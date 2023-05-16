package com.example.estateprojectfinal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long seller_id;
    private String firstname;
    private String surname;
    private String email;

    private String address;

    private String postcode;


    @ManyToOne
    private Buyer buyer;

    @OneToMany(mappedBy = "seller", fetch = FetchType.EAGER)
    @JsonIgnore
    private List<Property> propertyList;

    public Seller() {

    }

    public long getSeller_id() {
        return seller_id;
    }

    public Seller(long seller_id, String firstname, String surname, String email, String address, String postcode, Buyer buyer, List<Property> propertyList) {
        this.seller_id = seller_id;
        this.firstname = firstname;
        this.surname = surname;
        this.email = email;
        this.address = address;
        this.postcode = postcode;
        this.buyer = buyer;
        this.propertyList = propertyList;
    }

    public void setSeller_id(long seller_id) {
        this.seller_id = seller_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public List<Property> getPropertyList() {
        return propertyList;
    }

    public void setPropertyList(List<Property> propertyList) {
        this.propertyList = propertyList;
    }

    @Override
    public String toString() {
        return "Seller{" +
                "seller_id=" + seller_id +
                ", firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", buyer=" + buyer +
                ", propertyList=" + propertyList +
                '}';
    }
}
