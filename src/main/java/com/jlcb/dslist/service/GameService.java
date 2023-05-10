package com.jlcb.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jlcb.dslist.dto.GameDTO;
import com.jlcb.dslist.dto.GameMinDTO;
import com.jlcb.dslist.model.Game;
import com.jlcb.dslist.projection.GameMinProjection;
import com.jlcb.dslist.repository.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game game = gameRepository.findById(id).get();
		return new GameDTO(game);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> games = gameRepository.findAll();
		return games.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> gamesMinProjections = gameRepository.searchByList(listId);
		return gamesMinProjections.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
