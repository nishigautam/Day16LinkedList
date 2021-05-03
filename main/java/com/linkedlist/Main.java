package com.linkedlist;

public class Main {
    public static <T> void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Integer a = 56, b = 30, c = 70;

        linkedList.append(a);
        linkedList.append(c);
        linkedList.insertInBetween(b,a);
        linkedList.pop();
        linkedList.display();
    }
}