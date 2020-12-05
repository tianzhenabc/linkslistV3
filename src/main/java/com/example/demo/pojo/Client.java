package com.example.demo.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

//用户


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String username;


    @Column
    private String password;

    @Column
    private String email;

    //private BookDao links;


}
