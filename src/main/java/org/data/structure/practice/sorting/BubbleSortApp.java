package org.data.structure.practice.sorting;

public class BubbleSortApp
{
   public static void main(String[] args)
   {
      int maxSize = 100; // array size
      ArrayBub arr; // reference to array
      arr = new ArrayBub(maxSize); // create the array
      arr.insert(36); // insert 10 items
      arr.insert(19);
      arr.insert(29);
      arr.insert(12);
      arr.insert(5);


      arr.display(); // display items
      arr.bubbleSort(); // bubble sort them
      arr.display(); // display them again
   }
}
