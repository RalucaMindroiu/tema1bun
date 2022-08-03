package com.tema1.entity;

public class Salate {
    private static int globalId = 1;
    private int id;
    private String name;
    private Meniu meniu;

    public Salate() {

    }

    public Salate(String name, Meniu meniu) {
        this.id = globalId;
        globalId++;
        this.name = name;
        this.meniu = meniu;
    }

    public Meniu getMeniu() {
        return meniu;
    }

    @Override
    public String toString() {
        return "Salate{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", meniu=" + meniu +
                '}';
    }

}