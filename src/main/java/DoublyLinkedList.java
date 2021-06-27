/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LENOVO
 */
public class DoublyLinkedList {
    private Link head;
    private int size;
    
    public DoublyLinkedList() {
        
        head = null;
        size = 0;
    
    }
    
    public void addFront (int data){
        
        if (head == null)
            head = new Link(null, data, null);
        else {
            
            Link newLink = new Link(null, data, null);
            head.previous = newLink;
            head = newLink;
            
            }
            size++;
        }
        
        public int size(){
            
            return size;
            
        }
        
        public void print(){
            
            Link current = head;
            while (current != null){
                
                System.out.print(current.Data());
                current = current.next;
                
            }
        }
        
        
        public boolean isEmpty() {
        
        return head == null;
        
        }
    }
    

    
    

