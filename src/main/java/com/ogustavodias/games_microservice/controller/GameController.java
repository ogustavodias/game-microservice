package com.ogustavodias.games_microservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ogustavodias.games_microservice.models.Game;
import com.ogustavodias.games_microservice.services.GameServices;

@RestController
@RequestMapping("/games")
public class GameController {

  @Autowired
  private GameServices services;

  @PostMapping
  public Game insertGame(@RequestBody Game game) {
    return services.insertGame(game);
  }

  @GetMapping
  public List<Game> findAllGames() {
    return services.findAllGames();
  }

}
