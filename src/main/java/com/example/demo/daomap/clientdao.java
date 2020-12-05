package com.example.demo.daomap;

import com.example.demo.pojo.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface clientdao extends JpaRepository<Client,Integer> {

    //@Query("SELECT c.id FROM Client c where c.username=?1 and c.password=?2")
    //public Integer IsClient(String username,String password);
    Client findByUsernameAndPassword(String username,String password);

}
