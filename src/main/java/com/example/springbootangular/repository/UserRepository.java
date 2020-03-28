package com.example.springbootangular.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootangular.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
