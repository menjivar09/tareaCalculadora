
package Persona;


public class persona {
    private String nombre;
    private int edad;
    private String trabajo;
    
    
    
  
      public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }
    public void imprimirinformacion(){
       System.out.println("Nombre: "+nombre);
       System.out.println("Edad: "+edad);
       System.out.println("lugar de trabajo: "+trabajo);
       
       
   }
}

       
    

    