
package Clases;

public class claseLineItems {

    public double cantidad;

    public claseLineItems() {
    }

    public claseLineItems(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    //calcular el precio total
    public double getPrecioTotal(int cantidad, double precio) {
        double preciototal = 0;
        preciototal = cantidad * precio;
        return preciototal;
    }

    @Override
    public String toString() {
        return " Cantidad=" + cantidad;
    }

}

