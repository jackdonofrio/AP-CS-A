
/**
 * This is a review of all kinds of concepts.
 * Only use AP official subset methods for ArrayLists, Strings, 1D arrays, etc.
 * These methods focus on various arrays, loops, and whatever else I think
 * you need practice on.
 * @version 1.0
 * @author firstname lastname
 */

import java.util.ArrayList;
import java.util.List;

public class JU18
{
  /**
   * Accepts a string as a parameter and then creates an array of those letters
   * and returns it.
   * 
   * <pre>
   * convertStringTo1DArray("hello") -> ["h", "e", "l", "l", "o"]
   * convertStringTo1DArray("who") -> ["w", "h", "o"]
   * </pre>
   * 
   * @param str
   *          is not null.
   * @return
   */
  public static String[] convertStringTo1DArray(String str)
  {
    String[] arrayOfLetters = new String[str.length()];
    for (int i = 0; i < str.length(); i++)
    {
      arrayOfLetters[i] = str.substring(i, i + 1);
    }
    return arrayOfLetters;
  }

  /**
   * Given an array of ints, return true if the array contains either 3 even or
   * 3 odd values all next to each other.
   * 
   * <pre>
   * modThree({2, 1, 3, 5}) -> true 
   * modThree({2, 1, 2, 5}) -> false
   * modThree({2, 4, 2, 5}) -> true
   * </pre>
   * 
   * @param nums
   * @return
   */
  public static boolean threeOddOrEven(int[] nums)
  {
    boolean threeOddEven = false;
    for (int i = 0; i < nums.length - 2; i++)
    {
      if (nums[i] % 2 == nums[i + 1] % 2 && nums[i + 2] % 2 == nums[i] % 2)
      {
        threeOddEven = true;
      }
    }
    return threeOddEven;
  }

  /**
   * Return a version of the given array where each zero value in the array is
   * replaced by the largest odd value to the right of the zero in the array. If
   * there is no odd value to the right of the zero, leave the zero as a zero.
   * 
   * <pre>
   * replaceZerosWithBigOdd([0, 5, 0, 3]) -> {5, 5, 3, 3}
   * replaceZerosWithBigOdd([0, 4, 0, 3]) -> {3, 4, 3, 3}
   * replaceZerosWithBigOdd([0, 1, 0]) -> {0, 1, 0}
   * </pre>
   * 
   * @param nums
   * @return
   */
  public static List<Integer> replaceZerosWithBigOdd(List<Integer> nums)
  {
    for (int i = 0; i < nums.size(); i++)
    {
      if (nums.get(i) == 0)
      {
        int largestOdd = 0;
        for (int j = i; j < nums.size(); j++)
        {
          if (nums.get(j) % 2 == 1 && nums.get(j) > largestOdd)
          {
            largestOdd = nums.get(j);
          }
        }
        nums.set(i, largestOdd);
      }
    }
    return nums;
  }

  /**
   * An array is good enough if it contains three numbers in a row that does
   * this:
   * 
   * <pre>
   *  a value
   *  followed by that value + 5
   *  followed by that value - 1
   *  Note: The last value can differ by 2 or less from the correct value
   *  
   *  goodEnough([2, 7, 1]) -> true
   *  goodEnough([3, 8, 2]) -> true
   *  goodEnough([3, 8, 0]) -> true
   *  goodEnough([4, 9, 0]) -> false
   *  goodEnouhg([1, 2, 7, 1]) -> true
   *  goodEnough([1, 2, 8, 1]) -> false
   * </pre>
   * 
   * @param nums
   * @return
   */
  public static boolean goodEnough(List<Integer> nums)
  {
    boolean isGoodEnough = false;

    for (int i = 0; i < nums.size() - 2; i++)
    {
      if (nums.get(i + 1) == nums.get(i) + 5
        && Math.abs(nums.get(i) - nums.get(i + 2)) <= 1)
      {
        isGoodEnough = true;
      }
    }
    return isGoodEnough;
  }

  /**
   * Given two strings, base and remove, return a version of the base string
   * where all instances of the remove string have been removed (not case
   * sensitive). You may assume that the remove string is length 1 or more.
   * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves
   * "x".
   * 
   * <pre>
   * PRECONDITION: sentence and toBeRemoved will be lowercase.
   * searchAndRemoveSubstring("hello there", "he") -> "llo tre"
   * searchAndRemoveSubstring("hey hey fun", "e") -> "hy hy fun"
   * </pre>
   * 
   * @param base
   * @param remove
   * @return
   */
  public static String searchAndRemoveSubstring(String sentence,
    String toBeRemoved)
  {
    String newStr = "";
    int len = toBeRemoved.length();
    for (int i = 0; i < sentence.length(); i++)
    {
      if (i + len <= sentence.length()
        && sentence.substring(i, i + len).equals(toBeRemoved))
      {
        i += len - 1;
      }
      else
      {
        newStr += sentence.substring(i, i + 1);
      }
    }
    return newStr;
  }

  /**
   * Return an array that contains exactly the same numbers as the given array,
   * but rearranged so that every 4 is immediately followed by a 5. Do not move
   * the 4's, but every other number may move. The array contains the same
   * number of 4's and 5's, and every 4 has a number after it that is not a 4.
   * 
   * <pre>
   * PRECONDITION: number of 4s = number 5s in the array. 
   *               No four will be at the end of array. 
   *               No two four's in a row.
   * POSTCONTION: 4s must stay at SAME location.
   * putFivesAfterFours([5, 4, 1, 4, 5]) -> [1, 4, 5, 4, 5]
   * putFivesAfterFours([5, 4, 9, 4, 9, 5]) -> [9, 4, 5, 4, 5, 9]
   * putFivesAfterFours([1, 4, 1, 5]) -> [1, 4, 5, 1]
   * </pre>
   * 
   * @param nums
   *          is not null
   * @return
   */
  public static int[] putFivesAfterFours(int[] nums)
  {
    // {4, 3, 4, 5, 4, 9, 1, 1, 1, 5, 5}
    for (int i = 0; i < nums.length; i++)
    {
      if (nums[i] == 4 && nums[i + 1] != 5)
      {
        for (int j = 0; j < nums.length; j++)
        {
          if (nums[j] == 5 && (j == 0 || nums[j - 1] != 4))
          {
            int temp = nums[j];
            nums[j] = nums[i + 1];
            nums[i + 1] = temp;
          }
        }
      }
    }
    return nums;
  }

  /**
   * So the parameter max contains the largest value that should be in the 1D
   * array. You are to create and return a 1D array filled with numbers that
   * decrease one at a time in reverse order. For example
   * 
   * <pre>
   * Note: the spaces are added to make it easier to see the pattern.
   * reversyFun(3) -> {0,0,1,    0, 2, 1,    3, 2, 1}
   * reversyFun(5) -> {0,0,0,0,1,   0,0,0,2,1,    0,0,3,2,1,   0,4,3,2,1,    5,4,3,2,1}
   * </pre>
   * 
   * @param max
   * @return
   */
  public static int[] reversyFun(int max)
  {
    int[] array = new int[max * max];

    for (int row = max - 1; row >= 0; row--)
    {
      for (int col = max - 1; col >= 0; col--)
      {
        array[0] = 1;
      }
    }

    return array;
  }

}