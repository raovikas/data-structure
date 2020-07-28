package org.data.structure.practice.linkedlist;
//A simple Java program to introduce a linked list
public class LinkedList
{
   private Node head;// head of list

   /* Linked list Node.  This inner class is made static so that
   main() can access it */
   private static class Node
   {
      int data;
      Node next;

      Node(int d)
      {
         this.data = d;
      } // Constructor
   }

   /* method to create a simple linked list with 3 nodes*/
   public static void main(String[] args)
   {
      /* Start with the empty list. */
      LinkedList llist = new LinkedList();

      /* Three nodes have been allocated dynamically.
      We have references to these three blocks as head,
      second and third */
      llist.head = new Node(3);
      Node node1 = new Node(5);
      Node node2 = new Node(8);

      llist.head.next = node1;
      node1.next = node2;
   }
}
