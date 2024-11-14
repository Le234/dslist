package com.aleluiaeventos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aleluiaeventos.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}