/**
 * Name: John Donofrio Exercises practicing using 1D arrays of primitives.
 * Submit this to the dropbox. Restrictions: You may not use the Arrays nor List
 * class to solve any of these problems. This includes the Arrays.equals method
 * which would solve some of these problems in one line of code.
 * 
 * @version 1.0
 */

public class JU07
{
  // Declare any constants here.

  // Since all of these methods are static, you will not
  // declare any instance variables.

  /**
   * We send an array to be mutated. This method changes the 1st element of the
   * array to 40. and the fourth element to 35 if a fourth element exists.
   * 
   * <pre>
   *  Example 1
   *  stuff ==  {23, 23, 38, 12, 22, 30}
   *  changeThe1stAnd4thValue(stuff);
   *  stuff ==  {40, 23, 38, 35, 22, 30}
  
   *  Example 2 (there is no 4th element)
   *  cruft ==  {23, 23, 38}
   *  changeThe1stAnd4thValue(stuff);
   *  cruft ==  {40, 23, 38}
   * </pre>
   * 
   * @param score
   */
  public static void changeThe1stAnd4thValue(int[] score)
  {
    score[0] = 40; // first element score[0] is set to 40
    if (score.length >= 4)
      score[3] = 35;
    // if length is >= 4, 4th element (score[3]) is set to 35.
  }

  /**
   * Calculates the capacity of a given array; that is, how many integers can be
   * stored into the array.
   * 
   * @param itemArray
   * @return
   */
  public static int getCapacity(int[] itemArray)
  {
    if (itemArray == null) // if itemArray is null, 0 is returned
      return 0;
    else
      return itemArray.length; // else, the length is returned
  }

  /**
   * Given three non-null arrays, return back the total number of elements of
   * all three arrays.
   * 
   * <pre>
   * arr1 == {1, 4, 4}
   * arr2 == {8, 3, 2, 1}
   * arr3 == {4}
   * totalNumberOfElements(arr1, arr2, arr3) -> 8
   * </pre>
   * 
   * @param arr1
   * @param arr2
   * @param arr3
   */
  public static int totalNumberOfElements(int[] arr1, int[] arr2, int[] arr3)
  {
    return arr1.length + arr2.length + arr3.length; // sum of all lengths
  }

  /**
   * Given an non-null array, this method mutates the array by raising just the
   * last element to the given power parameter. Note: Math.pow always returns a
   * double, so you'll have to deal with that.
   * 
   * <pre>
   * itemArray == {3, 3, 5, 2}
   * then
   * raiseTheLastElementToThePower(itemArray, 3) mutates itemArray to
   * itemArray = {3, 3, 5, 8}
   * </pre>
   * 
   * @param itemArray
   * @param power
   */
  public static void raiseTheLastElementToThePower(int[] itemArray, int power)
  {
    itemArray[itemArray.length - 1] =
      (int) Math.pow(itemArray[itemArray.length - 1], power);
    // the last element of itemArray is raised to 'power'
  }

  /**
   * Calculates the number of non zero elements in the array.
   * 
   * <pre>
   * if myArray is {2, 0, 0, 1, 0, 0, 2, 0}
   * then getNumberOfNonZeroElements(myArray) -> 3
   * </pre>
   * 
   * @param myArray
   * @return
   */
  public static int getNumberOfNonZeroElements(int[] myArray)
  {
    int count = 0;
    for (int i = 0; i < myArray.length; i++)
      // checks every element, if it's not zero, count is incremented.
      if (myArray[i] != 0)
        count++;
    return count;
  }

  /**
   * Given an array, this method builds a String describing the array element by
   * element. See the tests.
   * 
   * @param list
   * @return
   */
  public static String prettyPrint(int[] list)
  {
    String message = "";
    for (int i = 0; i < list.length; i++)
      message += "The value of list sub " + i + " is " + list[i] + "\n";
    // for each value of i, list[i] is added to message with the appropriate
    // supporting text
    if (list.length == 0)
      message += "The array is empty.\n";
    // if the length is 0, it's empty and this is displayed
    return "This array contains " + list.length + " elements.\n" + message;
  }

