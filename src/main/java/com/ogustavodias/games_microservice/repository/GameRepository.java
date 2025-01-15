package com.ogustavodias.games_microservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ogustavodias.games_microservice.models.Game;

@Repository
public interface GameRepository extends MongoRepository<Game, String> {

}
