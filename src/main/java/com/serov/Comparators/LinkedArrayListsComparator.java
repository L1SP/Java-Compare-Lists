package com.serov.Comparators;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import com.serov.enums.List;

/**
 * Comparator implementation
 * @author n.a.serov
 */
public class LinkedArrayListsComparator < T > {

    /**
     * Default constructor without parameters
     */
    public LinkedArrayListsComparator() {}

    /**
     * LinkedList declaration
     */
    private LinkedList < T > linked = new LinkedList < T > ();

    /**
     * ArrayList declaration
     */
    private ArrayList < T > array = new ArrayList < T > ();

    /**
     * Arrays' size constant
     */
    final static int arraySize = 100000;

    /**
     * Possible variation for equally quick methods constant
     */
    final static long eps = 15;

    /**
     * function for filling the lists
     */
    private void fillLists() {
        array = new ArrayList < T > (arraySize);
        for (int i = 0; i < arraySize; i++) {
            linked.add(null);
        }

        for (int i = 0; i < arraySize; i++) {
            array.add(0, null);
        }
    }

    /** Comparing without printing */

    /**
     * A method for comparing adding elements to the beginning
     * @return Returns the quicker List
     */
    public List compareInsertFirst() {
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.addFirst(null);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.add(0, null);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        if (Math.abs(linkedTime - arrayTime) < eps)
            return null;
        else if (linkedTime < arrayTime)
            return List.LinkedList;
        else
            return List.ArrayList;
    }

