package com.ogustavodias.games_microservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ogustavodias.games_microservice.models.Game;
import com.ogustavodias.games_microservice.repository.GameRepository;

@Component
public class GameServices {

  @Autowired
  private GameRepository repository;

  public Game insertGame(Game game) {
    return repository.insert(game);
  }

  public List<Game> findAllGames() {
    return repository.findAll();
  }

}
