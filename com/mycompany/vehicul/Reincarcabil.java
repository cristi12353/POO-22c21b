/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.vehicul;

/**
 *
 * @author adina
 */
public interface Reincarcabil {
    void reincarca();
    
    default void afiseazaDupaMarca(String marca){
            Vehicul v = (Vehicul) this;
            if(v.marca!=null && v.marca.equals(marca)){
                System.out.println(v);
            }
    }

    default void afiseazaDupaPret(float min, float max){
            Vehicul v = (Vehicul) this;
            if(v.pret >= min && v.pret <= max){
                System.out.println(v);
            }
    }
}
}
