
/* 
 *
 * Creates two arrays - one for each integer from 0 to 9
 * Another generates 100 random numbers from 0-9 
 * the loop calculates how many times each integer
 * occurs from 0-9 in the 100-long array
 */

import java.util.*;

public class HundredRandoms
{
  public static void main(String[] args)
  {
    int[] counts = new int[10];
    int[] arr = new int[100];
    for (int i = 0; i < 100; i++)
    {
      arr[i] = (int) (Math.random() * 10);
      for (int k = 0; k < 10; k++)
      {
        if (arr[i] == k)
          counts[k]++;
      }
    }
    for (int e : counts)
      System.out.println(e);
  }
}
