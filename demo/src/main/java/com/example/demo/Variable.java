package com.example.demo;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Variable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;
    private String description;
    private String units;
    private float target;
    private float ucl;
    private float lcl;

    @OneToMany
    private Set<DataEntry> dataEntries;

    public Set<DataEntry> getDataEntries() { 
        return this.dataEntries; 
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnits() {
        return this.units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public float getTarget() {
        return this.target;
    }

    public void setTarget(float target) {
        this.target = target;
    }

    public float getUcl() {
        return this.ucl;
    }

    public void setUcl(float ucl) {
        this.ucl = ucl;
    }

    public float getLcl() {
        return this.lcl;
    }

    public void setLcl(float lcl) {
        this.lcl = lcl;
    }
}