package org.data.structure.practice.stack;

import java.util.Scanner;
import java.util.Stack;

public class EvaluatePrefix
{

   public static void main(String[] args)
   {
      EvaluatePrefix test = new EvaluatePrefix();
      Scanner s = new Scanner(System.in);
      String expression = s.next();
      int value = test.evaluatePrefix(expression);
      System.out.println(value);

   }

   private int evaluatePrefix(String expression)
   {
      Stack<Integer> stack = new Stack<>();
      for (int i = expression.length()-1; i >= 0; i--)
      {
         char ch = expression.charAt(i);
         if (Character.isDigit(ch))
         {
            stack.push(Character.getNumericValue(ch));
         }else
         {
            int op1 = stack.pop();
            int op2 = stack.pop();
            perform(stack,op1,op2,ch);
         }
      }
      return stack.pop();
   }

   private void perform(Stack<Integer> stack, int op1, int op2, char ch)
   {
      switch(ch)
      {
      case '*':
         stack.push(op1*op2);
         break;
      case '-':
         stack.push(op1-op2);
         break;
      case '/':
         stack.push(op1/op2);
         break;
      case '+':
         stack.push(op1+op2);
         break;
      }
   }
}
