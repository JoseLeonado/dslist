package com.jlcb.dslist.dto;

import com.jlcb.dslist.model.GameList;

public class GameListDTO {

	private Long id;
	private String name;

	public GameListDTO() {
	}

	public GameListDTO(GameList gameList) {
		id = gameList.getId();
		name = gameList.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
