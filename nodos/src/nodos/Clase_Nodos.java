/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nodos;

/**
 *
 * @author ASUS
 */
public class Clase_Nodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nodo nodo1 = new Nodo("Juan");
        Nodo nodo2 = new Nodo("Bri");
        Nodo nodo3 = new Nodo("Chris");
        Nodo nodo4 = new Nodo("Bryan");
        System.out.println("Nodo1 :" + nodo1);
        System.out.println("Nodo2 :" + nodo2);
        System.out.println("Nodo3 :" + nodo3);
        System.out.println("Nodo4 :" + nodo4);
       /* nodo1.mostrar();
        nodo2.mostrar();
        nodo3.mostrar();
        nodo4.mostrar();
        
        nodo1.vecinoDer = nodo2;
        nodo2.vecinoIzq = nodo1;
        nodo2.vecinoDer = nodo3;
        nodo3.vecinoIzq = nodo2;
        nodo3.vecinoDer = nodo4;
        nodo1.mostrar();
        nodo2.mostrar();
        nodo3.mostrar();
       System.out.println(nodo1.vecinoDer.vecinoDer.nombre);
        System.out.println(nodo2.vecinoDer.vecinoIzq.nombre);
        System.out.println(nodo2.vecinoDer.vecinoDer.nombre);
        */
        nodo1.concatenar(null, nodo2);
        nodo2.concatenar(nodo1, nodo3);
        nodo3.concatenar(nodo2, nodo4);
        nodo4.concatenar(nodo3, null);
        
        nodo1.mostrar();
        nodo2.mostrar();
        nodo3.mostrar();
        nodo4.mostrar();
        
       nodo1.modificarNombre("Mathiu");
       nodo1.mostrar();
        System.out.println("-----------------");
       nodo1.modificarVeciDer(nodo4);
       nodo2.modificarVeciIzq(nodo3);
       
       nodo1.mostrar();
       nodo2.mostrar();
        
    }
    
}
