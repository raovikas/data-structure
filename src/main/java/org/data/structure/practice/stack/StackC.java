package org.data.structure.practice.stack;

public class StackC
{
   private char[] stackArray;
   private int maxSize;
   private int top;

   public StackC(int size)
   {
      this.maxSize = size;
      stackArray = new char[size];
      top = -1;
   }

   public void push(char element)
   {
      stackArray[++top] = element;
   }


   public char pop()
   {
      return stackArray[top--] ;
   }

   public char peek()
   {
      return stackArray[top];
   }

   public boolean isEmpty()
   {
      return (top == -1);
   }

   public boolean isFull()
   {
      return (top ==maxSize-1);
   }
}
