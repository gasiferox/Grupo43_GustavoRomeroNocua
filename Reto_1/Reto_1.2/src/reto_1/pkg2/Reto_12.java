/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_1.pkg2;

import Classes.clsGeneradorCorreos;
//import java.util.Scanner;

/**
 *
 * @author maverick
 */
public class Reto_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        clsGeneradorCorreos generador = new clsGeneradorCorreos();
//        Scanner instScanner = new Scanner(System.in);
        
        String correoNuevo = generador.generarCorreo("gustavo", "romerin", "1987", 3);
        
//        String nombre = instScanner.nextLine();
//        String apellido = instScanner.nextLine();
        
        
//        String correoNuevo = generador.generarCorreo(nombre, apellido, "1987", 3);

        
//        String hash = "#";
        String title = "Título del Programa";
//        System.out.println("\n");
//        for(int i = 0; i < title.length(); i++){
//            System.out.print(hash);
//        }
        
        
        System.out.println("\n\t #########################");
        System.out.println("\t#    "+title+"   #");
        System.out.println("\t #########################");
//        System.out.println(hash*title.length()+7);
        System.out.println("");

        System.out.println("El correo es:" + correoNuevo);
    }
    
}
