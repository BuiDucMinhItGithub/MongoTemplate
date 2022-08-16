package com.mongo.service;


import com.mongo.model.Product;
import com.mongo.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public List<Product> getList(){
        return productRepo.findAll();
    }
}