  /**
   * Mutates the myArray by swapping element 4 with element 5. myArray will have
   * at least 5 elements.
   * 
   * <pre>
   * Given: myArray == {10, 20, 4, 30, 2, 8} swapEm(myArray) myArray == {10, 20,
   * 4, 2, 30, 8}
   * 
   * @param myArray
   */
  public static void swapEm(int[] myArray)
  {
    int temp = myArray[4];
    myArray[4] = myArray[5];
    myArray[5] = temp;
    // temp is used to store element 4 then swap the values.
  }

  /**
   * Mutates the myArray by swapping element 4 with element 5. myArray will have
   * at least 5 elements.
   * 
   * <pre>
   * Given: myArray == {10, 20, 4, 30, 2, 8} swapEm(myArray) myArray == {10, 20,
   * 4, 2, 30, 8}
   * 
   * @param myArray
   */
  public static void swapFirstWithLast(int[] myArray)
  {
    int temp = myArray[0];
    myArray[0] = myArray[myArray.length - 1];
    myArray[myArray.length - 1] = temp;
    // temp is used to hold the value of myArray[0] in order to swap values with
    // the last element (myArray[myArray.length - 1])
  }

  /**
   * Checks if the values of myArray match the values in yourArray. If the two
   * arrays have different length, they are not equal. Do not use the Arrays
   * class.
   * 
   * <pre>
   * equalArrays({4, 2, 9}, {4, 2, 9}) -> true
   * equalArray({9, 8, 2}, {9, 8}) -> false
   * </pre>
   * 
   * @param myArray
   *          will never be null
   * @param yourArray
   *          will never be null
   * @return
   */
  public static boolean equalArrays(int[] myArray, int[] yourArray)
  {
    int matches = 0;
    if (myArray.length == yourArray.length)
    {
      for (int i = 0; i < myArray.length; i++)
      {
        if (myArray[i] == yourArray[i])
          matches++;
      }
    }
    if (matches == myArray.length)
      return true;
    else
      return false;
    // if the lengths of each array are equal and the number of matches (every
    // element of one array that equals its counterpart) is equal to the length,
    // it returns true. Else, it returns false
  }

  /**
   * Counts the number of 42's stored in myArray.
   * 
   * <pre>
   *  stuff == {0, 1, 42, 2, 42, 1, 2}
   *  countFortyTwos(stuff) returns 2
   * </pre>
   * 
   * @param myArray
   * @return
   */
  public static int countFortyTwos(int[] myArray)
  {
    int count = 0;
    for (int i = 0; i < myArray.length; i++)
      if (myArray[i] == 42)
        count++;
    return count;
    // if an element in the array = 42, it adds to count.
  }

  /**
   * Sums up the total value of the array elements. Look at the bottom of page
   * 231 for an epic victory royale hint.
   * 
   * <pre>
   * myArray = {4, 2, 3}
   * getTotal(myArray) -> 9
   * </pre>
   * 
   * @param myArray
   * @return
   */
  public static int getTotal(int[] myArray)
  {
    int sum = 0;
    for (int i = 0; i < myArray.length; i++)
      sum += myArray[i];
    // adds each value of myArray[i] until !(i < myArray.length)
    return sum;
  }

  /**
   * Calculates the average score of all test values in the array. So if the
   * student got a 100, an 80, and a 90, then the average is 90.0.
   * 
   * <pre>
   * getAverage({100, 80}) -> 90.0
   * 
   * @param scoreArray
   * @return
   */
  public static double getAverage(int[] scoreArray)
  {
    int count = 0;
    double sum = 0;
    // sum is double so that decimals can be returned in the calculation
    for (int i = 0; i < scoreArray.length; i++)
    {
      sum += scoreArray[i];
      count++;
    }
    return sum / count;
  }

