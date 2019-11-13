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
public class Encapsulamiento {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       //instaanciamos la clase ciudadano
       ciudadano C= new ciudadano();
        
        C.setNombre("Paulo Dybala");
        System.out.println("el nombre del ciudadano es: "+C.getNombre());
        
        
        C.setEdad(30);
         System.out.println("la edad es: "+C.getedad());
         
         
       C.setExperiencia(12);
         System.out.println("Su experiencia laboral es de: "+C.getExperiencia ());
      
    }
    
}
