package Act2;


import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sardr
 */
public class TablaPeriodic {
   
    
    private double masaAtomica;
    private int numeroAtomico;
    private String simboloQuimico;
    private String nombre;
    private String color;
    
    public static ArrayList<TablaPeriodic> elementos = new ArrayList<>();
    
    public TablaPeriodic() {
    }

    public TablaPeriodic(double masaAtomica, int numeroAtomico, String simboloQuimico, String nombre, String color) {
        this.masaAtomica = masaAtomica;
        this.numeroAtomico = numeroAtomico;
        this.simboloQuimico = simboloQuimico;
        this.nombre = nombre;
        this.color = color;
    }
    
    public static void llenar(){
        insertarTablaPeriodic(14.0067, 7, "N", "Nitrogeno", "Morado");
        insertarTablaPeriodic(58.933195, 27, "Co", "Cobalto", "Amarillo");
        insertarTablaPeriodic(85.4678, 37, "Rb", "Rubidio", "Naranja");
        insertarTablaPeriodic(107.870, 47, "Ag", "Plata", "Amarillo");
    }
    
    public static void insertarTablaPeriodic(double masa, int numero, String simbolo, String nombre, String color){
        elementos.add(new TablaPeriodic(masa,numero, simbolo, nombre, color));
    }   

    public double getMasaAtomica() {
        return masaAtomica;
    }

    public void setMasaAtomica(double masaAtomica) {
        this.masaAtomica = masaAtomica;
    }

    public int getNumeroAtomico() {
        return numeroAtomico;
    }

    public void setNumeroAtomico(int numeroAtomico) {
        this.numeroAtomico = numeroAtomico;
    }

    public String getSimboloQuimico() {
        return simboloQuimico;
    }

    public void setSimboloQuimico(String simboloQuimico) {
        this.simboloQuimico = simboloQuimico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "TablaPeriodica{" + "masaAtomica=" + masaAtomica + ", numeroAtomico=" + numeroAtomico + ", simboloQuimico=" + simboloQuimico + ", nombre=" + nombre + ", color=" + color + '}';
    }
    
}
