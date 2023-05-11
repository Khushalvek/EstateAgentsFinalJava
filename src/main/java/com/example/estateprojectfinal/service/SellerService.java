package com.example.estateprojectfinal.service;

import com.example.estateprojectfinal.model.Buyer;
import com.example.estateprojectfinal.model.Seller;
import com.example.estateprojectfinal.repo.SellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SellerService {
    @Autowired
    private SellerRepo repo;

    public SellerService(SellerRepo repo){
        this.repo = repo;
    }
    public SellerService(){

    }

    public List<com.example.estateprojectfinal.model.Seller> getAll() {
        return this.repo.findAll();
    }


    public com.example.estateprojectfinal.model.Seller getSeller(Long id) {

        return this.repo.findById(id).get();

    }


    public com.example.estateprojectfinal.model.Seller createSeller (com.example.estateprojectfinal.model.Seller emp){

        return this.repo.save(emp);

    }

    public com.example.estateprojectfinal.model.Seller deleteSeller (long id){
        com.example.estateprojectfinal.model.Seller removed = this.getSeller(id);
        this.repo.deleteById(id);
        return removed;

    }
    public Seller updateSeller (long seller_id, Seller updatedSeller){

        Seller toUpdate = this.getSeller(seller_id);
        toUpdate.setName(updatedSeller.getName());
        toUpdate.setEmail(updatedSeller.getEmail());

        return this.repo.save(toUpdate);
    }

}
