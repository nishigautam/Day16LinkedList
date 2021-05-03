package com.linkedlist;

public class Main {
    public static <T> void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Integer x = 56, y = 30 , z = 70, a = 70, b = 30, c = 56;

        linkedList.insert(x);
        linkedList.insert(y);
        linkedList.insert(z);

        linkedList.add(a);
        linkedList.add(b);
        linkedList.add(c);

        linkedList.display();
    }
}