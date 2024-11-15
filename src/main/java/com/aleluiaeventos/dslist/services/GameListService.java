package com.aleluiaeventos.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aleluiaeventos.dslist.dto.GameListDTO;
import com.aleluiaeventos.dslist.entities.GameList;
import com.aleluiaeventos.dslist.repositories.GameListRepository;
import org.springframework.transaction.annotation.Transactional;




@Service
public class GameListService {

    @Autowired
    public GameListRepository gameListRepository;

    
    
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
       List<GameList> result = gameListRepository.findAll();
       return result.stream().map(GameListDTO::new)
                 .collect(Collectors.toList());    
    }

}

 