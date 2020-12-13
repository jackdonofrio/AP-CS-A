/**
 * Do not turn this file into the dropbox.
 * @version 1.1 - added globalTimeout.
 **/

import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU09Test
{
  @Rule
  public Timeout globalTimeout = Timeout.seconds(3);
  
  @Test
  public void test00CountHeadsUsingFOREACH1()
  {
    boolean[] arr = {true, true, false, false, true};
    assertEquals("3", JU09.countHeadsUsingFOREACH(arr) + "");
  }
  
  @Test
  public void test00CountHeadsUsingFOREACH2()
  {
    boolean[] arr = {false, true, false, true, false, false, true, true, true, false};
    assertEquals("5", JU09.countHeadsUsingFOREACH(arr) + "");
  }
  
  @Test
  public void test00CountHeadsUsingFOREACH3()
  {
    boolean[] arr = {false, true, false, true, false, false, true, true, false, false, true, false, false, true, true, true, false};

    assertEquals("8", JU09.countHeadsUsingFOREACH(arr) + "");
  }
  
  @Test
  public void test00CountHeadsUsingFOREACH4()
  {
    boolean[] arr = new boolean [100];
    for (int i = 0; i < 43; i++)
    {
      arr[i] = true;
    }
    assertEquals("43", JU09.countHeadsUsingFOREACH(arr) + "");
  }
  
  @Test
  public void test01GetNumberOfColumns1()
  {
    int[][] arr = new int[3][5];
    arr[2][2] = 42;
    assertEquals(5, JU09.getNumberOfColumns(arr));
  }

  @Test
  public void test01GetNumberOfColumns2()
  {
    int[][] arr = new int[10][3];
    arr[2][2] = 42;
    assertEquals(3, JU09.getNumberOfColumns(arr));
  }

  @Test
  public void test02GetNumberOfRows1()
  {
    int[][] arr = new int[33][5];
    arr[2][2] = 42;
    assertEquals(33, JU09.getNumberOfRows(arr));
  }

  @Test
  public void test02GetNumberOfRows2()
  {
    int[][] arr = new int[45][2];
    arr[0][0] = 42;
    assertEquals(45, JU09.getNumberOfRows(arr));
  }
  
  @Test
  public void test03GetDimensions1()
  {
    int[][] arr = new int[45][2];
    arr[0][0] = 42;
    assertEquals("45x2", JU09.getDimensions(arr));
  }
  
  @Test
  public void test03GetDimensions2()
  {
    int[][] arr = new int[33][9];
    arr[0][0] = 42;
    assertEquals("33x9", JU09.getDimensions(arr));
  }

  @Test
  public void test04SetThreeNumbers1()
  {
    int[][] arr = new int[5][7];
    JU09.setThreeNumbers(arr);
    assertEquals(
      "[42, 0, 0, 0, 0, 0, 0]\n[0, 0, 0, 0, 0, 0, 0]\n[0, 0, -2, 0, 0, 0, 0]\n[0, 0, 0, 0, 0, -3, 0]\n[0, 0, 0, 0, 0, 0, 0]\n",
      beautify(arr));
  }

  @Test
  public void test04SetThreeNumbers2()
  {
    int[][] arr = new int[3][5];
    JU09.setThreeNumbers(arr);
    assertEquals("[42, 0, 0, 0, 0]\n[0, 0, 0, 0, 0]\n[0, 0, -2, 0, 0]\n",
      beautify(arr));
  }

  @Test
  public void test04SetThreeNumbers3()
  {
    int[][] arr = new int[1][3];
    JU09.setThreeNumbers(arr);
    assertEquals("[42, 0, 0]\n", beautify(arr));
  }

  @Test
  public void test05SetTheCorners1()
  {
    int[][] arr = new int[4][3];
    JU09.setTheCorners(arr, 9);
    assertEquals("[9, 0, 9]\n[0, 0, 0]\n[0, 0, 0]\n[9, 0, 9]\n", beautify(arr));
  }

  @Test
  public void test05SetTheCorners2()
  {
    int[][] arr = new int[3][5];
    JU09.setTheCorners(arr, 8);
    assertEquals("[8, 0, 0, 0, 8]\n[0, 0, 0, 0, 0]\n[8, 0, 0, 0, 8]\n",
      beautify(arr));
  }

  @Test
  public void test06BuildASmallSquare1()
  {
    int[][] expected;
    expected = JU09.buildASmallSquare(7);
    assertEquals("[7, 7]\n[7, 7]\n", beautify(expected));
  }

  @Test
  public void test06BuildASmallSquare2()
  {
    int[][] expected;
    expected = JU09.buildASmallSquare(10);
    assertEquals("[10, 10]\n[10, 10]\n", beautify(expected));
  }

  @Test
  public void test07GetCapacity1()
  {
    int[][] arr = {{1, 2, 3}, {3, 3, 3}, {1, 1, 1}, {8, 2, 0}};
    JU09.getCapacity(arr);
    assertEquals(12, JU09.getCapacity(arr));
  }

  @Test
  public void test07GetCapacity2()
  {
    int[][] arr = {{1, 2, 3, 1}, {3, 3, 3, 1}};
    JU09.getCapacity(arr);
    assertEquals(8, JU09.getCapacity(arr));
  }

  @Test
  public void test07GetCapacity3()
  {
    int[][] arr = null;
    JU09.getCapacity(arr);
    assertEquals(0, JU09.getCapacity(arr));
  }

  @Test
  public void test08IsSquare1()
  {
    int[][] x = {{1, 2, 3}, {1, 2, 3}, {1, 1, 1}};
    assertTrue(JU09.isSquare(x));
    int[][] y = {{1, 2}, {4, 2}, {1, 0}};
    assertFalse(JU09.isSquare(y));
  }

  @Test
  public void test08IsSquare2()
  {
    int[][] x = new int[3][4];
    assertFalse(JU09.isSquare(x));
    int[][] y = new int[5][5];
    assertTrue(JU09.isSquare(y));
  }

  @Test
  public void test09GetFirstColumn1()
  {
    int[][] arr = {{4, 4, 3}, {1, 2, 2}, {5, 4, 3}};
    int[] actual = JU09.getFirstColumn(arr);
    assertEquals("[4, 1, 5]", Arrays.toString(actual));
  }

  @Test
  public void test09GetFirstColumn2()
  {
    int[][] arr = {{4, 4, 3, 9}, {1, 2, 2, 1}};
    int[] actual = JU09.getFirstColumn(arr);
    assertEquals("[4, 1]", Arrays.toString(actual));
  }
  
  @Test
  public void test10GetFirstColumn3()
  {
    int[][] arr = {{5, 4}, {8, 2}, {42, 2}, {5, 2}};
    int[] actual = JU09.getFirstColumn(arr);
    assertEquals("[5, 8, 42, 5]", Arrays.toString(actual));
  }

 
  @Test
  public void test11BuildAndFillSquare1()
  {
    assertEquals("[42, 13]\n" + 
        "[13, 42]\n" + 
        "", beautify(JU09.buildAndFillSquare(2)));
    
  }
  
  @Test
  public void test12BuildAndFillSquare2()
  {
    assertEquals("[42, 13, 13]\n" + 
        "[13, 42, 13]\n" + 
        "[13, 13, 42]\n" + 
        "", beautify(JU09.buildAndFillSquare(3)));
    
    assertEquals("[42, 13, 13, 13]\n" + 
        "[13, 42, 13, 13]\n" + 
        "[13, 13, 42, 13]\n" + 
        "[13, 13, 13, 42]\n", beautify(JU09.buildAndFillSquare(4)));
    
  }
  
  @Test
  public void test13BuildAndFillSquare3()
  {
    assertEquals("[42, 13, 13, 13, 13, 13, 13, 13]\n" + 
        "[13, 42, 13, 13, 13, 13, 13, 13]\n" + 
        "[13, 13, 42, 13, 13, 13, 13, 13]\n" + 
        "[13, 13, 13, 42, 13, 13, 13, 13]\n" + 
        "[13, 13, 13, 13, 42, 13, 13, 13]\n" + 
        "[13, 13, 13, 13, 13, 42, 13, 13]\n" + 
        "[13, 13, 13, 13, 13, 13, 42, 13]\n" + 
        "[13, 13, 13, 13, 13, 13, 13, 42]\n" + 
        "", beautify(JU09.buildAndFillSquare(8)));
    
  }

  @Test
  public void test14IncreaseValuesOfARowByOne1()
  {
    int[][] arr = {{1, 2}, {3, 3}, {1, 2}};
    JU09.increaseValuesOfARowByOne(arr, 2);
    assertEquals("[1, 2]\n[3, 3]\n[2, 3]\n", beautify(arr));
  }

  @Test
  public void test14IncreaseValuesOfARowByOne2()
  {
    int[][] arr = {{1, 2}, {3, 3}, {1, 2}};
    JU09.increaseValuesOfARowByOne(arr, 3);
    assertEquals("[1, 2]\n[3, 3]\n[1, 2]\n", beautify(arr));
    int[][] arr2 = {{1, 2}, {3, 3}, {1, 2}};
    JU09.increaseValuesOfARowByOne(arr2, 0);
    assertEquals("[2, 3]\n[3, 3]\n[1, 2]\n", beautify(arr2));
  }

  @Test
  public void test14IncreaseValuesOfARowByOne3()
  {
    int[][] arr = {{1, 2, 3}, {3, 3, 1}, {9, 2, 8}, {1, 2, 0}};
    JU09.increaseValuesOfARowByOne(arr, 1);
    assertEquals("[1, 2, 3]\n[4, 4, 2]\n[9, 2, 8]\n[1, 2, 0]\n", beautify(arr));
  }

  @Test
  public void test15WhoWonOthello1()
  {
    boolean[][] board =
      {{true, false, true, true, false}, {false, false, true, true, false},
          {false, false, false, true, true}, {true, false, true, true, true}};
    assertEquals("Player 1 Wins!", JU09.whoWonOthello(board));//11 //9
    
    boolean[][] checkBoard = {{false, false}, {true, false}};
    assertFalse(JU09.whoWonOthello(checkBoard).equals("Player 1 Wins!"));
  }

  @Test
  public void test15WhoWonOthello2()
  {
    boolean[][] board = {{true, false}, {false, true}};
    assertEquals("It's a Tie!", JU09.whoWonOthello(board));
    boolean[][] checkBoard = {{false, false}, {true, false}};
    assertFalse(JU09.whoWonOthello(checkBoard).equals("It's a Tie!"));
  }

  @Test
  public void test15WhoWonOthello3()
  {
    boolean[][] board = {{true, false}, {false, true}, {false, false}};
    assertEquals("Player 2 Wins!", JU09.whoWonOthello(board));
    boolean[][] checkBoard = {{true, true}, {true, true}, {true, false}};
    assertFalse(JU09.whoWonOthello(checkBoard).equals("Player 2 Wins!"));
  }

  @Test
  public void test15WhoWonOthello4()
  {
    boolean[][] board =
      {{true, false}, {false, true}, {false, false}, {true, true},
          {true, false}};
    assertEquals("It's a Tie!", JU09.whoWonOthello(board));
    boolean[][] checkBoard =
    {{true}};
    assertFalse(JU09.whoWonOthello(checkBoard).equals("Player 2 Wins!"));
  }

  @Test
  public void test16FillTotals1()
  {
    int[][] score = {{2, 3, 4, 5, 1}, {1, 0, 3, 4, 1}, {0, 0, 0, 0, 0}};
    JU09.fillTotals(score);
    String actual = beautify(score);
    assertEquals("[2, 3, 4, 5, 1]\n[1, 0, 3, 4, 1]\n[3, 3, 7, 9, 2]\n", actual);
  }

  @Test
  public void test16FillTotals2()
  {
    int[][] arr = {{4, 4, 3}, {1, 2, 2}, {5, 4, 3}, {9, 1, 2}, {0, 0, 0}};
    JU09.fillTotals(arr);
    String actual = beautify(arr);
    assertEquals("[4, 4, 3]\n[1, 2, 2]\n[5, 4, 3]\n[9, 1, 2]\n[19, 11, 10]\n",
      actual);
  }

  @Test
  public void test17FillTotals3()
  {
    int[][] arr = {{1, 1, 3, 2}, {1, 2, 2, 0}, {2, 1, 2, 1}, {0, 0, 0, 0}};
    JU09.fillTotals(arr);
    String actual = beautify(arr);
    assertEquals("[1, 1, 3, 2]\n[1, 2, 2, 0]\n[2, 1, 2, 1]\n[4, 4, 7, 3]\n",
      actual);
  }

  @Test
  public void test18LocateValue1()
  {
    int[][] arr = {{4, 4, 3}, {1, 2, 2}, {5, 13, 3}, {9, 1, 2}, {7, 3, 1}};
    String actual = JU09.locateValue(arr, 7);
    assertEquals("The value 7 was found at row 4, column 0.", actual);
  }

  @Test
  public void test18LocateValue2()
  {
    int[][] arr = {{4, 4, 3, 1}, {1, 2, 2, 2}, {5, 13, 3, 3}, {9, 1, 2, 1}};
    String actual = JU09.locateValue(arr, 10);
    assertEquals("The value 10 is not in this array.", actual);
  }

  @Test
  public void test19MakePlus1()
  {
    int[][] arr = {{4, 4, 5, 1}, {1, 5, 5, 2}, {5, 2, 2, 1}, {9, 1, 2, 1}};
    JU09.makePlus(arr, 1, 2);
    assertEquals("[4, 4, 3, 1]\n[3, 3, 3, 3]\n[5, 2, 3, 1]\n[9, 1, 3, 1]\n",
      beautify(arr));
  }

  @Test
  public void test19MakePlus2()
  {
    int[][] arr =
      {{4, 4, 5, 1}, {1, 5, 5, 2}, {5, 2, 2, 1}, {9, 1, 2, 1}, {8, 8, 8, 1}};
    JU09.makePlus(arr, 0, 0);
    assertEquals(
      "[3, 3, 3, 3]\n[3, 5, 5, 2]\n[3, 2, 2, 1]\n[3, 1, 2, 1]\n[3, 8, 8, 1]\n",
      beautify(arr));
  }

  @Test
  public void test19MakePlus3()
  {
    int[][] arr = {{1, 2}, {2, 1}, {2, 2}};
    JU09.makePlus(arr, 2, 0);
    assertEquals("[3, 2]\n[3, 1]\n[3, 3]\n", beautify(arr));
  }

  @Test
  public void test20StichTheRows1()
  {
    int[][] arr = {{1, 2}, {2, 1}, {2, 2}};
    String[] actual = JU09.stichEachRow(arr);
    assertEquals("[12, 21, 22]", Arrays.toString(actual));
  }

  @Test
  public void test21StichTheRows2()
  {
    int[][] arr = {{4, 4, 3, 1}, {1, 2, 2, 2}, {5, 13, 3, 3}, {9, 1, 2, 1}};
    String[] actual = JU09.stichEachRow(arr);
    assertEquals("[4431, 1222, 51333, 9121]", Arrays.toString(actual));
  }

  @Test
  public void test22StichTheRows3()
  {
    int[][] arr = {{4, 4}, {9, 1}};
    String[] actual = JU09.stichEachRow(arr);
    assertEquals("[44, 91]", Arrays.toString(actual));
  }

  @Test
  public void test23BigRow1()
  {
    int[][] arr = {{2, 3}, {1, 3}};
    int actual = JU09.getBigRow(arr);
    assertEquals(0, actual);
  }

  @Test
  public void test23BigRow2()
  {
    int[][] arr = {{2, 3}, {5, 3}};
    int actual = JU09.getBigRow(arr);
    assertEquals(1, actual);
  }

  @Test
  public void test23BigRow3()
  {
    int[][] arr = {{4, 4, 3, 1}, {1, 2, 2, 2}, {5, 13, 3, 3}, {9, 1, 2, 1}};
    int actual = JU09.getBigRow(arr);
    assertEquals(2, actual);
  }

  @Test
  public void test23BigRow4()
  {
    int[][] arr = {{4, 4, 3, 1}, {1, 2, 2, 2}, {5, 0, 3, 3}, {9, 1, 2, 1}};
    int actual = JU09.getBigRow(arr);
    assertEquals(3, actual);
  }

  /**
   * Make it easier for students to find the differences between the expected
   * and actual values of 2D arrays of integers. Arrays.deepToString method
   * doesn't quite work well because it displays the contents all on the same
   * row which is confusing to newbies who expect a grid-like representation.
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