package com.aleluiaeventos.dslist.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aleluiaeventos.dslist.dto.GameListDTO;
import com.aleluiaeventos.dslist.entities.GameList;
import com.aleluiaeventos.dslist.projection.GameMinProjection;
import com.aleluiaeventos.dslist.repositories.GameListRepository;
import com.aleluiaeventos.dslist.repositories.GameRepository;

import org.springframework.transaction.annotation.Transactional;




@Service
public class GameListService {

    @Autowired
    public GameListRepository gameListRepository;

    @Autowired
	private GameRepository gameRepository;

	

    
    
    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
       List<GameList> result = gameListRepository.findAll();
       return result.stream().map(GameListDTO::new)
                 .collect(Collectors.toList());
    }  


                 
    @Transactional
	public void move(Long listId, int sourceIndex, int destinationIndex) {

		List<GameMinProjection> list = gameRepository.searchByList(listId);

		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);

		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex < destinationIndex ? destinationIndex : sourceIndex;

		for (int i = min; i <= max; i++) {
			gameListRepository.updateBelongingPosition(listId, list.get(i).getID(), i);
		}
	}

	@Transactional(readOnly = true)
	public GameListDTO findById(Long id) {
		GameList entity = gameListRepository.findById(id).get();
		return new GameListDTO(entity);             
    }

}

 