package com.example.demo.service;

import com.example.demo.pojo.LinkMan;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public interface LinkService {
    Collection<LinkMan> findAllByClient_id(Integer client_id);

    LinkMan findByTdel(String Tel);

    LinkMan findByLinkid(Integer id);

    void saveLinkMan(LinkMan linkman);//保存

    void updatLinkMan(LinkMan linkman);//修改

    void deleteLinkMan(Integer id);//

}
