/**
 * Complete the methods below. A series of exercises that focus on 2D arrays of
 * primitives. You may assume that any 2D array will be rectangular i.e all rows
 * in the 2D array have the same length.
 *
 * @author John Donofrio
 * @version 1.4
 *
 */
public class JU09
{
  // Declare and initialize constants here. Make sure you name them in
  // a way that makes the grader happy.

  /**
   * A 1D array review problem. Given an array of coinFlips, count the number of
   * heads and return it. Assume heads == true, and tails == false. You must do
   * this with a FOREACH loop. Examples:
   * 
   * <pre>
   * countHeadsUsingFOREACH({true, true, false}) -> 2
   * countHeadsUsingFOREACH({false, false, true, true, true}) -> 3
   * </pre>
   * 
   * @param coinFlips
   *          != null
   * @return number of heads.
   */
  public static int countHeadsUsingFOREACH(boolean[] coinFlips)
  {
    int headCount = 0;
    // for each loop checks if each value in 1D array is true, if so headCount
    // is incremented.
    for (boolean e : coinFlips)
      if (e)
        headCount++;
    return headCount;
  }

  /**
   * Returns the number of columns that matrix contains.
   *
   * PRECONDITION: matrix has at least one row.
   *
   * @param arr
   *          is not null.
   * @return number of columns that arr contains.
   */
  public static int getNumberOfColumns(int[][] matrix)
  {

    // length of first array = # of columns as long as all 1d arrays are equal
    // in the matrix, or the first is longest.
    return matrix[0].length;
  }

  /**
   * Returns the number of rows that matrix contains.
   *
   * PRECONDITION: matrix has at least one row.
   *
   * @param arr
   *          is not null.
   * @return
   */
  public static int getNumberOfRows(int[][] matrix)
  {
    // rows = number of arrays in the 2d array = matrix.length
    return matrix.length;
  }

  /**
   * Returns the dimensions of the matrix in a nice human format.
   *
   * <pre>
   * if arr1 is:
   * 8 9
   * 2 0
   * 3 3
   * getDimensions(arr1) -> "3x2"
   *
   * if arr2 is:
   * 8 9 4 4 1
   * 2 0 3 3 1
   * 3 3 3 3 2
   * 3 3 3 3 2
   * getDimensions(arr2) -> "4x5"
   * </pre>
   *
   * @param matrix
   * @return
   */
  public static String getDimensions(int[][] matrix)
  {
    // # of columns = matrix.length # of rows = matrix[0].length
    return matrix.length + "x" + matrix[0].length;
  }

  /**
   * The client will send you a 2D array reference that is constructed where all
   * elements are zero. Your job is to set three of the elements to different
   * values. Sets three of the numbers in the 2D array to 42, -2, and -3. The
   * top left corner element is 42. The 3rd row, 3rd column is -2. The 4th 6th
   * column is -3
   *
   * <pre>
   * For example:
   * if arr is this:
   * [0, 0, 0, 0, 0, 0, 0]
   * [0, 0, 0, 0, 0, 0, 0]
   * [0, 0, 0, 0, 0, 0, 0]
   * [0, 0, 0, 0, 0, 0, 0]
   * [0, 0, 0, 0, 0, 0, 0]
   *
   * Then after the method call to setThreeNumbers, it will look like this:
   * [42, 0, 0, 0, 0, 0, 0]
   * [0, 0, 0, 0, 0, 0, 0]
   * [0, 0, -2, 0, 0, 0, 0]
   * [0, 0, 0, 0, 0, -3, 0]
   * [0, 0, 0, 0, 0, 0, 0]
   *
   * The values are set the same in every 2d array that's sent.
   * the one in the top left corner
   * is 42, etc.
   * </pre>
   *
   * @param arr
   *          is already constructed but may not have enough space to store all
   *          the numbers
   */
  public static void setThreeNumbers(int[][] arr)
  {
    // fills in arrays with appropriate values if length conditions are met
    if (arr.length >= 1)
      arr[0][0] = 42;
    if (arr.length >= 3)
      arr[2][2] = -2;
    if (arr.length >= 4)
      arr[3][5] = -3;
    return;
  }

  /**
   * Sets the corner elements of a 2D array to the same value given by the
   * client.
   * 
   * <pre>
   * 0 0 0 
   * 0 0 0
   * 0 0 0
   *
   * after a call to setTheCorners(arr, 4), the 2D array will look like this.
   *
   * 4 0 4
   * 0 0 0
   * 4 0 4
   * </pre>
   * 
   * @param arr
   *          non null.
   * @param value
   *          any integer
   */
  public static void setTheCorners(int[][] arr, int value)
  {
    // Top
    arr[0][0] = value; // Top Left
    arr[0][arr[0].length - 1] = value; // Top Right
    // Bottom
    arr[arr.length - 1][0] = value; // Bottom Left
    arr[arr.length - 1][arr[arr.length - 1].length - 1] = value; // Bottom Right
    return;
  }

