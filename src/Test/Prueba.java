
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Clases.claseDomicilio;
import Clases.claseFacturas;
import Clases.claseLineItems;
import Clases.claseProducto;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Prueba { 

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //crear un objeto de la factura
        claseFacturas objfacturas = new claseFacturas();
        //declarar variables
        String nombre;
        String calle;
        String ciudad;
        String Estado;
        String descripcion;
        double precio;
        double preciototal = 0;
        int cantidad;
        String si = "1";
        //ingresar datos
        System.out.println("Ingrese Nombre");
        nombre = teclado.next();
        System.out.println("Ingrese Calle");
        calle = teclado.next();
        System.out.println("Ingrese Ciudad");
        ciudad = teclado.next();
        System.out.println("Ingrese Estado");
        Estado = teclado.next();
        claseDomicilio dos = new claseDomicilio(nombre, calle, ciudad, Estado);
        objfacturas.doimicilio(dos);
        //opccion de ingresar as datos pero solo la condicion esta en 3
        while (si.equals("1")) {
            System.out.println("Descripcion");
            descripcion = teclado.next();
            System.out.println("Precio");
            precio = teclado.nextDouble();
            System.out.println("Cantidad");
            cantidad = teclado.nextInt();
            claseProducto p = new claseProducto(descripcion, precio);
            claseLineItems l = new claseLineItems(cantidad);
            objfacturas.producto(p);
            objfacturas.item(l);
            preciototal = preciototal + l.getPrecioTotal(cantidad, precio);
            System.out.println("Desea ingresar otro producto [1]Si No[2]");
            si = teclado.next();
        }
        //presento los datos
        System.out.println(objfacturas.unir() + preciototal);
        try {
            File f = new File("Datos.txt");
            FileWriter fw;
            BufferedWriter bw;
            if (f.exists()) {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.newLine();
                bw.write(objfacturas.unir() + " " + preciototal);
            } else {
                fw = new FileWriter(f, true);
                bw = new BufferedWriter(fw);
                bw.write(objfacturas.unir() + " " + preciototal);
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
        }
    }
}
