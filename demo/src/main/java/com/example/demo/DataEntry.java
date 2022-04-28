package com.example.demo;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class DataEntry {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private float y;
    private String x;
    private short flag;

    public float getValue() {
        return this.y;
    }

    public void setValue(float y) {
        this.y = y;
    }

    public String getDate() {
        return this.x;
    }

    public void setDate(String x) {
        this.x = x;
    }

    public short getFlag() {
        return this.flag;
    }

    public void setFlag(short flag) {
        this.flag = flag;
    }
}