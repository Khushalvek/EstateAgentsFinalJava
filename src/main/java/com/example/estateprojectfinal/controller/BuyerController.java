package com.example.estateprojectfinal.controller;

import com.example.estateprojectfinal.model.Buyer;
import com.example.estateprojectfinal.repo.BuyerRepo;
import com.example.estateprojectfinal.service.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/buyer")
public class BuyerController {

    @Autowired
    BuyerService service;

    @Autowired
    BuyerRepo mRepo;

    @GetMapping("/read")
    public List<Buyer> read() {
        return service.getAll();
    }

    @GetMapping("/read/{id}")
    public Buyer readOne(@PathVariable long id ) {
        return service.getBuyer(id);
    }

    @PostMapping("/add")
    public Buyer add(@RequestBody Buyer newDep){
        return service.createBuyer(newDep);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable long id ) {
        service.deleteBuyer(id);
    }
    @PutMapping ("/update/{buyer_id}")
    public Buyer updateBuyer (@PathVariable long buyer_id,
                               @RequestBody Buyer updatedBuyer){
        return this.service.updateBuyer(buyer_id, updatedBuyer);
    }


}
