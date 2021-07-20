/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import sun.security.util.Length;

/**
 *
 * @author maverick
 */
public class clsAsegurarClave {

    // no se generaron atributos
    
    // constructor vacio
    public clsAsegurarClave() {
    }
    
    public String asegurarClave(String clave){
        String mensaje = "";
        boolean longitud = false;
        int minusculas = 0, mayusculas = 0, numeric = 0, espacio = 0, esp_caracter = 0;
        
        if(clave.length() >= 6 && clave.length() <= 12){
            longitud = true;
        }else{
            System.out.println("La longitud no cumple con las condiciones");
            longitud = false;
        }

        for(int i = 0; i < clave.length(); i++){
            char ch = clave.charAt(i);
            //minusculas = false
            if(ch >= 'a' && ch <= 'z'){
                minusculas ++;
                //break;
            //}else{
                //System.out.println("No tiene minusculas");
            }
        }
        
        for(int i = 0; i < clave.length(); i++){
            char ch = clave.charAt(i);
            if(ch >= 'A' && ch <= 'Z'){
                mayusculas ++;
            }
        }
        
        for(int i = 0; i < clave.length(); i++){
            char ch = clave.charAt(i);
            if(ch >= 0 && ch <= 9){
                numeric ++;
            }
        }
        
        for(int i = 0; i < clave.length(); i++){
            char ch = clave.charAt(i);
            if(ch == ' '){
                espacio ++;
            }
        }
        
        for(int i = 0; i < clave.length(); i++){
            char ch = clave.charAt(i);
            if(ch == '#'){
                esp_caracter ++;
            }
        }
        
        if(longitud == true && minusculas != 0 && mayusculas != 0 && numeric != 0 && espacio == 0 && esp_caracter != 0){
            mensaje = "CORRECTA";
        }else{
            mensaje = "INCORRECTA";
        }
        
        return mensaje;
    }
    
}
