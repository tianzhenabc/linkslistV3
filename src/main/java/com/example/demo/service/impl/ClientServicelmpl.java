package com.example.demo.service.impl;

import com.example.demo.daomap.clientdao;
import com.example.demo.pojo.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientServicelmpl implements ClientService {
    @Autowired
    private clientdao dao1;
    @Override
    public Client findByUsernameAndPassword(String username, String password) {
        return dao1.findByUsernameAndPassword(username,password);
    }


}
