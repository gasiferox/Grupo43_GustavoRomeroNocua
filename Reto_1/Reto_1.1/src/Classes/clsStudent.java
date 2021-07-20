/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * && open the template in the editor.
 */
package Classes;

/**
 *
 * @author maverick
 */
public class clsStudent {
    private String nombre;
    private String codigo;
    private double notaFinal;    

    
    public clsStudent(String nombre, String codigo, double notaFinal) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.notaFinal = notaFinal;
    }
    
    
    public String determinarNotificacion(){
        String message = "";
        if (this.notaFinal >= 0 && this.notaFinal <= 5){

            if(this.notaFinal >= 3 && this.notaFinal <= 5){
                message = "gana";
            }
            else if(this.notaFinal >= 2.2 && this.notaFinal < 3){
                message = "recupera";
            }
            else if(this.notaFinal >= 0 && this.notaFinal < 2.2){
                message = "pierde";
            }
        }
        else{
            message = "***ERROR***";
            System.out.println("La nota introducida no es válida.");
        }
        return message;
    }
    
    public char convertirSistAmericano(){
        char letraNota = 'A';
        
        double gradoNumerico = this.notaFinal * 100 / 5;

        if (this.notaFinal >= 0 && this.notaFinal <= 5){
            if(gradoNumerico >= 90 && gradoNumerico <= 100){
                letraNota='A';
            }
            else if(gradoNumerico >= 80 && gradoNumerico < 90){
                letraNota='B';
            }
            else if(gradoNumerico >= 70 && gradoNumerico < 80){
                letraNota='C';
            }
            else if(gradoNumerico >= 69 && gradoNumerico < 70){
                letraNota='D';
            }
            else{
                letraNota='F';
            }
        }
        else{
            letraNota = 'E';
            System.out.println("***ERROR*** La nota no es válida!");
        }
        
        return letraNota;

    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the notaFinal
     */
    public double getNotaFinal() {
        return notaFinal;
    }

    /**
     * @param notaFinal the notaFinal to set
     */
    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
}
