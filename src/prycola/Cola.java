/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prycola;

/**
 *
 * @author robertoarmas
 */
public class Cola{
 
     private Nodo cima;
     private Nodo base;
      
     public Cola(){
          this.cima = null;
     }
     
     public void push(Object dato){
        Nodo nuevo = new Nodo(dato);
        if(this.cima == null){
            this.cima = this.base = nuevo;
            return;
        }
        this.base.setSiguiente(nuevo);
        this.base = nuevo;
     }
     
     public Object peek(){
         return this.cima.getDato();
     }
     
     public Object pop(){
        Nodo aux = this.cima;
        this.cima = aux.getSiguiente();
        return aux.getDato();
     }
     
     public void print(){
         Nodo aux = this.cima;
         while(aux != null){
             System.out.println(aux.getDato());
             aux = aux.getSiguiente();
         }
     }
     
     
     
     public boolean isEmpty(){
         return this.cima == null;
     }
     
     
}