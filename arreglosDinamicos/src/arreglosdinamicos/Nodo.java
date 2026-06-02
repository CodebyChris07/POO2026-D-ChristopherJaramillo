/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglosdinamicos;

/**
 *
 * @author ASUS
 */
public class Nodo {
    int dato;
    Nodo next;

    public Nodo() {
        dato = 0;
        next = null;
        
    }

    public Nodo(int a) {
        dato = a;
        next = null;
    }
    public void concatenar(Nodo b){
        next = b;
    }
    public void mostrar(){
        System.out.println("Dato: " + dato + " Next: " + next);
    
    
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
    
    
}
