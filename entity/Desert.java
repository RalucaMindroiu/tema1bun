package com.tema1.entity;

public class Desert extends Salate {

    private int pretDesert;
    public Desert(){
        super();
    }

    public Desert(String lava_cake, Meniu meniu1) {
        super(lava_cake, meniu1);
    }

    public void solicitaDesert(){
        super.getMeniu().setDesert();
    }

    public void setPretDesert(int pretDesert){
        this.pretDesert = pretDesert;
    }
    @Override
    public String toString(){
        return "Desert{"+
                "pretDesert=" + pretDesert +
                '}'+
                "for"+
                super.toString();
    }

}
