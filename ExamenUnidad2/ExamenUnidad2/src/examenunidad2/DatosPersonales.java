/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examenunidad2;

/**
 *
 * @author sardr
 */
public class DatosPersonales {
    public void Sandra69971() {
        String nombre = "Sandra Lizette Sanchez Ramirez";
        String matricula = "69971";
        String correo = "al069971@uacam.mx";
        
        String resultado = "Nombre: " + nombre + "\n" + "Matrciula: " + matricula + "\n" +"Correo electronico: " + correo;
        
        System.out.println(resultado);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DatosPersonales dato = new DatosPersonales ();
        dato.Sandra69971();
    }
    
}
