package com.example.demo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//联系人
/*@Data
@AllArgsConstructor
@NoArgsConstructor*/
@Entity
@Table
public class LinkMan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer linkid;
    @Column
    private Integer client_id;
    @Column
    private String name;
    private Integer gender; //0女；1男
    private String tel;
    private String email;
    private String address;

    @Override
    public String toString() {
        return "LinkMan{" +
                "linkid=" + linkid +
                ", client_id=" + client_id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Integer getLinkid() {
        return linkid;
    }

    public void setLinkid(Integer linkid) {
        this.linkid = linkid;
    }

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
