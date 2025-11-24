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

//cod Mihaluta Andrei

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
            if (!v.marca.equals(marcaInterzisa) && v.getPret() >= pretMinim) {
                System.out.println(v);
        }
    }
}
//cod Mihaluta Andrei

//cod Prozan Bogdan Madalin
        Scanner in = new Scanner(System.in);
        System.out.println("Introdu marca acceptata: ");
        String marcaAcceptata = in.nextLine();

        System.out.println("Introdu pretul minim: ");
        float pretMin = in.nextFloat();

        System.out.println("Introdu pretul maxim: ");
        float pretMax = in.nextFloat();
        in.nextLine();

        System.out.println("Introdu numarul de vehicule: ");
        int n = in.nextInt();
        in.nextLine();

        int i=0;
        Vehicul[] vehicule= new Vehicul[n];
        vehicule[i] = new Vehicul();

        for(i = 0; i<n; i++){
            vehicule[i] = new Vehicul();

            System.out.print("Marca vehiculului " + (i+1)+": ");
            vehicule[i].marca = in.nextLine();

            System.out.print("Pretul vehiculului " + (i+1)+": ");
            vehicule[i].pret = in.nextFloat();
            in.nextLine();

            if(vehicule[i].marca.equals(marcaAcceptata)){
                System.out.println("Marca ACCEPTATA! ");

            }
            else{
                System.out.println("Marca NEACCEPTATA! ");
            }

            if(vehicule[i].pret>=pretMin&&vehicule[i].pret<=pretMax){
                System.out.println("Pretul este in interval! ");
            }
            else{
                System.out.println("Pretul nu este interval! ");
            }
        }
//cod Prozan Bogdan Madalin

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
