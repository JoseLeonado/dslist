package com.jlcb.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jlcb.dslist.model.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
