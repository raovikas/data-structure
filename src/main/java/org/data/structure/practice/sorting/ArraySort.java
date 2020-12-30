package org.data.structure.practice.sorting;

/* unordered primitive type array*/
public class ArraySort
{

   private long[] longArray; // ref to array longArray
   private int nElement; // no of data items

   public ArraySort(int max)
   {
      longArray = new long[max]; // create the array
      nElement = 0; // no item yet
   }

   public void insert(long value) // put elememt into array
   {
      longArray[nElement] = value; // insert it
      nElement++; // increment size
   }

   public boolean find(long searchElement)
   {
      int i;
      for (i = 0; i < nElement; i++)
      {
         if (longArray[i] == searchElement)
            break;
      }

      if (i == nElement) // go to end ?
         return false; // not found element
      else
         return true;

   }

   public int size()
   {
      return nElement;
   }

   public boolean delete(long element)
   {
      int i ;
      for(i=0;i<nElement;i++)
      {
         if(longArray[i] == element)
            break;
      }

      if(i == nElement)
         return false;
      else
      {
         for(int k=i;k<nElement-1;k++)  // 1 ,2 ,3, 4 ,5  //2
         {
            longArray[k] = longArray[k+1];
         }
         nElement--;
         return true;
      }

   }

   public void display()
   {
      for(int i=0;i<nElement;i++)
      {
         System.out.print(longArray[i]+" ");
      }
      System.out.println("");
   }

   public void bubbleSort()
   {
      for(int i = 0; i<nElement-1;i++)
      {
         int flags = 0;
         for(int j =0; j<nElement-1-i;j++)
         {
            if(longArray[j]>longArray[j+1])
            {
               swap(j,j+1);
               flags = 1;
            }
         }
         if(flags == 0) break;
      }
   }



   public void selectionSort()
   {
      for(int i=0;i<nElement-1;i++)
      {
         int min=i;

         for(int j=i+1;j<nElement;j++)
         {
            if(longArray[min]>longArray[j])
            {
               min = j;
            }
         }
         swap(i,min);
      }
   }

   private void swap(int one, int two)
   {
      long temp = longArray[one];
      longArray[one] = longArray[two];
      longArray[two] = temp;
   }


}
