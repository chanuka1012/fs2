package com.example.demo.fs2.fullStack.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.fs2.fullStack.model.User;

@Repository

public interface UserRepo extends MongoRepository<User ,String>{

    User findByEmail(String email);

}
