package com.example.demo.controller;

//import com.example.demo.config.WebSecurityConfig;


import com.example.demo.pojo.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

    @Autowired
    private ClientService clients;


    @PostMapping("/loginPost")
    public String loginPost(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            Model model,HttpSession session
            )throws Exception{
        Integer id=-1;
        if(!StringUtils.isEmpty(username)&&!StringUtils.isEmpty(password)){
            Client client=clients.findByUsernameAndPassword(username,password);

            if(client==null){
                model.addAttribute("msg","用户名或密码错误！");
                return "index";
            }else {
                session.setAttribute("userID",client.getId());
                return "redirect:/booklist.html";
            }
        }
        model.addAttribute("msg","用户名或密码错误！");
        return "index";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        // 移除session
        session.invalidate();
        return "redirect:/index.html";
    }
}
