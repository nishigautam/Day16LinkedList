package com.linkedlist;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class testingNode {

    @Test
    public void returnTrueWhenFindNode() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Integer a = 56, b = 30, c = 70;
        linkedList.append(a);
        linkedList.append(c);
        linkedList.insertInBetween(b, a);
        Assert.assertEquals(true, linkedList.findNode(b));
    }
    /**
     * ability to insert element after given value node key
     */
    @Test
    public void insertNumberAfterGivenValue() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        Integer a = 56, b = 30, c = 70 ;
        linkedList.append(a);
        linkedList.append(c);
        linkedList.insertNumberAfterGivenNodeKey(b, a);
        Assert.assertEquals(true, linkedList.findNode(b));
    }

}
