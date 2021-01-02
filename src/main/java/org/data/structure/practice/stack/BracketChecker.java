package org.data.structure.practice.stack;

public class BracketChecker
{
   private String input;

   public BracketChecker(String in)
   {
      this.input = in;
   }

   public void check()
   {
      int size = input.length();
      StackC stack = new StackC(size);
      for (int i = 0; i < size; i++)
      {
         char ch = input.charAt(i);
         switch (ch)
         {
         case '{':
         case '[':
         case '(':
            stack.push(ch);
            break;
         case '}':
         case ']':
         case ')':
            if (!stack.isEmpty())
            {
               char chx = stack.pop();
               if ((ch == '}' && chx != '{') || (ch == ']' && chx != '[') || (ch == ')' && chx != '('))
               {
                  System.out.println("ERROR character :" + ch + " at index" + i);
               }
            }
            else
               System.out.println("ERROR character :" + ch + " at index" + i);
            break;
         default:
            break;
         }
      }
      if( !stack.isEmpty() )
         System.out.println("Error: missing right delimiter");

      //return stack.isEmpty();

   }
}
