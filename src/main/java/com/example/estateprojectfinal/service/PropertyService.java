package com.example.estateprojectfinal.service;

import com.example.estateprojectfinal.model.Property;
import com.example.estateprojectfinal.model.Seller;
import com.example.estateprojectfinal.repo.PropertyRepo;
import com.fasterxml.jackson.databind.annotation.JsonAppend;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Property getProperty(Long id) {
        // Optional is a wrapper around something which may or may not exist
        Optional<Property> propertyOptional =  this.repo.findById(id);
        if (propertyOptional.isPresent()) return  propertyOptional.get();
        throw new EntityNotFoundException("Property with id " + id + " does not exist");
    }


    public Property createAddress (Property addr){

        return this.repo.save(addr);

    }

    public Property deleteAddress (long id){
        Property removed = this.getAddress(id);
        this.repo.deleteById(id);
        return removed;

    }
    public Property updateProperty (long property_id, Property updatedProperty){

        Property toUpdate = this.getAddress(property_id);
        toUpdate.setAddress(updatedProperty.getAddress());
        toUpdate.setStatus(updatedProperty.getStatus());
        toUpdate.setPrice(updatedProperty.getPrice());
        toUpdate.setBathrooms(updatedProperty.getBathrooms());
        toUpdate.setBedrooms(updatedProperty.getBedrooms());
        toUpdate.setType(updatedProperty.getType());
        toUpdate.setGarden(updatedProperty.getGarden());
        toUpdate.setPostcode(updatedProperty.getPostcode());



        return this.repo.save(toUpdate);
    }
    public Property updateStatus(long id, String status) {
        Property toUpdate = getProperty(id);
        toUpdate.setStatus(status);
        return repo.save(toUpdate);
    }
}
