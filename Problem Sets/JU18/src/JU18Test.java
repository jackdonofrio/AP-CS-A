
/**
 * Do not upload this file
 * @version 1.0 - Initial release
 */
import static org.junit.Assert.*;

import java.util.*;
import org.junit.Test;

import org.junit.runners.*;
import org.junit.FixMethodOrder;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU18Test
{
  
  @Test
  public void test01ConvertStringTo1DArray()
  {
    assertEquals("[p, i, z, z, a]", Arrays.toString(JU18.convertStringTo1DArray("pizza")));
    assertEquals("[s, p, i, n, a, c, h]", Arrays.toString(JU18.convertStringTo1DArray("spinach")));
    assertEquals("[v, a, l, v, e]", Arrays.toString(JU18.convertStringTo1DArray("valve")));
  }
  
  @Test
  public void test02ThreeOddOrEven1()
  {
    int [] arr1 = {2, 1, 3, 5};
    assertTrue(JU18.threeOddOrEven(arr1));
    int [] arr2 = {1, 2};
    assertFalse(JU18.threeOddOrEven(arr2));
  }
  
  @Test
  public void test02ThreeOddOrEven2()
  {
    int [] arr1 = {2, 7, 2, 0, 10, 3};
    assertTrue(JU18.threeOddOrEven(arr1));
    int [] arr2 = {2, 1, 2, 5};
    assertFalse(JU18.threeOddOrEven(arr2));
  }
  
  @Test
  public void test03ThreeOddOrEven3()
  {
    int [] arr1 = {2, 7, 2, 0, 10, 3};
    assertTrue(JU18.threeOddOrEven(arr1));
    int [] arr2 = {2};
    assertFalse(JU18.threeOddOrEven(arr2));
    
    int [] arr3 = {9, 7, 2, 9, 2, 2, 14};
    assertTrue(JU18.threeOddOrEven(arr3));
    int [] arr4 = {2, 4, 9, 2, 4, 9, 2, 4, 9};
    assertFalse(JU18.threeOddOrEven(arr4));
  }
  
  @Test
  public void test04ReplaceZerosWithBigOdd1()
  {
    List<Integer> myList1  = Arrays.asList(new Integer[]{0, 5});
    assertEquals("[5, 5]", JU18.replaceZerosWithBigOdd(myList1).toString());
  }
  
  @Test
  public void test04ReplaceZerosWithBigOdd2()
  {
    List<Integer> myList1  = Arrays.asList(new Integer[]{0, 5, 4, 9, 100});
    assertEquals("[9, 5, 4, 9, 100]", JU18.replaceZerosWithBigOdd(myList1).toString());
  }
  
  @Test
  public void test04ReplaceZerosWithBigOdd3()
  {
    List<Integer> myList1  = Arrays.asList(new Integer[]{0, 4, 0, 3});
    assertEquals("[3, 4, 3, 3]", JU18.replaceZerosWithBigOdd(myList1).toString());
    List<Integer> myList2  = Arrays.asList(new Integer[]{0, 2, 1, 0, 5, 9, 11, 7, 0});
    assertEquals("[11, 2, 1, 11, 5, 9, 11, 7, 0]", JU18.replaceZerosWithBigOdd(myList2).toString());
  }
  
  @Test
  public void test04ReplaceZerosWithBigOdd4()
  {
    List<Integer> myList1  = Arrays.asList(new Integer[]{5, 0, 100, 4, 99, 100, 0, 9, 10, 11, 12, 13});
    assertEquals("[5, 99, 100, 4, 99, 100, 13, 9, 10, 11, 12, 13]", JU18.replaceZerosWithBigOdd(myList1).toString());
    List<Integer> myList2  = Arrays.asList(new Integer[]{0});
    assertEquals("[0]", JU18.replaceZerosWithBigOdd(myList2).toString());
    List<Integer> myList3  = Arrays.asList(new Integer[]{77, 23, 0, 1000, 0, 89, 77, 200, 201, 34, 33});
    assertEquals("[77, 23, 201, 1000, 201, 89, 77, 200, 201, 34, 33]", JU18.replaceZerosWithBigOdd(myList3).toString());

  }
  
  @Test
  public void test05GoodEnough1()
  {
    List<Integer> myList1  = Arrays.asList(new Integer[]{2, 7, 1});
    assertTrue(JU18.goodEnough(myList1));
    List<Integer> myList2  = Arrays.asList(new Integer[]{2, 7, 4});
    assertFalse(JU18.goodEnough(myList2));
  }
  
  @Test
  public void test05GoodEnough2()
  {
    List<Integer> myList1  = Arrays.asList(new Integer[]{3, 8, 2});
    assertTrue(JU18.goodEnough(myList1));
    List<Integer> myList2  = Arrays.asList(new Integer[]{2, 7, -2});
    assertFalse(JU18.goodEnough(myList2));
  }
  
  @Test
  public void test05GoodEnough3()
  {
    List<Integer> myList1  = Arrays.asList(new Integer[]{1, 1, 4, 9, 4, 9, 2});
    assertTrue(JU18.goodEnough(myList1));
    List<Integer> myList2  = Arrays.asList(new Integer[]{1, 1, 4, 9, 0});
    assertFalse(JU18.goodEnough(myList2));
  }
  
  @Test
  public void test05GoodEnough4()
  {
    List<Integer> myList  = Arrays.asList(new Integer[]{2, 7, 5, 10, 4});
    assertTrue(JU18.goodEnough(myList));
    List<Integer> myList2  = Arrays.asList(new Integer[]{5, 10, 20});
    assertFalse(JU18.goodEnough(myList2));
  }
  
  @Test
  public void test05GoodEnough5()
  {
    List<Integer> myList  = Arrays.asList(new Integer[] {1, 2, 7, 1});
    assertTrue(JU18.goodEnough(myList));
    List<Integer> myList2  = Arrays.asList(new Integer[]{1, 2, 8, 1});
    assertFalse(JU18.goodEnough(myList2));
  }
  
  @Test
  public void test06SearchAndRemoveSubstring1()
  {
    String a = "ab";
    String b = "a";
    assertEquals("b", JU18.searchAndRemoveSubstring(a, b));
  }
  
  @Test
  public void test06SearchAndRemoveSubstring2()
  {
    String a = "ab";
    String b = "b";
    assertEquals("a", JU18.searchAndRemoveSubstring(a, b));
  }
  
  @Test
  public void test06SearchAndRemoveSubstring3()
  {
    String a = "hello there";
    String b = "h";
    assertEquals("ello tere", JU18.searchAndRemoveSubstring(a, b));
  }
  
  @Test
  public void test06SearchAndRemoveSubstring4()
  {
    String a = "hello there";
    String b = "he";
    assertEquals("llo tre", JU18.searchAndRemoveSubstring(a, b));
  }
  
  @Test
  public void test06SearchAndRemoveSubstring5()
  {
    String a = "hello there";
    String b = "x";
    assertEquals("hello there", JU18.searchAndRemoveSubstring(a, b));
  }
  
  @Test
  public void test06SearchAndRemoveSubstring6()
  {
    String a = "this is a fish";
    String b = "is";
    assertEquals("th  a fh", JU18.searchAndRemoveSubstring(a, b));
  }
  
  @Test
  public void test06SearchAndRemoveSubstring7()
  {
    String a = "this is a fish";
    String b = " ";
    assertEquals("thisisafish", JU18.searchAndRemoveSubstring(a, b));
  }
  
  @Test
  public void test06SearchAndRemoveSubstring8()
  {
    String a = "abzzzzab";
    String b = "zz";
    assertEquals("abab", JU18.searchAndRemoveSubstring(a, b));
  }
  
  @Test
  public void test06SearchAndRemoveSubstring9()
  {
    String a = "abzzzab";
    String b = "zz";
    assertEquals("abzab", JU18.searchAndRemoveSubstring(a, b));
  }
  
  @Test
  public void test06SearchAndRemoveSubstring10()
  {
    String a = "";
    String b = "x";
    assertEquals("", JU18.searchAndRemoveSubstring(a, b));
  }
  
  @Test
  public void test06SearchAndRemoveSubstring11()
  {
    String a = "zzz";
    String b = "z";
    assertEquals("", JU18.searchAndRemoveSubstring(a, b));
  }
  
  @Test
  public void test06SearchAndRemoveSubstring12()
  {
    String a = "computer science careers pay well";
    String b = "er";
    assertEquals("comput science cares pay well", JU18.searchAndRemoveSubstring(a, b));
  }
  
  @Test
  public void test06SearchAndRemoveSubstring13()
  {
    String a = "pizza pizza pizza is zap";
    String b = "zza";
    assertEquals("pi pi pi is zap", JU18.searchAndRemoveSubstring(a, b));
  }
  
  
  @Test
  public void test07PutFivesAfterFours1()
  {    
    int [] arr = {4, 5};
    assertEquals("[4, 5]", Arrays.toString(JU18.putFivesAfterFours(arr)));
  }
  
  @Test
  public void test07PutFivesAfterFours2()
  {    
    int [] arr = {5, 4, 1};
    assertEquals("[1, 4, 5]", Arrays.toString(JU18.putFivesAfterFours(arr)));
  }
  
  @Test
  public void test07PutFivesAfterFours3()
  {    
    int [] arr = {5, 4, 5, 4, 1};
    assertEquals("[1, 4, 5, 4, 5]", Arrays.toString(JU18.putFivesAfterFours(arr)));
  }
  
  @Test
  public void test07PutFivesAfterFours4()
  {    
    int [] arr = {3, 4, 5};
    assertEquals("[3, 4, 5]", Arrays.toString(JU18.putFivesAfterFours(arr)));
  }
  
  @Test
  public void test07PutFivesAfterFours5()
  {    
    int [] arr = {2, 4, 2, 5};
    assertEquals("[2, 4, 5, 2]", Arrays.toString(JU18.putFivesAfterFours(arr)));
  }
  
  @Test
  public void test07PutFivesAfterFours6()
  {    
    int [] arr = {1, 1, 4, 5, 4, 5};
    assertEquals("[1, 1, 4, 5, 4, 5]", Arrays.toString(JU18.putFivesAfterFours(arr)));
  }
  
  @Test
  public void test07PutFivesAfterFours7()
  {    
    int [] arr = {4, 9, 4, 9, 5, 5, 4, 9, 5};
    assertEquals("[4, 5, 4, 5, 9, 9, 4, 5, 9]", Arrays.toString(JU18.putFivesAfterFours(arr)));
  }
  
  @Test
  public void test07PutFivesAfterFours8()
  {    
    int [] arr = {4, 3, 4, 5, 4, 9, 1, 1, 1, 5, 5};
    assertEquals("[4, 5, 4, 5, 4, 5, 1, 1, 1, 3, 9]", Arrays.toString(JU18.putFivesAfterFours(arr)));
  }
  
  @Test
  public void test07PutFivesAfterFours9()
  {    
    int [] arr = {};
    assertEquals("[]", Arrays.toString(JU18.putFivesAfterFours(arr)));
  }
  
  @Test
  public void test07PutFivesAfterFours10()
  {    
    int [] arr = {1, 5, 2, 2, 2, 2, 2, 3, 2, 4, 42};
    assertEquals("[1, 42, 2, 2, 2, 2, 2, 3, 2, 4, 5]", Arrays.toString(JU18.putFivesAfterFours(arr)));
  }
  
  @Test
  public void test07PutFivesAfterFours11()
  {    
    int [] arr = {4, 5, 5, 2, 7, 7, 4, 3, 9};
    assertEquals("[4, 5, 3, 2, 7, 7, 4, 5, 9]", Arrays.toString(JU18.putFivesAfterFours(arr)));
  }
  
  @Test
  public void test07PutFivesAfterFours12()
  {    
    int [] arr = {4, 3, 3, 3, 3, 3, 5, 8, 2, 1, 4, 5, 1};
    assertEquals("[4, 5, 3, 3, 3, 3, 3, 8, 2, 1, 4, 5, 1]", Arrays.toString(JU18.putFivesAfterFours(arr)));
  }
  @Test
  public void test08ReversyFun01()
  {
    assertEquals("[]", Arrays.toString(JU18.reversyFun(0)));
  }
  
  @Test
  public void test08ReversyFun02()
  {
    assertEquals("[1]", Arrays.toString(JU18.reversyFun(1)));
  }
  
  @Test
  public void test08ReversyFun03()
  {
    assertEquals("[0, 1, 2, 1]", Arrays.toString(JU18.reversyFun(2)));
  }
  
  @Test
  public void test08ReversyFun04()
  {
    assertEquals("[0, 0, 1, 0, 2, 1, 3, 2, 1]", Arrays.toString(JU18.reversyFun(3)));
  }
  
  @Test
  public void test08ReversyFun05()
  {
    assertEquals("[0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]", Arrays.toString(JU18.reversyFun(4)));
  }
  
  @Test
  public void test08ReversyFun06()
  {
    assertEquals("[0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 4, 3, 2, 1, 0, 0, 0, 5, 4, 3, 2, 1, 0, 0, 6, 5, 4, 3, 2, 1, 0, 7, 6, 5, 4, 3, 2, 1, 8, 7, 6, 5, 4, 3, 2, 1]", Arrays.toString(JU18.reversyFun(8)));
  }
  
  @Test
  public void test08ReversyFun07()
  {
    assertEquals("[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 4, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 5, 4, 3, 2, 1, 0, 0, 0, 0, 0, 0, 6, 5, 4, 3, 2, 1, 0, 0, 0, 0, 0, 7, 6, 5, 4, 3, 2, 1, 0, 0, 0, 0, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 0, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 0, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1]", Arrays.toString(JU18.reversyFun(12)));
  }
  
}
