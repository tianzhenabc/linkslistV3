package com.example.demo.service.impl;

import com.example.demo.daomap.linksdao;
import com.example.demo.pojo.LinkMan;
import com.example.demo.service.LinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service
public class LinkServicelmpl implements LinkService {

    @Autowired
    private linksdao dao;

    @Override
    public Collection<LinkMan> findAllByClient_id(Integer client_id) {
        return dao.findllbyclient_id(client_id);
    }

    @Override
    public LinkMan findByTdel(String Tel) {
        return dao.findBytel(Tel);
    }

    @Override
    public LinkMan findByLinkid(Integer id) {
        return dao.findBylinkId(id);
    }

    @Override
    public void saveLinkMan(LinkMan linkman) {
        dao.save(linkman);
    }

    @Override
    public void updatLinkMan(LinkMan linkman) {
        dao.save(linkman);
    }

    @Override
    public void deleteLinkMan(Integer id) {
        dao.deletelinkid(id);
    }
}
