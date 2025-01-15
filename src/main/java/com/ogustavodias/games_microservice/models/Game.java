package com.ogustavodias.games_microservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;

@Document(collection = "games")
@Getter
@Setter
public class Game {

  @Id
  private String id;
  private String name;
  private String platform;
  private String developer;
  private String distributor;

  public Game(String name, String platform, String developer, String distributor) {
    this.name = name;
    this.platform = platform;
    this.developer = developer;
    this.distributor = distributor;
  }

}
