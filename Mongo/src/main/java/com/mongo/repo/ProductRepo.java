package com.mongo.repo;

import com.mongo.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepo extends MongoRepository<Product, Long> {

}
