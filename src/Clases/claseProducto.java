/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Usuario
 */
public class claseProducto {

    public String descripcion;
    public double precio;

    public claseProducto() {
    }

    public claseProducto(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

 
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Descripcion= " + descripcion + " Precio= " + precio;
    }

}
