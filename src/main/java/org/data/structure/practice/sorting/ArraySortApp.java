package org.data.structure.practice.sorting;

public class ArraySortApp
{
   public static void main(String[] args)
   {
      int maxSize = 100; // array size
      ArraySort arr; // reference to array
      arr = new ArraySort(maxSize); // create the array
      arr.insert(38); // insert 10 items
      arr.insert(52);
      arr.insert(9);
      arr.insert(18);
      arr.insert(6);
      arr.insert(62);
      arr.insert(13);


      arr.display(); // display items
      arr.bubbleSort(); // bubble sort them
      //arr.selectionSort(); // selection sort
      arr.display(); // display them again
   }
}
