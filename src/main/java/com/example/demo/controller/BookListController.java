package com.example.demo.controller;


import com.example.demo.pojo.Client;
import com.example.demo.pojo.LinkMan;
import com.example.demo.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.List;

@Controller
public class BookListController {
    @Autowired
    private LinkService Server;

    private Integer userid;

    @GetMapping("/booklist.html")
    public String BookList(Model model, HttpSession session)throws Exception{
        userid=(Integer)session.getAttribute("userID");
        Collection<LinkMan> Links= Server.findAllByClient_id(userid);
        System.out.println(Links.toString());
        model.addAttribute("links",Links);
        return "booklist";
    }

    @GetMapping("/addLink")
    public String toAddpage(){
        return "book/addNew";
    }

    @PostMapping("/addLink")
    public String AddLink(LinkMan newlink){
        newlink.setClient_id(userid);
        Server.saveLinkMan(newlink);//保存新联系人
        return "redirect:/booklist.html";
    }

    @GetMapping("/check")
    @ResponseBody
    public String toCheckTel(@RequestParam("uphone")String Tel){
        LinkMan now=Server.findByTdel(Tel);
        if (now!=null)
        {
            System.out.println(now.toString());
            return "0";
        }
        return "1";

    }

    @GetMapping("/editLink/{id}")
    public String toUpdataPage(@PathVariable("id")Integer id,Model model){
        LinkMan now=Server.findByLinkid(id);
        model.addAttribute("link",now);
        return "book/updata";
    }

    @PostMapping("/Updata/{id}")
    public String editLink(@PathVariable("id")Integer id,LinkMan newlink){
        newlink.setClient_id(userid);
        newlink.setLinkid(id);
        Server.updatLinkMan(newlink);//修改联系人
        return "redirect:/booklist.html";
    }

    @GetMapping("/deleteLink/{id}")
    public String deleteLink(@PathVariable("id")Integer id){
        Server.deleteLinkMan(id);
        return "redirect:/booklist.html";
    }
}

