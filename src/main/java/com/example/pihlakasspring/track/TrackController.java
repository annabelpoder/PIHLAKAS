package com.example.pihlakasspring.track;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/track")
public class TrackController {
    private final TrackAdd trackAdd;

    @Autowired
    public TrackController(TrackAdd trackAdd) {
        this.trackAdd = trackAdd;
    }

    @PostMapping("/new")
    public void createNewTrack(@RequestBody NewTrackJson json){trackAdd.insert(json);}

    @GetMapping("/all")
    public List<Track> findAllTracks(){return trackAdd.findAllTracks();}

    @GetMapping("/available")
    public List<Track> findAvailableTracks(){return trackAdd.findAvailableTracks();}
    }
