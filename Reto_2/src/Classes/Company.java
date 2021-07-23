/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author maverick
 */
public class Company {

    // Variables to work with colored fonts
//    public static final String ANSI_BLACK = "\u001B[30m";
//    public static final String ANSI_RED = "\u001B[31m";
//    public static final String ANSI_GREEN = "\u001B[32m";
//    public static final String ANSI_YELLOW = "\u001B[33m";
//    public static final String ANSI_BLUE = "\u001B[34m";
//    public static final String ANSI_PURPLE = "\u001B[35m";
//    public static final String ANSI_CYAN = "\u001B[36m";
//    public static final String ANSI_WHITE = "\u001B[37m";
//    
    // Variable to reset font to normal color
//    public static final String ANSI_RESET = "\u001B[0m";
    
//    // Variables to work with background colors
//    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
//    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
//    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
//    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
//    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
//    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
//    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
//    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    
    // Local vars
    private String coName;
    private String nit;
    private String address;
    private Employee employee;
    private Client client;
    private static Scanner input = new Scanner(System.in);
    
    // Constructor empty
    public Company() {
    }
     
    // Constructor full
    public Company(String coName, String nit, String address, Employee employee) {
        this.coName = coName;
        this.nit = nit;
        this.address = address;
        this.employee = employee;
    }
    
        
    // Encapsulated vars
    /**
     * @return the coName
     */
    public String getCoName() {
        return coName;
    }

