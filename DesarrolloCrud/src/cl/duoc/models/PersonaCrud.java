/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cetecom
 */
public class PersonaCrud {
    private List<Persona> personas = new ArrayList<>();
    private int idPersonaCrud = 1;
    
    
    //Create
    public void agregarPersona(String parNombre){
        Persona nuevaPersona = new Persona(idPersonaCrud++,parNombre);
        personas.add(nuevaPersona);
        System.out.println("Persona agregada!!!");
    }
    
    //Read
    public void listarPersonas(){
        for(Persona i : personas){
            System.out.println("ID: " +  i.getId() + " NOMBRE: " + i.getNombre());
        }
    }
    
    //Update
    public void actualizarPersona(int parId, String parNombreNuevo){
        for(Persona i : personas){
            if(i.getId() == parId){
                i.setNombre(parNombreNuevo);
                System.out.println("Persona actulizada.");
                return;
            }
        }
        System.out.println("Persona no encontrada...");
    }
    
    
    //Delete
    public void eliminarPersona(int parId){
        for(Persona i : personas){
            if(i.getId() == parId){
                personas.remove(i);
                System.out.println("Persona eliminada!!!!!");
                return;
            }
        }
        System.out.println("Persona no encontrada.");
    }
    
}
