package org.data.structure.practice.stack;

public class StackApp
{
   public static void main(String[] args)
   {
      StackX theStack = new StackX(10);
      theStack.push(20);
      theStack.push(40);
      theStack.push(60);
      theStack.push(80);
      theStack.push(100);

      while (!theStack.isEmpty())
      {
         long element = theStack.pop();
         System.out.print(element);
         System.out.print(" ");
      }
      System.out.println("");
   }
}
