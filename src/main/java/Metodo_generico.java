/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Metodo_generico<U> {
    
        public Metodo_generico(){
    
        primero=null;
        
    } 
    
    public void setPrimero (U nuevoValor){
    
        primero=nuevoValor;
    
    }
    
    public U getPrimero(){
    
        return primero;
    
    }
   
    public U primero;
}
