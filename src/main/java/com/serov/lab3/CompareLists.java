package com.serov.lab3;

import com.serov.Comparators.LinkedArrayListsComparator;

/**
 * The main application class
 * @author n.a.serov
 */
public class CompareLists {

    /**
     * Default constructor without parameters
     */
    public CompareLists() {}

    /**
     * The main function of the Expression solver program
     * @param args an array of command-line arguments for the application
     */
    public static void main(String[] args) {
        LinkedArrayListsComparator < ? > comparator = new LinkedArrayListsComparator < Object > ();
        comparator.compareAndPrint();
    }
}