/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab7p2_luiscastro;

/**
 *
 * @author lfern
 */
public class Producto {
    private int id;
    private String nombre;
    private int category;
    private double precio;
    private int aisle;
    private int bin;

    public Producto(int id, String nombre, int category, double precio, int aisle, int bin) {
        this.id = id;
        this.nombre = nombre;
        this.category = category;
        this.precio = precio;
        this.aisle = aisle;
        this.bin = bin;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public int getBin() {
        return bin;
    }

    public void setBin(int bin) {
        this.bin = bin;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", nombre=" + nombre + ", category=" + category + ", precio=" + precio + ", aisle=" + aisle + ", bin=" + bin + '}';
    }
    
}
