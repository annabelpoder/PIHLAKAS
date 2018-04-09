package com.example.pihlakasspring.player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Player {

    @Id
    @GeneratedValue
    long id;
    String firstName;
    String lastName;

}
