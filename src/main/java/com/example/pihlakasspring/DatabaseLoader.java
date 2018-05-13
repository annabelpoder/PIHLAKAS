package com.example.pihlakasspring;

import com.example.pihlakasspring.player.Player;
import com.example.pihlakasspring.player.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final PlayerRepository repository;

    @Autowired
    public DatabaseLoader(PlayerRepository repository){
        this.repository = repository;
    }

    @Override
    public void run(String...strings){
        this.repository.save(new Player((long) 1, "Ellen", "ellen@gmail.com"));
    }
}
