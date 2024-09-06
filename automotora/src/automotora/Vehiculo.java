/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automotora;

/**
 *
 * @author Cetecom
 */
public class Vehiculo {
    private String patente, color, num_chasis;
    private int anio, precio;
    private Marca_vehiculo marca;
    private Categoria_vehiculo categoria;

    public Vehiculo() {
    }

    public Vehiculo(String patente, String color, String num_chasis, int anio, int precio, Marca_vehiculo marca, Categoria_vehiculo categoria) {
        this.patente = patente;
        this.color = color;
        this.num_chasis = num_chasis;
        this.anio = anio;
        this.precio = precio;
        this.marca = marca;
        this.categoria = categoria;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNum_chasis() {
        return num_chasis;
    }

    public void setNum_chasis(String num_chasis) {
        this.num_chasis = num_chasis;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Marca_vehiculo getMarca() {
        return marca;
    }

    public void setMarca(Marca_vehiculo marca) {
        this.marca = marca;
    }

    public Categoria_vehiculo getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria_vehiculo categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", color=" + color + ", num_chasis=" + num_chasis + ", anio=" + anio + ", precio=" + precio + ", marca=" + marca + ", categoria=" + categoria + '}';
    }
    
    
    
    public void calcularIvaVehiculo(){
        System.out.println("El valor neto del vehiculo: " + precio);
        System.out.println("El precio del vehiculo con IVA es: " + precio * 1.19);
        
    }    
    
    
    
    
    public void recibirAlgo(int num, String nom, Persona per){
        System.out.println("Parametro entero :  " + num +  "---"  + nom);
        System.out.println("nombre persona: " + per.getNombre());
    }    
    
}
