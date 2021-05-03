package com.linkedlist;

public class Main {
    public static <T> void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Integer a = 56, b = 30, c = 40 , d = 70;

        linkedList.append(a);
        linkedList.append(c);
        linkedList.append(d);
        linkedList.insertNumberAfterGivenNodeKey(b,a);
        linkedList.display();
    }
}