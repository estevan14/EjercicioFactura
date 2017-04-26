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
public class claseDomicilio {

    private String strNombre;
    private String strCalle;
    private String strCiudad;
    private String strEstado;

    public claseDomicilio() {
    }

    public claseDomicilio(String strNombre, String strCalle, String strCiudad, String strEstado) {
        this.strNombre = strNombre;
        this.strCalle = strCalle;
        this.strCiudad = strCiudad;
        this.strEstado = strEstado;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    public String getStrCalle() {
        return strCalle;
    }

    public void setStrCalle(String strCalle) {
        this.strCalle = strCalle;
    }

    public String getStrCiudad() {
        return strCiudad;
    }

    public void setStrCiudad(String strCiudad) {
        this.strCiudad = strCiudad;
    }

    public String getStrEstado() {
        return strEstado;
    }

    public void setStrEstado(String strEstado) {
        this.strEstado = strEstado;
    }

    @Override
    public String toString() {
        return "Nombre=" + strNombre + " Calle=" + strCalle + " Ciudad=" + strCiudad + " Estado=" + strEstado;
    }

}

