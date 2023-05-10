package com.jlcb.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlcb.dslist.model.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
