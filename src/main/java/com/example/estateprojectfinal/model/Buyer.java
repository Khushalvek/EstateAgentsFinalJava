package com.example.estateprojectfinal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Buyer {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long buyer_Id;
    private String firstName;
    private String surname;
    private String address;
    private String postcode;
    private String  phone;

    public Buyer(long buyer_Id, String firstName, String surname, String address, String postcode, String phone) {
        this.buyer_Id = buyer_Id;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.postcode = postcode;
        this.phone = phone;
    }


    public Buyer() {

    }

    public long getBuyer_Id() {
        return buyer_Id;
    }

    public void setBuyer_Id(long buyer_Id) {
        this.buyer_Id = buyer_Id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Buyer{" +
                "buyer_Id=" + buyer_Id +
                ", firstName='" + firstName + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", phone=" + phone +
                '}';
    }
}


