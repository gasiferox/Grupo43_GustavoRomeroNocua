/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_1.pkg1;

import Classes.clsStudent;

/**
 *
 * @author maverick
 */
public class Reto_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        clsStudent student01 = new clsStudent("Gustavo", "C2-001", 5);
        clsStudent student02 = new clsStudent("Carlos", "C2-002", 2.5);
        clsStudent student03 = new clsStudent("Juan", "C2-003", 1.2);
        clsStudent student04 = new clsStudent("Pedro", "C2-004", 3);
        
        System.out.println("El estudiante " + student01.getNombre() + " " + student01.determinarNotificacion() + " la asignatura.");
        System.out.println("La nota del estudiante en grado americano es: " + student01.convertirSistAmericano());
        System.out.println("\nEl estudiante " + student02.getNombre() + " " + student02.determinarNotificacion() + " la asignatura.");
        System.out.println("La nota del estudiante en grado americano es: " + student02.convertirSistAmericano());
        System.out.println("\nEl estudiante " + student03.getNombre() + " " + student03.determinarNotificacion() + " la asignatura.");
        System.out.println("La nota del estudiante en grado americano es: " + student03.convertirSistAmericano());
        System.out.println("\nEl estudiante " + student04.getNombre() + " " + student04.determinarNotificacion() + " la asignatura.");
        System.out.println("La nota del estudiante en grado americano es: " + student04.convertirSistAmericano());
    }
    
}
