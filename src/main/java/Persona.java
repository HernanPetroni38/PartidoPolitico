/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public abstract class Persona implements Caminar, Votar{
    
    int dni;
    String Nombre;
        
    public abstract String Descripcion ();
    
    public Persona(int dni, String Nombre) {
        this.dni = dni;
        this.Nombre = Nombre;
    }

    public Persona() {
    }
    
    
    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
}
