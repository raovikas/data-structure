package org.data.structure.practice.queue;
/* Java implementation using Array */
public class Queue
{

   private long[] queueArray;
   private int noOfItems;
   private int maxSize;
   private int rear;
   private int front;


   public Queue(int s)
   {
      maxSize = s;
      queueArray = new long[maxSize];
      noOfItems = 0;
      rear = -1;
      front = 0;
   }


   public void insert(long element)
   {
      if(rear == maxSize-1)
         rear = -1;
      queueArray[++rear] = element;
      noOfItems++;
   }

   public long remove()
   {
      long temp = queueArray[front++];
      if(front == maxSize)
         front = 0;
      noOfItems--;
      return temp;
   }

   public long peekFront()
   {
      return queueArray[front];
   }

   public boolean isEmpty()
   {
      return (noOfItems == 0);
   }

   public boolean isFull()
   {
      return (noOfItems == maxSize);
   }

   public int size()
   {
      return noOfItems;
   }
}
