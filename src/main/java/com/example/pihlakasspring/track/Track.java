package com.example.pihlakasspring.track;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Track
{
    @Id
    @GeneratedValue
    Long id;
    String name;
    Boolean available;


    public boolean isAvailable(){
        return available;
    }
    void setAvailable(boolean available){
        this.available = available;
    }
}
