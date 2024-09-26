/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cl.duoc.listasarray;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class ClDuocListasArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<String> mascotas = new ArrayList<>();
        
        mascotas.add("Perro");
        mascotas.add("Gato");
        mascotas.add("Leon");
        mascotas.add("Tigre");
        mascotas.add("Cocodrilo");
        
        
        String nombre = "perro";
        System.out.println(nombre);
        
        
        mascotas.remove("Perro");
        System.out.println(mascotas.get(3));
        System.out.println(mascotas.contains("Perro"));
        System.out.println(mascotas.indexOf("Leon"));
        System.out.println(mascotas.size());
        //mascotas.clear();
        
        System.out.println(mascotas);
        
        for(String i : mascotas){
            System.out.println(i);
        }
        
    }
    
}