    /**
     * A method for comparing adding elements to the middle
     * @return Returns the quicker List
     */
    public List compareInsertMid() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.add(arraySize / 2, null);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.add(arraySize / 2, null);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        if (Math.abs(linkedTime - arrayTime) < eps)
            return null;
        else if (linkedTime < arrayTime)
            return List.LinkedList;
        else
            return List.ArrayList;
    }

    /**
     * A method for comparing adding elements to the end
     * @return Returns the quicker List
     */
    public List compareAdd() {
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.add(null);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.add(null);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        if (Math.abs(linkedTime - arrayTime) < eps)
            return null;
        else if (linkedTime < arrayTime)
            return List.LinkedList;
        else
            return List.ArrayList;
    }

    /**
     * A method for comparing removing elements from the beginning
     * @return Returns the quicker List
     */
    public List compareRemoveFirst() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.remove(0);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.remove(0);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        if (Math.abs(linkedTime - arrayTime) < eps)
            return null;
        else if (linkedTime < arrayTime)
            return List.LinkedList;
        else
            return List.ArrayList;
    }

    /**
     * A method for comparing removing elements from the middle
     * @return Returns the quicker List
     */
    public List compareRemoveMid() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.remove(linked.size() / 2);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.remove(array.size() / 2);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        if (Math.abs(linkedTime - arrayTime) < eps)
            return null;
        else if (linkedTime < arrayTime)
            return List.LinkedList;
        else
            return List.ArrayList;
    }

    /**
     * A method for comparing removing elements from the end
     * @return Returns the quicker List
     */
    public List compareRemoveLast() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.remove(linked.size() - 1);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.remove(array.size() - 1);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        if (Math.abs(linkedTime - arrayTime) < eps)
            return null;
        else if (linkedTime < arrayTime)
            return List.LinkedList;
        else
            return List.ArrayList;
    }

    /**
     * A method for comparing getting elements from the beginning
     * @return Returns the quicker List
     */
    public List compareGetFirst() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.get(0);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.get(0);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        if (Math.abs(linkedTime - arrayTime) < eps)
            return null;
        else if (linkedTime < arrayTime)
            return List.LinkedList;
        else
            return List.ArrayList;
    }

    /**
     * A method for comparing getting elements from the middle
     * @return Returns the quicker List
     */
    public List compareGetMid() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.get(arraySize / 2);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.get(arraySize / 2);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        if (Math.abs(linkedTime - arrayTime) < eps)
            return null;
        else if (linkedTime < arrayTime)
            return List.LinkedList;
        else
            return List.ArrayList;
    }

    /**
     * A method for comparing getting elements from the end
     * @return Returns the quicker List
     */
    public List compareGetLast() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.get(arraySize - 1);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.get(arraySize - 1);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        if (Math.abs(linkedTime - arrayTime) < eps)
            return null;
        else if (linkedTime < arrayTime)
            return List.LinkedList;
        else
            return List.ArrayList;
    }

    /**
     * A method for comparing setting elements from the beginning
     * @return Returns the quicker List
     */
    public List compareSetFirst() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.set(arraySize - 1, null);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.set(arraySize - 1, null);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        if (Math.abs(linkedTime - arrayTime) < eps)
            return null;
        else if (linkedTime < arrayTime)
            return List.LinkedList;
        else
            return List.ArrayList;
    }

    /**
     * A method for comparing setting elements from the middle
     * @return Returns the quicker List
     */
    public List compareSetMid() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.set(arraySize / 2, null);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.set(arraySize / 2, null);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        if (Math.abs(linkedTime - arrayTime) < eps)
            return null;
        else if (linkedTime < arrayTime)
            return List.LinkedList;
        else
            return List.ArrayList;
    }

    /**
     * A method for comparing setting elements from the end
     * @return Returns the quicker List
     */
    public List compareSetLast() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.set(arraySize - 1, null);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.set(arraySize - 1, null);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        if (Math.abs(linkedTime - arrayTime) < eps)
            return null;
        else if (linkedTime < arrayTime)
            return List.LinkedList;
        else
            return List.ArrayList;
    }

    /** Comparing with printing */

    /**
     * A method for comparing adding elements to the beginning and printing the result
     */
    public void compareAndPrintInsertFirst() {
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.addFirst(null);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.add(0, null);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        System.out.println("Adding the element to the beginning:\n");
        if (Math.abs(linkedTime - arrayTime) < eps)
            System.out.println("lists are equally quick\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else if (linkedTime < arrayTime)
            System.out.println("LinkedList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else
            System.out.println("ArrayList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
    }

    /**
     * A method for comparing adding elements to the middle and printing the result
     */
    public void compareAndPrintInsertMid() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.add(arraySize / 2, null);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.add(arraySize / 2, null);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        System.out.println("Adding the element to the middle:\n");
        if (Math.abs(linkedTime - arrayTime) < eps)
            System.out.println("lists are equally quick\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else if (linkedTime < arrayTime)
            System.out.println("LinkedList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else
            System.out.println("ArrayList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
    }

    /**
     * A method for comparing adding elements to the end and printing the result
     */
    public void compareAndPrintAdd() {
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.add(null);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.add(null);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        System.out.println("Adding the element to the end:\n");
        if (Math.abs(linkedTime - arrayTime) < eps)
            System.out.println("lists are equally quick\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else if (linkedTime < arrayTime)
            System.out.println("LinkedList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else
            System.out.println("ArrayList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
    }

    /**
     * A method for comparing removing elements from the beginning and printing the result
     */
    public void compareAndPrintRemoveFirst() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.remove(0);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.remove(0);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        System.out.println("Removing the first element:\n");
        if (Math.abs(linkedTime - arrayTime) < eps)
            System.out.println("lists are equally quick\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else if (linkedTime < arrayTime)
            System.out.println("LinkedList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else
            System.out.println("ArrayList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
    }

    /**
     * A method for comparing removing elements from the middle and printing the result
     */
    public void compareAndPrintRemoveMid() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.remove(linked.size() / 2);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.remove(array.size() / 2);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        System.out.println("Removing the middle element:\n");
        if (Math.abs(linkedTime - arrayTime) < eps)
            System.out.println("lists are equally quick\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else if (linkedTime < arrayTime)
            System.out.println("LinkedList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else
            System.out.println("ArrayList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
    }

    /**
     * A method for comparing removing elements from the end and printing the result
     */
    public void compareAndPrintRemoveLast() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.remove(linked.size() - 1);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.remove(array.size() - 1);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        System.out.println("Removing the last element:\n");
        if (Math.abs(linkedTime - arrayTime) < eps)
            System.out.println("lists are equally quick\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else if (linkedTime < arrayTime)
            System.out.println("LinkedList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else
            System.out.println("ArrayList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
    }

    /**
     * A method for comparing getting elements from the beginning and printing the result
     */
    public void compareAndPrintGetFirst() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.get(0);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.get(0);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        System.out.println("Getting the first element:\n");
        if (Math.abs(linkedTime - arrayTime) < eps)
            System.out.println("lists are equally quick\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else if (linkedTime < arrayTime)
            System.out.println("LinkedList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else
            System.out.println("ArrayList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
    }

    /**
     * A method for comparing getting elements from the middle and printing the result
     */
    public void compareAndPrintGetMid() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.get(arraySize / 2);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.get(arraySize / 2);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        System.out.println("Getting the middle element:\n");
        if (Math.abs(linkedTime - arrayTime) < eps)
            System.out.println("lists are equally quick\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else if (linkedTime < arrayTime)
            System.out.println("LinkedList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else
            System.out.println("ArrayList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
    }

    /**
     * A method for comparing getting elements from the end and printing the result
     */
    public void compareAndPrintGetLast() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.get(arraySize - 1);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.get(arraySize - 1);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        System.out.println("Getting the last element:\n");
        if (Math.abs(linkedTime - arrayTime) < eps)
            System.out.println("lists are equally quick\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else if (linkedTime < arrayTime)
            System.out.println("LinkedList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else
            System.out.println("ArrayList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
    }

    /**
     * A method for comparing setting elements from the beginning and printing the result
     */
    public void compareAndPrintSetFirst() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.set(arraySize - 1, null);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.set(arraySize - 1, null);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        System.out.println("Setting the first element:\n");
        if (Math.abs(linkedTime - arrayTime) < eps)
            System.out.println("lists are equally quick\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else if (linkedTime < arrayTime)
            System.out.println("LinkedList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else
            System.out.println("ArrayList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
    }

    /**
     * A method for comparing setting elements from the middle and printing the result
     */
    public void compareAndPrintSetMid() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.set(arraySize / 2, null);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.set(arraySize / 2, null);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();

        System.out.println("Setting the middle element:\n");
        if (Math.abs(linkedTime - arrayTime) < eps)
            System.out.println("lists are equally quick\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else if (linkedTime < arrayTime)
            System.out.println("LinkedList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else
            System.out.println("ArrayList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
    }

    /**
     * A method for comparing setting elements from the end and printing the result
     */
    public void compareAndPrintSetLast() {
        fillLists();
        Date startLinked = new Date();
        for (int i = 0; i < arraySize; i++) {
            linked.set(arraySize - 1, null);
        }
        Date finishLinked = new Date();
        long linkedTime = finishLinked.getTime() - startLinked.getTime();

        Date startArray = new Date();
        for (int i = 0; i < arraySize; i++) {
            array.set(arraySize - 1, null);
        }
        Date finishArray = new Date();
        long arrayTime = finishArray.getTime() - startArray.getTime();

        linked = new LinkedList < T > ();
        array = new ArrayList < T > ();
        System.out.println("Setting the last element:\n");
        if (Math.abs(linkedTime - arrayTime) < eps)
            System.out.println("lists are equally quick\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else if (linkedTime < arrayTime)
            System.out.println("LinkedList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
        else
            System.out.println("ArrayList is quicker\n" + "LinkedList: " + linkedTime + " ms\n" + "ArrayList: " + arrayTime + " ms\n");
    }

    /**
     * A method for comparing all methods and printing the results
     */
    public void compareAndPrint() {
        compareAndPrintInsertFirst();
        compareAndPrintInsertMid();
        compareAndPrintAdd();
        compareAndPrintRemoveFirst();
        compareAndPrintRemoveMid();
        compareAndPrintRemoveLast();
        compareAndPrintGetFirst();
        compareAndPrintGetMid();
        compareAndPrintGetLast();
        compareAndPrintSetFirst();
        compareAndPrintSetMid();
        compareAndPrintSetLast();
    }
}