/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.vehicul;

/**
 *
 * @author adina
 */
//

public class Vehicul implements Reincarcabil{

    private Vector<Vehicul> listaVehicule = new Vector<>();

    public String marca;
    float pret;
    
    public Vehicul(){
        this.marca="Dacia";
        this.pret=0.0f;
    }
    
    public Vehicul(String marca, float pret){
        this.marca=marca;
        this.pret=pret;
    }
    public Vehicul(Vehicul other){
        this.marca=other.marca;
        this.pret=other.pret;
//getter David Dascalu
         public float getPret() {
        return pret;
    }
//getter David Dascalu
    }
    @Override
    public String toString(){
        return "Marca: "+marca+" pret="+pret;
    }
//getter Mihaluta
    public float getPret(){
        return pret;
    }
    @Override
    public void reincarca(){
        System.out.println("Nu se aplica");
    }

    @Override
    public void afiseazaDupaMarca(String marca) {
        if (this.marca != null && this.marca.equals(marca)) {
            System.out.println(this);
        }
    }

    @Override
    public void afiseazaDupaPret(float min, float max) {
        if (this.pret >= min && this.pret <= max) {
            System.out.println(this);
        }
    }
        //Cod Isaia George----
    public boolean verificaPretMaiMic(float pret) {
        if(this.pret < pret)
            return true;
        return false;
    }
    //Cod Isaia George ^

    //COD Panaite Cristian Florin
    public void salveazaInFisier(){
        try {
            try(PrintWriter pw = new PrintWriter(new FileWriter("vehicul.txt", true))) {
                for(Vehicul v : listaVehicule) {
                    pw.println(v.marca + "," + v.pret);
                }
            }
        } catch (Exception e) {
            System.out.println("Eroare la salvarea in fisier: " + e.getMessage());
        }
    }
    private void incarcaDinFisier() {
        try {
            File fisierVehicul = new File("vehicul.txt");
            if (fisierVehicul.exists()) {
                try (BufferedReader reader = new BufferedReader(new FileReader(fisierVehicul))) {
                    String linie;
                    while ((linie = reader.readLine()) != null) {
                        String[] parts = linie.split(";");
                        if (parts.length == 2) {
                            Vehicul t = new Vehicul(parts[0],parts[1]);
                            listaVehicule.add(t);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Eroare la incarcare din fisier: " + e.getMessage());
        }
    }
    public static void salveazaVehiculeCSV(Vehicul[] vehicule, String numeFisier) {
    try (PrintWriter pw = new PrintWriter(new FileWriter(numeFisier))) {
 
        pw.println("marca,pret");
 
        for (Vehicul v : vehicule) {
            if (v != null) {
                pw.println(v.marca + "," + v.pret);
            }
        }
 
        System.out.println("Vehicule salvate în CSV: " + numeFisier);
 
    } catch (IOException e) {
        System.out.println("Eroare la salvare CSV: " + e.getMessage());
    }
}
 
 
    public static List<Vehicul> citesteVehiculeCSV(String numeFisier) {
    List<Vehicul> lista = new ArrayList<>();
 
    try (BufferedReader br = new BufferedReader(new FileReader(numeFisier))) {
        String linie;
 
        br.readLine();
 
        while ((linie = br.readLine()) != null) {
            String[] parts = linie.split(",");
 
            if (parts.length == 2) {
                String marca = parts[0];
                float pret = Float.parseFloat(parts[1]);
 
                lista.add(new Vehicul(marca, pret));
            }
        }
 
    } catch (IOException e) {
        System.out.println("Eroare la citire CSV: " + e.getMessage());
    }
 
    return lista;
}
public static void salveazaVehiculeBinar(List<Vehicul> lista, String numeFisier) {
    try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(numeFisier))) {
 
        for (Vehicul v : lista) {
            dos.writeUTF(v.marca);
            dos.writeFloat(v.pret);
        }
 
        System.out.println("Salvare binara reusita in " + numeFisier);
 
    } catch (IOException e) {
        System.out.println("Eroare la salvarea binara: " + e.getMessage());
    }
}
 
    public static List<Vehicul> citesteVehiculeBinar(String numeFisier) {
    List<Vehicul> lista = new ArrayList<>();
 
    try (DataInputStream dis = new DataInputStream(new FileInputStream(numeFisier))) {
 
        while (true) {
            String marca = dis.readUTF();
            float pret = dis.readFloat();
            lista.add(new Vehicul(marca, pret));
        }
 
    } catch (EOFException e) {
    } catch (IOException e) {
        System.out.println("Eroare la citirea binara: " + e.getMessage());
    }
 
    return lista;
}
    /// COD Panaite Cristian Florin
}
