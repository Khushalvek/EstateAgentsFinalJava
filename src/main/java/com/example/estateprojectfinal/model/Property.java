package com.example.estateprojectfinal.model;

import jakarta.persistence.*;

@Entity
public class Property {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long property_id;
    private String address;
    private String status;
    private int price;






    @ManyToOne
    private Seller seller;

    public Property(long property_id, String address, String status, int price, Seller seller) {
        this.property_id = property_id;
        this.address = address;
        this.status = status;
        this.price = price;
        this.seller = seller;
    }

    public Property() {

    }

    public long getProperty_id() {
        return property_id;
    }

    public void setProperty_id(long property_id) {
        this.property_id = property_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    @Override
    public String toString() {
        return "Property{" +
                "property_id=" + property_id +
                ", address='" + address + '\'' +
                ", status='" + status + '\'' +
                ", price=" + price +
                ", seller=" + seller +
                '}';
    }
}