  /**
   * Creates a 2x2 2D array filled with the fillValue sent by the client.
   *
   * @param fillValue
   * @return
   */
  public static int[][] buildASmallSquare(int fillValue)
  {
    int[][] twoByTwo = {{fillValue, fillValue}, {fillValue, fillValue}};
    // initializes/fills 2x2 2d array with fillValue
    return twoByTwo;
  }

  /**
   * Returns the capacity of the array arr. Determines the maximum number of
   * elements that this array can store. Return zero if the array has not been
   * constructed.
   *
   * <pre>
   * getCapacity(null) -> 0
   * getCapacity({1, 2, 4},
   *             {5, 2, 9}) - > 6
   * </pre>
   *
   * @param arr
   *          can be null so watch for that.
   * @return zero if the array was null.
   */
  public static int getCapacity(int[][] arr)
  {
    int capacity = 0;
    if (arr != null) // arr must have been constructed
    {
      for (int i = 0; i < arr.length; i++) // arr[i] = each row
      {
        for (int k = 0; k < arr[i].length; k++)
          // gets # of elements in each row
          capacity++;
      }
      return capacity;
    }
    else // if it is not constructed, 0 is returned
      return 0;
  }

  /**
   * Determines if the non-null matrix has a square shape.
   * 
   * <pre>
   * isSquare({1, 2}, {3, 4}) -> true
   * isSquare({1, 2}, {3, 4}, {4, 5}) -> false
   * </pre>
   * 
   * @param arr
   *          non null
   * @return true if the
   */
  public static boolean isSquare(int[][] matrix)
  {
    // # of rows
    int height = matrix.length;

    // # of elements in row (assuming all rows have = # of elements)
    int length = matrix[0].length;

    if (height == length) // def of square: length = width (in this case height)
      return true;
    else
      return false;
  }

  /**
   * Create an array that copies the values from the first column of the
   * non-null matrix.
   * 
   * <pre>
   * So if the matrix is
   *     1, 5, 9
   *     12, 41, 2
   *     4, 9, 8
   *     8, 8, 8
   *     
   * Then the returned value would be
   *    {1, 12, 4, 8}
   * </pre>
   * 
   * @param matrix
   * @return
   */
  public static int[] getFirstColumn(int[][] matrix)
  {
    int[] firstColumnNums = new int[matrix.length]; // matrix len = # of columns
    for (int i = 0; i < matrix.length; i++)
    {
      firstColumnNums[i] = matrix[i][0]; // first # in each column
    }
    return firstColumnNums; // returns 1d array of 1st elements
  }

  /**
   * Given a length of a square 2D array of integers, build that 2D array, then
   * fill it with the value 13 in all of the elements, except where the row
   * number is the same as the column number, fill those with 42's. Return that
   * array.
   * 
   * <pre>
   * buildAndFillSquare(5) ->
   * 42 13 13 13 13
   * 13 42 13 13 13
   * 13 13 42 13 13
   * 13 13 13 42 13
   * 13 13 13 13 42
   * </pre>
   * 
   * @param sideLength
   *          > 0
   * @return a 2D array.
   */
  public static int[][] buildAndFillSquare(int sideLength)
  {
    // creates square 2d array
    int[][] arr = new int[sideLength][sideLength];
    for (int i = 0; i < arr.length; i++)
    {
      for (int k = 0; k < arr[i].length; k++)
      {
        if (k == i) // if k is equal to i, that element is = 42
          arr[i][k] = 42;
        else
          arr[i][k] = 13; // else, the element is 13
      }
    }
    return arr;
  }

  /**
   * Bumps all of the values in a particular row by +1. If it's NOT a valid row
   * number, then the array is not changed.
   *
   * @param arr
   *          non null
   * @param rowNum
   *          may be invalid.
   */
  public static void increaseValuesOfARowByOne(int[][] arr, int rowNum)
  {
    if (rowNum <= arr.length - 1) // if the row number represents a real row
    {
      for (int k = 0; k < arr[rowNum].length; k++)
      {
        arr[rowNum][k]++; // increments each element in rowNum
      }
    }

    return;
  }

  /**
   * Othello is a board game. You find out who wins by counting the number of
   * white discs (player 1 true) and black discs (player 2 false). A two
   * dimensional array is passed to this method. There are three possible
   * responses: "Player 1 Wins!", "Player 2 Wins!", "It's a Tie!"
   *
   * <pre>
   * if aBoard is:
   * true false
   * false true
   * whoWonOthello(aBoard) -> "It's a Tie!"
   *
   * if bBoard is:
   * true true true true
   * false false true true
   * whoWonOthello(bBoard) -> "Player 1 Wins!"
   * </pre>
   *
   *
   * @param board
   *          non null
   * @return see above.
   */
  public static String whoWonOthello(boolean[][] board)
  {
    int player1Score = 0;
    int player2Score = 0;
    // counts how many times true / false appear, increment scores
    for (int i = 0; i < board.length; i++)
    {
      for (int k = 0; k < board[i].length; k++)
      {
        if (board[i][k])
          player1Score++;
        else
          player2Score++;
      }
    }
    // return appropriate message based on score
    if (player1Score > player2Score)
      return "Player 1 Wins!";
    else if (player2Score > player1Score)
      return "Player 2 Wins!";
    else
      return "It's a Tie!";
  }

