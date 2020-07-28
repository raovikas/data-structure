package org.data.structure.practice.stack;

//Java Code for stack  Implementation using Linked List
public class Stack
{
   private StackNode root;

   private static class StackNode
   {
      int data;
      StackNode next;

      StackNode(int d)
      {
         this.data = d;
      }
   }

   public boolean isEmpty()
   {
      if (root == null)
         return true;
      else
         return false;
   }

   public int pop()
   {
      if (root == null)
      {
         System.out.println("stack is underflow");
         return Integer.MIN_VALUE;
      }

      int n = root.data;
      root = root.next;
      return n;
   }

   public void push(int d)
   {
      StackNode newNode = new StackNode(d);
      if (root == null)
         root = newNode;
      else
      {
         StackNode temp = root;
         root = newNode;
         newNode.next = temp;
      }
   }

   public int peek()
   {
      if (root == null)
      {
         System.out.println("stack is underflow");
         return Integer.MIN_VALUE;
      }
      return root.data;
   }

   public static void main(String[] args)
   {
      Stack s = new Stack();
      s.push(3);
      s.push(2);
      s.push(1);

      System.out.println("pop the stack element "+s.pop());
      System.out.println("top element in stack "+s.peek());
   }
}
