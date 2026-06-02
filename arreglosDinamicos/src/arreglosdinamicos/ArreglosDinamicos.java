/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosdinamicos;

/**
 *
 * @author ASUS
 */
public class ArreglosDinamicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Persona personaA = new Persona("Ana", 22);
        Persona personaB = new Persona("Juan", 25);
        Persona personaC = new Persona("Kevin", 22);
        
        System.out.println("PersonaA" + personaA + "\n");
        System.out.println("PersonaB" + personaB + "\n");
        System.out.println("PersonaC" + personaC + "\n");
        
        personaC = personaA;
        System.out.println("PersonaC" + personaC + "\n");
        personaA.cambiarDatos("Ana", 25);
        personaA.mostrarDatos();
        personaC.mostrarDatos();
        */
        
        Nodo objA = new Nodo(8);
        Nodo objB = new Nodo(4);
        Nodo objC = new Nodo(5);
        System.out.println("ObajetoA" + objA);
        System.out.println("ObjetoB" + objB);
        System.out.println("ObjetoC" + objC);
         objA.concatenar(objB);
         objB.concatenar(objC);
        objA.next = objC; 
        objB.next = objC;
        objC.next = objA;
        objA.mostrar();
        objB.mostrar();
        objC.mostrar();
        System.out.println("DatoA: " + objA.dato + "\nNextA: " + objA.next);
        objA.next.getDato();
        
        
        
        
        
        
        
    }
    
}
