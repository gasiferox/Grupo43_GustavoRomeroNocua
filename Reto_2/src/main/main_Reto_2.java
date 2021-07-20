/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import Classes.*;
import java.util.Scanner;

/**
 *
 * @author maverick
 */
public class main_Reto_2 {
    
    // Variables to work with colored fonts
//    public static final String ANSI_BLACK = "\u001B[30m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_YELLOW = "\u001B[33m";
//    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";
    
    // Variable to reset font to normal color
//    public static final String ANSI_RESET = "\u001B[0m";
    
    // Variables to work with background colors
//    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
//    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
//    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
//    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
//    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
//    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
//    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
//    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Company company = new Company();
        Company employee = new Company();
        //Company clients = new Company();
                    
                    
        
        boolean exitProgram = false;
        
//        Employee manager = new Employee();
//        Company company = new Company("MinTIC CO", "nit1234", "calle 5", manager);
        
        // First option menu - loop
        while (!exitProgram) {            
            System.out.println("\n\n#########################################################");
            System.out.println("#                      MinTIC 2022                      #");
            System.out.println("#########################################################");
            System.out.println("\nBIENVENIDO AL PROGRAMA DEL RETO # 2");
            System.out.println("\nSELECCIONA UNA OPCIÓN DEL MENÚ");
            System.out.println("\nCon que desea trabajar?");
            System.out.println("\n\t1. EMPRESA");
            System.out.println("\t2. EMPLEADOS");
            System.out.println("\t3. CLIENTES");
            System.out.println("\n\t4. SALIR");
            
            int optMenu1 = input.nextInt();
            
            switch(optMenu1) {
                case 1:
                    //Company company = new Company();
                    company.crudCompany();
                    break;
                case 2:
                    System.out.println("llamar metodo crudEmployee");
                    //Company employee = new Company();
                    employee.crudEmployees();
                    break;
                case 3:
                    System.out.println("llamar método crudClientes");
                    //Company clients = new Company();
                    
                    break;
                case 4:
                    exitProgram = true;
                    System.out.println("===================== SALIENDO DEL PROGRAMA =====================");
                    break;
                default:
                    System.out.println("*** Opción inválida ***");
            }
        }

    }
    
}
