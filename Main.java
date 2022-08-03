package com.tema1;
import com.tema1.entity.Meniu;
import com.tema1.entity.Desert;

public class Main
{
    public static void main(String[] args){
        Meniu meniu1 = new Meniu();
        Desert desert1;
        desert1 = new Desert("Lava cake", meniu1);
        System.out.println(desert1);

        Meniu meniu2 = new Meniu();
        Desert desert2 = new Desert("Apple pie", meniu2);
        System.out.println(desert2);

        Desert desert1_meniu1= new Desert();
        System.out.println(desert1_meniu1);

        desert1_meniu1.setPretDesert(37);
        System.out.println(desert1_meniu1);

        desert1_meniu1.solicitaDesert();
        System.out.println(desert1);
        System.out.println(desert2);
    }
}
