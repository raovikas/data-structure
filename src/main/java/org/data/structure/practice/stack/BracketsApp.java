package org.data.structure.practice.stack;

public class BracketsApp
{
   public static void main(String[] args)
   {
      BracketChecker checker = new BracketChecker("a{b(c)");
      checker.check();
   }
}
