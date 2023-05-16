package com.example.estateprojectfinal.service;

import com.example.estateprojectfinal.model.Buyer;
import com.example.estateprojectfinal.repo.BuyerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyerService {

    @Autowired
    private BuyerRepo repo;

    public BuyerService(BuyerRepo repo){
        this.repo = repo;
    }
    public BuyerService(){

    }

    public List<Buyer> getAll() {
        return this.repo.findAll();
    }


    public Buyer getBuyer(Long id) {

        return this.repo.findById(id).get();

    }


    public Buyer createBuyer (Buyer dep){

        return this.repo.save(dep);

    }

    public Buyer deleteBuyer (long id){
        Buyer removed = this.getBuyer(id);
        this.repo.deleteById(id);
        return removed;

    }
    public Buyer updateBuyer (long buyer_id, Buyer updatedBuyer)
    {
        Buyer toUpdate = this.getBuyer(buyer_id);
        toUpdate.setFirstName(updatedBuyer.getFirstName());
        toUpdate.setSurname(updatedBuyer.getSurname());
        toUpdate.setAddress(updatedBuyer.getAddress());
        toUpdate.setPostcode(updatedBuyer.getPostcode());
        toUpdate.setPhone(updatedBuyer.getPhone());

        return this.repo.save(toUpdate);
    }


}
