package com.ronaldosantos.workshopmongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ronaldosantos.workshopmongo.entities.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
