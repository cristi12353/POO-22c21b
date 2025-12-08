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
        List<Object> listaVehicule = new ArrayList<>();
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
        
        //Dragaescu Cosmin
        Trotineta[] trotinete=new Trotineta[3];
        trotinete[0]= new Trotineta ("Myiria",1200,60,(byte) 50);
        trotinete[1]= new Trotineta("Kukirin",2000,100,(byte) 70);
        trotinete[2]= new Trotineta("Xiaomi",1700,150,(byte) 65);


        //Dragaescu Cosmin
        System.out.println("\n Afisare in functie de pret: ");
        Trotineta.pretmaimic(trotinete,2000);
        System.out.println("\n Afisare in functie de autonimia acumulatorului: ");
        Trotineta.autonomieminima(trotinete,(byte)65);
        
//cod David Dascalu
        Object[] vehicule = {
            new Vehicul("Dacia", 30000f),
            new Vehicul("BMW", 80000f),
            new Vehicul("Audi", 45000f),
            new Vehicul("Renault", 28000f),
            new Vehicul("BMW", 60000f),
            new Masina("BMW", 75000f, 5),
            new Electrica("Tesla", 300000f, (byte)250, 100),
            new Trotineta("Xiaomi", 500f, 25)
        };

        String marcaInterzisa = "BMW";
        float pretMaxim = 50000f;

        System.out.println("Vehicule permise:");

        for (Object obj : vehicule) {
            if (obj instanceof Vehicul) {
                Vehicul v = (Vehicul) obj;
            if (!v.marca.equals(marcaInterzisa) && v.getPret() <= pretMaxim) {
                System.out.println(v);
            }
        }
    }
}
//cod David Dascalu

//cod Mihaluta Andrei

        Object[] vector = new Object[5];

        vector[0] = new Vehicul("BMW", 25000f);
        vector[1] = new Vehicul("Audi", 15000f);
        vector[2] = new Vehicul("Mercedes", 500f);
        vector[3] = new Vehicul("Toyota", 800f);
        vector[4] = new Vehicul();

        for (int i = 0; i < vector.length; i++) {
            Vehicul v = (Vehicul) vector[i];
            System.out.println(v);
        }
    }
}
//cod Mihaluta Andrei

//cod Prozan Bogdan Madalin
            for(Object o : listaVehicule) {
            System.out.println(o);
            if(o instanceof Reincarcabil) {
                ((Reincarcabil)o).reincarca();
            }
            System.out.println("----------------------------");
//cod Prozan Bogdan Madalin

        System.out.println("\nAfisare dupa marca 'Tesla':");
        for (Reincarcabil item : vect) {
            item.afiseazaDupaMarca("Tesla");
        }

        System.out.println("\nAfisare dupa pret intre 1000 si 100000:");
        for (Reincarcabil item : vect) {
            item.afiseazaDupaPret(1000f, 100000f);
        }

        //Cod Isaia George---
        Object[] trotinete = new Trotineta[5];
        trotinete[0] = new Trotineta("Xiaomi", 2000.0f, 300, (byte)20);
        trotinete[1] = new Trotineta("Samsung", 2500.0f, 600, (byte)50);
        trotinete[2] = new Trotineta("Razer", 1500.0f, 250, (byte)15);
        trotinete[3] = new Trotineta("Huawei", 3000.0f, 500, (byte)35);
        trotinete[4] = new Trotineta("Apple", 2750.0f, 500, (byte)40);

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti maxim pret: ");
        float pret = sc.nextFloat();
        System.out.println("Introduceti maxim capacitate baterie");
        int capacitate = sc.nextInt();
        for(Object tr : trotinete){
            if(tr instanceof Trotineta){
                Trotineta vr = (Trotineta) tr;
                if(vr.verificaPretMaiMic(pret) && vr.verificaCapacitateMaiMic(capacitate)){
                    System.out.println(tr);
                }
            }

        }
        //Cod Isaia George ^

// Cod Sumurduc Aurelian-Andrei
            Vehicul[] vector1 = new Vehicul[3];
            vector1[0] = new Vehicul();
            vector1[1] = new Vehicul("Toyota", 2999.99f);
            Vehicul alt1 = new Vehicul("Dacia", 1999.99f);
            vector1[2] = new Vehicul(alt1);
            System.out.println(vector1[0]);
            System.out.println(vector1[1]);
            System.out.println(vector1[2]);


            Trotineta[] vector2 = new Trotineta[3];
            vector2[0] = new Trotineta();
            vector2[1] = new Trotineta("Samsung", 399.99f,20, (byte) 50);
            Trotineta alt1 = new Trotineta("SteelSeries", 249.99f, 22, (byte) 40);
            vector2[2] = new Trotineta(alt1);
            System.out.println(vector2[0]);
            System.out.println(vector2[1]);
            System.out.println(vector2[2]);

// Cod Sumurduc Aurelian-Andrei

                ////lungu florin
       
        Masina[] masini = {
                new Masina("Tesla", 50000f, (byte) 250), 
                new Masina("Nissan", 35000f, (byte) 200),
                new Masina("Audi", 60000f, (byte) 220), // Audi, Preț 60000
                new Masina("Renault", 45000f, (byte) 180) // Renault, Preț 45000
            };

       
            String marcaInterzisa = "Audi";  // Marca interzisă este Audi
            float pretMaxim = 45000f;        // Prețul maxim permis este 45000

           
            System.out.println("Masini permise (fără marca interzisă și cu preț <= " + pretMaxim + "):");
            for (Masina m : masini) {
               
                if (!m.marca.equals(marcaInterzisa) && m.getPret() <= pretMaxim) {
                    System.out.println(m);  
        
    }
            }
}
     //// lungu florin
        
    }
//COD Dragnea CrIstian Romeo
    Trotineta[] trotinete = new Trotineta[5];
    trotinete[0] = new Trotineta("Xiaomi", 2000.0f, 300, (byte)20);
    trotinete[1] = new Trotineta("Kukirin", 2500.0f, 600, (byte)50);
    trotinete[2] = new Trotineta("Razer", 1500.0f, 250, (byte)15);
    trotinete[3] = new Trotineta("Huawei", 3000.0f, 500, (byte)35);
    trotinete[4] = new Trotineta("Apple", 2750.0f, 500, (byte)40);

    Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti maxim pret: ");
    float pret = sc.nextFloat();
        System.out.println("Introduceti maxim capacitate baterie");
    byte autonomie = sc.nextByte();
        for(Trotineta a : trotinete){
        if(a.verifPret(pret) && a.verifAutonomieAcc(autonomie)){
            System.out.println(a);
        }
    }
//cod Dragnea Cristian

    //COD Panaite Cristian Florin
    //de apelat functia salveazaInFisier() din Vehicul.java
    Vehicul v4 = new Vehicul("TestMarca", 12345.67f);
    v4.salveazaInFisier();
    //COD Panaite Cristian Florin

    
}
