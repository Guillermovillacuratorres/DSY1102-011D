/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herencia;

import cl.duoc.models.Gato;
import cl.duoc.models.Perro;

/**
 *
 * @author Cetecom
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro perro = new Perro();
        Gato gato = new Gato();
        
        perro.setNombre("Firualis");
        gato.setNombre("Pancho");
        
        perro.hacerSonido();
        gato.hacerSonido();
    }
    
}



