
/**
 * 2D Arrays can be a pain because if you are visiting
 * every row and every column, you usually have to deal with
 * nested loops.
 **/
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

//keep the tests from scrambling otherwise would drive students insane.
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU10Test
{

  @Test
  public void test01Build2DArrayWithRows1()
  {
    int[] arr0 = {4, 4, 3, 9};
    int[] arr1 = {1, 2, 2, 1};
    int[] arr2 = {3, 2, 7, 2};
    int[][] actual = JU10.build2DArrayWithRows(arr0, arr1, arr2);
    String stringVersionOfActual2DArray = this.beautify(actual);
    assertEquals("[4, 4, 3, 9]\n[1, 2, 2, 1]\n[3, 2, 7, 2]\n",
      stringVersionOfActual2DArray);
  }

  @Test
  public void test01Build2DArrayWithRows2()
  {
    int[] arr0 = {4, 4, 3, 9, 4, 4, 3};
    int[] arr1 = {1, 2, 2, 1, 1, 2, 2};
    int[] arr2 = {3, 2, 7, 2, 2, 7, 2};
    int[][] actual = JU10.build2DArrayWithRows(arr0, arr1, arr2);
    String stringVersionOfActual2DArray = this.beautify(actual);
    assertEquals(
      "[4, 4, 3, 9, 4, 4, 3]\n[1, 2, 2, 1, 1, 2, 2]\n[3, 2, 7, 2, 2, 7, 2]\n",
      stringVersionOfActual2DArray);
  }

  @Test
  public void test02ReturnLastRowOf2DArray1()
  {
    int[][] arr = {{4, 4, 3}, {1, 2, 2}, {5, 4, 3}};
    int[] actual = JU10.returnLastRowOf2DArray(arr);
    assertEquals("[5, 4, 3]", Arrays.toString(actual));
  }

  @Test
  public void test02ReturnLastRowOf2DArray2()
  {
    int[][] arr =
      {{4, 4, 3, 1, 1, 1, 2}, {4, 4, 3, 2, 1, 1, 5}, {4, 4, 3, 1, 8, 1, 5}};
    int[] actual = JU10.returnLastRowOf2DArray(arr);
    assertEquals("[4, 4, 3, 1, 8, 1, 5]", Arrays.toString(actual));
  }
  
  @Test
  public void test03AddTwoMatrices1()
  {
    int [][] x = {{1, 2}, {4, 5}};
    int [][] y = {{7, 2}, {1, 2}};
    assertEquals("[8, 4]\n" + 
      "[5, 7]\n", beautify(JU10.addTwoMatrices(x, y)));
  }
  
  @Test
  public void test03AddTwoMatrices2()
  {
    int [][] x = {{1, 2, 2}, {4, 5, 9}, {1, 1, 2}};
    int [][] y = {{3, 1, 1}, {1, 2, -2}, {1, 0, 1}};
    assertEquals("[4, 3, 3]\n" + 
      "[5, 7, 7]\n" + 
      "[2, 1, 3]\n" + 
      "", beautify(JU10.addTwoMatrices(x, y)));
  }
  
  @Test
  public void test03AddTwoMatrices3()
  {
    int [][] x = {{1, 2, 2}, {4, 5, 9}};
    int [][] y = {{3, 1, 1}};
    assertEquals("null", beautify(JU10.addTwoMatrices(x, y)));
  }
  
  @Test
  public void test03AddTwoMatrices4()
  {
    int [][] x = {{1, 2, 2}, {4, 5, 9}, {4, 5, 9}};
    int [][] y = {{3, 1}, {4, 5}, {1, 2}};
    assertEquals("null", beautify(JU10.addTwoMatrices(x, y)));
  }
  
  @Test
  public void test04SumOfAllElementsIn2DArray1()
  {
    int [][] grid = {{1, 2}, {4, 5}, {5, 2}};
    assertEquals("19", JU10.sumOfAllElementsIn2DArray(grid) + "");
  }
  
  @Test
  public void test04SumOfAllElementsIn2DArray2()
  {
    int [][] grid = {{1, 2, 2, 3}, {4, 5, 2, 1}, {5, 2, 2, 1}};
    assertEquals("30", JU10.sumOfAllElementsIn2DArray(grid) + "");
  }
  
  @Test
  public void test05GradeExam01()
  {
    //@formatter:on
    String[][] answers = { {"B", "A", "A"},
                           {"D", "B", "A"},
                           {"B", "A", "D"},
                           {"D", "B", "D"},
                           {"A", "A", "A"}
                        };

    String[] key = {new String("B"), new String("A"), new String("D")};
    //@formatter:off
    
    String response = JU10.gradeExam(answers, key);
    assertEquals("Student #0's correct count is 2 out of 3\n" + 
      "Student #1's correct count is 0 out of 3\n" + 
      "Student #2's correct count is 3 out of 3\n" + 
      "Student #3's correct count is 1 out of 3\n" + 
      "Student #4's correct count is 1 out of 3\n" + 
      "", response);
  }
  
  @Test
  public void test05GradeExam02()
  {
    //@formatter:on
    String[][] answers = { {"B", "B", "D", "C"},
                           {"D", "B", "A", "B"},
                        };

    String[] key = {new String("D"), new String("B"), new String("D"), 
                    new String("C")};
    //@formatter:off
    
    String response = JU10.gradeExam(answers, key);
    assertEquals("Student #0's correct count is 3 out of 4\n" + 
      "Student #1's correct count is 2 out of 4\n" + 
      "", response);
  }
  
  @Test
  public void test05GradeExam03()
  {
    //@formatter:on
    String[][] answers = { {"D", "B", "D", "C", "A"},
                           {"D", "B", "A", "B", "A"},
                           {"C", "C", "C", "C", "C"},
                        };

    String[] key = {new String("D"), new String("B"), new String("D"), 
                    new String("C"), new String("A")};
    //@formatter:off
    
    String response = JU10.gradeExam(answers, key);
    assertEquals("Student #0's correct count is 5 out of 5\n" + 
      "Student #1's correct count is 3 out of 5\n" + 
      "Student #2's correct count is 1 out of 5\n" + 
      "", response);
  }

  @Test
  public void test05GradeExam04()
  {
    //@formatter:on
    String[][] answers =
      {{"A", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
          {"D", "B", "A", "B", "C", "A", "E", "E", "A", "D"},
          {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"},
          {"C", "B", "A", "E", "D", "C", "E", "E", "A", "D"},
          {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"},
          {"B", "B", "E", "C", "C", "D", "E", "E", "A", "D"},
          {"B", "B", "A", "C", "C", "D", "E", "E", "A", "D"},
          {"E", "B", "E", "C", "C", "D", "E", "E", "A", "D"}};

    String[] key = {new String("D"), new String("B"), new String("D"), 
                    new String("C"), new String("C"), new String("D"), 
                    new String("A"), new String("E"), new String("A"), 
                    new String("D")};
    //@formatter:off
    
    String response = JU10.gradeExam(answers, key);
    assertEquals("Student #0's correct count is 7 out of 10\n" + 
      "Student #1's correct count is 6 out of 10\n" + 
      "Student #2's correct count is 5 out of 10\n" + 
      "Student #3's correct count is 4 out of 10\n" + 
      "Student #4's correct count is 8 out of 10\n" + 
      "Student #5's correct count is 7 out of 10\n" + 
      "Student #6's correct count is 7 out of 10\n" + 
      "Student #7's correct count is 7 out of 10\n" + 
      "", response);
  }

  /**
   * Make it easier for students to find the differences between the expected
   * and actual values of 2D arrays of integers.
   * 
   * @param arr
   *          can be anything.
   * @return a nice pretty string of values.
   */
  private String beautify(int[][] arr)
  {
    if (arr == null)
    {
      return "null";
    }

    if (arr.length == 0)
    {
      return "empty";
    }
    String answer = "";
    for (int[] row : arr)
    {
      if (row == null)
      {
        answer += "null\n";
      }
      else
      {
        answer += Arrays.toString(row) + "\n";
      }
    }
    return answer;
  }
}