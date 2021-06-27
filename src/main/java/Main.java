
import exceptions.RequisitosPresidenteException;
import java.io.IOException;
import java.util.Scanner;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class Main {
    
    public static void main (String[] args){
    
        Candidato candidato1 = new Candidato (38155166,"Carlos Cabral",1);
        Candidato candidato2 = new Candidato (13133133,"Juan Perez",34);
        Candidato candidato3 = new Candidato (14144144,"Miguel Luis",55);
    
       // System.out.println ("Ingrese la edad del presidente");
       // Scanner entrada = new Scanner(System.in);
       // int edad = entrada.nextInt();
    
        Presidente presidente1 = null;
    
        boolean presidenteCreado = false; 
        
        Scanner entrada = new Scanner(System.in);
        
        while (presidenteCreado == false){
        
        //    System.out.println("No se cumplen los requisitos");
            System.out.println ("Ingrese la edad del presidente");
            int edad = entrada.nextInt(); // TODO: esto puede arrojar otra exception , por ejemplo si ingresamos una letra rompe,        
    
            try {    
        
                presidente1 = new Presidente (15155155,"Jorge Avila",edad);
                presidenteCreado = true;
                System.out.println("Se cumplio el requisito");
            } catch (RequisitosPresidenteException e) {
                    
                 System.out.println ("No se cumplen el requisito solicitado");   
                    
            }
        }   
    
        Candidato array[] = {candidato1,candidato2,candidato3};
    
        System.out.println(presidente1.elegir_candidato(array));
 
    /*  Metodo_generico <String> unaCosa = new Metodo_generico <String>();//ejecucion de metodo generico
    
        unaCosa.setPrimero("Jorge");
    
        System.out.println(unaCosa.getPrimero());
    
        Afiliados NuevoAfiliado = new Afiliados (38152654, "Jorge Luis");
    
        Metodo_generico <Afiliados> Nuevo12 = new Metodo_generico <Afiliados>();
   
        Nuevo12.setPrimero(NuevoAfiliado);
    
        System.out.println(Nuevo12.getPrimero()); //hasta aqui llega el desarrollo del metodo generico
    */
        Afiliados Nuevo = new Afiliados (38152654, "Jorge Luis");
        Comunero Nuevo2 = new Comunero (37377377, "Mario Luis");
    
        Listar <Afiliados> Nuevo3 = new Listar <Afiliados>();
        Listar <Comunero> Nuevo4 = new Listar <Comunero>();
      
        Nuevo3.agregarEnLista(Nuevo);
        Nuevo4.agregarEnLista(Nuevo2);
    
        DoublyLinkedList dl1 = new DoublyLinkedList();
        dl1.addFront(5);
        dl1.addFront(10);
        dl1.print();
    
    }
}

