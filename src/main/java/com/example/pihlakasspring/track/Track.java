package com.example.pihlakasspring.track;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Entity;

@Entity
public class Track
{
    private Long id;
    private String name;
    private boolean available;

    public Long getId(){return id;}
    public void setId(Long id) {this.id = id;}
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public boolean isAvailable(){
        return available;
    }
    public void setAvailable (boolean available){
        this.available = available;
    }
}
