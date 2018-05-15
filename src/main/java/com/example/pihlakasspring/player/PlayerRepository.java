package com.example.pihlakasspring.player;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayerRepository extends CrudRepository<Player, Long> {
    List<Player> findAllBy();

}
