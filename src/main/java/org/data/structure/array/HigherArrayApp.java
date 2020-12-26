package org.data.structure.array;

public class HigherArrayApp
{
   public static void main(String[] args)
   {
      HigherArray hightArray = new HigherArray(6);
      hightArray.insert(2);
      hightArray.insert(7);
      hightArray.insert(5);
      hightArray.insert(4);
      hightArray.insert(3);
      hightArray.insert(8);

      hightArray.find(5);
      hightArray.delete(5);
      hightArray.display();

   }
}
