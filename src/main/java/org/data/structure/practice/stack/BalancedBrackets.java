package org.data.structure.practice.stack;

//import for Scanner and other utility classes
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;


/*
 * Input: exp = “[()]{}{[()()]()}”
Output: Balanced

Input: exp = “[(])”
Output: Not Balanced
 */
class BalancedBrackets {
   public static void main(String args[] ) throws Exception {

      // Write your code here
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      BalancedBrackets testClass = new BalancedBrackets();
      for(int i = 0 ;i<n;i++)
      {
         String expression = s.next();
         if(testClass.isBracketsBalanced(expression))
            System.out.println("YES");
         else
            System.out.println("NO");
      }
   }

   public boolean isBracketsBalanced(String expression)
   {
      Deque<Character> stack = new ArrayDeque<>();
      for(int i = 0 ; i<expression.length(); i++)
      {
         char ch = expression.charAt(i);
         if(ch == '{' || ch == '[' || ch == '(')
         {
            stack.push(ch);
            continue;
         }

         if(stack.isEmpty())
            return false;


         char c = stack.pop();
         switch(ch)
         {
         case ')':
            if(c == '{' || c == '[')
               return false;
            break;

         case ']':

            if(c == '{' || c == '(')
               return false;
            break;

         case '}':

            if(c == '[' || c == '(')
               return false;
            break;
         }



      }
      return stack.isEmpty();

   }

}
