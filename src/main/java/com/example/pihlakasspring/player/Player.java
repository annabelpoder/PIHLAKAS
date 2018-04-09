package com.example.pihlakasspring.player;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class Player {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    long id;
    String firstName;
    String email;
}
