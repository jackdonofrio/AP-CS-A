
/**
 * Name: John Donofrio Only turn this file in to the dropbox. Only use AP
 * official subset methods for ArrayLists, Strings, 1D arrays, etc. Focuses on
 * Chapter 7 in the EText
 * 
 * @version 1.1 - shifted order to match tests.
 */

public class JU08
{
  // Declare any constants up here.

  /**
   * Using a regular FOR loop, build a single sentence out of all of the names
   * in the names array. Example:
   * 
   * <pre>
   * sayNamesRegularFOR({"Grace","Steve","Ada"})
   *                    -> "<Grace><Steve><Ada>"
   * </pre>
   * 
   * @param names
   * @return
   */
  public static String sayNamesRegularFOR(String[] names)
  {
    // You MUST use a regular FOR loop to solve this.
    String sentence = "";
    for (int i = 0; i < names.length; i++)
    {
      sentence += "<" + names[i] + ">";
    }
    return "Start:" + sentence + ":Finish";
    // for each element in names, the string in each element is added to
    // sentence
  }

  /**
   * Using a FOR EACH loop, build a single sentence out of all of the names in
   * the names array. Example:
   * 
   * <pre>
   * sayNamesFOREACH({"Grace","Steve","Ada"})
   *                    -> "<Grace><Steve><Ada>"
   * </pre>
   * 
   * @param names
   * @return
   */
  public static String sayNamesFOREACH(String[] names)
  {
    String sentence = "Start:";
    for (String e : names)
    {
      sentence += "<" + e + ">";
      // for each element in names, add each string to sentence with <> outside
      // of it
    }
    return sentence + ":Finish";
  }

