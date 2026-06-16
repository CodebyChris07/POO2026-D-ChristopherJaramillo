/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nodos;

/**
 *
 * @author ASUS
 */
public class Nodo {
    String nombre;
    Nodo vecinoIzq;
    Nodo vecinoDer;

    public Nodo(String nombre) {
        this.nombre = nombre;
        vecinoIzq = null;
        vecinoDer = null;
    }
     public void concatenar(Nodo vecinoIzq, Nodo vecinoDer){
        this.vecinoIzq = vecinoIzq;
        this.vecinoDer = vecinoDer;
    }
     public void modificarNombre(String  nombre){
     this.nombre = nombre;
     
     }
     public void modificarVeciIzq(Nodo vecinoIzq){
     this.vecinoIzq = vecinoIzq;
     }
     public void modificarVeciDer(Nodo vecinoDer){
     this.vecinoDer = vecinoDer;
     }
  
     public void mostrar(){
        System.out.println("Dato: " + nombre + " \nVecinoIzquierdo: " + vecinoIzq +
                "\nVecinoDerecho: " + vecinoDer);
    
    
    }
     
            
    
}
