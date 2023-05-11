package com.example.estateprojectfinal.service;

import com.example.estateprojectfinal.model.Property;
import com.example.estateprojectfinal.model.Seller;
import com.example.estateprojectfinal.repo.PropertyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepo repo;

    public PropertyService(PropertyRepo repo){
        this.repo = repo;
    }
    public PropertyService(){

    }

    public List<Property> getAll() {
        return this.repo.findAll();
    }


    public Property getAddress(Long id) {

        return this.repo.findById(id).get();

    }


    public Property createAddress (Property addr){

        return this.repo.save(addr);

    }

    public Property deleteAddress (long id){
        Property removed = this.getAddress(id);
        this.repo.deleteById(id);
        return removed;

    }
//    public Seller updateProperty (long property_id, Property updatedProperty){
//
//        Seller toUpdate = this.getProperty(property_id);
//        toUpdate.setAddress(updatedProperty.getAddress());
//        toUpdate.setStatus(updatedProperty.getStatus());
//        toUpdate.int
//
//        return this.repo.save(toUpdate);
//    }

}
//    private long property_id;
//    private String address;
//    private String status;
//    private int price;