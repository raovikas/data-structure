package org.data.structure.practice.sorting;

public class BubbleSortApp
{
   public static void main(String[] args)
   {
      int maxSize = 100; // array size
      ArrayBub arr; // reference to array
      arr = new ArrayBub(maxSize); // create the array
      arr.insert(5); // insert 10 items
      arr.insert(3);
      arr.insert(7);
      arr.insert(1);
      arr.insert(2);
      arr.insert(8);
      arr.insert(4);

      arr.display(); // display items
      arr.bubbleSort(); // bubble sort them
      arr.display(); // display them again
   }
}
