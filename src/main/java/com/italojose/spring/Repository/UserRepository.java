package com.italojose.spring.Repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.italojose.spring.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	

}
