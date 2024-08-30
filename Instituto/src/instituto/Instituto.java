/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instituto;

import java.util.Scanner;

/**
 *
 * @author Cetecom
 */
public class Instituto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Hoooooola!!!");
        
        Persona personaUno = new Persona();
        personaUno.setRut("12.123.123-5");
        personaUno.setNombre("Pedro");
        
        System.out.println(personaUno);
         

        Persona personaDos = new Persona("Mario", "30-05-1993", "mario@gmail.com", "45.123.123-K", 912345678, 1110, 1.73, 45);
     
        System.out.println(personaDos + " ---- " +  personaUno);
        
        
        personaUno.caminar();
        personaDos.caminar();
        
        System.out.println(personaUno.pruebaMetodo(100));
        
        
        
        int opcion = 0;
        
        while(opcion != 3){
            System.out.println("-----Menu-----");
            System.out.println("Opcion 1");
            System.out.println("Opcion 2");
            System.out.println("Salir");
            
            opcion = entrada.nextInt();
        }

        
        
        
        
        
               
        
    }
}
