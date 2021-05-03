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

    /**
     * uc2 : ability to create linked list by adding 30 and 56 to 70
     */
    public void add(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    /**
     * uc3 :
     */
    public void append(T data) {
        Node<T> newNode = new Node<T>(data);
        if (head == null && tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
    }

    /**
     * uc4 : ability to insert an element in between
     */
    public void insertInBetween(T newKey, T key) {
        Node<T> node = head;
        Node<T> temp;
        Node<T> newNode = new Node<T>(newKey);
        while(node != null) {
            if(node.getData() == key) {
                break;
            }
        node = node.getNext();
        }
        temp = node.getNext();
        node.setNext(newNode);
        newNode.setNext(temp);
    }

    public void display() {
        Node<T> node = head;
        while (node != null) {
            System.out.println(node.getData());
            node = node.getNext();
        }
    }
}
