package com.example.pihlakasspring.track;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
@Getter
@Setter
public class Track
{
    @Id
    @GeneratedValue
    Long id;
    String name;
    private boolean available;


    public boolean isAvailable(){
        return available;
    }
    void setAvailable(boolean available){
        this.available = available;
    }
}
