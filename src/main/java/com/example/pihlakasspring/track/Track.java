package com.example.pihlakasspring.track;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Track
{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private boolean available;

    public Long getId(){return id;}
    void setId(Long id) {this.id = id;}
    public String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
    public boolean isAvailable(){
        return available;
    }
    void setAvailable(boolean available){
        this.available = available;
    }
}
