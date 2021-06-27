
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 * @param <T>
 */
public class Listar<T>  {
    
    public Listar(){
    
        primero=null;
        
    } 
    
    public void setPrimero (T nuevoValor){
    
        primero=nuevoValor;
    
    }
    
    public T getPrimero(){
    
        return primero;
    
    }
    
    int i=0;
    public void agregarEnLista(Object T){
        
        lista.add(i,T);            
        i++;
                
        System.out.println("¿Quiere mostrar la lista?");
        String entradaTeclado;
        Scanner entradaEscaner = new Scanner (System.in); 
        entradaTeclado = entradaEscaner.nextLine(); 
        String per=entradaTeclado.toUpperCase();
        
        if (per.equals("SI")){
            
            Iterator it = lista.iterator();
        
            while (it.hasNext()){
        
            System.out.print(it.next());
            }                
        }
    }

    public T primero;
    ArrayList<Object> lista = new ArrayList<>(2);
}
