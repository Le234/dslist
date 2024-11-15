package com.aleluiaeventos.dslist.dto;

import com.aleluiaeventos.dslist.entities.GameList;

public class GameListDTO {

    private Long id;
    private String name;

    public GameListDTO(){
}

    public GameListDTO(GameList Entity) {
       this.id = Entity.getId();
       this.name = Entity.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    






}
