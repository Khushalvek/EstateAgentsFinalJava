package com.example.estateprojectfinal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Buyer {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long buyer_Id;
    private String Name;
    private String email;


    public Buyer(long buyer_Id, String name, String email) {
        this.buyer_Id = buyer_Id;
        Name = name;
        this.email = email;

    }

    public Buyer() {

    }

    public long getBuyer_Id() {
        return buyer_Id;
    }

    public void setBuyer_Id(long buyer_Id) {
        this.buyer_Id = buyer_Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "buyer_Id=" + buyer_Id +
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
