package org.data.structure.practice.stack;
// Java code for statck implementation using array
public class StackX
{
   private long[] stackArray;
   private int maxSize;
   private int top;

   public StackX(int size)
   {
      this.maxSize = size;
      stackArray = new long[size];
      top = -1;
   }

   public void push(long element)
   {
      stackArray[++top] = element;
   }


   public long pop()
   {
      return stackArray[top--] ;
   }

   public long peek()
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
