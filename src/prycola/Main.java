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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cola c = new Cola();
        c.push("Primero en entrar Primero en salir");
        c.push("Otro dato despues");
        c.push("ultimo dato");
        c.print();
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("Mostrar cima:" + c.peek());
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("Sacar cima:" + c.pop());
        System.out.println("Nueva cima:" + c.peek());
        System.out.println("+++++++++++++++++++++++++");
        System.out.println("Sacar:" + c.pop());
        System.out.println("--------------------------");
        System.out.println("Imprimir cola");
        c.print();
       
    }
    
}
