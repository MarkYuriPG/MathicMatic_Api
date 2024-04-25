package com.mathic.restapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mathic.restapi.Models.GameModel;

@Repository
public interface GameRepository extends JpaRepository<GameModel, Integer>{
}
