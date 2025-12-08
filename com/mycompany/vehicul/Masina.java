/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicul;

/**
 *
 * @author adina
 */
public class Masina extends Vehicul {
    byte vitezaMaxima;
    
    public Masina(){
        super();
        this.vitezaMaxima=(byte)200;
    }
    public Masina(String marca, float pret, byte vitezaMaxima){
        super(marca, pret);
        this.vitezaMaxima=vitezaMaxima;
    }
    public Masina(Masina other){
        super(other);
        this.vitezaMaxima=other.vitezaMaxima;
    }
    @Override
    public String toString(){
        return super.toString()+" viteza maxima= "+vitezaMaxima;
    }
            //Cod Sumurduc Aurelian-Andrei
    public void Pret_diferit_de_o_valoare(float pret) {
        Vehicul a = (Vehicul) this;
        if(a.pret != pret) {
            System.out.println(a.marca + " are pret diferit de: " + pret);
        }
    }
     Masina v1 =  Masina(test.txt,10);
    v1.SalveazaInFisier();
//Cod Sumurduc Aurelian-Andrei
}
