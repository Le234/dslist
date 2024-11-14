package com.aleluiaeventos.dslist.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aleluiaeventos.dslist.dto.GameDTO;
import com.aleluiaeventos.dslist.dto.GameMinDTO;
import com.aleluiaeventos.dslist.entities.Game;
import com.aleluiaeventos.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    public GameRepository gameRepository;

    /** fazer tratamento de exception caso não encontre o Id */
    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game result = gameRepository.findById(id).get();
        GameDTO dto = new GameDTO(result);
        return dto;
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
       List<Game> result = gameRepository.findAll();
       List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
       return dto;
        
    }

}
