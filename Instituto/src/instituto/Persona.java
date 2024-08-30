/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package instituto;

/**
 *
 * @author Cetecom
 */
public class Persona {
    private String nombre, fecha_nacimiento, correo, rut;
    private int telefono, numero_casa;
    private double altura,peso;

    public Persona() {
    }

    public Persona(String nombre, String fecha_nacimiento, String correo, String rut, int telefono, int numero_casa, double altura, double peso) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.correo = correo;
        this.rut = rut;
        this.telefono = telefono;
        this.numero_casa = numero_casa;
        this.altura = altura;
        this.peso = peso;
    }
    
    
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getNumero_casa() {
        return numero_casa;
    }

    public void setNumero_casa(int numero_casa) {
        this.numero_casa = numero_casa;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    @Override
    public String toString(){
        return "Rut: " + rut + "\n" +
               "Nombre: " + nombre +
                "Telefono: " + telefono;
    }
    
    
    
    public void caminar(){
        System.out.println("Soy " + nombre + " y estoy caminando...");
    }
    
    
    public int pruebaMetodo(int numero){
        return numero;
    }
    
    
    
    
    
}




