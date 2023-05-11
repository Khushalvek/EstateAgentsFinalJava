package com.example.estateprojectfinal.repo;

import com.example.estateprojectfinal.model.Seller;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SellerRepo extends CrudRepository<Seller, Long> {
    List<Seller> findAll();
}
