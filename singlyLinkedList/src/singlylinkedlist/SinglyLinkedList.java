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

}
