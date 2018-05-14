package com.example.pihlakasspring.player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


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

    public double getShotsNr() {
        return shotsNr;
    }

    public void setShotsNr(double shotsNr) {
        this.shotsNr = shotsNr;
    }

    public double getPoints() {
        return points;
    }

    public void setPoints(double points) {
        this.points = points;
    }

    String firstName;
    String trackName;
    double shotsNr;
    double points;

    Player(){}

    public Player(Long id, String firstName, String trackName, double shotsNr, double points) {
        this.id = id;
        this.firstName = firstName;
        this.trackName = trackName;
        this.shotsNr = shotsNr;
        this.points = points;
    }
}
