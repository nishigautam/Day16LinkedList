package com.linkedlist;

public class Main {
    public static <T> void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Integer a = 70, b = 56, c = 30;

        linkedList.append(a);
        linkedList.append(c);
        linkedList.insertInBetween(b,c);

        linkedList.display();
    }
}