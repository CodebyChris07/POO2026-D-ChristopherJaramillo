/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package doublelinkedlist;

/**
 *
 * @author ASUS
 */
public class DoublyLinkedListMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DoublyLinkedList dlist = new DoublyLinkedList();
        dlist.insetar(1);
        dlist.insetar(4);
        dlist.insetar(8);
        dlist.insetar(10);
        dlist.imprimir();
        dlist.imprimir2();
        dlist.eliminar(1);
        dlist.eliminar(0);
        dlist.imprimir();
        dlist.modificar(8, 20);
        dlist.imprimir();

    }

}
