package com.springbootjpa.practicejpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.springbootjpa.practicejpa.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
           
}