package com.example.pihlakasspring.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

@RestController
@RequestMapping(path="/")
public class PlayerController {
    @Autowired
    private PlayerRepository playerRepository;
    Long id;
    @RequestMapping(value = "/add", method = {RequestMethod.POST})
    public  String addNewPlayer(WebRequest request)
    {
                    String firstName = request.getParameter("firstName");
                    String trackName = request.getParameter("trackName");
                    String shotsNr = request.getParameter("shotsNr");
                    String points = request.getParameter("points");
                    {
                        Player n = new Player();
                        n.setId(id);
                        n.setFirstName(firstName);
                        n.setPoints(points);
                        n.setShotsNr(shotsNr);
                        n.setTrackName(trackName);
                        playerRepository.save(n);
                        return "saved";
        }
    }
}

