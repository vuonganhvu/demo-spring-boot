package com.itss.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class User {
    @Id
    private Integer id;
    private String userName;
    private String roles;
    private String password;
}

