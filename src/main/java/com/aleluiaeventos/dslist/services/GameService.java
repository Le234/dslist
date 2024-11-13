package com.aleluiaeventos.dslist.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aleluiaeventos.dslist.dto.GameMinDTO;
import com.aleluiaeventos.dslist.entities.Game;
import com.aleluiaeventos.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    public GameRepository gameRepository;

    public List<GameMinDTO> findAll(){
       List<Game> result = gameRepository.findAll();
       List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
       return dto;
        
    }

}
