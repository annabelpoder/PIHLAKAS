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
    String firstName;
    String trackName;
    double shotsNr;
    double points;

    Player(){}

    public Player(String firstName, String trackName, double shotsNr, double points) {
        this.firstName = firstName;
        this.trackName = trackName;
        this.shotsNr = shotsNr;
        this.points = points;
    }
}
