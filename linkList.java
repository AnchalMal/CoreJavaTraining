package com.java.training;
import java.util.*;

/**
 * Created by anchalmal on 2/4/17.
 */
public class linkList {

        public static void main(String args[]) {

            LinkedList<String> linkedlist = new LinkedList<String>();

            linkedlist.add("1");
            linkedlist.add("2");
            linkedlist.add("3");
            linkedlist.add("4");
            linkedlist.add("5");

            System.out.println("Linked List : " +linkedlist);

            linkedlist.addFirst("First Item");
            linkedlist.addLast("Last Item");
            System.out.println("LinkedList Content after addition: " +linkedlist);

            Object firstvar = linkedlist.get(0);
            System.out.println("First element: " +firstvar);
            linkedlist.set(0, "Changed first item");
            Object firstvar2 = linkedlist.get(0);
            System.out.println("First element after update: " +firstvar2);

            linkedlist.removeFirst();
            linkedlist.removeLast();
            System.out.println("LinkedList after deletion of first and last element: " +linkedlist);

            linkedlist.add(0, "Newly added item");
            linkedlist.remove(2);
            System.out.println("Final Content: " +linkedlist);
        }
}
