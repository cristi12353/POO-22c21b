/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicul;

/**
 *
 * @author adina
 */
public class Trotineta extends Vehicul implements Reincarcabil{
    int capacitateBaterie;
    byte autonomieAcumulator;
    
    public Trotineta(){
        super();
        this.capacitateBaterie=50;
        this.autonomieAcumulator=50;
    }
    
    public Trotineta(String marca, float pret,int capacitateBaterie, byte autonomieAcumulator){
        super(marca,pret);
        this.capacitateBaterie=capacitateBaterie;
        this.autonomieAcumulator=autonomieAcumulator;
    }
    
    public Trotineta(Trotineta other){
        super(other);
        this.capacitateBaterie=other.capacitateBaterie;
        this.autonomieAcumulator=other.autonomieAcumulator;
    }

    //Dragaescu Cosmin
    public static void pretmaimic(Trotineta[] v, float pretMaxim) {
        System.out.println("Trotinete cu pret < " + pretMaxim + ":");

        for (int i = 0; i < v.length; i++) {
            if ( v[i].getPret() < pretMaxim) {
                System.out.println(v[i]);
            }
        }
    }
    public static void autonomieminima(Trotineta[] v, byte autonomieMinima) {
        System.out.println("Trotinete cu autonomie >= " + autonomieMinima + ":");

        for (int i = 0; i < v.length; i++) {
            if (v[i].autonomieAcumulator >= autonomieMinima) {
                System.out.println(v[i]);
            }
        }
    }

    
    @Override
    public String toString(){
        return super.toString()+" capacitate baterie "+capacitateBaterie+ " autonomie acumulator= "+ autonomieAcumulator;
    }
    
    @Override
    public void reincarca(){
       System.out.println("Perioada de incarcare="+capacitateBaterie/2);
    }
         //Cod Sumurduc Aurelian-Andrei
    public void Capacitate_mai_mare_de(int capacitate) {
        Trotineta a = (Trotineta) this;
        if(a.capacitateBaterie > capacitate) {
            System.out.println(a.marca + " are capacitate diferita de: " + capacitate);
        }
    }
//Cod Sumurduc Aurelian-Andrei

        //Cod Isaia George----
    public boolean verificaCapacitateMaiMic(int capacitateBaterie){
        if (this.capacitateBaterie < capacitateBaterie){
            return true;
        }
        return false;
    }
    //Cod Isaia George ^

    }
