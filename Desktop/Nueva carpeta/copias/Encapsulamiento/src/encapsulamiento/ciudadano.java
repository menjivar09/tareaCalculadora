/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulamiento;

/**
 *
 * @author RUBEN
 */
public class ciudadano {
    
    //variable 
    private int edad;
    private String nombre;
    private int experiencia;
    
    //le pasamos los parametros que ya habiamos declarado de tipo publico para inicializar las 
    //variables declaradas arriva
    public void setEdad(int edad){
        //accediendo a la variable que declaramos arriba
        this.edad= edad;
        
        
    }
    public int getedad(){
        return edad;
    }
    
    public void setNombre(String  nombre){
        this.nombre= nombre;
        
        
    }

public String getNombre(){
       return nombre;
        
        
    }
public int getExperiencia(){
    return experiencia;
}

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
}
