/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.vehicul;

/**
 *
 * @author adina
 */
public class MainVehicul {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicul v1, v2, v3;
        Masina m1, m2, m3;
        Electrica e1, e2, e3;
        Trotineta t1, t2, t3;

        v1 = new Vehicul();
        v2 = new Vehicul("Peugeot", 3000.99f);
        v3 = new Vehicul(v2);

        m1 = new Masina("Ford", 20000f, (byte) 180);
        m2 = new Masina();
        m3 = new Masina(m1);

        e1 = new Electrica();
        e2 = new Electrica("Tesla", 300000f, (byte) 250, 100);
        e3 = new Electrica(e2);

        t1 = new Trotineta("Xiaomi", 1200f, 50, (byte) 30);
        t2 = new Trotineta();
        t3 = new Trotineta(t1);

        System.out.println("Vehicule create:\n");
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(m1);
        System.out.println(e2);
        System.out.println(t1);

        System.out.println("\nTest reincarcare");
        e1.reincarca();
        e2.reincarca();
        e3.reincarca();
        t1.reincarca();

        Reincarcabil[] vect = new Reincarcabil[]{v1, v2, v3, m1, m2, m3, e1, e2, e3, t1, t2, t3};
        
//cod David Dascalu
        Vehicul[] masini = {
                new Vehicul("Dacia", 30000),
                new Vehicul("BMW", 80000),
                new Vehicul("Audi", 45000),
                new Vehicul("Renault", 28000),
                new Vehicul("BMW", 60000)
        };

        String marcaInterzisa = "BMW";
        float pretMaxim = 50000;

        System.out.println("Vehicule permise:");

        for (Vehicul v : masini) {
            if (!v.marca.equals(marcaInterzisa) && v.getPret() <= pretMaxim) {
                System.out.println(v);
            }
        }
    }
}
//cod David Dascalu

        System.out.println("\nAfisare dupa marca 'Tesla':");
        for (Reincarcabil item : vect) {
            item.afiseazaDupaMarca("Tesla");
        }

        System.out.println("\nAfisare dupa pret intre 1000 si 100000:");
        for (Reincarcabil item : vect) {
            item.afiseazaDupaPret(1000f, 100000f);
        }
        
    }
    
}
