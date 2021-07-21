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
    private LinkedList<Company> listCompanies = new LinkedList<>();
    private LinkedList<Employee> listEmployees = new LinkedList<>();
    private LinkedList<Client> listClients = new LinkedList<>();
    private LinkedList<Admin> listAdmins = new LinkedList<>();
    private Scanner input = new Scanner(System.in);
    
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
     * @return the listEmployees
     */
    public LinkedList<Employee> getListEmployees() {
        return listEmployees;
    }

    /**
     * @param listEmployees the listEmployees to set
     */
    public void setListEmployees(LinkedList<Employee> listEmployees) {
        this.listEmployees = listEmployees;
    }

    /**
     * @return the listClients
     */
    public LinkedList<Client> getListClients() {
        return listClients;
    }

    /**
     * @param listClients the listClients to set
     */
    public void setListClients(LinkedList<Client> listClients) {
        this.listClients = listClients;
    }

    /**
     * @return the listAdmins
     */
    public LinkedList<Admin> getListAdmins() {
        return listAdmins;
    }

    /**
     * @param listAdmins the listAdmins to set
     */
    public void setListAdmins(LinkedList<Admin> listAdmins) {
        this.listAdmins = listAdmins;
    }
    
    /**
     * @return the listCompanies
     */
    public LinkedList<Company> getListCompanies() {
        return listCompanies;
    }

    /**
     * @param listCompanies the listCompanies to set
     */
    public void setListCompanies(LinkedList<Company> listCompanies) {
        this.listCompanies = listCompanies;
    }

    
    // Custom methods and functions
    public void crudCompany()  {
        
        boolean exit = false;
        while (!exit) {
            
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
                    this.coName = input.nextLine();

                    System.out.print("\tIngrese el NIT: ");
                    this.nit = input.nextLine();

                    System.out.print("\tIngrese la dirección: ");
                    this.address = input.nextLine();

                    System.out.print("\tNombre del Represente Legal: ");
                    Employee legalRepre = new Employee();
                    legalRepre.setName(input.nextLine());

                    System.out.print("\tApellido del Represente Legal: ");
                    legalRepre.setLastname(input.nextLine());

                    System.out.print("\tDocumento del Represente Legal: ");
                    legalRepre.setId(input.nextLine());

                    System.out.print("\tCorreo electrónico del representante legal: ");
                    legalRepre.setEmail(input.nextLine());

                    Position position = new Position();
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
                            position = new Position();
                            position.setTitle("Director");
                            legalRepre.setPosition(position);
//                            System.out.println("2. " + position.getTitle());
                            System.out.println("3. " + legalRepre.getPosition().getTitle());
                            break;
                        case 2:
                            position.setTitle("Gerente");
                            legalRepre.setPosition(position);
                            System.out.println("3. " + legalRepre.getPosition().getTitle());
                            break;
                        case 3:
                            position.setTitle("Supervisor");
                            legalRepre.setPosition(position);
                            System.out.println("3. " + legalRepre.getPosition().getTitle());
                            break;
                        case 4:
                            position.setTitle("Analista");
                            legalRepre.setPosition(position);
                            System.out.println("3. " + legalRepre.getPosition().getTitle());
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }

                    //position.setTitle(input.nextLine());
//                    employee.crudPosition();
//                    legalRepre.setPosition(position);

                    System.out.print("\tNivel del cargo: ");
//                    position.setLevel(input.nextLine());
//                    legalRepre.setPosition(position);
                    
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
                            System.out.println("1. " + position.getLevel());
//                            legalRepre.setPosition(position);
                            position.setLevel("nivel1");
                            legalRepre.setPosition(position);
                            //legalRepre.setPosition(position);
                            System.out.println("2. " + position.getLevel());
//                            System.out.println("3. " + legalRepre.getPosition().getLevel());
                            break;
                        case 2:
                            position.setLevel("nivel2");
                            legalRepre.setPosition(position);
                            System.out.println(position.getLevel());
                            break;
                        case 3:
                            position.setLevel("nivel3");
                            legalRepre.setPosition(position);
                            System.out.println(position.getLevel());
                            break;
                        default:
                            System.out.println("Opción inválida");
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
                            System.out.println("Comando erroneo");
                    }
                    
                    System.out.print("\nINGRESE EL SALARIO: ");
                    legalRepre.setSalary(Integer.parseInt(input.nextLine()));


                    
