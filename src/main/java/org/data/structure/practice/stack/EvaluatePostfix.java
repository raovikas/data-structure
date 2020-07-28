package org.data.structure.practice.stack;

import java.util.Scanner;
import java.util.Stack;

/*
 * Evaluate postfix i.e
 * 9
 * 2 3 * 5 4 * + 9 -
 */
public class EvaluatePostfix
{

   public static void main(String[] args)
   {
      EvaluatePostfix test = new EvaluatePostfix();
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      String expression = new String("");
      for (int i = 0; i < n; i++)
      {
         expression += s.next();
      }

      int in =  test.evaluatePostFix(expression);
      System.out.println(in);

   }

   private Integer evaluatePostFix(String expression)
   {
      Stack<Integer> stack = new Stack<>();
      for (int j = 0; j < expression.length(); j++)
      {
         char ch = expression.charAt(j);
         // if operand
         if (Character.isDigit(ch))
         {
            stack.push(Character.getNumericValue(ch));
         }
         else
         {
            int op2 = stack.pop();
            int op1 = stack.pop();
            perform(ch, op2, op1,stack);
         }

      }

      return stack.pop();
   }

   private void perform(char ch, int op2, int op1, Stack<Integer> stack)
   {
      switch (ch)
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