  /**
   * Using a regular FOR loop, given an array, simply count the number of 42's
   * you find in the array. Related to: sequential search
   * 
   * <pre>
   * For example, 
   * arr = {5, 3, 8, 42, 9, 42, 9, 42, 42}
   * then 
   * warmUpCount42s(arr) -> 4
   * </pre>
   * 
   * @param arr
   * @return
   */
  public static int warmUpCount42RegularFOR(int[] arr)
  {
    int count = 0;
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] == 42)
        count++;
      // for each value of i from 0 to arr.length, if arr[i] == 42, add 1 to
      // count
    }
    return count;
  }

  /**
   * Given four Strings, create an array and fill it with those strings in the
   * order given. So if name1 = "A", name2 = "Barry", name3 = "C", name4 = "D",
   * then the array would look:
   * 
   * <pre>
   * {"A", "Barry", "C", "D"}
   * </pre>
   * 
   * @param name1
   * @param name2
   * @param name3
   * @param name4
   * @return
   */
  public static String[] fillArrayWithNames(String name1, String name2,
    String name3, String name4)
  {
    String[] arr = {name1, name2, name3, name4};
    // new array is created with each name
    return arr;
  }

  /**
   * Using a FOR EACH loop, given an array, simply count the number of 42's you
   * find in the array. Related to: sequential search
   * 
   * <pre>
   * For example, 
   * arr = {5, 3, 8, 42, 9, 42, 9, 42, 42}
   * then 
   * warmUpCount42s(arr) -> 4
   * </pre>
   */
  public static int warmUpCount42FOREACH(int[] arr)
  {
    int count = 0;
    for (int e : arr)
    {
      if (e == 42)
        count++;
    }
    // for each element in arr, if it is equal to 42, increment count
    return count;
  }

  /**
   * Creates an array filled with whole numbers starting at zero and ending at
   * max.
   * 
   * <pre>
   * createArrayOfWholeNumbers(4) would return {0, 1, 2, 3, 4}
   * </pre>
   * 
   * @param max
   * @return
   */
  public static int[] createArrayOfWholeNumbers(int max)
  {
    int len = max + 1; // max + 1 = length
    int[] arr = new int[len];
    for (int i = 0; i < len; i++)
    {
      arr[i] = i;
      // for every integer value of i from 0 to len (max+1), each array element
      // i is filled with the respective value of i
    }
    return arr;
  }

  /**
   * Takes an array, creates a new array with the opposite values.
   * 
   * @param itemArray
   * @return
   */
  public static boolean[] reverseTheTruth(boolean[] itemArray)
  {
    boolean[] arr = new boolean[itemArray.length];
    // new array that is itemArray.length long
    for (int i = 0; i < arr.length; i++) {
      if (itemArray[i] == false)
        arr[i] = true;
      else 
        arr[i] = false;
      // swaps values of itemArray elements into arr elements
    }
    return arr;
  }

  /**
   * Creates a new array with values that are double the values in the original
   * array. itemArray is NOT changed after the call to doubleAllOfThem
   * 
   * <pre>
   *  Example
   *  stuff == {2, 3, -4,  8, 0, 1}
   *  thingy = doubleAllOfThem(stuff);
   *  thingy == {4, 6, -8, 16, 0, 2}
   *  stuff == {2, 3, -4, 8, 0, 1}
   * </pre>
   * 
   * @param itemArray
   * @return
   */
  public static int[] doubleAllOfThem(int[] itemArray)
  {
    int[] arr = new int[itemArray.length];
    // creates new int array with itemArray length
    for (int i = 0; i < itemArray.length; i++)
    {
      arr[i] = itemArray[i] * 2;
      // doubles each element in arr for e
    }
    return arr; // not the correct answer.
  }

  /**
   * Creates a new array using the values of myArray and yourArray. Basically
   * you are creating a new array by stitching the first array with the second.
   * 
   * <pre>
   *  stuff1 = {1, 4, 2}
   *  stuff2 = {5, 3};
   *  stuff3 = appendArrays(stuff1, stuff2);
   *  stuff3 == {1, 4, 2, 5, 3};
   * </pre>
   * 
   * @param myArray
   * @param yourArray
   * @return
   */
  public static int[] appendArrays(int[] myArray, int[] yourArray)
  {
    int[] arr = new int[myArray.length + yourArray.length];
    // creates new array that is myArray + yourArray lenths long
    int a = 0; // a is used to get elements of yourArray
    for (int i = 0; i < arr.length; i++)
    { // for values of i under myArray length, assign arr[i] to myArray[i]
      if (i < myArray.length)
        arr[i] = myArray[i];
      else
      {
        arr[i] = yourArray[a];
        a++;
        // once i exceeds myArray.length, start using a for yourArray elements
      }
    }
    return arr;
  }

  /**
   * Returns true if the numbers in the values array contain four numbers that
   * have the same value.
   * 
   * <pre>
   * isConsecutiveFour({3, 4, 5, 5, 5, 5, 4, 5}) -> true
   * isConsecutiveFour({3, 4, 5}) -> false
   * isConsecutiveFour({1, 1, 1, 1, 1, 4}) -> true
   * </pre>
   * 
   * @param values
   *          is not null
   * @return true or false
   */
  public static boolean isConsecutiveFour(int[] values)
  {
    boolean res = false;
    for (int i = 0; i < values.length - 3; i++)
    { // subtract three to avoid out of bounds
      if (values[i] == values[i + 1] && values[i] == values[i + 2]
        && values[i] == values[i + 3])
      {
        res = true;
      }
    }
    return res;
  }

  /**
   * Given an array, find the VALUE of the largest element in the array. Once
   * you find it, build a String sentence with the following format:
   * 
   * <pre>
   * "For the array [20, 10, 5, 90, 7], the largest value 90 can be found at index 3"
   * </pre>
   * 
   * @param arr
   *          non-empty, non null
   * @return a string of the format above.
   */
  public static String selectLargest(int[] arr)
  {
    String msg = "";
    int max = arr[0]; // max initialized to element 0
    int maxIndex = 0; // index of max stored here
    for (int i = 0; i < arr.length; i++)
    {
      if (arr[i] > max) // if arr[i] is greater than max...
      {
        max = arr[i]; // both value of max and maxIndex change
        maxIndex = i;
      }
      if (i == arr.length - 1)
        // if i is the last element, arr[i] is added with no comma
        msg += arr[i];
      else // else, it gets a comma
        msg += arr[i] + ", ";
    }

    return "For the array [" + msg + "], the largest value " + max
      + " can be found at index " + maxIndex;
  }

  /**
   * Given an array, and two locations, you will swap the values of those two
   * locations. Note: the locations x, and y could be bogus. Related to:
   * selection sort.
   * 
   * 
   * @param arr
   *          not null, non-empty.
   * @param x
   *          could be negative
   * @param y
   *          could be negative.
   */
  public static void swapEmIn1DArray(int[] arr, int x, int y)
  {
    if ((x < arr.length && x >= 0) && (y < arr.length && y >= 0))
      // x and y must both be in the range of >= 0 and < length of array
    {
      int temp = arr[x];
      arr[x] = arr[y];
      arr[y] = temp;
      // temp is used to store arr[x] and swap values
    }
  }

}