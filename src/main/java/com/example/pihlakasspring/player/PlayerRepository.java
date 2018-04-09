package com.example.pihlakasspring.player;

import org.springframework.data.repository.CrudRepository;

import com.example.pihlakasspring.player.Player;

public interface PlayerRepository extends CrudRepository<Player, Long> {
}
