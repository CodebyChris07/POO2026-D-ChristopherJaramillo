/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singlylinkedlistcircular;

/**
 *
 * @author ASUS
 */
public class SinglyLinkedListCircularMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        SinglyLinkedListCircular list = new SinglyLinkedListCircular();
        list.add(23);
        list.add(12);
        list.add(8);
        list.add(17);
        list.print();
        list.delete(17);
        list.print();
        list.buscar(8);
        
       
        
        
    }
    
}
