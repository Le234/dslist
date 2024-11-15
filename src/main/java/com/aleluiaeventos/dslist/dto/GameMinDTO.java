package com.aleluiaeventos.dslist.dto;

import com.aleluiaeventos.dslist.entities.Game;
import com.aleluiaeventos.dslist.projection.GameMinProjection;

public class GameMinDTO {

    private Long id;
	private String title;
	private Integer year;
    private String imgUrl;
	private String shortDescription;

    public GameMinDTO(){
    }

    public GameMinDTO(Game Entity) {
        id = Entity.getId();
        title = Entity.getTitle();
        year = Entity.getYear();
        imgUrl = Entity.getImgUrl();
        shortDescription = Entity.getShortDescription();
    }

    public GameMinDTO(GameMinProjection projection) {
        id = projection.getID();
        title = projection.getTitle();
        year = projection.getGameYear();
        imgUrl = projection.getImUrl();
        shortDescription = projection.getShortDescription();
    }


    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    


}
