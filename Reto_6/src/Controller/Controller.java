/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.DataDB;
import Model.DataModelDB;
import View.IntPets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author maverick
 */
public class Controller implements ActionListener {
    
    private final IntPets view;
    
    public final void events() {
        view.cb_petOwner.addActionListener(this);
        view.cb_breed.addActionListener(this);
    }


    public Controller(IntPets view) {
        this.view = view;
        getOwners();
        Item item = (Item) view.cb_petOwner.getSelectedItem();
        events();
        
        getBreed();
        Item item_breed = (Item) view.cb_breed.getSelectedItem();
        events();
    }

    public final void getOwners() {
        ArrayList<DataDB> list;
        DataModelDB model = new DataModelDB();
        list = model.getOwners(0);
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                int idOwner = list.get(i).getIdOwner();
                String owner = list.get(i).getOwner();
                view.cb_petOwner.addItem(new Item(idOwner, owner));
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron registro de clientes", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public final void getBreed() {
        ArrayList<DataDB> list;
        DataModelDB model = new DataModelDB();
        list = model.getBreed(0);
        if (list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                int idBreed = list.get(i).getIdBreed();
                String breedName = list.get(i).getBreedName();
                view.cb_breed.addItem(new Item(idBreed, breedName));
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se encontraron registro de clientes", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
        }
    }


    @Override
    public void actionPerformed(ActionEvent ae) {

    }
    
    
        
}
