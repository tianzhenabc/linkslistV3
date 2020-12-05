package com.example.demo.daomap;

import com.example.demo.pojo.LinkMan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Repository
public interface linksdao extends JpaRepository<LinkMan, Integer> {


    @Query(value = "select e from LinkMan e where e.client_id =?1")
    Collection<LinkMan> findllbyclient_id(Integer client_id);


    @Query(value = "select e from LinkMan e where e.tel =?1")
    LinkMan findBytel(String Tel);

    @Query(value = "select e from LinkMan e where e.linkid =?1")
    LinkMan findBylinkId(int linkid);

    @Transactional
    @Modifying
    @Query(value = "delete from LinkMan c where c.linkid =?1")
    void deletelinkid(int linkid);


}
