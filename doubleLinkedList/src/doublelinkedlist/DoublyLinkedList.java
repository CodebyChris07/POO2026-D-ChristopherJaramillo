/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package doublelinkedlist;

/**
 *
 * @author ASUS
 */
public class DoublyLinkedList {

    class Node {

        int data;
        Node previous;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    // cabeza y cola
    Node head, tail = null;

    // insertar un nodo a la lista
    public void insetar(int dato) {

        Node newNode = new Node(dato);
        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;

        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;

        }
    }

    public void imprimir() {
        Node current = head;
        if (head == null) {
            System.out.println("La lista esta vacia");
            return;

        }
        System.out.println("Nodos de doble enlace");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;

        }
        System.out.println("\n");

    }

    public void imprimir2() {
        // imprimir desde la cola
        Node current = tail;
        if (head == null) {
            System.out.println("La lista esta vacia");
            return;

        }
        System.out.println("Nodos de doble enlace");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.previous;

        }
        System.out.println("\n");

    }

    public void eliminar(int dato) {
        if (head == null) {
            System.out.println(dato + " no encontrado");
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
        // eliminar cabeza
        if (current == head) {
            head = current.next;
        } else {
            current.previous.next = current.next;
        }
        // eliminar cola
        if (current == tail) {
            tail = current.previous;
        } else {
            current.next.previous = current.previous;
        }
        current.next = null;
        current.previous = null;
        System.out.println(dato + " encontrado y eliminado");

    }

    public void modificar(int existe, int remplazo) {
        if (head == null) {
            System.out.println(existe + " no encontrado");
            return;

        }
        Node current = head;
        while (current != null && current.data != existe) {
            current = current.next;

        }
        if (current == null) {
            System.out.println(existe + " no encontrado");
            return;

        }

        current.data = remplazo;
    }

}
