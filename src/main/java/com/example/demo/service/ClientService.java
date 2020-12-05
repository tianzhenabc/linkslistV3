package com.example.demo.service;

import com.example.demo.daomap.clientdao;
import com.example.demo.pojo.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface ClientService{

    Client findByUsernameAndPassword(String username, String password);

}
