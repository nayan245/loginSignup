package com.example.demo.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="signuplogin")
public class Employee {
    @Id

    @Column(name = "personID", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personID;
    @Column(name = "username", length = 255)
    private String username;

    @Column(name = "passkey", length = 255)
    private String passkey;

    public int getPersonID() {
        return personID;
    }

    public String getUsername() {
        return username;
    }

    public String getPasskey() {
        return passkey;
    }
}


