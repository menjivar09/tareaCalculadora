/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajandoconobjetos;

/**
 *
 * @author RUBEN
 */
public class TrabajandoconObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Ingeniero Ingeniero  = new Ingeniero();
        
    Ingeniero.setNombre("Alexander");
    Ingeniero.setApellido("Menjivar");
    Ingeniero.setTrabajo("Ingeniero");
    Ingeniero.setEdad (20);
    Ingeniero.setSexo ("Masculino");
    
System.out.println("Nombre: " + Ingeniero.getNombre() );
System.out.println("apellido: " + Ingeniero.getApellido() );
System.out.println("trabajo: " + Ingeniero.getTrabajo() );
System.out.println("Edad: " + Ingeniero.getEdad() );
System.out.println("Sexo: " + Ingeniero.getSexo() );
}
    
public static class Ingeniero{
    private String nombre;
    private String apellido;
    private String trabajo;
    private int edad;
    private String sexo;  
   
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getTrabajo(){
        return trabajo;
    }
    public int getEdad(){
        return edad;
    }
    public String getSexo(){
        return sexo;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setTrabajo(String trabajo){
        this.trabajo = trabajo;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    
    }

    
}
        // TODO code application logic here
    
    