  /**
   * Given an non null array of grades, it returns the final letter grade that
   * the student should receive. It doesn't round, so an 89.9 is a B.
   * 
   * <pre>
   *  calculateGrade({90, 100}) -> "A"
   *  calculateGrade({90, 80, 100) -> "A"
   *  calculateGrade({70, 90, 81}) -> "B"
   * </pre>
   * 
   * @param scoreArray
   * @return
   */
  public static String calculateGrade(int[] scoreArray)
  {
    double grade = getAverage(scoreArray);
    // invokes getAverage for scoreArray to determine the grade.
    if (grade >= 90.0)
      return "A";
    else if (grade < 90.0 && grade >= 80.0)
      return "B";
    else if (grade < 80.0 && grade >= 70.0)
      return "C";
    else if (grade < 70.0 && grade >= 60.0)
      return "D";
    else
      return "F";
  }

  /**
   * Finding the largest element. (Answer is on page 232 of the EBook). Given an
   * array of integers, return the value of the largest element in the array.
   * 
   * <pre>
   *  stuff == {30, 11, 23, 17, 5}
   *  getTheBiggest(stuff) -> 30 
   *  stuff == {8, 3, 101, 89, 88, 22}
   *  getTheBiggest(stuff) -> 101
   * </pre>
   * 
   * @param myArray
   * @return
   */
  public static int getTheBiggest(int[] myArray)
  {
    int max = myArray[0]; // max is initialized to 1st element
    for (int i = 1; i < myArray.length; i++)
    {
      if (myArray[i] > max)
      // for each value of i, if myArray[i] is greater than max, it becomes the
      // new max.
      {
        max = myArray[i];
      }
    }
    return max;
  }

  /**
   * Given the titles of books that you are going to put on a shelf, find the
   * one that would go at the end of the shelf if you alphabetically sorted
   * them. PRECONDITION: all books start with an uppercase letter.
   * 
   * <pre>
   *  stuff == {"Horse", "Chicken", "Snake", "Apple"}
   *  bookAtEndOfShelf(stuff) -> "Snake" 
   *  stuff == {"Zebra", "Zoo", "Monster"}
   *  bookAtEndOfShelf(stuff) -> "Zoo"
   * </pre>
   * 
   * @param myArray
   * @return
   */
  public static String bookAtEndOfShelf(String[] books)
  {

    for (int i = 0; i < books.length; i++) {
      for (int j = i + 1; j < books.length; j++)
      if (books[i].compareTo(books[j]) > 0) 
      {
        String temp = books[i];
        books[i] = books[j];
        books[j] = temp;
      }   
    }
    return books[books.length - 1];
    // sorts books alphabetically, then gives last string in array.
  }

  /**
   * Shift all numbers in the array one spot forward. The last element goes to
   * the front. Look the bottom of page 232 in the EText.
   * 
   * <pre>
   * nums = {34, 10, 42, 8, 13}
   * shiftAllForwardOne(nums)
   * nums now is {13, 34, 10, 42, 8}
   * </pre>
   * 
   * @param nums
   */
  public static void shiftAllForwardOne(int[] nums)
  {
    int[] tempArray = new int[nums.length];
    for (int i = 0; i < nums.length; i++) // create new array to copy values
      tempArray[i] = nums[i];
    for (int i = 0; i < nums.length - 1; i++)
      nums[i + 1] = tempArray[i];
    nums[0] = tempArray[tempArray.length - 1];
    // I had to create a copy array because the new values I assigned would
    // overwrite the old ones and I would end up getting something like [-3, 1,
    // 1, 1] as an answer when the 1 gets copied as the value of nums[i].
    // Admittedly, there was probably an easier way to solve this.
  }

  /**
   * The array stores a different word in each element. Count the total number
   * of letters in the array. Hint: The String class has a length() accessor
   * method that returns the number of letters in a String reference.
   * 
   * <pre>
   *  Example:
   *  words == {"apple", "bah", "oh"};
   *  getTotalLetters(words) -> 10
   * </pre>
   * 
   * @param wordArray
   * @return
   */
  public static int getTotalLetters(String[] wordArray)
  {
    int sum = 0;
    for (int i = 0; i < wordArray.length; i++)
      sum += wordArray[i].length();
    // length of each string element is added to sum.
    return sum; 
  }

}