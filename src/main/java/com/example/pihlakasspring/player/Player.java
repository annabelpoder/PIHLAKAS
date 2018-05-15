package com.example.pihlakasspring.player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;


import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter

public class Player {
    @Id
    @GeneratedValue
    Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }

    public String getShotsNr() {
        return shotsNr;
    }

    public void setShotsNr(String shotsNr) {
        this.shotsNr = shotsNr;
    }

    public String getPoints() {
        return points;
    }

    public void setPoints(String points) {
        this.points = points;
    }

    String firstName;
    String trackName;
    String shotsNr;
    String points;

    Player(){}

    public Player(Long id, String firstName, String trackName,
                  String shotsNr, String points) {
        this.id = id;
        this.firstName = firstName;
        this.trackName = trackName;
        this.shotsNr = shotsNr;
        this.points = points;
    }
}
