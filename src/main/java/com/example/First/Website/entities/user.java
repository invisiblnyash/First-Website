package com.example.First.Website.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "users")
public class user implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int Gpa;

    private int number;

    private Boolean Above18;

    private String email;
    private String FullName;

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", FullName='" + FullName + '\'' +
                ", Gpa=" + Gpa +
                ", number=" + number +
                ", Above18=" + Above18 +
                ", email='" + email + '\'' +
                '}';
    }

    public user() {
    }

    public user(long id, String fullName, int gpa, int number, Boolean above18, String email) {
        this.id = id;
        FullName = fullName;
        Gpa = gpa;
        this.number = number;
        Above18 = above18;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public int getGpa() {
        return Gpa;
    }

    public void setGpa(int gpa) {
        Gpa = gpa;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Boolean getAbove18() {
        return Above18;
    }

    public void setAbove18(Boolean above18) {
        Above18 = above18;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }




}
