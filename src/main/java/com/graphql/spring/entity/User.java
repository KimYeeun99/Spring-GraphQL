package com.graphql.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
public class User {
    @Id
    private String id;

    private String password;
    private String phone;
    private int schoolgrade;
    private int schoolclass;
    private int schoolnumber;
    private String role;
    private String year;
    private LocalDate birth;
    private String email;
}
