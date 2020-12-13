
/**
 * Do NOT upload this file to a dropbox.
 * @version 3.0 - infinite loop protection
 */
import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;
import org.junit.rules.Timeout;
import org.junit.runners.*;
import org.junit.FixMethodOrder;
import org.junit.Rule;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU08Test
{
  
  @Rule
  public Timeout globalTimeout = Timeout.seconds(3);

  @Test
  public void test01sayNamesRegularFOR1()
  {
    String[] words = {"Grace", "Ada"};
    assertEquals("Start:<Grace><Ada>:Finish", JU08.sayNamesRegularFOR(words));
  }

  @Test
  public void test01sayNamesRegularFOR2()
  {
    String[] words = {"Elvis", "Paul", "Mariah", "Michael"};
    assertEquals("Start:<Elvis><Paul><Mariah><Michael>:Finish",
      JU08.sayNamesRegularFOR(words));
  }

  @Test
  public void test01sayNamesRegularFOR3()
  {
    String[] words = {"Sarah", "Kim", "Amy", "Jenn", "Jane"};
    assertEquals("Start:<Sarah><Kim><Amy><Jenn><Jane>:Finish",
      JU08.sayNamesRegularFOR(words));
  }

  @Test
  public void test02sayNamesFOREACH1()
  {
    String[] words = {"Grace", "Ada"};
    assertEquals("Start:<Grace><Ada>:Finish", JU08.sayNamesFOREACH(words));
  }

  @Test
  public void test02sayNamesFOREACH2()
  {
    String[] words = {"Elvis", "Paul", "Mariah", "Michael"};
    assertEquals("Start:<Elvis><Paul><Mariah><Michael>:Finish",
      JU08.sayNamesFOREACH(words));
  }

  @Test
  public void test02sayNamesFOREACH3()
  {
    String[] words = {"Sarah", "Kim", "Amy", "Jenn", "Jane"};
    assertEquals("Start:<Sarah><Kim><Amy><Jenn><Jane>:Finish",
      JU08.sayNamesFOREACH(words));
  }

  @Test
  public void test03warmUpCount42RegularFOR1()
  {
    int[] numbers = {9, 42, 42, 42, 42, 8};
    assertEquals(4, JU08.warmUpCount42RegularFOR(numbers));
  }

  @Test
  public void test03warmUpCount42RegularFOR2()
  {
    int[] numbers = {42, 0, 0, 42, 1};
    assertEquals(2, JU08.warmUpCount42RegularFOR(numbers));
  }

  @Test
  public void test03warmUpCount42RegularFOR3()
  {
    int[] numbers = {42, 0, 0, 42, 1, 7, 9, -4, 42, 7, 42, 42, 42, 9, 42};
    assertEquals(7, JU08.warmUpCount42RegularFOR(numbers));
  }

  @Test
  public void test04warmUpCount42FOREACH1()
  {
    int[] numbers = {9, 42, 42, 42, 42, 8};
    assertEquals(4, JU08.warmUpCount42RegularFOR(numbers));
  }

  @Test
  public void test04warmUpCount42FOREACH2()
  {
    int[] numbers = {42, 0, 0, 42, 1};
    assertEquals(2, JU08.warmUpCount42RegularFOR(numbers));
  }

  @Test
  public void test04warmUpCount42FOREACH3()
  {
    int[] numbers = {42, 0, 0, 42, 1, 7, 9, -4, 42, 7, 42, 42, 42, 9, 42};
    assertEquals(7, JU08.warmUpCount42RegularFOR(numbers));
  }

  @Test
  public void test04FillArrayWithNames1()
  {
    String[] myArray =
      JU08.fillArrayWithNames("Rainbow", "Dash", "Power", "Ranger");
    assertEquals("[Rainbow, Dash, Power, Ranger]", Arrays.toString(myArray));
  }

  @Test
  public void test04FillArrayWithNames2()
  {
    String[] myArray = JU08.fillArrayWithNames("Joe", "Sue", "Steve", "Alex");
    assertEquals("[Joe, Sue, Steve, Alex]", Arrays.toString(myArray));
  }

  @Test
  public void test05CreateArrayOfWholeNumbers1()
  {
    int[] wholeNumbers = JU08.createArrayOfWholeNumbers(5);
    assertEquals("[0, 1, 2, 3, 4, 5]", Arrays.toString(wholeNumbers));
  }

  @Test
  public void test05CreateArrayOfWholeNumbers2()
  {
    int[] wholeNumbers = JU08.createArrayOfWholeNumbers(20);
    assertEquals(
      "[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20]",
      Arrays.toString(wholeNumbers));
  }

  @Test
  public void test05CreateArrayOfWholeNumbers3()
  {
    int[] wholeNumbers = JU08.createArrayOfWholeNumbers(13);
    assertEquals("[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]",
      Arrays.toString(wholeNumbers));
  }

  @Test
  public void test06ReverseTheTruth1()
  {

    boolean[] myArray = {true, false, true, false, false, true};
    boolean[] actual = JU08.reverseTheTruth(myArray);
    assertEquals("Don't modify the original array",
      "[true, false, true, false, false, true]", Arrays.toString(myArray));
    assertEquals("[false, true, false, true, true, false]",
      Arrays.toString(actual));
  }

  @Test
  public void test06ReverseTheTruth2()
  {

    boolean[] myArray = {false, true, true, true, false};
    boolean[] actual = JU08.reverseTheTruth(myArray);
    assertEquals("Don't modify the original array",
      "[false, true, true, true, false]", Arrays.toString(myArray));
    assertEquals("[true, false, false, false, true]", Arrays.toString(actual));
  }

  @Test
  public void test06ReverseTheTruth3()
  {
    boolean[] myArray = {false, false};
    boolean[] actual = JU08.reverseTheTruth(myArray);
    assertEquals("Don't modify the original array", "[false, false]",
      Arrays.toString(myArray));
    assertEquals("[true, true]", Arrays.toString(actual));
  }

  @Test
  public void test07DoubleAllOfThem1()
  {
    int[] myArray = {1, 2, 3, 4};
    int[] actual = JU08.doubleAllOfThem(myArray);
    assertEquals("Don't modify the original array", "[1, 2, 3, 4]",
      Arrays.toString(myArray));
    assertEquals("[2, 4, 6, 8]", Arrays.toString(actual));
  }

  @Test
  public void test07DoubleAllOfThem2()
  {
    int[] myArray = {0, 2, 3, 4, 1, 2, 3};
    int[] actual = JU08.doubleAllOfThem(myArray);
    assertEquals("Don't modify the original array", "[0, 2, 3, 4, 1, 2, 3]",
      Arrays.toString(myArray));
    assertEquals("[0, 4, 6, 8, 2, 4, 6]", Arrays.toString(actual));
  }

  @Test
  public void test07DoubleAllOfThem3()
  {
    int[] myArray = {3, -2, 3, 4, 5, -2, 1, 1};
    int[] actual = JU08.doubleAllOfThem(myArray);
    assertEquals("Don't modify the original array",
      "[3, -2, 3, 4, 5, -2, 1, 1]", Arrays.toString(myArray));
    assertEquals("[6, -4, 6, 8, 10, -4, 2, 2]", Arrays.toString(actual));
  }

  @Test
  public void test08AppendArrays1()
  {
    int[] myArray = {1, 5, 6};
    int[] yourArray = {2, 3, 4, 5};
    int[] actual = JU08.appendArrays(myArray, yourArray);
    assertEquals("[1, 5, 6, 2, 3, 4, 5]", Arrays.toString(actual));

  }

  @Test
  public void test08AppendArrays2()
  {
    int[] myArray = {1, 5, 6, 10, 43, 32};
    int[] yourArray = {2};
    int[] actual = JU08.appendArrays(myArray, yourArray);
    assertEquals("[1, 5, 6, 10, 43, 32, 2]", Arrays.toString(actual));
  }

  @Test
  public void test08AppendArrays3()
  {
    int[] myArray = {1, 5, 6, 10, 43, 32};
    int[] yourArray = {2, 3, 4, 9, 10, 44};
    int[] actual = JU08.appendArrays(myArray, yourArray);
    assertEquals("[1, 5, 6, 10, 43, 32, 2, 3, 4, 9, 10, 44]",
      Arrays.toString(actual));
  }

  @Test
  public void test09IsConsecutiveFour1()
  {
    int[] nums1 = {42, 42, 42, 42};
    assertTrue(JU08.isConsecutiveFour(nums1));
    int[] nums2 = {42, 42, 7, 42};
    assertFalse(JU08.isConsecutiveFour(nums2));
  }

  @Test
  public void test09IsConsecutiveFour2()
  {
    int[] nums1 = {8, 8, 8, 8, 3};
    assertTrue(JU08.isConsecutiveFour(nums1));
    int[] nums2 = {8, 8, 8, 2, 3, 8, 8, 8, 3};
    assertFalse(JU08.isConsecutiveFour(nums2));
  }

  @Test
  public void test09IsConsecutiveFour3()
  {
    int[] nums1 = {33, 2, 2, 3, 8, 8, 8, 8};
    assertTrue(JU08.isConsecutiveFour(nums1));
    int[] nums2 = {33, 2, 2, 3, 8, 8, 5, 8};
    assertFalse(JU08.isConsecutiveFour(nums2));
  }

  @Test
  public void test09IsConsecutiveFour4()
  {
    int[] nums1 = {33, 2, 2, 3, 3, 3, 3, 9, 9, 9};
    assertTrue(JU08.isConsecutiveFour(nums1));
    int[] nums2 = {33, 2, 2, 3, 3, 0, 3, 9, 9, 9};
    assertFalse(JU08.isConsecutiveFour(nums2));
  }

  @Test
  public void test10SwapEmIn1DArray1()
  {
    int[] original = {20, 10, 5, 90, 7};
    JU08.swapEmIn1DArray(original, 0, 2);
    assertEquals("[5, 10, 20, 90, 7]", Arrays.toString(original));
  }

  @Test
  public void test10SwapEmIn1DArray2()
  {
    int[] original = {1, 2, 3, 19, 30, 50};
    JU08.swapEmIn1DArray(original, 5, 6);
    assertEquals("[1, 2, 3, 19, 30, 50]", Arrays.toString(original));
    int[] check = {5, 2};
    JU08.swapEmIn1DArray(check, 0, 1);
    assertEquals("[2, 5]", Arrays.toString(check));
  }

  @Test
  public void test10SwapEmIn1DArray3()
  {
    int[] original = {100, 2, 3, 19, 30, 50, 88, 66};
    JU08.swapEmIn1DArray(original, 3, 6);
    assertEquals("[100, 2, 3, 88, 30, 50, 19, 66]", Arrays.toString(original));
  }

  @Test
  public void test10SwapEmIn1DArray4()
  {
    int[] original1 = {100, 2, 3, 19, 30, 50, 88, 66};
    JU08.swapEmIn1DArray(original1, -1, -8);
    assertEquals("[100, 2, 3, 19, 30, 50, 88, 66]", Arrays.toString(original1));
    int[] original2 = {100, 2, 3, 19, 30, 50, 88, 66, 9};
    JU08.swapEmIn1DArray(original2, 8, 7);
    assertEquals("[100, 2, 3, 19, 30, 50, 88, 9, 66]",
      Arrays.toString(original2));

  }

  @Test
  public void test09SelectLargest1()
  {
    int[] arr = {20, 10, 5, 90, 7};
    assertEquals(
      "For the array [20, 10, 5, 90, 7], the largest value 90 can be found at index 3",
      JU08.selectLargest(arr));
  }

  @Test
  public void test09SelectLargest2()
  {
    int[] arr = {5, 3, 2, 1, -4, -9, -100};
    assertEquals(
      "For the array [5, 3, 2, 1, -4, -9, -100], the largest value 5 can be found at index 0",
      JU08.selectLargest(arr));
  }

  @Test
  public void test09SelectLargest3()
  {
    int[] arr = {5, 3, 2, 43, -4, -9, -100};
    assertEquals(
      "For the array [5, 3, 2, 43, -4, -9, -100], the largest value 43 can be found at index 3",
      JU08.selectLargest(arr));
  }

  @Test
  public void test09SelectLargest4()
  {
    int[] arr = {43};
    assertEquals(
      "For the array [43], the largest value 43 can be found at index 0",
      JU08.selectLargest(arr));
  }

  @Test
  public void test09SelectLargest5()
  {
    int[] arr = {12, 4, 99, 100, 8, 102};
    assertEquals(
      "For the array [12, 4, 99, 100, 8, 102], the largest value 102 can be found at index 5",
      JU08.selectLargest(arr));
  }

}