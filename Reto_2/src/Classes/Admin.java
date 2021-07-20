/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.LinkedList;

/**
 *
 * @author maverick
 */
public class Admin {
    
    private String category;
    private LinkedList<Employee> listSubordintes = new LinkedList<>();

    public Admin(String category) {
        this.category = category;
    }

    public Admin() {
    }
    
    
    
    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the listSubordintes
     */
    public LinkedList<Employee> getListSubordintes() {
        return listSubordintes;
    }

    /**
     * @param listSubordintes the listSubordintes to set
     */
    public void setListSubordintes(LinkedList<Employee> listSubordintes) {
        this.listSubordintes = listSubordintes;
    }
    
}
