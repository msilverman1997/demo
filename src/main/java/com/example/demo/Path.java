package com.example.demo;

import org.hibernate.annotations.Generated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Path {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String origin;

    private String destination;

    private String distance;

    private String type;

    private String dow;

    public Path(){}

    public Path(String origin, String destination, String distance, String type, String DOW) {
        this.origin = origin;
        this.destination = destination;
        this.distance = distance;
        this.type = type;
        this.dow = DOW;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDOW() {
        return this.dow;
    }

    public void setDOW(String DOW) {
        this.dow = DOW;
    }
}
