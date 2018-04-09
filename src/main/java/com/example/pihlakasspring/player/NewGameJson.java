package com.example.pihlakasspring.player;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class NewGameJson {

    @Id
    @GeneratedValue
    private String firstName;
    private Long trackId;
}
