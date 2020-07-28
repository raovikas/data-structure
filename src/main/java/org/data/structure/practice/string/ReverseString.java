package org.data.structure.practice.string;

import java.util.Scanner;

public class ReverseString
{

   public static void main(String[] args)
   {
      ReverseString rs = new ReverseString();
      Scanner s = new Scanner(System.in);
      String str = s.nextLine();
      char[] c = str.toCharArray();
      rs.reverse(c);
   }

   private void reverse(char[] c)
   {
      char temp;
      int i = 0;
      int j = c.length - 1;
      while (j > i)
      {
         temp = c[i];
         c[i] = c[j];
         c[j] = temp;
         i++;
         j--;
      }
      System.out.println(c);
   }
}
