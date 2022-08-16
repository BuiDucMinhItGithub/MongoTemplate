package com.mongo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MongoConfig {

    @Autowired
    private Environment env;

    @Bean
    public MongoDatabaseFactory mongoDatabaseFactory(){
        return new SimpleMongoClientDatabaseFactory(env.getProperty("SPRING_DATA_MONGODB_URI"));
    }

    @Bean
    public MongoTemplate mongoTemplate() {
        MongoTemplate mongoTemplate = new MongoTemplate(mongoDatabaseFactory());

        return mongoTemplate;

    }
}
