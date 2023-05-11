package com.example.estateprojectfinal.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;


@Entity
public class Seller {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long seller_id;
    private String Name;
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

    public long getId() {
        return seller_id;
    }

    public Seller(long property_id, String name, String email, String address, String postcode, Buyer buyer, List<Property> propertyList) {
        this.seller_id = property_id;
        Name = name;
        this.email = email;
        this.address = address;
        this.postcode = postcode;
        this.buyer = buyer;
        this.propertyList = propertyList;
    }

    public long getProperty_id() {
        return seller_id;
    }

    public void setProperty_id(long property_id) {
        this.seller_id = property_id;
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
                ", Name='" + Name + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", postcode='" + postcode + '\'' +
                ", buyer=" + buyer +
                ", propertyList=" + propertyList +
                '}';
    }
}
