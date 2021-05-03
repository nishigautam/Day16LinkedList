package com.linkedlist;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    /**
     * uc1
     */
    public void insert(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    public void display() {
        Node<T> node = head;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }
}