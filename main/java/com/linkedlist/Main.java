package com.linkedlist;

public class Main {
    public static <T> void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Integer a = 70, b = 30, c = 56;

        linkedList.append(a);
        linkedList.append(b);
        linkedList.append(c);

        linkedList.display();
    }
}