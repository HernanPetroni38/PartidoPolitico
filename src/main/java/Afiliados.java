/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Afiliados extends Persona {

    public Afiliados(int dni, String Nombre) {
        super(dni, Nombre);
    }

    public Afiliados() {
    }  
      
    @Override
    public String Descripcion() {
     return ("Soy afiliado aun partido politico");
    }

    @Override
    public void caminar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void votar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString(){
            
        return Nombre;  
        
    }
}
