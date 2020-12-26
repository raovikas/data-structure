package org.data.structure.array;

/* ordered primitive type element array */
public class HigherOrderedArray
{
   private long[] longArray;
   private int nElement;

   public HigherOrderedArray(int max)
   {
      longArray = new long[max];
      nElement = 0;
   }

   public void insert(long element)
   {
      int i;
      for (i = 0; i < nElement; i++)
      {
         if (longArray[i] > element)
         {
            break;
         }
      }

      for (int j = nElement; j > i; j--)
      {
         longArray[j] = longArray[j - 1];
      }
      longArray[i] = element;
      nElement++;

   }

   public int size()
   {
      return nElement;
   }


   public int find(long searchKey)
   {
      int lowerBound = 0;
      int uperBound = nElement-1;
      int curEement;
      while(true)
      {
         curEement = (lowerBound+uperBound)/2;
         if(longArray[curEement]==searchKey)
            return curEement;
         else if(lowerBound>uperBound)
         {
            return nElement;
         }
         else
         {
            if(longArray[curEement]>searchKey)
            {
               uperBound = curEement-1;
            }
            else
            {
               lowerBound = curEement+1;
            }
         }

      }

   }

   public boolean delete(long element)
   {
      int i = find(element);
      if(i == nElement)
         return false;
      else
      {
         for(int j = i; j<nElement-1;j++)
         {
            longArray[j] = longArray[j+1];
         }
         nElement--;
         return true;
      }
   }

   public void display()
   {
      for (int i = 0; i < nElement; i++)
      {
         System.out.print(longArray[i] + " ");
      }
      System.out.println("");
   }

}
