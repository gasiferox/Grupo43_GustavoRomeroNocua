/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto_1_Person;

import Classes.clsPerson;
import java.text.SimpleDateFormat;
//import java.time.LocalDate;
//import java.time.Period;
//import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author maverick
 */
public class Reto_1_Person {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //clsPerson person_1 = new clsPerson();
        clsPerson instVacuna = new clsPerson();
        
        //Forma manual de asigar los valores a las variables uno a uno.
//        person_1.setName("Gustavo");
//        person_1.setSurename("Romero");
//        person_1.setBirth_date(1977);
//        person_1.setGender('M');
//        person_1.setAddress("Casa 3, Tribunas");
//        person_1.setCity("Pereira");
//        person_1.setCountry("Colombia");
//        person_1.setMarital_status('S');
//        person_1.setVaccinated(true);
        
        // Asignación de variables mediante constructor.
        clsPerson person_1 = new clsPerson("Gustavo", "Romero", 1977, 'M', "Casa 3, Tribunas", "Pereira", "Colombia", 'M', true);
        clsPerson person_2 = new clsPerson("Laura", "Giraldo", 1995, 'F', "Casa 2, La Castellana", "Manizales", "Colombia", 'S', true);
        clsPerson person_3 = new clsPerson("Alejandro", "Romero", 1979, 'M', "Usaquen 501", "Bogotá", "Colombia", 'D', false);
        clsPerson person_4 = new clsPerson("René", "Medina", 1975, 'M', "Casa 5", "Cali", "Colombia", 'C', false);
        
        // Llamado a la funcion gotVaccinate definida en las clases
        String vacunaPerson1 = instVacuna.gotVaccinate(person_1.isVaccinated());
        String vacunaPerson2 = instVacuna.gotVaccinate(person_2.isVaccinated());
        String vacunaPerson3 = instVacuna.gotVaccinate(person_3.isVaccinated());
        String vacunaPerson4 = instVacuna.gotVaccinate(person_4.isVaccinated());

        
        // Definimos variable para calcular la edad
        Date current_date = new Date();
        SimpleDateFormat getYearFormat = new SimpleDateFormat("yyyy");
        String current_year = getYearFormat.format(current_date);
        //System.out.println(current_year);
        //int current_year = current_date.getDate();
        //String currentYear = getYearFormat.format(date);
        
//        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy");
//        Period agePerson_1 = Period.between(person_1.getBirth_date(), LocalDate.now());
//        System.out.println("La edad de la persona " + person_1.getName() + " " + person_1.getSurename() + " es " + agePerson_1.getYears());
//        
        int year_born = Integer.parseInt(current_year);
        int agePerson_1 = year_born - person_1.getBirth_date();
        int agePerson_2 = year_born - person_2.getBirth_date();
        int agePerson_3 = year_born - person_3.getBirth_date();
        int agePerson_4 = year_born - person_4.getBirth_date();
        
        System.out.println("La edad de la persona " + person_1.getName() + " " + person_1.getSurename() + " es " + agePerson_1 + " , vive en " + person_1.getCity() + "\t*****" + vacunaPerson1 + "*****");
        System.out.println("La edad de la persona " + person_2.getName() + " " + person_2.getSurename() + " es " + agePerson_2 + " , vive en " + person_2.getCity() + "\t*****" + vacunaPerson2 + "*****");
        System.out.println("La edad de la persona " + person_3.getName() + " " + person_3.getSurename() + " es " + agePerson_3 + " , vive en " + person_3.getCity() + "\t*****" + vacunaPerson3 + "*****");
        System.out.println("La edad de la persona " + person_4.getName() + " " + person_4.getSurename() + " es " + agePerson_4 + " , vive en " + person_4.getCity() + "\t\t*****" + vacunaPerson4 + "*****");
    }
    
}