//                    legalRepre = new Employee(legalRepre.getSalary(), position.getTitle(), position.getLevel(), legalRepre.isAdmin(), legalRepre.getName(), legalRepre.getLastname(), legalRepre.getId(), legalRepre.getEmail());
                    Company company = new Company(coName, nit, address, legalRepre);

                    listCompanies.add(company);
                    listEmployees.add(legalRepre);
                            
                    
                    for (int i = 0; i < listEmployees.size(); i++) {
                        System.out.println(listEmployees.get(i).toString());
                    }

                    System.out.println("\n======================= EMPRESA CREADA CON ÉXITO =======================");

                    break;
                case 2:
                    System.out.println("\n\n#########################################################");
                    System.out.println("#                      MinTIC 2022                      #");
                    System.out.println("#                  LISTADO DE EMPRESAS                  #");
                    System.out.println("#########################################################");

                    for (int i = 0; i < listCompanies.size(); i++) {
                        //Company listCompany = new Company();
                        System.out.println("\n                        EMPRESA " + (i + 1));

                        //legalRepre = new Employee();

                        company = listCompanies.get(i);
                        //employee = listEmployees.get(i);

                        System.out.println("=========================================================\n");
                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                        System.out.println("Correo electrónico RL: " + company.employee.getEmail());
                        System.out.println("Cargo: " + company.getEmployee().getPosition().getTitle());
                        System.out.println("Nivel: " + company.getEmployee().getPosition().getLevel());
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
                        System.out.println("\n             INFORMACIÓN ACTUAL DE LA EMPRESA");
                        System.out.println("=========================================================\n");
                        System.out.println("\tRazón Social: " + company.coName + "\n\tNIT: " + company.nit + "\n\tDirección: " + company.address);
                        System.out.println("\tRepresentante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\n\tDocumento Representante Legal: " + company.employee.getId());
                        System.out.println("\tCorreo electrónico RL: " + company.employee.getEmail());
                        System.out.println("\tCargo: " + company.employee.getPosition().getTitle() + "\n\tNivel: " + company.employee.getPosition().getLevel());
                        System.out.println("\nQue campo desea cambiar?\n");
                        System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                        
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
                                        System.out.println("\tRazón Social: " + company.coName + "\n\tNIT: " + company.nit + "\n\tDirección: " + company.address);
                                        System.out.println("\tRepresentante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\n\tDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("\tCorreo electrónico RL: " + company.employee.getEmail());
                                        System.out.println("\tCargo: " + company.employee.getPosition().getTitle() + "\n\tNivel: " + company.employee.getPosition().getLevel());
                                        System.out.println("\nQue campo desea cambiar?\n");
                                        System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    break;
                                case 2:
                                    System.out.print("Nuevo NIT: ");
                                    company.setNit(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("\tRazón Social: " + company.coName + "\n\tNIT: " + company.nit + "\n\tDirección: " + company.address);
                                        System.out.println("\tRepresentante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\n\tDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("\tCorreo electrónico RL: " + company.employee.getEmail());
                                        System.out.println("\tCargo: " + company.employee.getPosition().getTitle() + "\n\tNivel: " + company.employee.getPosition().getLevel());
                                        System.out.println("\nQue campo desea cambiar?\n");
                                        System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    break;
                                case 3:
                                    System.out.print("Nueva dirección: ");
                                    company.setAddress(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("\tRazón Social: " + company.coName + "\n\tNIT: " + company.nit + "\n\tDirección: " + company.address);
                                        System.out.println("\tRepresentante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\n\tDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("\tCorreo electrónico RL: " + company.employee.getEmail());
                                        System.out.println("\tCargo: " + company.employee.getPosition().getTitle() + "\n\tNivel: " + company.employee.getPosition().getLevel());
                                        System.out.println("\nQue campo desea cambiar?\n");
                                        System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    break;
                                case 4:
                                    System.out.print("Nuevo nombre del Representante Legal: ");
                                    company.employee.setName(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("\tRazón Social: " + company.coName + "\n\tNIT: " + company.nit + "\n\tDirección: " + company.address);
                                        System.out.println("\tRepresentante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\n\tDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("\tCorreo electrónico RL: " + company.employee.getEmail());
                                        System.out.println("\tCargo: " + company.employee.getPosition().getTitle() + "\n\tNivel: " + company.employee.getPosition().getLevel());
                                        System.out.println("\nQue campo desea cambiar?\n");
                                        System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    break;
                                case 5:
                                    System.out.print("Nuevo apellido del Representante Legal: ");
                                    company.employee.setLastname(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("\tRazón Social: " + company.coName + "\n\tNIT: " + company.nit + "\n\tDirección: " + company.address);
                                        System.out.println("\tRepresentante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\n\tDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("\tCorreo electrónico RL: " + company.employee.getEmail());
                                        System.out.println("\tCargo: " + company.employee.getPosition().getTitle() + "\n\tNivel: " + company.employee.getPosition().getLevel());
                                        System.out.println("\nQue campo desea cambiar?\n");
                                        System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    break;
                                case 6:
                                    System.out.print("Nuevo documento Representante Legal: ");
                                    company.employee.setId(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("\tRazón Social: " + company.coName + "\n\tNIT: " + company.nit + "\n\tDirección: " + company.address);
                                        System.out.println("\tRepresentante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\n\tDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("\tCorreo electrónico RL: " + company.employee.getEmail());
                                        System.out.println("\tCargo: " + company.employee.getPosition().getTitle() + "\n\tNivel: " + company.employee.getPosition().getLevel());
                                        System.out.println("\nQue campo desea cambiar?\n");
                                        System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    break;
                                case 7:
                                    System.out.print("Nuevo correo electrónico: ");
                                    company.employee.setEmail(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("\tRazón Social: " + company.coName + "\n\tNIT: " + company.nit + "\n\tDirección: " + company.address);
                                        System.out.println("\tRepresentante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\n\tDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("\tCorreo electrónico RL: " + company.employee.getEmail());
                                        System.out.println("\tCargo: " + company.employee.getPosition().getTitle() + "\n\tNivel: " + company.employee.getPosition().getLevel());
                                        System.out.println("\nQue campo desea cambiar?\n");
                                        System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    break;
                                case 8:
                                    System.out.print("Nuevo nombre del cargo del representante legal: ");
                                    company.employee.getPosition().setTitle(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("\tRazón Social: " + company.coName + "\n\tNIT: " + company.nit + "\n\tDirección: " + company.address);
                                        System.out.println("\tRepresentante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\n\tDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("\tCorreo electrónico RL: " + company.employee.getEmail());
                                        System.out.println("\tCargo: " + company.employee.getPosition().getTitle() + "\n\tNivel: " + company.employee.getPosition().getLevel());
                                        System.out.println("\nQue campo desea cambiar?\n");
                                        System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    break;
                                case 9:
                                    System.out.print("Nuevo nivel de cargo del Representante Legal: ");
                                    company.employee.getPosition().setLevel(input.nextLine());
                                        System.out.println("\n        INFORMACIÓN ACTUALIZADA DE LA EMPRESA");
                                        System.out.println("=========================================================\n");
                                        System.out.println("\tRazón Social: " + company.coName + "\n\tNIT: " + company.nit + "\n\tDirección: " + company.address);
                                        System.out.println("\tRepresentante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\n\tDocumento Representante Legal: " + company.employee.getId());
                                        System.out.println("\tCorreo electrónico RL: " + company.employee.getEmail());
                                        System.out.println("\tCargo: " + company.employee.getPosition().getTitle() + "\n\tNivel: " + company.employee.getPosition().getLevel());
                                        System.out.println("\nQue campo desea cambiar?\n");
                                        System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    System.out.println("\nQue campo desea cambiar?\n");
                                    System.out.println("\t1. Razón social\n\t2. NIT\n\t3. Dirección\n\t4. Nombre representante legal\n\t5. Apellido representante legal\n\t6. Documento Representante Legal\n\t7. Correo electrónico RL\n\t8. Cargo\n\t9. Nivel\n\n\t10. Terminar");
                                    break;
                                case 10:
                                    exitEdit = true;
                                    break;
                                default:
                                    System.out.println("========== Ha intoducidouna opción inválida!! ==========");
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
                        System.out.println("=========================================================\n");
                        System.out.println("Razón Social: " + company.coName + "\nNIT: " + company.nit + "\nDirección: " + company.address);
                        System.out.println("Representante Legal: " + company.employee.getName() + " " + company.employee.getLastname() + "\nDocumento Representante Legal: " + company.employee.getId());
                        System.out.println("Correo electrónico RL: " + company.employee.getEmail());
                        System.out.println("Cargo: " + company.employee.getPosition().getTitle() + "\nNivel: " + company.employee.getPosition().getLevel());

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
                    System.out.println("========== Ha intoducidouna opción inválida!! ==========");

            }

        }
    }
    
    
//    public void crudEmployees() {
//        
//        Scanner input = new Scanner(System.in);
//        
//        System.out.println("\t\tMinTIC 2022");
//        System.out.println("\n===========================================");
//        System.out.println("\nSELECCIONA UNA OPCIÓN DEL MENÚ");
//        System.out.println("\t1. Crear empleado");
//        System.out.println("\t2. Consultar base de datos de empleados");
//        System.out.println("\t3. Editar empleado");
//        System.out.println("\t2. Borrar empleado");
//
//        int optMenu3 = input.nextInt();
//        
//        switch(optMenu3) {
//            case 1:
//                System.out.println("\tCúantos empleados deseas agregar?");
//                int numEmployees = input.nextInt();
//                for (int i = 0; i < numEmployees; i++) {
//                    System.out.println("\tEmpleado" + (i+1));
//                    System.out.println("\n===========================================");
//                    System.out.println("\tIngrese el nombre: ");
//                    String name = input.next();
//                    
//                    System.out.println("\tIngrese el apellido: ");
//                    String lastname = input.next();
//                    
//                    System.out.println("\tIngrese el documento: ");
//                    String id = input.next();
//                    
//                    System.out.println("\tIngrese el correo electrónico: ");
//                    String email = input.next();
//                    
//                    System.out.println("\tIngrese el salario: ");
//                    int salary = input.nextInt();
//                    
//                    System.out.println("\tIndique el cargo: ");
//                    Position position = new Position();
//                    position.setTitle(input.next());
//                    
//                    System.out.println("\tIndique el nivel del cargo: ");
//                    position.setLevel(input.next());
//                                        
//                    employee = new Employee(salary, position, name, lastname, id, email, admin);
//                    listEmployees.add(employee);
//                    
//                    System.out.println(listEmployees);
//                    
//                }
//                break;
//            case 2:
//                System.out.println("======== BASE DE DATOS DE EMPLEADOS ========");
//                for (int i = 0; i < listEmployees.size(); i++) {
//                    System.out.println("EMPLEADO " + (i + 1));
//                    employee = listEmployees.get(i);
//                    System.out.println("Nombre y apellido: " + employee.getName() + " " + employee.getLastname());
//                    System.out.println("Documento: " + employee.getId());
//                    System.out.println("Correo electrónico: " + employee.getEmail());
//                    System.out.println("Salario: $" + employee.getSalary());
//                    Position position = new Position("","");
//                    System.out.println("Cargo: " + position.getTitle());
//                    System.out.println("Nivel del cargo: " + position.getLevel());
//                }
//                break;
//            case 3:
//                break;
//            case 4:
//                break;
//            default:
//                System.out.println("Opción inválida");
//                
//        }
        
//    }
    
}
