/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.models;

/**
 *
 * @author Cetecom
 */
public class Electronico extends Producto
{
    private String marca;
    private int garantiaMeses;

    public Electronico() {
    }

    public Electronico(String marca, int garantiaMeses) {
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public Electronico(String marca, int garantiaMeses, String idProducto, String nombre, double precio) {
        super(idProducto, nombre, precio);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String toString() {
        return "Electronico{" + "marca=" + marca + ", garantiaMeses=" + garantiaMeses + '}';
    }
    
    public void extenderGarantia(int mesesExtra){
        this.setGarantiaMeses(garantiaMeses + mesesExtra);
        System.out.println("el producto quedo con: " + garantiaMeses + " meses :D");
    }
}
