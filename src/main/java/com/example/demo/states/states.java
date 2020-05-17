package com.example.demo.states;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class states {
    @Id
    private String name;
    private String geometry;

    public states(){}
    public states(String name, String geometry) {
        this.name = name;
        this.geometry = geometry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeometry() {
        return geometry;
    }

    public void setGeometry(String geometry) {
        this.geometry = geometry;
    }
}
