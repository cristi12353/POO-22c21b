/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.vehicul;

/**
 *
 * @author adina
 */
public class Electrica extends Masina implements Reincarcabil{
    int capacitateBaterie;
    
    /*public Electrica(){
        super();
        this.capacitateBaterie=200;
    }*/
            
    public Electrica(String marca, float pret, byte vitezaMaxima, int capacitateBaterie){
        super(marca,pret,vitezaMaxima);
        this.capacitateBaterie=capacitateBaterie;
    }
    
    public Electrica(Electrica other){
        super(other);
        this.capacitateBaterie=other.capacitateBaterie;
    }
    
    @Override
    public String toString(){
        return super.toString()+" capacitate baterie"+ capacitateBaterie;
    }
    
    @Override
    public void reincarca(){
       System.out.println("Perioada de incarcare="+capacitateBaterie/10);
    }
    //cod Dragnea Cristian Romeo
    public static void scrieFisierElectrica(ArrayList<Electrica> listaElectrica, String numeFisier) {
    try{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(numeFisier));
        oos.writeObject(listaElectrica);
        System.out.println("S-a scris");
        oos.close();
    } catch(Exception e){
        e.printStackTrace();
    }
}

public static ArrayList<Electrica> citesteElectricaFisier(String numeFisier){
    try{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(numeFisier));
        return (ArrayList<Electrica>) ois.readObject();
    } catch(Exception e){
        e.printStackTrace();
        return new ArrayList<>();
    }
}
 //cod Dragnea Cristian Romeo
}
