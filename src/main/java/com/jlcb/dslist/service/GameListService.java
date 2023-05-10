package com.jlcb.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jlcb.dslist.dto.GameListDTO;
import com.jlcb.dslist.model.GameList;
import com.jlcb.dslist.repository.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> gameList = gameListRepository.findAll();
		return gameList.stream().map(x -> new GameListDTO(x)).toList();
	}

}
