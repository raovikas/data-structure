package org.data.structure.practice.linkedlist;

//A simple Java program to introduce a linked list
public class LinkedList
{
   private Node head;// head of list

   /*
    * Linked list Node. This inner class is made static so that main() can access it
    */
   private static class Node
   {
      int data;
      Node next;

      Node(int d)
      {
         this.data = d;
      } // Constructor
   }

   /* method to create a simple linked list with 3 nodes */
   public static void main(String[] args)
   {
      /* Start with the empty list. */
      LinkedList llist = new LinkedList();

      /*
       * Three nodes have been allocated dynamically. We have references to these three blocks as head, second and third
       */
      llist.head = new Node(3);
      Node node1 = new Node(5);
      Node node2 = new Node(8);

      llist.head.next = node1;
      node1.next = node2;

      Node node = new Node(9);
      llist.insertNodeInfront(node);
      Node end = new Node(10);
      llist.insertNodeInEnd(end);
      Node newNode = new Node(2);
      llist.insertAfterGivenNode(node1, newNode);
      llist.traversal();
   }

   public void traversal()
   {

      Node pointer = head;
      while (pointer != null)
      {
         System.out.print(pointer.data + "->");
         pointer = pointer.next;
      }
      System.out.println("null");//just to represent linkedList its do not required
   }

   // insert node at front of the linked list
   public void insertNodeInfront(Node node)
   {

      node.next = head;
      head = node;
   }

   // insert node at end of the linked list
   public void insertNodeInEnd(Node node)
   {

      if (head == null)
      {
         head = node;
         return;
      }

      Node pointer = head;
      while (pointer.next != null)
      {
         pointer = pointer.next;
      }

      pointer.next = node;

   }

   // insert node after a given node
   public void insertAfterGivenNode(Node prevNode, Node newNode)
   {
      if (prevNode == null)
      {
         System.out.println("the given previous node cannot be null");
         return;
      }
      newNode.next = prevNode.next;
      prevNode.next = newNode;

   }
}
