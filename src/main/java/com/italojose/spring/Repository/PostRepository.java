package com.italojose.spring.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.italojose.spring.domain.Post;

public interface PostRepository extends MongoRepository<Post, String> {

}
