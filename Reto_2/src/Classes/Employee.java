/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

//import java.util.Scanner;

/**
 *
 * @author maverick
 */
public class Employee extends Person {
    
    private int salary;
    private Position position;
    private boolean admin;

    public Employee() {
    }

    public Employee(int salary, Position position, boolean admin, String name, String lastname, String id, String email) {
        super(name, lastname, id, email);
        this.salary = salary;
        this.position = position;
        this.admin = admin;
    }

    Employee(int salary, String level, String level0, boolean admin, String name, String lastname, String id, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     * @return the position
     */
    public Position getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Position position) {
        this.position = position;
    }
    
    /**
     * @return the admin
     */
    public boolean isAdmin() {
        return admin;
    }

    /**
     * @param admin the admin to set
     */
    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
    
    
    // Custom methods
    // Handle a Crud Position from the Employee Class
    
//    public void crudPosition() {
//        
//        Scanner input = new Scanner(System.in);
//    
//        position = new Position();
        //boolean exitJobs = false;
        //while (!exitJobs) {
        
//            System.out.println("\n\n#########################################################");
//            System.out.println("#                      MinTIC 2022                      #");
//            System.out.println("#                         CARGOS                        #");
//            System.out.println("#########################################################");
//            System.out.println("\nSELECCIONE EL CARGO DEL EMPLEADO\n");
//            System.out.println("\t1. DIRECTOR");
//            System.out.println("\t2. GERENTE");
//            System.out.println("\t3. SUPERVISOR");
//            System.out.println("\t4. ANALISTA");
//            System.out.println("\n\t5. REGRESAR AL MENÚ ANTERIOR");
//            
//            int jobOpt = Integer.parseInt(input.nextLine());
//            switch (jobOpt) {
//                case 1:
//                    System.out.println(position.getTitle());
//                    position.setTitle("Director");
//                    System.out.println(position.getTitle());
//                    break;
//                case 2:
//                    position.setTitle("Gerente");
//                    break;
//                case 3:
//                    position.setTitle("Supervisor");
//                    break;
//                case 4:
//                    position.setTitle("Analista");
//                    break;
//                case 5:
//                    break;
//                default:
//                    System.out.println("Opción inválida");
//          //  }

//        }
            
//    }



    
}
