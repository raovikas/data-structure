package org.data.structure.array;

public class HigherOrderedArrayApp
{

   public static void main(String[] args)
   {
      HigherOrderedArray array = new HigherOrderedArray(5);
      array.insert(4);
      array.insert(2);
      array.insert(8);
      array.insert(7);
      array.insert(6);
      array.display();
      array.delete(6);
      array.display();

      int searchKey = 8; // search for item
      if( array.find(searchKey) != array.size() )
         System.out.println("Found " + searchKey);
      else
         System.out.println("Can’t find " + searchKey);
   }
}
