package com.example.pihlakasspring.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(path="/demo")
public class PlayerController {
    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping(path="/add")
    public @ResponseBody String addNewPlayer (@RequestParam String firstName, @RequestParam String email){
        Player n = new Player();
        n.setFirstName(firstName);
        n.setEmail(email);
        playerRepository.save(n);
        return "saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Player> getAllPlayers(){
        return playerRepository.findAll()
    }

}
