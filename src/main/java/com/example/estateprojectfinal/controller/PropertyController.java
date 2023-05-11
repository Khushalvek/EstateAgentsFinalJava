package com.example.estateprojectfinal.controller;

import com.example.estateprojectfinal.model.Property;
import com.example.estateprojectfinal.repo.PropertyRepo;
import com.example.estateprojectfinal.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/property")
public class PropertyController {


        @Autowired
        PropertyRepo mRepo;


    @Autowired
    PropertyService service;

    public PropertyController(PropertyService service){
        this.service = service;
    }



        @GetMapping("/read")
        public List<Property> read() {
            return service.getAll();
        }

        @GetMapping("/read/{id}")
        public Property readOne(@PathVariable long id ) {
            return service.getAddress(id);
        }

        @PostMapping("/add")
        public Property add(@RequestBody Property newAddr){
            return this.service.createAddress(newAddr);
        }

        @DeleteMapping("/delete/{id}")
        public void delete(@PathVariable long id ) {
            service.deleteAddress(id);
        }

    }
