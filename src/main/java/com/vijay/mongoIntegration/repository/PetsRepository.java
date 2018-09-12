package com.vijay.mongoIntegration.repository;

import com.vijay.mongoIntegration.model.Pets;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetsRepository extends MongoRepository<Pets, String> {
    Pets findBy_id(ObjectId _id);
}