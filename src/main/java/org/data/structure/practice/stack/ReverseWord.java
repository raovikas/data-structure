package org.data.structure.practice.stack;

public class ReverseWord
{
   public static void main(String[] args)
   {
      new ReverseWord().reverse("Vikas");
   }

   private void reverse(String word)
   {
      char[] ch = word.toCharArray();
      StackC theStack = new StackC(10);
      StringBuilder sb = new StringBuilder();
      for (char c : ch)
      {
         theStack.push(c);
      }

      while(!theStack.isEmpty())
      {
         sb.append(theStack.pop());
      }

      System.out.println(sb.toString());
   }
}
