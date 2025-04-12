package com.ronaldosantos.workshopmongo.repositories;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ronaldosantos.workshopmongo.entities.User;

@Repository@Document(collation = "users")
public interface UserRepository extends MongoRepository<User, String> {

}
