package com.mathic.restapi.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mathic.restapi.Models.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{
}