    /**
     * @param coName the coName to set
     */
    public void setCoName(String coName) {
        this.coName = coName;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the employee
     */
    public Employee getEmployee() {
        return employee;
    }

    /**
     * @param employee the employee to set
     */
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    /**
     * @return the client
     */
    public Client getClient() {
        return client;
    }

    /**
     * @param client the client to set
     */
    public void setClient(Client client) {
        this.client = client;
    }

    
    // Custom methods and functions
    public void crudCompany()  {
        
        // Lists defined
        LinkedList<Company> listCompanies = new LinkedList<>();

        
        boolean exit = false;
        while (!exit) {
            
            // Instanced objects
            Employee legalRepre = new Employee();
            //Company company = new Company();
            Position position = new Position();
            
            System.out.println("\n\n#########################################################");
            System.out.println("#                      MinTIC 2022                      #");
            System.out.println("#                        EMPRESAS                       #");
            System.out.println("#########################################################");
            System.out.println("\nSELECCIONA UNA OPCIÓN DEL MENÚ\n");
            System.out.println("\t1. CREAR EMPRESA");
            System.out.println("\t2. LISTAR EMPRESAS");
            System.out.println("\t3. EDITAR EMPRESA");
            System.out.println("\t4. BORRAR EMPRESA");
            System.out.println("\n\t5. REGRESAR AL MENÚ ANTERIOR");

            int optMenu2 = Integer.parseInt(input.nextLine());

            switch(optMenu2) {
                case 1:
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                     CREAR EMPRESA                     #");
                    System.out.println("#########################################################");
                    System.out.println("\n\tIngrese los datos de la empresa");
                    System.out.print("\n\tRazón social: ");
                    // Referenced to local variables
                    this.coName = input.nextLine();

                    System.out.print("\tIngrese el NIT: ");
                    this.nit = input.nextLine();

                    System.out.print("\tIngrese la dirección: ");
                    this.address = input.nextLine();

                    // Referenced to legalRepre object
                    System.out.print("\tNombre del Representante Legal: ");
                    legalRepre.setName(input.nextLine());

                    System.out.print("\tApellido del Representante Legal: ");
                    legalRepre.setLastname(input.nextLine());

                    System.out.print("\tDocumento del Representante Legal: ");
                    legalRepre.setId(input.nextLine());

                    System.out.print("\tCorreo electrónico del representante legal: ");
                    legalRepre.setEmail(input.nextLine());

                    System.out.println("\tCargo dentro de la empresa: \n");
                    
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                         CARGOS                        #");
                    System.out.println("#########################################################");
                    System.out.println("\nSELECCIONE EL CARGO DEL EMPLEADO\n");
                    System.out.println("\t1. DIRECTOR");
                    System.out.println("\t2. GERENTE");
                    System.out.println("\t3. SUPERVISOR");
                    System.out.println("\t4. ANALISTA");

                    int jobTitleOpt = Integer.parseInt(input.nextLine());
                    switch (jobTitleOpt) {
                        case 1:
                            position.setTitle("Director");  // Referenced to position object
                            legalRepre.setPosition(position);
                            break;
                        case 2:
                            position.setTitle("Gerente");
                            legalRepre.setPosition(position);
                            break;
                        case 3:
                            position.setTitle("Supervisor");
                            legalRepre.setPosition(position);
                            break;
                        case 4:
                            position.setTitle("Analista");
                            legalRepre.setPosition(position);
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }

                    System.out.print("\tNivel del cargo: ");
                    
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                         CARGOS                        #");
                    System.out.println("#########################################################");
                    System.out.println("\nSELECCIONE EL CARGO DEL EMPLEADO\n");
                    System.out.println("\t1. NIVEL - 1");
                    System.out.println("\t2. NIVEL - 2");
                    System.out.println("\t3. NIVEL - 3");

                    int jobLevelOpt = Integer.parseInt(input.nextLine());
                    switch (jobLevelOpt) {
                        case 1:
                            position.setLevel("Nivel - 1");
                            legalRepre.setPosition(position);
                            break;
                        case 2:
                            position.setLevel("Nivel - 2");
                            legalRepre.setPosition(position);
                            break;
                        case 3:
                            position.setLevel("Nivel - 3");
                            legalRepre.setPosition(position);
                            break;
                        default:
                            System.out.println("========== Ha intoducido una opción inválida!! ==========");
                    }
                    
                    System.out.println("\nES ADMINISTRATIVO?\n");
                    System.out.println("\t1. SI");
                    System.out.println("\t2. NO");

                    int empTypeOpt = Integer.parseInt(input.nextLine());
                    switch (empTypeOpt) {
                        case 1:
                            legalRepre.setAdmin(true);
                            break;
                        case 2:
                            legalRepre.setAdmin(false);
                            break;
                        default:
                            System.out.println("========== Ha intoducido una opción inválida!! ==========");
                    }
                    
                    System.out.print("\nINGRESE EL SALARIO: ");
                    legalRepre.setSalary(Integer.parseInt(input.nextLine()));

                    Company company = new Company(this.coName, this.nit, this.address, legalRepre);

                    listCompanies.add(company);

                    System.out.println("\n======================= EMPRESA CREADA CON ÉXITO =======================");

                    break;
                case 2:
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                  LISTADO DE EMPRESAS                  #");
                    System.out.println("#########################################################");

                    for (int i = 0; i < listCompanies.size(); i++) {
                        System.out.println("\n                     " + "[" + i + "] EMPRESA " + (i + 1));

                        company = listCompanies.get(i);

                        System.out.println("=========================================================\n");
                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                        System.out.println("Correo electrónico del Representante Legal: " + company.employee.getEmail());
                        System.out.println("Cargo dentro de la empresa: " + company.getEmployee().getPosition().getTitle());
                        System.out.println("Nivel: " + company.getEmployee().getPosition().getLevel());
                        System.out.println("Salario: $" + company.getEmployee().getSalary());
                        
                        if (company.getEmployee().isAdmin()) {
                            System.out.println("Administrativo: Si");
                        } else {
                            System.out.println("Administrativo: No");
                        }
                            
                        System.out.println("\n");
                    }
                    break;
                    
                case 3:
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                     EDITAR EMPRESA                    #");
                    System.out.println("#########################################################");
                    System.out.println("\nIngrese el indice de la empresa a editar:\n");
                    int editIndex = Integer.parseInt(input.nextLine());
                    if (editIndex >= 0 && editIndex < listCompanies.size()) {
                        company = listCompanies.get(editIndex);
                        System.out.println("\n             INFORMACIÓN ACTUAL DEL EMPLEADO");
                        System.out.println("=========================================================\n");
                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                        System.out.println("Correo electrónico del Representante Legal: " + company.employee.getEmail());
                        System.out.println("Cargo dentro de la empresa: " + company.getEmployee().getPosition().getTitle());
                        System.out.println("Nivel: " + company.getEmployee().getPosition().getLevel());
                        System.out.println("Salario: $" + company.getEmployee().getSalary());
                        if (company.getEmployee().isAdmin()) {
                            System.out.println("Administrativo: Si");
                        } else {
                            System.out.println("Administrativo: No");
                        }
                        System.out.println("\n");

                        System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\t10. Salario\n\t11. Estatus de administrador\n\t12. Terminar edición");
                        System.out.println("\nQue campo desea cambiar?\n");
                        
                        boolean exitEdit = false;
                        while (!exitEdit) {
                            int opt = Integer.parseInt(input.nextLine());
                            switch (opt) {
                                case 1:
                                    System.out.print("Nueva Razón social: ");
                                    String newCoName = input.nextLine();
                                    company.setCoName(newCoName);
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("Correo electrónico del Representante Legal: " + company.employee.getEmail());
                                        System.out.println("Cargo dentro de la empresa: " + company.getEmployee().getPosition().getTitle());
                                        System.out.println("Nivel: " + company.getEmployee().getPosition().getLevel());
                                        System.out.println("Salario: $" + company.getEmployee().getSalary());
                                        if (company.getEmployee().isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\t10. Salario\n\t11. Estatus de administrador\n\t12. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 2:
                                    System.out.print("Nuevo NIT: ");
                                    company.setNit(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("Correo electrónico del Representante Legal: " + company.employee.getEmail());
                                        System.out.println("Cargo dentro de la empresa: " + company.getEmployee().getPosition().getTitle());
                                        System.out.println("Nivel: " + company.getEmployee().getPosition().getLevel());
                                        System.out.println("Salario: $" + company.getEmployee().getSalary());
                                        if (company.getEmployee().isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\t10. Salario\n\t11. Estatus de administrador\n\t12. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 3:
                                    System.out.print("Nueva dirección: ");
                                    company.setAddress(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("Correo electrónico del Representante Legal: " + company.employee.getEmail());
                                        System.out.println("Cargo dentro de la empresa: " + company.getEmployee().getPosition().getTitle());
                                        System.out.println("Nivel: " + company.getEmployee().getPosition().getLevel());
                                        System.out.println("Salario: $" + company.getEmployee().getSalary());
                                        if (company.getEmployee().isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\t10. Salario\n\t11. Estatus de administrador\n\t12. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 4:
                                    System.out.print("Nuevo nombre del Representante Legal: ");
                                    company.employee.setName(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("Correo electrónico del Representante Legal: " + company.employee.getEmail());
                                        System.out.println("Cargo dentro de la empresa: " + company.getEmployee().getPosition().getTitle());
                                        System.out.println("Nivel: " + company.getEmployee().getPosition().getLevel());
                                        System.out.println("Salario: $" + company.getEmployee().getSalary());
                                        if (company.getEmployee().isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\t10. Salario\n\t11. Estatus de administrador\n\t12. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 5:
                                    System.out.print("Nuevo apellido del Representante Legal: ");
                                    company.employee.setLastname(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("Correo electrónico del Representante Legal: " + company.employee.getEmail());
                                        System.out.println("Cargo dentro de la empresa: " + company.getEmployee().getPosition().getTitle());
                                        System.out.println("Nivel: " + company.getEmployee().getPosition().getLevel());
                                        System.out.println("Salario: $" + company.getEmployee().getSalary());
                                        if (company.getEmployee().isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\t10. Salario\n\t11. Estatus de administrador\n\t12. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 6:
                                    System.out.print("Nuevo documento Representante Legal: ");
                                    company.employee.setId(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("Correo electrónico del Representante Legal: " + company.employee.getEmail());
                                        System.out.println("Cargo dentro de la empresa: " + company.getEmployee().getPosition().getTitle());
                                        System.out.println("Nivel: " + company.getEmployee().getPosition().getLevel());
                                        System.out.println("Salario: $" + company.getEmployee().getSalary());
                                        if (company.getEmployee().isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\t10. Salario\n\t11. Estatus de administrador\n\t12. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 7:
                                    System.out.print("Nuevo correo electrónico: ");
                                    company.employee.setEmail(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("Correo electrónico del Representante Legal: " + company.employee.getEmail());
                                        System.out.println("Cargo dentro de la empresa: " + company.getEmployee().getPosition().getTitle());
                                        System.out.println("Nivel: " + company.getEmployee().getPosition().getLevel());
                                        System.out.println("Salario: $" + company.getEmployee().getSalary());
                                        if (company.getEmployee().isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\t10. Salario\n\t11. Estatus de administrador\n\t12. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 8:
                                    System.out.print("Nuevo nombre del cargo del representante legal: ");
                                    company.employee.getPosition().setTitle(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("Correo electrónico del Representante Legal: " + company.employee.getEmail());
                                        System.out.println("Cargo dentro de la empresa: " + company.getEmployee().getPosition().getTitle());
                                        System.out.println("Nivel: " + company.getEmployee().getPosition().getLevel());
                                        System.out.println("Salario: $" + company.getEmployee().getSalary());
                                        if (company.getEmployee().isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\t10. Salario\n\t11. Estatus de administrador\n\t12. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 9:
                                    System.out.print("Nuevo nivel de cargo del Representante Legal: ");
                                    company.employee.getPosition().setLevel(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("Correo electrónico del Representante Legal: " + company.employee.getEmail());
                                        System.out.println("Cargo dentro de la empresa: " + company.getEmployee().getPosition().getTitle());
                                        System.out.println("Nivel: " + company.getEmployee().getPosition().getLevel());
                                        System.out.println("Salario: $" + company.getEmployee().getSalary());
                                        if (company.getEmployee().isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\t10. Salario\n\t11. Estatus de administrador\n\t12. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 10:
                                    System.out.print("Nuevo Salario del Representante Legal: ");
                                    company.employee.setSalary(Integer.parseInt(input.nextLine()));
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("Correo electrónico del Representante Legal: " + company.employee.getEmail());
                                        System.out.println("Cargo dentro de la empresa: " + company.getEmployee().getPosition().getTitle());
                                        System.out.println("Nivel: " + company.getEmployee().getPosition().getLevel());
                                        System.out.println("Salario: $" + company.getEmployee().getSalary());
                                        if (company.getEmployee().isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\t10. Salario\n\t11. Estatus de administrador\n\t12. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 11:
                                    System.out.print("\nEl empleado es administrativo?\n");
                                    System.out.println("\n\t1. Sí");
                                    System.out.println("\t2. No\n");

                                    int empTypeOptEd = Integer.parseInt(input.nextLine());
                                    switch (empTypeOptEd) {
                                        case 1:
                                            company.employee.setAdmin(true);
                                            break;
                                        case 2:
                                            company.employee.setAdmin(false);
                                            break;
                                        default:
                                            System.out.println("========== Ha intoducido una opción inválida!! ==========");
                                    }
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("Correo electrónico del Representante Legal: " + company.employee.getEmail());
                                        System.out.println("Cargo dentro de la empresa: " + company.employee.getPosition().getTitle());
                                        System.out.println("Nivel: " + company.employee.getPosition().getLevel());
                                        System.out.println("Salario: $" + company.getEmployee().getSalary());
                                        if (company.getEmployee().isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\t10. Salario\n\t11. Estatus de administrador\n\t12. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 12:
                                    exitEdit = true;
                                    break;
                                default:
                                    System.out.println("========== Ha intoducido una opción inválida!! ==========");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                     BORRAR EMPRESA                    #");
                    System.out.println("#########################################################");
                    System.out.println("\nIngrese el indice de la empresa a borrar:\n");
                    int optRemove = Integer.parseInt(input.nextLine());
                    if (optRemove >= 0 && optRemove < listCompanies.size()) {
                        company = listCompanies.get(optRemove);
                        System.out.println("\n                INFORMACIÓN DE LA EMPRESA");
                        System.out.println("\n                     " + "[" + optRemove + "] EMPRESA " + (optRemove + 1));
                        System.out.println("=========================================================\n");
                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                        System.out.println("Correo electrónico del Representante Legal: " + company.employee.getEmail());
                        System.out.println("Cargo dentro de la empresa: " + company.getEmployee().getPosition().getTitle());
                        System.out.println("Nivel: " + company.getEmployee().getPosition().getLevel());
                        System.out.println("Salario: $" + company.getEmployee().getSalary());
                        if (company.getEmployee().isAdmin()) {
                            System.out.println("Administrativo: Si");
                        } else {
                            System.out.println("Administrativo: No");
                        }
                        System.out.println("\n");
                        
                        System.out.print("\n\nRealmente quiere borrar esta empresa? (Si / No) ");
                        String remove = input.nextLine();
                        if (remove.equals("Si") || remove.equals("s") || remove.equals("Sí") || remove.equals("S")) {
                            listCompanies.remove(optRemove);
                            System.out.println("================== EMPRESA BORRADA!! ====================");
                        }else {
                            System.out.println("================ OPERACIÓN CANCELADA!! ==================");
                        }
                    }

                    break;
                case 5:
                    exit = true;
                    System.out.println("============= VOLVIENDO AL MENÚ ANTERIOR ================");
                    break;
                default:
                    System.out.println("========== Ha intoducido una opción inválida!! ==========");

            }

        }
    }

    
    public void crudEmployees() {
            
        // Lists defined
        LinkedList<Employee> listEmployees = new LinkedList<>();

        
        boolean exit = false;
        while (!exit) {
            
            // Instanced objects
            Employee employee = new Employee();
            //Company company = new Company();
            Position position = new Position();
            
            System.out.println("\n\n#########################################################");
            System.out.println("#                      MinTIC 2022                      #");
            System.out.println("#                        EMPLEADOS                      #");
            System.out.println("#########################################################");
            System.out.println("\nSELECCIONA UNA OPCIÓN DEL MENÚ\n");
            System.out.println("\t1. CREAR EMPLEADO");
            System.out.println("\t2. LISTAR EMPLEADOS");
            System.out.println("\t3. EDITAR EMPLEADO");
            System.out.println("\t4. BORRAR EMPLEADO");
            System.out.println("\n\t5. REGRESAR AL MENÚ ANTERIOR");

            int optMenu2 = Integer.parseInt(input.nextLine());

            switch(optMenu2) {
                case 1:
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                     CREAR EMPLEADO                    #");
                    System.out.println("#########################################################");
                    System.out.println("\n\tIngrese los datos del empleado");
                    System.out.print("\n\tNombre: ");
                    // Referenced to local variables
                    employee.setName(input.nextLine());

                    System.out.print("\tApellido: ");
                    employee.setLastname(input.nextLine());

                    System.out.print("\tDocumento de identificación: ");
                    employee.setId(input.nextLine());

                    System.out.print("\tCorreo electrónico: ");
                    employee.setEmail(input.nextLine());

                    System.out.print("\tSalario: ");
                    employee.setSalary(Integer.parseInt(input.nextLine()));

                    System.out.println("\tCargo: \n");
                    
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                         CARGOS                        #");
                    System.out.println("#########################################################");
                    System.out.println("\nSELECCIONE EL CARGO DEL EMPLEADO\n");
                    System.out.println("\t1. DIRECTOR");
                    System.out.println("\t2. GERENTE");
                    System.out.println("\t3. SUPERVISOR");
                    System.out.println("\t4. ANALISTA");

                    int jobTitleOpt = Integer.parseInt(input.nextLine());
                    switch (jobTitleOpt) {
                        case 1:
                            position.setTitle("Director");  // Referenced to position object
                            employee.setPosition(position);
                            break;
                        case 2:
                            position.setTitle("Gerente");
                            employee.setPosition(position);
                            break;
                        case 3:
                            position.setTitle("Supervisor");
                            employee.setPosition(position);
                            break;
                        case 4:
                            position.setTitle("Analista");
                            employee.setPosition(position);
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }

                    System.out.print("\tNivel del cargo: ");
                    
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                         CARGOS                        #");
                    System.out.println("#########################################################");
                    System.out.println("\nSELECCIONE EL CARGO DEL EMPLEADO\n");
                    System.out.println("\t1. NIVEL - 1");
                    System.out.println("\t2. NIVEL - 2");
                    System.out.println("\t3. NIVEL - 3");

                    int jobLevelOpt = Integer.parseInt(input.nextLine());
                    switch (jobLevelOpt) {
                        case 1:
                            position.setLevel("Nivel - 1");
                            employee.setPosition(position);
                            break;
                        case 2:
                            position.setLevel("Nivel - 2");
                            employee.setPosition(position);
                            break;
                        case 3:
                            position.setLevel("Nivel - 3");
                            employee.setPosition(position);
                            break;
                        default:
                            System.out.println("========== Ha intoducido una opción inválida!! ==========");
                    }
                    
                    System.out.println("\nES ADMINISTRATIVO?\n");
                    System.out.println("\t1. SI");
                    System.out.println("\t2. NO");

                    int empTypeOpt = Integer.parseInt(input.nextLine());
                    switch (empTypeOpt) {
                        case 1:
                            employee.setAdmin(true);
                            break;
                        case 2:
                            employee.setAdmin(false);
                            break;
                        default:
                            System.out.println("========== Ha intoducido una opción inválida!! ==========");
                    }

                    listEmployees.add(employee);

                    System.out.println("\n======================= EMPLEADO CREADO CON ÉXITO =======================");

                    break;
                case 2:
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                  LISTADO DE EMPLEADOS                 #");
                    System.out.println("#########################################################");

                    for (int i = 0; i < listEmployees.size(); i++) {
                        System.out.println("\n                     " + "[" + i + "] EMPLEADO " + (i + 1));

                        employee = listEmployees.get(i);

                        System.out.println("=========================================================\n");
                        System.out.println("Nombre y apellidos: " + employee.getName() + " " + employee.getLastname() + "\nDocumento de identificación: " + employee.getId());
                        System.out.println("Correo electrónico: " + employee.getEmail());
                        System.out.println("Cargo: " + employee.getPosition().getTitle());
                        System.out.println("Nivel: " + employee.getPosition().getLevel());
                        System.out.println("Salario: $" + employee.getSalary());
                        if (employee.isAdmin()) {
                            System.out.println("Administrativo: Si");
                        } else {
                            System.out.println("Administrativo: No");
                        }
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                     EDITAR EMPLEADO                   #");
                    System.out.println("#########################################################");
                    System.out.println("\nIngrese el indice del empleado a editar:\n");
                    int editIndex = Integer.parseInt(input.nextLine());
                    if (editIndex >= 0 && editIndex < listEmployees.size()) {
                        employee = listEmployees.get(editIndex);
                        System.out.println("\n             INFORMACIÓN ACTUAL DEL EMPLEADO");
                        System.out.println("=========================================================\n");
                        System.out.println("Nombre y apellidos: " + employee.getName() + " " + employee.getLastname() + "\nDocumento de identificación: " + employee.getId());
                        System.out.println("Correo electrónico: " + employee.getEmail());
                        System.out.println("Cargo: " + employee.getPosition().getTitle());
                        System.out.println("Nivel: " + employee.getPosition().getLevel());
                        System.out.println("Salario: $" + employee.getSalary());
                        if (employee.isAdmin()) {
                            System.out.println("Administrativo: Si");
                        } else {
                            System.out.println("Administrativo: No");
                        }
                        System.out.println("\n");

                        System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Cargo\n\t6. Nivel\n\t7. Salario\n\t8. Estatus de administrador\n\t9. Terminar edición");
                        System.out.println("\nQue campo desea cambiar?\n");
                        
                        boolean exitEdit = false;
                        while (!exitEdit) {
                            int opt = Integer.parseInt(input.nextLine());
                            switch (opt) {
                                case 1:
                                    System.out.print("Nuevo nombre del empleado: ");
                                    employee.setName(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DEL EMPLEADO");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Nombre y apellidos: " + employee.getName() + " " + employee.getLastname() + "\nDocumento de identificación: " + employee.getId());
                                        System.out.println("Correo electrónico: " + employee.getEmail());
                                        System.out.println("Cargo: " + employee.getPosition().getTitle());
                                        System.out.println("Nivel: " + employee.getPosition().getLevel());
                                        System.out.println("Salario: $" + employee.getSalary());
                                        if (employee.isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Cargo\n\t6. Nivel\n\t7. Salario\n\t8. Estatus de administrador\n\t9. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 2:
                                    System.out.print("Nuevo apellido del empleado: ");
                                    employee.setLastname(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DEL EMPLEADO");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Nombre y apellidos: " + employee.getName() + " " + employee.getLastname() + "\nDocumento de identificación: " + employee.getId());
                                        System.out.println("Correo electrónico: " + employee.getEmail());
                                        System.out.println("Cargo: " + employee.getPosition().getTitle());
                                        System.out.println("Nivel: " + employee.getPosition().getLevel());
                                        System.out.println("Salario: $" + employee.getSalary());
                                        if (employee.isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Cargo\n\t6. Nivel\n\t7. Salario\n\t8. Estatus de administrador\n\t9. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 3:
                                    System.out.print("Nuevo documento: ");
                                    employee.setId(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DEL EMPLEADO");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Nombre y apellidos: " + employee.getName() + " " + employee.getLastname() + "\nDocumento de identificación: " + employee.getId());
                                        System.out.println("Correo electrónico: " + employee.getEmail());
                                        System.out.println("Cargo: " + employee.getPosition().getTitle());
                                        System.out.println("Nivel: " + employee.getPosition().getLevel());
                                        System.out.println("Salario: $" + employee.getSalary());
                                        if (employee.isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Cargo\n\t6. Nivel\n\t7. Salario\n\t8. Estatus de administrador\n\t9. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 4:
                                    System.out.print("Nuevo correo electrónico: ");
                                    employee.setEmail(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DEL EMPLEADO");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Nombre y apellidos: " + employee.getName() + " " + employee.getLastname() + "\nDocumento de identificación: " + employee.getId());
                                        System.out.println("Correo electrónico: " + employee.getEmail());
                                        System.out.println("Cargo: " + employee.getPosition().getTitle());
                                        System.out.println("Nivel: " + employee.getPosition().getLevel());
                                        System.out.println("Salario: $" + employee.getSalary());
                                        if (employee.isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Cargo\n\t6. Nivel\n\t7. Salario\n\t8. Estatus de administrador\n\t9. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 5:
                                    System.out.print("Nuevo cargo del empleado: ");
                                    employee.getPosition().setTitle(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DEL EMPLEADO");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Nombre y apellidos: " + employee.getName() + " " + employee.getLastname() + "\nDocumento de identificación: " + employee.getId());
                                        System.out.println("Correo electrónico: " + employee.getEmail());
                                        System.out.println("Cargo: " + employee.getPosition().getTitle());
                                        System.out.println("Nivel: " + employee.getPosition().getLevel());
                                        System.out.println("Salario: $" + employee.getSalary());
                                        if (employee.isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Cargo\n\t6. Nivel\n\t7. Salario\n\t8. Estatus de administrador\n\t9. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 6:
                                    System.out.print("Nuevo nivel de cargo del empleado: ");
                                    employee.getPosition().setLevel(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DEL EMPLEADO");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Nombre y apellidos: " + employee.getName() + " " + employee.getLastname() + "\nDocumento de identificación: " + employee.getId());
                                        System.out.println("Correo electrónico: " + employee.getEmail());
                                        System.out.println("Cargo: " + employee.getPosition().getTitle());
                                        System.out.println("Nivel: " + employee.getPosition().getLevel());
                                        System.out.println("Salario: $" + employee.getSalary());
                                        if (employee.isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Cargo\n\t6. Nivel\n\t7. Salario\n\t8. Estatus de administrador\n\t9. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                     break;
                                case 7:
                                    System.out.print("Nuevo Salario del Representante Legal: ");
                                    employee.setSalary(Integer.parseInt(input.nextLine()));
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DEL EMPLEADO");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Nombre y apellidos: " + employee.getName() + " " + employee.getLastname() + "\nDocumento de identificación: " + employee.getId());
                                        System.out.println("Correo electrónico: " + employee.getEmail());
                                        System.out.println("Cargo: " + employee.getPosition().getTitle());
                                        System.out.println("Nivel: " + employee.getPosition().getLevel());
                                        System.out.println("Salario: $" + employee.getSalary());
                                        if (employee.isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Cargo\n\t6. Nivel\n\t7. Salario\n\t8. Estatus de administrador\n\t9. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                     break;
                                case 8:
                                    System.out.print("\nEl empleado es administrativo?\n");
                                    System.out.println("\n\t1. Sí");
                                    System.out.println("\t2. No\n");

                                    int empTypeOptEd = Integer.parseInt(input.nextLine());
                                    switch (empTypeOptEd) {
                                        case 1:
                                            employee.setAdmin(true);
                                            break;
                                        case 2:
                                            employee.setAdmin(false);
                                            break;
                                        default:
                                            System.out.println("========== Ha intoducido una opción inválida!! ==========");
                                    }
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DEL EMPLEADO");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Nombre y apellidos: " + employee.getName() + " " + employee.getLastname() + "\nDocumento de identificación: " + employee.getId());
                                        System.out.println("Correo electrónico: " + employee.getEmail());
                                        System.out.println("Cargo: " + employee.getPosition().getTitle());
                                        System.out.println("Nivel: " + employee.getPosition().getLevel());
                                        System.out.println("Salario: $" + employee.getSalary());
                                        if (employee.isAdmin()) {
                                            System.out.println("Administrativo: Si");
                                        } else {
                                            System.out.println("Administrativo: No");
                                        }
                                        System.out.println("\n");
                                    System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Cargo\n\t6. Nivel\n\t7. Salario\n\t8. Estatus de administrador\n\t9. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 9:
                                    exitEdit = true;
                                    break;
                                default:
                                    System.out.println("========== Ha intoducido una opción inválida!! ==========");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                     BORRAR EMPLEADO                   #");
                    System.out.println("#########################################################");
                    System.out.println("\nIngrese el indice del empleado a borrar:\n");
                    int optRemove = Integer.parseInt(input.nextLine());
                    if (optRemove >= 0 && optRemove < listEmployees.size()) {
                        employee = listEmployees.get(optRemove);
                        System.out.println("\n                     " + "[" + optRemove + "] EMPLEADO " + (optRemove + 1));
                        System.out.println("\n                INFORMACIÓN DEL EMPLEADO");
                        System.out.println("=========================================================\n");
                        System.out.println("Nombre y apellidos: " + employee.getName() + " " + employee.getLastname() + "\nDocumento de identificación: " + employee.getId());
                        System.out.println("Correo electrónico: " + employee.getEmail());
                        System.out.println("Cargo: " + employee.getPosition().getTitle());
                        System.out.println("Nivel: " + employee.getPosition().getLevel());
                        System.out.println("Salario: $" + employee.getSalary());
                        if (employee.isAdmin()) {
                            System.out.println("Administrativo: Si");
                        } else {
                            System.out.println("Administrativo: No");
                        }
                        System.out.println("\n");
                        
                        System.out.print("\n\nRealmente quiere borrar a este empleado? (Si / No) ");
                        String remove = input.nextLine();
                        if (remove.equals("Si") || remove.equals("s") || remove.equals("Sí") || remove.equals("S")) {
                            listEmployees.remove(optRemove);
                            System.out.println("================== EMPLEADO BORRADO!! ====================");
                        }else {
                            System.out.println("================ OPERACIÓN CANCELADA!! ==================");
                        }
                    }

                    break;
                case 5:
                    exit = true;
                    System.out.println("============= VOLVIENDO AL MENÚ ANTERIOR ================");
                    break;
                default:
                    System.out.println("========== Ha intoducido una opción inválida!! ==========");

            }

        }
        
    }

    
    public void crudClients() {
            
        // Lists defined
        LinkedList<Client> listClients = new LinkedList<>();

        
        boolean exit = false;
        while (!exit) {
            
            // Instanced objects
            Client client = new Client();
            
            System.out.println("\n\n#########################################################");
            System.out.println("#                      MinTIC 2022                      #");
            System.out.println("#                        CLIENTES                       #");
            System.out.println("#########################################################");
            System.out.println("\nSELECCIONA UNA OPCIÓN DEL MENÚ\n");
            System.out.println("\t1. CREAR CLIENTE");
            System.out.println("\t2. LISTAR CLIENTES");
            System.out.println("\t3. EDITAR CLIENTE");
            System.out.println("\t4. BORRAR CLIENTE");
            System.out.println("\n\t5. REGRESAR AL MENÚ ANTERIOR");

            int optMenu2 = Integer.parseInt(input.nextLine());

            switch(optMenu2) {
                case 1:
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                     CREAR CLIENTE                     #");
                    System.out.println("#########################################################");
                    System.out.println("\n\tIngrese los datos del empleado");
                    System.out.print("\n\tNombre: ");
                    // Referenced to local variables
                    client.setName(input.nextLine());

                    System.out.print("\tApellido: ");
                    client.setLastname(input.nextLine());

                    System.out.print("\tDocumento de identificación: ");
                    client.setId(input.nextLine());

                    System.out.print("\tCorreo electrónico: ");
                    client.setEmail(input.nextLine());

                    System.out.print("\tDirección: ");
                    client.setAddress(input.nextLine());

                    System.out.print("\tTeléfono: ");
                    client.setPhone(input.nextLine());

                    // Object employee added to client list
                    listClients.add(client);

                    System.out.println("\n======================= EMPLEADO CREADO CON ÉXITO =======================");

                    break;
                case 2:
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                  LISTADO DE CLIENTES                  #");
                    System.out.println("#########################################################");

                    for (int i = 0; i < listClients.size(); i++) {
                        System.out.println("\n                     " + "[" + i + "] CLIENTE " + (i + 1));

                        client = listClients.get(i);

                        System.out.println("=========================================================\n");
                        System.out.println("Nombre y apellidos: " + client.getName() + " " + client.getLastname() + "\nDocumento de identificación: " + client.getId());
                        System.out.println("Correo electrónico: " + client.getEmail());
                        System.out.println("Dirección: " + client.getAddress());
                        System.out.println("Teléfono: " + client.getPhone());
                        System.out.println("\n");
                    }
                    break;
                case 3:
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                     EDITAR CLIENTE                    #");
                    System.out.println("#########################################################");
                    System.out.println("\nIngrese el indice del empleado a editar:\n");
                    int editIndex = Integer.parseInt(input.nextLine());
                    if (editIndex >= 0 && editIndex < listClients.size()) {
                        client = listClients.get(editIndex);
                        System.out.println("\n             INFORMACIÓN ACTUAL DEL CLIENTE");
                        System.out.println("=========================================================\n");
                        System.out.println("Nombre y apellidos: " + client.getName() + " " + client.getLastname() + "\nDocumento de identificación: " + client.getId());
                        System.out.println("Correo electrónico: " + client.getEmail());
                        System.out.println("Dirección: " + client.getAddress());
                        System.out.println("Teléfono: " + client.getPhone());
                        System.out.println("\n");

                        System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Dirección\n\t6. Teléfono\n\n\t7. Terminar edición");
                        System.out.println("\nQue campo desea cambiar?\n");
                        
                        boolean exitEdit = false;
                        while (!exitEdit) {
                            int opt = Integer.parseInt(input.nextLine());
                            switch (opt) {
                                case 1:
                                    System.out.print("Nuevo nombre del cliente: ");
                                    client.setName(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DEL CLIENTE");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Nombre y apellidos: " + client.getName() + " " + client.getLastname() + "\nDocumento de identificación: " + client.getId());
                                        System.out.println("Correo electrónico: " + client.getEmail());
                                        System.out.println("Dirección: " + client.getAddress());
                                        System.out.println("Teléfono: " + client.getPhone());
                                        System.out.println("\n");
                                    System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Dirección\n\t6. Teléfono\n\n\t7. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 2:
                                    System.out.print("Nuevo apellido del cliente: ");
                                    client.setLastname(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DEL CLIENTE");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Nombre y apellidos: " + client.getName() + " " + client.getLastname() + "\nDocumento de identificación: " + client.getId());
                                        System.out.println("Correo electrónico: " + client.getEmail());
                                        System.out.println("Dirección: " + client.getAddress());
                                        System.out.println("Teléfono: " + client.getPhone());
                                        System.out.println("\n");
                                    System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Dirección\n\t6. Teléfono\n\n\t7. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 3:
                                    System.out.print("Nuevo documento del cliente: ");
                                    client.setId(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DEL CLIENTE");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Nombre y apellidos: " + client.getName() + " " + client.getLastname() + "\nDocumento de identificación: " + client.getId());
                                        System.out.println("Correo electrónico: " + client.getEmail());
                                        System.out.println("Dirección: " + client.getAddress());
                                        System.out.println("Teléfono: " + client.getPhone());
                                        System.out.println("\n");
                                    System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Dirección\n\t6. Teléfono\n\n\t7. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 4:
                                    System.out.print("Nuevo correo electrónico del cliente: ");
                                    client.setEmail(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DEL CLIENTE");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Nombre y apellidos: " + client.getName() + " " + client.getLastname() + "\nDocumento de identificación: " + client.getId());
                                        System.out.println("Correo electrónico: " + client.getEmail());
                                        System.out.println("Dirección: " + client.getAddress());
                                        System.out.println("Teléfono: " + client.getPhone());
                                        System.out.println("\n");
                                    System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Dirección\n\t6. Teléfono\n\n\t7. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 5:
                                    System.out.print("Nueva dirección del cliente: ");
                                    client.setAddress(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DEL CLIENTE");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Nombre y apellidos: " + client.getName() + " " + client.getLastname() + "\nDocumento de identificación: " + client.getId());
                                        System.out.println("Correo electrónico: " + client.getEmail());
                                        System.out.println("Dirección: " + client.getAddress());
                                        System.out.println("Teléfono: " + client.getPhone());
                                        System.out.println("\n");
                                    System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Dirección\n\t6. Teléfono\n\n\t7. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    break;
                                case 6:
                                    System.out.print("Nuevo número telefónico del cliente: ");
                                    client.setPhone(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DEL CLIENTE");
                                        System.out.println("=========================================================\n");
                                        System.out.println("Nombre y apellidos: " + client.getName() + " " + client.getLastname() + "\nDocumento de identificación: " + client.getId());
                                        System.out.println("Correo electrónico: " + client.getEmail());
                                        System.out.println("Dirección: " + client.getAddress());
                                        System.out.println("Teléfono: " + client.getPhone());
                                        System.out.println("\n");
                                    System.out.println("\t1. Nombre\n\t2. Apellido\n\t3. Documento de identificación\n\t4. Correo electrónico\n\t5. Dirección\n\t6. Teléfono\n\n\t7. Terminar edición");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                     break;
                                case 7:
                                    exitEdit = true;
                                    break;
                                default:
                                    System.out.println("========== Ha intoducido una opción inválida!! ==========");
                            }
                        }
                    }
                    break;
                case 4:
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                     BORRAR CLIENTE                    #");
                    System.out.println("#########################################################");
                    System.out.println("\nIngrese el indice del cliente a borrar:\n");
                    int optRemove = Integer.parseInt(input.nextLine());
                    if (optRemove >= 0 && optRemove < listClients.size()) {
                        client = listClients.get(optRemove);
                        System.out.println("\n                     " + "[" + optRemove + "] EMPLEADO " + (optRemove + 1));
                        System.out.println("\n                INFORMACIÓN DEL CLIENTE");
                        System.out.println("=========================================================\n");
                        System.out.println("Nombre y apellidos: " + client.getName() + " " + client.getLastname() + "\nDocumento de identificación: " + client.getId());
                        System.out.println("Correo electrónico: " + client.getEmail());
                        System.out.println("Dirección: " + client.getAddress());
                        System.out.println("Teléfono: " + client.getPhone());
                        System.out.println("\n");
                        
                        System.out.print("\n\nRealmente quiere borrar a este Cliente? (Si / No) ");
                        String remove = input.nextLine();
                        if (remove.equals("Si") || remove.equals("s") || remove.equals("Sí") || remove.equals("S")) {
                            listClients.remove(optRemove);
                            System.out.println("================== CLIENTE BORRADO!! ====================");
                        }else {
                            System.out.println("================ OPERACIÓN CANCELADA!! ==================");
                        }
                    }

                    break;
                case 5:
                    exit = true;
                    System.out.println("============= VOLVIENDO AL MENÚ ANTERIOR ================");
                    break;
                default:
                    System.out.println("========== Ha intoducido una opción inválida!! ==========");

            }

        }
        
    }
    
}