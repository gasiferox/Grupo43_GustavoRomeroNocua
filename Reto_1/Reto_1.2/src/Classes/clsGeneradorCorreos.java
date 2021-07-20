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
public class clsGeneradorCorreos {

    // No se generaron atributos para la clase
    
    //constructor vacio ya que no hay parámetros
    public clsGeneradorCorreos() {
    }
    
    public String generarCorreo(String nombre, String apellido, String agnio, int opcion){
        
        final String CORREO="@misiontic.com";
        String nuevoCorreo = "";

        if(opcion == 1){
            nuevoCorreo = nombre.substring(0,1) + apellido.substring(0,1) + CORREO;
        }
        else if(opcion == 2){
            nuevoCorreo = nombre.substring(0,3) + apellido.substring(0,2) + CORREO;
        }
        else if(opcion == 3){
            nuevoCorreo = nombre.substring(0,3) + apellido.substring(apellido.length()-2, apellido.length()) + agnio + CORREO;
        }
        
        return nuevoCorreo;
    }
    
}
