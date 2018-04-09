package com.example.pihlakasspring.track;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("index")
public class TrackController {
    @Autowired
    private TrackAdd trackAdd;

    @PostMapping("new")
    public void createNewTrack(@RequestBody NewTrackJson json){trackAdd.insert(json);}

    @GetMapping("all")
    public List<Track> findAllTracks(){return trackAdd.findAllTracks();}

    @GetMapping("available")
    public List<Track> findAvailableTracks(){return trackAdd.findAvailableTracks();}

    @PostMapping("{trackId/deactivate}")
    public void findAvailableTracks(@PathVariable Long trackId) {
        trackAdd.updateAvailability(trackId, false);
    }
    }
