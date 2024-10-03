/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desarrollocrud;

import cl.duoc.models.PersonaCrud;

/**
 *
 * @author Cetecom
 */
public class DesarrolloCrud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PersonaCrud crud = new PersonaCrud();
        
        crud.agregarPersona("Mario");
        crud.agregarPersona("Juan");
        crud.agregarPersona("Luiggi");
        crud.agregarPersona("Pedro");
        crud.agregarPersona("Jorge");
        crud.agregarPersona("Fabian");
        crud.agregarPersona("David");
        crud.agregarPersona("Cristopher");
                
        crud.actualizarPersona(98, "Sin nombre");
        
        crud.eliminarPersona(8);
        
        crud.listarPersonas();
    }
    
}
