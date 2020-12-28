package org.data.structure.practice.string;

import java.util.Arrays;

/*
 *  Given two strings , write a method to decide if one is a permutation of the other
 */
public class Permutation
{

   // Solution1:sort the strings.
   public boolean permutation(String s1, String s2)
   {
      if (s1.length() != s2.length())
      {
         return false;
      }

      return sort(s1).equals(sort(s2));
   }

   private String sort(String s1)
   {
      char[] ch = s1.toCharArray();
      Arrays.sort(ch);
      return new String(ch);
   }

   // solution2: check if the two strings have identical character counts.
   public boolean permutation2(String x, String y)
   {
      if (x.length() != y.length())
      {
         return false;
      }

      int[] s_array = new int[128];//Assumption
      char[] ch = x.toCharArray();
      for (char c : ch)
      {
         s_array[c]++;
      }

      for (int i = 0; i < y.length(); i++)
      {
         int cha = y.charAt(i);
         s_array[cha]--;
         if (s_array[cha] < 0)
         {
            return false;
         }

      }
      return true;

   }

   public static void main(String[] args)
   {
      boolean permutation = new Permutation().permutation("abbc", "bacb");
      boolean permutation2 = new Permutation().permutation2("abbc", "bacb");
      System.out.println(permutation);
      System.out.println(permutation2);
   }

}
