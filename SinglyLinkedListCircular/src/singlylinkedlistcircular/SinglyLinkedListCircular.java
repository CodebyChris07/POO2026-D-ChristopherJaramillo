/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singlylinkedlistcircular;

/**
 *
 * @author ASUS
 */
public class SinglyLinkedListCircular {

    public Node head = null;
    public Node tail = null;

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;

        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;

        }

    }

    public void print() {
        Node current = head;
        if (head == null) {
            System.out.println("La lista esta vacia");

        } else {
            System.out.println("Nodos enlazados en la lista circular");
            do {
                System.out.print(" " + current.data);
                current = current.next;
            } while (current != head);
            System.out.println();
        }

    }

    public void delete(int data) {
        if (head == null) {
            System.out.println(data + " no encontrado");
            return;
        }

        Node current = head;
        Node prev = tail;

        do {
            if (current.data == data) {
                // caso: solo hay un nodo
                if (current == head && current == tail) {
                    head = null;
                    tail = null;

                }else if (current == head) {
                    // caso: eliminar cabeza
                    head = head.next;
                    tail.next = head;

                } else if (current == tail) {
                    // caso: eliminar cola
                    tail = prev;
                    tail.next = head;

                } else {
                    // caso eliminar intermedio
                    prev.next = current.next;

                }
                current.next = null;
                System.out.println(data + " encontrado y eliminado");
                return;

            }
            prev = current;
            current = current.next;

        } while (current != head);
        System.out.println(data + " no encontrado");
    }
    
     public void buscar(int dato) {
        if (head == null) {
            System.out.println("Lista vacia");
            return;
        }
        Node current = head;
        while (current != null && current.data != dato) {
            current = current.next;
        }
        if (current == null) {
            System.out.println(dato + " no encontrado");
            return;
        }
        System.out.println(dato + " encontrado");
    }

}
