package com.mathic.restapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mathic.restapi.Models.UserModel;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer>{
}
