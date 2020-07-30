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
      System.out.println("after deleting 8 from linkedlist");
      llist.deleteNode(8);
      llist.traversal();
      System.out.println("after delete node at position 2 ");
      llist.deleteNodeAtPosition(2);
      llist.traversal();
      System.out.println("Reverse linked list");
      llist.reverseLinkedList();
      llist.traversal();
      int length = llist.length();
      System.out.println("length of LinkedList using iterative: " + length);
      int count = llist.count(llist.head);
      System.out.println("length of LinkedList using recursive: " + count);
      System.out.println("found  element 9 in LinkedList: "+llist.searchElement(llist.head, 9));
      System.out.println("found  element 2 in LinkedList: "+llist.search(llist.head, 2));
   }

   public void traversal()
   {

      Node pointer = head;
      while (pointer != null)
      {
         System.out.print(pointer.data + "->");
         pointer = pointer.next;
      }
      System.out.println("null");// just to represent linkedList its do not required
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

   // delete the first occurrence of given key in linked list
   public void deleteNode(int key)
   {
      Node current = head;
      Node prev = null;
      if (current != null && current.data == key)
      {
         head = current.next;
         return;
      }

      while (current != null && current.data != key)
      {
         prev = current;
         current = current.next;
      }

      if (current == null)
      {
         System.out.println("key is not present is this linked list");
         return;
      }

      prev.next = current.next;

   }

   /*
    * Delete a Linked List node at a given position Input: position = 1, Linked List = 8->2->3->1->7 Output: Linked List = 8->3->1->7
    *
    * Input: position = 0, Linked List = 8->2->3->1->7 Output: Linked List = 2->3->1->7
    *
    */
   public void deleteNodeAtPosition(int position)
   {
      // If linked list is empty
      if (head == null)
         return;

      Node temp = head;
      if (position == 0)
      {
         head = temp.next;
         return;
      }
      int currentPostion = 0;

      while (temp != null && currentPostion < position - 1)
      {
         temp = temp.next;
         currentPostion += 1;
      }

      if (temp == null || temp.next == null)
      {
         return;
      }

      Node node = temp.next.next;
      temp.next = node;

   }

   // reverse linkedlist
   public void reverseLinkedList()
   {
      Node current = head;
      Node prv = null;
      Node temp;
      if (current == null)
         return;
      while (current != null)
      {
         temp = prv;
         prv = current;
         current = current.next;
         prv.next = temp;
      }

      head = prv;

   }

   /*
    * get length using linkedlist iterative
    */
   public int length()
   {
      int length = 0;
      Node current = head;
      while (current != null)
      {
         current = current.next;
         length += 1;
      }

      return length;
   }

   /*
    * Get length using recursive
    */
   public int count(Node node)
   {
      if (node == null)
         return 0;
      return 1 + count(node.next);

   }

   /*
    * search an element in LinkedList using recurrsive
    */
   public boolean searchElement(Node node,int element)
   {
      while(node!=null && node.data!=element)
      {
         node = node.next;
      }
      if(node == null)
         return false;
      return true;
   }

   // Checks whether the value x is present
   // in linked list using recurrsive
   public boolean search(Node head, int x)
   {
      // Base case
      if (head == null)
         return false;

      // If key is present in current node,
      // return true
      if (head.data == x)
         return true;

      // Recur for remaining list
      return search(head.next, x);
   }

}
