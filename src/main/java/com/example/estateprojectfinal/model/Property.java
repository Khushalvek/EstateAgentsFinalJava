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
    private int bathrooms;
    private int bedrooms;
    private String type;
    private String garden;

    private String postcode;







    @ManyToOne
    private Seller seller;

    public Property() {
    }

    public Property(long property_id, String address, String status, int price, int bathrooms, int bedrooms, String type, String garden, String postcode, Seller seller) {
        this.property_id = property_id;
        this.address = address;
        this.status = status;
        this.price = price;
        this.bathrooms = bathrooms;
        this.bedrooms = bedrooms;
        this.type = type;
        this.garden = garden;
        this.postcode = postcode;
        this.seller = seller;
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

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getGarden() {
        return garden;
    }

    public void setGarden(String garden) {
        this.garden = garden;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
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
                ", bathrooms=" + bathrooms +
                ", bedrooms=" + bedrooms +
                ", type='" + type + '\'' +
                ", garden='" + garden + '\'' +
                ", postcode='" + postcode + '\'' +
                ", seller=" + seller +
                '}';
    }
}
