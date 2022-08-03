package com.tema1.entity;

public class Meniu {
    private final String pretMancare;

    public Meniu(){
        StringBuilder pretMancare= new StringBuilder();
        for (int i=0; i<=30; i++){
            pretMancare.append((int) (Math.random() * 100));
        }
        this.pretMancare = pretMancare.toString();
    }

    @Override
public String toString() {
        int value = 0;
        return "MeniuMancare{" +
            "value=" + value +
            ", pretMancare=" + pretMancare +
            '}';
}

    public void setDesert() {
    }
}

