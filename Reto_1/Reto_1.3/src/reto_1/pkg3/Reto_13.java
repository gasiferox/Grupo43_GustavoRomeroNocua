/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_1.pkg3;

import Classes.clsAsegurarClave;
import java.util.Scanner;

/**
 *
 * @author maverick
 */
public class Reto_13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner inClave = new Scanner(System.in);
        String clave;
        System.out.println("Por favor ingrese la clave:");
        clave = inClave.nextLine();
        
        clsAsegurarClave inst_clave = new clsAsegurarClave();
        String nueva_clave = inst_clave.asegurarClave(clave);
        
        System.out.println("La nueva clave es: " + nueva_clave + " " + clave);
        
    }
    
}
