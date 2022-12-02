package com.serov.lab3;

import org.junit.jupiter.api.TestInstance;

import com.serov.Comparators.LinkedArrayListsComparator;
import com.serov.enums.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Testing the LinkedArrayListsComparator implementation
 * @author n.a.serov
 */
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
public class LinkedArrayListsComparatorUnitTests {

    /**
     * Instance of a comparator
     */
    private static LinkedArrayListsComparator < ? > comparator;

    /**
     * Creating a new comparator before executing the tests
     */
    @BeforeAll
    static public void setUp() {
        comparator = new LinkedArrayListsComparator < Object > ();
    }


    /**
     * Checking if LinkedList is quicker at inserting elements to the beginning
     */
    @Test
    public void testInsertingFirstIsLinked() {
        assertEquals(comparator.compareInsertFirst(), List.LinkedList);
    }

    /**
     * Checking if ArrayList is quicker at inserting elements to the middle
     */
    @Test
    public void testInsertingMidIsArrayList() {
        assertEquals(comparator.compareInsertMid(), List.ArrayList);
    }

    /**
     * Checking if lists are equally quick at inserting elements to the end
     */
    @Test
    public void testInsertingLastIsEqual() {
        assertEquals(comparator.compareAdd(), null);
    }

    /**
     * Checking if  LinkedList is quicker at removing elements at the beginning
     */
    @Test
    public void testRemovingFirstIsLinked() {
        assertEquals(comparator.compareRemoveFirst(), List.LinkedList);
    }

    /**
     * Checking if ArrayList is quicker at removing elements at the middle
     */
    @Test
    public void testRemovingMidIsArrayList() {
        assertEquals(comparator.compareRemoveMid(), List.ArrayList);
    }

    /**
     * Checking if lists are equally quick at removing elements at the end
     */
    @Test
    public void testRemovingLastIsEqual() {
        assertEquals(comparator.compareRemoveLast(), null);
    }

    /**
     * Checking if lists are equally quick at getting elements from the beginning
     */
    @Test
    public void testGetFirstIsEqual() {
        assertEquals(comparator.compareGetFirst(), null);
    }

    /**
     * Checking if ArrayList is quicker at getting elements from the middle
     */
    @Test
    public void testGetMidIsArrayList() {
        assertEquals(comparator.compareGetMid(), List.ArrayList);
    }

    /**
     * Checking if lists are equally quick at getting elements from the end
     */
    @Test
    public void testGetLastIsEqual() {
        assertEquals(comparator.compareGetLast(), null);
    }

    /**
     * Checking if lists are equally quick at setting elements at the beginning
     */
    @Test
    public void testSetFirstIsEqual() {
        assertEquals(comparator.compareSetFirst(), null);
    }

    /**
     * Checking if ArrayList is quicker at setting elements at the middle
     */
    @Test
    public void testSetMidIsArrayList() {
        assertEquals(comparator.compareSetMid(), List.ArrayList);
    }

    /**
     * Checking if lists are equally quick at setting elements at the end
     */
    @Test
    public void testSetLastIsEqual() {
        assertEquals(comparator.compareSetFirst(), null);
    }
}