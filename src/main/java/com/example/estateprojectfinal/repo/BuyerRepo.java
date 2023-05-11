package com.example.estateprojectfinal.repo;

import com.example.estateprojectfinal.model.Buyer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BuyerRepo extends CrudRepository<Buyer,Long> {
    List<Buyer> findAll();
}