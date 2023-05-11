package com.example.estateprojectfinal.controller;

import com.example.estateprojectfinal.model.Seller;
import com.example.estateprojectfinal.repo.SellerRepo;
import com.example.estateprojectfinal.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerController {

        @Autowired
        SellerRepo mRepo;

        @Autowired
        SellerService service;

        @GetMapping("/read")
        public List<com.example.estateprojectfinal.model.Seller> read() {
            return service.getAll();
        }

        @GetMapping("/read/{id}")
        public com.example.estateprojectfinal.model.Seller readOne(@PathVariable long id ) {
            return service.getSeller(id);
        }

        @PostMapping("/add")
        public com.example.estateprojectfinal.model.Seller add(@RequestBody com.example.estateprojectfinal.model.Seller newEmp){
            return service.createSeller(newEmp);
        }

        @DeleteMapping("/delete/{id}")
        public void delete(@PathVariable long id ) {
            service.deleteSeller(id);
        }
    @PutMapping ("/update/{seller_id}")
    public Seller updateSeller (@PathVariable long seller_id,
                               @RequestBody Seller updatedSeller){
        return this.service.updateSeller(seller_id, updatedSeller);
    }

    }