  /**
   * Tallies each column in a total at the bottom of the 2d array. Any values in
   * the last row are overwritten with these subtotals. The 2D array can have
   * any dimensions, but the last row will always start out as zeros.
   *
   * <pre>
   * 1 2 3 1 2
   * 1 3 1 0 2
   * 0 0 0 0 0
   *
   * after the call to fillTotals
   *
   * 1 2 3 1 2
   * 1 3 1 0 2
   * 2 5 4 1 4
   * </pre>
   *
   * @param scores
   *          non null
   */
  public static void fillTotals(int[][] scores)
  {
    // loops through each column and sums the each element in the column except
    // for the last row. the element in the last row is given the total value
    for (int k = 0; k < scores[0].length; k++)
    {
      int total = 0;
      for (int i = 0; i < scores.length; i++)
      {
        if (i != scores.length - 1)
          total += scores[i][k];
        if (i == scores.length - 1)
          scores[scores.length - 1][k] = total;
      }
    }
    return;
  }

  /**
   * Searches for the value searchValue in a 2D matrix. There's a message if you
   * can't find the value and one if you do find the value. Examples:
   *
   * <pre>
   * if arr2D is
   * 8 3 2
   * 9 3 1
   * locateValue(arr2D, 10) ->
   * "The value 10 is not in this array."
   *
   * if arr2DB is
   * 8 2 2 2 1
   * 9 9 9 2 1
   * 0 0 2 2 1
   * 0 1 1 8 1
   * locateValue(arr2DB, 8) ->
   * "The value 8 was found at row 3, column 3."
   * </pre>
   *
   * @param arr
   *          is not null.
   * @param searchValue
   *          a value that may or may not exist in the matrix.
   * @return see the message format above.
   */
  public static String locateValue(int[][] matrix, int searchValue)
  {
    int row = 0;
    int column = 0;
    boolean flag = false;
    for (int i = 0; i < matrix.length; i++)
    {
      for (int k = 0; k < matrix[i].length; k++)
      {
        if (matrix[i][k] == searchValue)
        // if it finds the searchValue, the row/column are indexed and flag is
        // set to true
        {
          row = i;
          column = k;
          flag = true;
        }
      }
    }
    if (flag)
      return "The value " + searchValue + " was found at row " + row
        + ", column " + column + ".";
    else
      return "The value " + searchValue + " is not in this array.";
  }

  /**
   * Given the exact coordinates in the 2D array, Creates a plus sign with the
   * intersection on the array using the number 3.
   *
   * <pre>
   * 0 0 0 0
   * 0 0 0 0
   * 0 0 0 0
   *
   * After makePlus(arr, 2, 1)
   *
   * 0 3 0 0
   * 0 3 0 0
   * 3 3 3 3
   * 0 3 0 0
   * </pre>
   *
   * @param arr
   *          non null array filled with zeroes
   * @param x
   *          a valid subscript
   * @param y
   *          a valid subscript
   */
  public static void makePlus(int[][] arr, int x, int y)
  {
    for (int i = 0; i < arr.length; i++)
    {
      for (int k = 0; k < arr[i].length; k++)
      {
        if (k == y) // when the k value in an element =y, it becomes 3
          arr[i][k] = 3;
        if (i == x) // when the i value in an element =x, it becomes 3
          arr[i][k] = 3;
      }
    }
    return;
  }

  /**
   * Creates a 1D array of Strings from a 2D array. Stitch each row together
   * into a 1D array of Strings.
   *
   * <pre>
   *
   * 2 3 4 1
   * 8 1 1 2
   *
   * returns
   *
   * [2341, 8112]
   * </pre>
   *
   * @param arr
   * @return
   */
  public static String[] stichEachRow(int[][] matrix)
  {

    String[] str = new String[matrix.length];

    for (int i = 0; i < matrix.length; i++)
    {
      str[i] = ""; // initializes value for each element so they're not null
      for (int k = 0; k < matrix[i].length; k++)
      {
        str[i] += matrix[i][k];
        // fills each str element with the stitched elements of each array in
        // matrix
      }
    }
    return str;

  }

  /**
   * Finds the row that contains the largest sum total of values. For example,
   * if arr is a 2D array filled with the values below:
   *
   * <pre>
   * 3 4 1
   * 5 5 6
   * 4 1 0
   * 7 0 1
   * 4 5 1
   * </pre>
   *
   * getBigRow() returns 1 because 5 + 5 + 6 is 16 and it's larger than any
   * other row value sum.
   *
   * @param arr
   *          is not null.
   * @return the row subscript containing the largest row sum.
   */
  public static int getBigRow(int[][] arr)
  {
    int indexRow = 0; // max row index
    int max = 0; // value of max row
    for (int i = 0; i < arr.length; i++)
    {
      int total = 0;
      for (int k = 0; k < arr[i].length; k++)
      {
        total += arr[i][k]; // total for each row
      }
      if (total > max)
      {
        max = total;
        indexRow = i; // indexes big row
      }
    }
    return indexRow;
  }
}