/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.claseDomicilio;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class claseFacturas {
    
    ArrayList<claseDomicilio> d = new ArrayList();
    ArrayList<claseLineItems> l = new ArrayList();
    ArrayList<claseProducto> p = new ArrayList();

    public void doimicilio(claseDomicilio dos) {
        d.add(dos);
    }

    public void producto(claseProducto po) {
        p.add(po);
    }

    public void item(claseLineItems li) {
        l.add(li);
    }

    public String unir() {
        String concatenar = "";
        String producto = "";
        for (int i = 0; i < 3; i++) {
            producto = producto + " " + p.get(i) + " " + l.get(i) + "\n";
        }
        for (claseDomicilio domicilio : d) {
            concatenar = domicilio.toString() + "\n" + producto+" Precio Total "  ;
        }
        return concatenar;
    }
}
