/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

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
    
    public void crudPosition() {
        
        boolean exitJobs = false;
        while (!exitJobs) {
        
            System.out.println("\n\n#########################################################");
            System.out.println("#                      MinTIC 2022                      #");
            System.out.println("#                         CARGOS                        #");
            System.out.println("#########################################################");
            System.out.println("\nSELECCIONA UNA OPCIÓN DEL MENÚ\n");
            System.out.println("\t1. CREAR EMPRESA");
            System.out.println("\t2. LISTAR EMPRESAS");
            System.out.println("\t3. EDITAR EMPRESA");
            System.out.println("\t4. BORRAR EMPRESA");
            System.out.println("\n\t5. REGRESAR AL MENÚ ANTERIOR");

        }
    }


    
}
