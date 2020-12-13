/**
 * Complete the methods below. A series of exercises that focus on 2D arrays of
 * primitives. You may assume that any 2D array will be rectangular i.e all rows
 * in the 2D array have the same length.
 *
 * @author John Donofrio
 * @version 1.0
 *
 */
public class JU10
{
  /**
   * Inputs three references to 1D arrays and builds and returns a 2D array that
   * consists of just those rows. If you remember that a 2D array is just an
   * array of arrays, this will be rather simple. (no loops required)
   *
   * <pre>
   * PRECONDITION: All three rows are the same length and are not null.
   * </pre>
   *
   * @param row0
   *          not null
   * @param row1
   *          not null
   * @param row2
   *          not null
   * @return
   */
  public static int[][] build2DArrayWithRows(int[] row0, int[] row1, int[] row2)
  {
    // stores each array in each row of new 2d array
    int[][] matrix = {row0, row1, row2};
    return matrix;
  }

  /**
   * Returns the reference to the last row in the matrix. If you remember that a
   * 2D array is just an array of arrays, this will be rather simple. (no loops
   * required)
   *
   * <pre>
   * If the matrix is
   * 2, 9, 2, 1, 3
   * 9, 9, 2, 9, 9
   * 8, 2, 2, 2, 2
   *
   *then
   *returnLastRowOf2DArray returns a 1D array reference
   * 8, 2, 2, 2, 2
   * </pre>
   *
   * @param matrix
   * @return
   */
  public static int[] returnLastRowOf2DArray(int[][] matrix)
  {
    // matrix.length - 1 = last array. length = 3, index of last = 2.
    return matrix[matrix.length - 1];
  }

  /**
   * Creates a new 2D array that contains the sum of the values of the two 2D
   * arrays sent to it. If the two matrices are not the same dimensions, then
   * return null. Example
   * 
   * <pre>
   * {{1, 3}   +  {{2, 2}   =  {{3, 5}
   *  {2, 5}}      {1, 1}}      {3, 6}}
   * </pre>
   * 
   * @param a
   * @param b
   * @return
   */
  public static int[][] addTwoMatrices(int[][] a, int[][] b)
  {
    boolean flag = false;
    if (a.length != b.length) // lengths of matrices must be equal to add
    {
      flag = true;
    }
    if (a.length == b.length) // length of each 1d arr must be equal to add
    {
      for (int i = 0; i < a.length; i++)
        if (a[i].length != b[i].length)
          flag = true;
    }
    if (flag) // if they cannot be added, null is returned
      return null;

    else
    {
      int[][] matrix = new int[a.length][a[0].length];
      for (int row = 0; row < a.length; row++)
      {
        for (int column = 0; column < a.length; column++)
        {
          matrix[row][column] = a[row][column] + b[row][column];
          // fill new matrix with sum of each element of each 1d array in the 2d
          // array
        }
      }
      return matrix;
    }

  }

  /**
   * (Lesson 17.2 Focus on has a huge hint) Return the sum total of all numbers
   * in any 2D array.
   * 
   * @param gridOfNumbers
   * @return
   */
  public static int sumOfAllElementsIn2DArray(int[][] gridOfNumbers)
  {
    int total = 0;
    for (int row = 0; row < gridOfNumbers.length; row++)
    {
      for (int column = 0; column < gridOfNumbers[row].length; column++)
        total += gridOfNumbers[row][column];
      // traverses 2d array and adds each element to total
    }
    return total;
  }

  /**
   * See page 274 for hints and full description. Given the responses from
   * students and the solution key, this will return a grade report showing how
   * many points each student got. The number of students and number of
   * questions can vary for each exam.
   * 
   * <pre>
   * If a student responses were {"A", "C", "C", "B"}
   * and the key was             {"C", "C", "C", "B"}
   * then the student missed only the first question.
   * The report would have
   * Student #2's correct count is 3 out of 4
   * </pre>
   * 
   * @param answers
   * @param key
   * @return
   */
  public static String gradeExam(String[][] answers, String[] key)
  {
    int[] scores = new int[answers.length]; // 1d array to store scores

    for (int row = 0; row < answers.length; row++)
    {
      int score = 0; // reset to 0 every row
      for (int column = 0; column < answers[row].length; column++)
      {
        if (answers[row][column].equals(key[column]))
          // increments score if the element in a given row of answers is equal
          // to the corresponding index of key
          score++;
      }
      scores[row] = score; // stores score in scores at end of nested for loop
    }
    String message = "";
    for (int i = 0; i < scores.length; i++)
      message +=
        "Student #" + i + "'s correct count is " + scores[i] + " out of "
          + answers[0].length + "\n";
    return message;
  }

}