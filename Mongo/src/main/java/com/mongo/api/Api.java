package com.mongo.api;

import com.mongo.model.Product;
import com.mongo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class Api {

    @Autowired
    ProductService productService;

    @Autowired
    MongoTemplate mongoTemplate;


    @GetMapping("/list")
    public List<Product> getList(){
        Query query =  Query.query(Criteria.where("number").(13));
        query.fields().exclude("name");
        return mongoTemplate.find(query, Product.class);
    }

    @PostMapping("/add")
    public Product add(@RequestBody Product product){
        return mongoTemplate.save(product);
    }
}
