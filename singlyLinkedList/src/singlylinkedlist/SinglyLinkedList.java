/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singlylinkedlist;

/**
 *
 * @author ASUS
 */
public class SinglyLinkedList {

    class Node {

        int data;
        Node next;
        // contronstructor

        Node(int d) {
            data = d;
            next = null;
        }
    }
    Node head;

    public SinglyLinkedList insert(SinglyLinkedList list, int data) {
        Node new_node = new Node(data);
        // para el caso que la lista este vacia
        if (list.head == null) {
            list.head = new_node;

        } else {

            Node last = list.head;
            while (last.next != null) {
                last = last.next;

            }
            last.next = new_node;

        }

        return list;

    }

    public void mostrar(SinglyLinkedList list) {
        Node currNode = list.head;
        System.out.print("\nLinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + " ");
            // vamos al siguiente nodo
            currNode = currNode.next;

        }
        System.out.println("\n");

    }

    public SinglyLinkedList insetInicio(SinglyLinkedList list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;

        } else {

            new_node.next = list.head;
            list.head = new_node;

        }
        return list;

    }

    public void delete(int key) {
        if (head == null) {
            System.out.println(key + " no encontrado");
            return;

        }
        Node currNode = head;
        Node prev = null;
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode == null) {
            System.out.println(key + " no encontrado");
            return;

        }
        if (prev == null) {
            head = currNode.next;
        } else {
            prev.next = currNode.next;
        }
        currNode.next = null;
        System.out.println(key + " encontrado y eliminado");

    }

    public void buscar(int dato) {
        if (head == null) {
            System.out.println("Lista vacia");
            return;
        }
        Node currNode = head;
        while (currNode != null && currNode.data != dato) {
            currNode = currNode.next;
        }
        if (currNode == null) {
            System.out.println(dato + " no encontrado");
            return;
        }
        System.out.println(dato + " encontrado");
    }

}
