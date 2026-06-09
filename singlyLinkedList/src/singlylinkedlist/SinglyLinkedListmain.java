/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlylinkedlist;

/**
 *
 * @author ASUS
 */
public class SinglyLinkedListmain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinglyLinkedList list = new SinglyLinkedList();
        list = list.insert(list, 8);
        list = list.insert(list, 5);
        list = list.insert(list, 7);
        list = list.insert(list, 9);
        list.mostrar(list);
        list.insetInicio(list, 10);
        list.mostrar(list);
        
    }
    
}
