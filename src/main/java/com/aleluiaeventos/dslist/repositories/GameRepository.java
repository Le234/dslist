package com.aleluiaeventos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aleluiaeventos.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
