package com.aleluiaeventos.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.aleluiaeventos.dslist.dto.GameListDTO;
import com.aleluiaeventos.dslist.dto.GameMinDTO;
import com.aleluiaeventos.dslist.services.GameListService;
import com.aleluiaeventos.dslist.services.GameService;


@RestController
@RequestMapping (value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll(){
        List<GameListDTO> result = gameListService.findAll();
        return result;
        
    }

     @GetMapping(value = "/{listID}games")
       public List<GameMinDTO> findByList(@PathVariable Long listID){
        List<GameMinDTO> result = gameService.findByList(listID);
        return result;
        
    }

}
