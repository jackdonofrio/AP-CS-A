/**
* Do not submit to dropbox. 
* @version 2.0 - added infinite loop guard
*/
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.*;
//Used to keep tests in order.
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU07Test
{
  
  @Rule
  public Timeout globalTimeout = Timeout.seconds(3);
  
  @Test
  public void test01ChangeThe1stAnd4thValue1()
  {
    int[] myArray = {10, 20, 30, 32, 40};
    JU07.changeThe1stAnd4thValue(myArray);
    assertEquals("[40, 20, 30, 35, 40]", Arrays.toString(myArray));
  }

  @Test
  public void test01ChangeThe1stAnd4thValue2()
  {
    int[] myArray = {4, 2, 3};
    JU07.changeThe1stAnd4thValue(myArray);
    assertEquals("[40, 2, 3]", Arrays.toString(myArray));
  }

  @Test
  public void test02TotalNumberOfElements1()
  {
    int[] a = {3, 3, 3};
    int[] b = {8, 8};
    int[] c = {9, 2, 3, 3};
    assertEquals(9, JU07.totalNumberOfElements(a, b, c));
  }

  @Test
  public void test02TotalNumberOfElements2()
  {
    int[] a = {3, 3, 3, 4, 3, 9};
    int[] b = {8, 8, 23};
    int[] c = {3, 9};
    assertEquals(11, JU07.totalNumberOfElements(a, b, c));
  }

  @Test
  public void test02TotalNumberOfElements3()
  {
    int[] a = {3};
    int[] b = {8, 8, 5, 1, 1, 1};
    int[] c = {9, 2, 3, 3, 3, 3, 4, 5, 10};
    assertEquals(16, JU07.totalNumberOfElements(a, b, c));
  }

  @Test
  public void test03GetCapacity1()
  {
    int[] myArray = {1, 2, 3, 3, 2};
    assertEquals(5, JU07.getCapacity(myArray));
  }

  @Test
  public void test03GetCapacity2()
  {
    int[] myArray = null;
    assertEquals(0, JU07.getCapacity(myArray));
  }

  @Test
  public void test03GetCapacity3()
  {
    int[] myArray = new int[378];
    assertEquals(378, JU07.getCapacity(myArray));
  }

  @Test
  public void test03GetCapacity4()
  {
    int[] myArray = {1, 2, 3, 3, 2, -1, 4, 9, 10};
    assertEquals(9, JU07.getCapacity(myArray));
  }



  @Test
  public void test04RaiseTheLastElementToThePower1()
  {
    int[] arr = {1, 2, 3, 3, 2, -1, 4};
    JU07.raiseTheLastElementToThePower(arr, 2);
    assertEquals("[1, 2, 3, 3, 2, -1, 16]", Arrays.toString(arr));
  }

  @Test
  public void test04RaiseTheLastElementToThePower2()
  {
    int[] arr = {1, 2, 3};
    JU07.raiseTheLastElementToThePower(arr, 5);
    assertEquals("[1, 2, 243]", Arrays.toString(arr));
  }

  @Test
  public void test05SwapEm1()
  {
    int[] arr = {2, 3, 14, 18, 2, 78};
    JU07.swapEm(arr);
    assertEquals("[2, 3, 14, 18, 78, 2]", Arrays.toString(arr));
  }

  @Test
  public void test05SwapEm2()
  {
    int[] arr = {2, 3, 14, 18, 9, 7, 100};
    JU07.swapEm(arr);
    assertEquals("[2, 3, 14, 18, 7, 9, 100]", Arrays.toString(arr));
  }

  @Test
  public void test06SwapFirstWithLast1()
  {
    int[] arr = {2, 3, 14, 18, 9, 7, 100};
    JU07.swapFirstWithLast(arr);
    assertEquals("[100, 3, 14, 18, 9, 7, 2]", Arrays.toString(arr));
  }

  @Test
  public void test06SwapFirstWithLast2()
  {
    int[] arr = {4, 2, 8};
    JU07.swapFirstWithLast(arr);
    assertEquals("[8, 2, 4]", Arrays.toString(arr));
  }

  @Test
  public void test07GetNumberOfNonZeroElements1()
  {
    int[] myArray = {1, 2, 3, 3, 2, 0, 0, 0, 0, 0};
    assertEquals(5, JU07.getNumberOfNonZeroElements(myArray));
  }

  @Test
  public void test08GetNumberOfNonZeroElements2()
  {
    int[] myArray = {0, 2, 0, 3, 2, 0, 0, 0, 0, 0};
    assertEquals(3, JU07.getNumberOfNonZeroElements(myArray));
  }

  @Test
  public void test09PrettyPrint1()
  {
    int[] myArray = {3, 8, 2};
    assertEquals(
      "This array contains 3 elements.\nThe value of list sub 0 is 3\nThe value of list sub 1 is 8\nThe value of list sub 2 is 2\n",
      JU07.prettyPrint(myArray));
  }

  @Test
  public void test09PrettyPrint2()
  {
    int[] myArray = {};
    assertEquals("This array contains 0 elements.\nThe array is empty.\n",
      JU07.prettyPrint(myArray));
  }

  @Test
  public void test09PrettyPrint3()
  {
    int[] myArray = {1, 4, 9, 5, -4};
    assertEquals(
      "This array contains 5 elements.\nThe value of list sub 0 is 1\nThe value of list sub 1 is 4\nThe value of list sub 2 is 9\nThe value of list sub 3 is 5\nThe value of list sub 4 is -4\n",
      JU07.prettyPrint(myArray));
  }



  @Test
  public void test12EqualArrays1()
  {
    int[] myArray = {1, 3, 3};
    int[] yourArray = {1, 3, 3};
    int[] diffArray = {0, 3, 3};
    assertTrue(JU07.equalArrays(myArray, yourArray));
    assertFalse(JU07.equalArrays(myArray, diffArray));
  }

  @Test
  public void test12EqualArrays2()
  {
    int[] myArray = {1, 2, 3, 7, 2, -1, 4, 9, 10};
    int[] yourArray = {1, 2, 3, 3, 2, -1, 4, 9, 10};
    int[] diffArray = {1, 2, 3, 7, 2, -1, 4, 9, 10};
    assertFalse(JU07.equalArrays(myArray, yourArray));
    assertTrue(JU07.equalArrays(myArray, diffArray));

  }

  @Test
  public void test12EqualArrays3()
  {
    int[] myArray = {1, 2, 3, 3, 2, -1, 4, 9, 10};
    int[] yourArray = {1, 2, 3, 3, 2, -1, 4};
    int[] diffArray = {1, 2, 3, 3, 2, -1, 4, 9, 10};
    assertFalse(JU07.equalArrays(myArray, yourArray));
    assertTrue(JU07.equalArrays(myArray, diffArray));
  }

  @Test
  public void test12EqualArrays4()
  {
    int[] myArray = {1, 2, 3, 3};
    int[] yourArray = {1, 2, 3, 3, 2, -1, 4};
    assertFalse(JU07.equalArrays(myArray, yourArray));
  }



  @Test
  public void test14CountFortyTwos1()
  {
    int[] myArray = {1, 42, 3, 4, 1, 42, 3, 42};
    assertEquals(3, JU07.countFortyTwos(myArray));

  }

  @Test
  public void test14CountFortyTwos2()
  {
    int[] myArray = {1, 42, 3, 4, 1, 3, 42};
    assertEquals(2, JU07.countFortyTwos(myArray));
  }

  @Test
  public void test14CountFortyTwos3()
  {
    int[] myArray = {0, 1, 1, 4, 2, 4, 2};
    assertEquals(0, JU07.countFortyTwos(myArray));
  }

  @Test
  public void test15GetTotal1()
  {
    int[] myArray = {1, 2, 3, 4, 1, 2, 3, 4};
    assertEquals(20, JU07.getTotal(myArray));
  }

  @Test
  public void test15GetTotal2()
  {
    int[] myArray = {1, 2, 3, 4, 1, 2, 3, 4, 10, -4, -8};
    assertEquals(18, JU07.getTotal(myArray));
  }

  @Test
  public void test16GetAverage1()
  {
    int[] myArray = {1, 2};
    assertEquals(1.5, JU07.getAverage(myArray), 0.01);
  }

  @Test
  public void test16GetAverage2()
  {
    int[] myArray = {100, 90, 85, 20, 20, 20};
    assertEquals(55.83, JU07.getAverage(myArray), 0.01);
  }

  @Test
  public void test16GetAverage3()
  {
    int[] myArray = {100, 40, 85, 10};
    assertEquals(58.75, JU07.getAverage(myArray), 0.01);
  }

  @Test
  public void test17CalculateGrade1()
  {
    int[] myArray = {100, 90, 85};
    assertEquals("A", JU07.calculateGrade(myArray));
  }

  @Test
  public void test17CalculateGrade2()
  {
    int[] myArray = {100, 90, 85, 20, 20, 20};
    assertEquals("F", JU07.calculateGrade(myArray));
  }

  @Test
  public void test17CalculateGrade3()
  {
    int[] myArray = {100, 90, 85, 70, 20, 20};
    assertEquals("D", JU07.calculateGrade(myArray));
  }

  @Test
  public void test17CalculateGrade4()
  {
    int[] myArray = {82, 80, 78, 80};
    assertEquals("B", JU07.calculateGrade(myArray));
  }

  @Test
  public void test18GetTheBiggest1()
  {
    int[] myArray = {-100, 90, 85, 343, 20, 20};
    assertEquals(343, JU07.getTheBiggest(myArray));
  }

  @Test
  public void test18GetTheBiggest2()
  {
    int[] myArray = {100, 90, 85, 70, 90, 90, 18, 200, 19, 5000};
    assertEquals(5000, JU07.getTheBiggest(myArray));
  }

  @Test
  public void test18GetTheBiggest3()
  {
    int[] myArray = {123, -5, 85, -5, 90, 90, 100, 90, 85, 70, 90, 90};
    assertEquals(123, JU07.getTheBiggest(myArray));
  }

  @Test
  public void test19BookAtEndOfShelf1()
  {
    String[] myArray = {"B", "C", "A", "X", "F"};
    assertEquals("X", JU07.bookAtEndOfShelf(myArray));
  }

  @Test
  public void test19BookAtEndOfShelf2()
  {
    String[] myArray = {"B", "C", "A", "X", "F", "Z"};
    assertEquals("Z", JU07.bookAtEndOfShelf(myArray));
  }

  @Test
  public void test19BookAtEndOfShelf3()
  {
    String[] myArray = {"Thor", "Black Widow", "Ant-man", "Rocket"};
    assertEquals("Thor", JU07.bookAtEndOfShelf(myArray));
  }
  
  @Test
  public void test20ShiftAllForwardOne1()
  {
    int[] myArray = {1, 4, 9, 5, -3};
    JU07.shiftAllForwardOne(myArray);
    assertEquals(
      "[-3, 1, 4, 9, 5]",
      Arrays.toString(myArray));
  }
  
  @Test
  public void test20ShiftAllForwardOne2()
  {
    int[] myArray = {10, 42, 32, 6, 9, 11, 12, 50};
    JU07.shiftAllForwardOne(myArray);
    assertEquals(
      "[50, 10, 42, 32, 6, 9, 11, 12]",
      Arrays.toString(myArray));
  }
  
  @Test
  public void test20ShiftAllForwardOne3()
  {
    int[] myArray = {7, 42, 32, 6, 9, 11, 12, 50, 18, 87, 34};
    JU07.shiftAllForwardOne(myArray);
    assertEquals(
      "[34, 7, 42, 32, 6, 9, 11, 12, 50, 18, 87]",
      Arrays.toString(myArray));
  }

  @Test
  public void test21CountLetters1()
  {
    String[] planets = {"Mercury", "Venus", "Earth"};
    assertEquals(17, JU07.getTotalLetters(planets));
  }

  @Test
  public void test21CountLetters2()
  {
    String[] starWars = {"Luke", "Yoda", "Obiwan", "Chewie", "Han"};
    assertEquals(23, JU07.getTotalLetters(starWars));
  }

}