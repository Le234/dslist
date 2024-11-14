package com.aleluiaeventos.dslist.dto;

import com.aleluiaeventos.dslist.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(){
}

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    






}
