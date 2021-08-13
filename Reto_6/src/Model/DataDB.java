/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author maverick
 */
public class DataDB {
    private int idOwner;
    private String owner;
    
    private int idBreed;
    private String breedName;

    public DataDB() {
        this.idOwner = 0;
        this.owner = "";
        
        this.idBreed = 0;
        this.breedName = "";
    }

        
    /**
     * @return the idOwner
     */
    public int getIdOwner() {
        return idOwner;
    }

    /**
     * @param idOwner the idOwner to set
     */
    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    /**
     * @return the owner
     */
    public String getOwner() {
        return owner;
    }

    /**
     * @param owner the owner to set
     */
    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * @return the idBreed
     */
    public int getIdBreed() {
        return idBreed;
    }

    /**
     * @param idBreed the idBreed to set
     */
    public void setIdBreed(int idBreed) {
        this.idBreed = idBreed;
    }

    /**
     * @return the breedName
     */
    public String getBreedName() {
        return breedName;
    }

    /**
     * @param breedName the breedName to set
     */
    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }
    
    
}
