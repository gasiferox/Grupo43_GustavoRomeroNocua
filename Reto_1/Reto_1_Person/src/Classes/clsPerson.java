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
public class clsPerson {
    private String name;
    private String surename;
    private int birth_date;
    private char gender;
    private String address;
    private String city;
    private String country;
    private char marital_status;
    private boolean vaccinated;

    public clsPerson(String name, String surename, int birth_date, char gender, 
            String address, String city, String country, char marital_status, 
            boolean vaccinated) {
        this.name = name;
        this.surename = surename;
        this.birth_date = birth_date;
        this.gender = gender;
        this.address = address;
        this.city = city;
        this.country = country;
        this.marital_status = marital_status;
        this.vaccinated = vaccinated;
    }

    public clsPerson() {

    }
    
    public String gotVaccinate(boolean vaccinated){
        String message = "";
        if(vaccinated == true){
            message = "Vacunado";            
        }else{
            message = "No vacunado";
        }
        
        return message;
    }
    
    

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surename
     */
    public String getSurename() {
        return surename;
    }

    /**
     * @param surename the surename to set
     */
    public void setSurename(String surename) {
        this.surename = surename;
    }

    /**
     * @return the birth_date
     */
    public int getBirth_date() {
        return birth_date;
    }

    /**
     * @param birth_date the birth_date to set
     */
    public void setBirth_date(int birth_date) {
        this.birth_date = birth_date;
    }

    /**
     * @return the gender
     */
    public char getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(char gender) {
        this.gender = gender;
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
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the marital_status
     */
    public char getMarital_status() {
        return marital_status;
    }

    /**
     * @param marital_status the marital_status to set
     */
    public void setMarital_status(char marital_status) {
        this.marital_status = marital_status;
    }

    /**
     * @return the vaccinated
     */
    public boolean isVaccinated() {
        return vaccinated;
    }

    /**
     * @param vaccinated the vaccinated to set
     */
    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
