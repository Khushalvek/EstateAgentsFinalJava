package com.example.estateprojectfinal.repo;

import com.example.estateprojectfinal.model.Property;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PropertyRepo extends CrudRepository<Property,Long> {
    List<Property> findAll();
}
