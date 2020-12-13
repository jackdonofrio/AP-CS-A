
/**
 * JU15 Focuses on ArrayLists.
 * @version 2.1 fixed bad Thanos test, and deleted List interface since
 *              the AP exam no longer covers interfaces starting 2020.  
 *              also use the new Java 7 diamond operator.
 */
import static org.junit.Assert.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;
//Used to keep tests in order - otherwise would make students insane.
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU15Test
{

  @Test
  public void test01Fill1DArray1()
  {
    int [] originalArr = {8, 5};
    int [] actual = JU15.fill1DArray(originalArr);
    assertEquals("[8, 5, 4, 3, 1, 8]", Arrays.toString(actual));
  }
  
  @Test
  public void test01Fill1DArray2()
  {
    int [] originalArr = {8, 5, 10, 11};
    int [] actual = JU15.fill1DArray(originalArr);
    assertEquals("[8, 5, 10, 11, 4, 3, 1, 8]", Arrays.toString(actual));
  }
  
  @Test
  public void test01Fill1DArray3()
  {
    int [] originalArr = {3};
    int [] actual = JU15.fill1DArray(originalArr);
    assertEquals("[3, 4, 3, 1, 8]", Arrays.toString(actual));
  }
  
  @Test
  public void test02FillArrayList1()
  {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(8);
    arr.add(5);
    ArrayList<Integer> actual = JU15.fillArrayList(arr);
    assertNotNull(actual);
    assertEquals("[8, 5, 4, 3, 1, 8]", actual.toString());
  }
  
  @Test
  public void test02FillArrayList2()
  {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(42);
    arr.add(7);
    arr.add(3);
    arr.add(-7);
    ArrayList<Integer> actual = JU15.fillArrayList(arr);
    assertNotNull(actual);
    assertEquals("[42, 7, 3, -7, 4, 3, 1, 8]", actual.toString());
  }
  
  @Test
  public void test02DestroySmallest1()
  {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(42);
    arr.add(7);
    arr.add(3);
    arr.add(-7);
    JU15.destroySmallest(arr);
    assertEquals("[42, 7, 3]", arr.toString());
  }
  
  @Test
  public void test02DestroySmallest2()
  {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(3);
    arr.add(8);
    arr.add(10);
    arr.add(7);
    arr.add(6);
    arr.add(5);
    JU15.destroySmallest(arr);
    assertEquals("[8, 10, 7, 6, 5]", arr.toString());
  }
  
  @Test
  public void test02DestroySmallest3()
  {
    ArrayList<Integer> arr = new ArrayList<>();
    arr.add(9);
    arr.add(8);
    arr.add(10);
    arr.add(2);
    arr.add(6);
    arr.add(5);
    arr.add(5);
    arr.add(5);
    arr.add(8);
    JU15.destroySmallest(arr);
    assertEquals("[9, 8, 10, 6, 5, 5, 5, 8]", arr.toString());
  }



  @Test
  public void test03EpicAdd1()
  {
    String[] my1DArr = {"Fluffy", "Pizza", "Zorro", null, null};
    ArrayList<String> myList = new ArrayList<>();
    myList.addAll(Arrays.asList(my1DArr));
    JU15.epicAdd(3, "Egg", myList);

    assertEquals("[Fluffy, Pizza, Zorro, Egg, null, null]", myList.toString());
  }

  @Test
  public void test03EpicAdd2()
  {
    String[] my1DArr = {"Fluffy", "Pizza", "Zorro", null, null};
    ArrayList<String> myList = new ArrayList<>();
    myList.addAll(Arrays.asList(my1DArr));
    
    JU15.epicAdd(0, "Egg", myList);

    assertEquals("[Egg, Fluffy, Pizza, Zorro, null, null]", myList.toString());
  }
  
  @Test
  public void test04AddSpaghetti1()
  {
    ArrayList<String> al = new ArrayList<>();
    al.add("Bread Slice1");
    al.add("Bread Slice2");
    JU15.addSpaghetti(al);
    assertEquals("[Bread Slice1, spaghetti, Bread Slice2]", al.toString());
  }
  
  @Test
  public void test04AddSpaghetti2()
  {
    ArrayList<String> al = new ArrayList<>();
    al.add("Bread Slice1");
    al.add("Mustard");
    al.add("Lettuce");
    al.add("Bread Slice2");
    JU15.addSpaghetti(al);
    assertEquals("[Bread Slice1, Mustard, spaghetti, Lettuce, Bread Slice2]", al.toString());
  }
  
  @Test
  public void test04AddSpaghetti3()
  {
    ArrayList<String> al = new ArrayList<>();
    al.add("Lettuce");
    al.add("Mustard");
    al.add("Hot Sauce");
    al.add("Pizza");
    al.add("Lettuce");
    al.add("Pasta");
    JU15.addSpaghetti(al);
    assertEquals("[Lettuce, Mustard, Hot Sauce, spaghetti, Pizza, Lettuce, Pasta]", al.toString());
  }
  
  @Test
  public void test05ThanosSnap1()
  {
    ArrayList<String> al = new ArrayList<>();
    al.add("Hawkeye");
    al.add("America");
    al.add("Hulk");
    al.add("Thor");
    al.add("Witch");
    al.add("Vision");
    al.add("Widow");
    al.add("Machine");
    al.add("Ironman");
    al.add("Gary");
    JU15.thanosSnap(al);
    assertEquals("[Hawkeye, America, Hulk, Thor, Witch]", al.toString());  
  }
  
  @Test
  public void test05ThanosSnap2()
  {
    ArrayList<String> al = new ArrayList<>();
    al.add("a");
    al.add("b");
    al.add("c");
    al.add("d");
    al.add("e");
    al.add("f");
    al.add("g");
    al.add("h");
    JU15.thanosSnap(al);
    assertEquals("[a, b, c, d]", al.toString());  
  }
  
  @Test
  public void test05ThanosSnap3()
  {
    ArrayList<String> al = new ArrayList<>();
    al.add("a");
    al.add("b");
    al.add("c");
    JU15.thanosSnap(al);
    assertEquals("[a, b]", al.toString());  
  }
  
  @Test
  public void test05ThanosSnap4()
  {
    ArrayList<String> al = new ArrayList<>();
    al.add("x");
    al.add("b");
    al.add("c");
    al.add("d");
    al.add("a");
    al.add("b");
    al.add("z");

    JU15.thanosSnap(al);
    assertEquals("[x, b, c, d]", al.toString());  
  }
  
  @Test
  public void test05ThanosSnap5()
  {
    ArrayList<String> al = new ArrayList<>();
    al.add("a");
    al.add("b");
    al.add("c");
    al.add("d");
    al.add("a");
    al.add("b");
    al.add("c");
    al.add("d");
    al.add("a");
    al.add("b");
    al.add("c");
    al.add("a");
    al.add("b");
    al.add("c");
    al.add("d");
    JU15.thanosSnap(al);
    assertEquals("[a, b, c, d, a, b, c, d]", al.toString());  
  }
  
  @Test
  public void test05ThanosSnap6()
  {
    ArrayList<String> al = new ArrayList<>();
    al.add("Hawkeye");
    al.add("America");
    al.add("Hulk");
    al.add("Thor");
    al.add("Witch");
    al.add("Vision");
    al.add("Machine");
    al.add("Ironman");
    al.add("Gary");
    JU15.thanosSnap(al);
    assertEquals("[Hawkeye, America, Hulk, Thor, Witch]", al.toString());  
  }
  
  @Test
  public void test06RemoveTheFirstTwoValues1()
  {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(3);
    al.add(5);
    JU15.removeTheFirstTwoValues(al);
    assertEquals("[]", al.toString());
  }
  
  @Test
  public void test06RemoveTheFirstTwoValues2()
  {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(3);
    al.add(5);
    al.add(4);
    al.add(42);
    JU15.removeTheFirstTwoValues(al);
    assertEquals("[4, 42]", al.toString());
  }
  
  @Test
  public void test07RemoveTheLastValue1()
  {
    ArrayList<String> al = new ArrayList<>();
    al.add("Marceline");
    al.add("Finn");
    al.add("Princess Bubblegum");
    al.add("Ice King");
    al.add("Jake");
    JU15.removeTheLastValue(al);
    assertEquals("[Marceline, Finn, Princess Bubblegum, Ice King]", al.toString());
  }
  
  @Test
  public void test07RemoveTheLastValue2()
  {
    ArrayList<String> al = new ArrayList<>();
    JU15.removeTheLastValue(al);
    assertEquals("[]", al.toString());
    
    ArrayList<String> al2 = new ArrayList<>();
    al2.add("Turning");
    JU15.removeTheLastValue(al2);
    assertEquals("[]", al2.toString());
  }
  
  
  @Test
  public void test08RemoveThatWord1()
  {
    ArrayList<String> fruit = new ArrayList<>();
    fruit.add("apple");
    JU15.removeThatWord(fruit, "apple");
    assertEquals("[]", fruit.toString());
    
  }
  
  @Test
  public void test08RemoveThatWord2()
  {
    ArrayList<String> fruit = new ArrayList<>();
    fruit.add("apple");
    JU15.removeThatWord(fruit, "app");
    assertEquals("[apple]", fruit.toString());
    
    ArrayList<String> fruit2 = new ArrayList<>();
    fruit2.add("app");
    fruit2.add("apple");
    fruit2.add("app");
    JU15.removeThatWord(fruit2, "app");
    assertEquals("[apple]", fruit2.toString());
    
  }
  
  @Test
  public void test08RemoveThatWord3()
  {
    ArrayList<String> fruit = new ArrayList<>();
    //Since students will probably try to treat Strings as primitives for equality, 
    //we'll prevent string interning from happening.
    fruit.add(new String("apple"));
    JU15.removeThatWord(fruit, "apple");
    assertEquals("[]", fruit.toString());
    
  }
  
  @Test
  public void test08RemoveThatWord4()
  {
    ArrayList<String> fruit = new ArrayList<>();
    fruit.add("apple");
    //Since students will probably try to treat Strings as primitives for equality, 
    //we'll prevent string interning from happening.
    fruit.add(new String("grape")); //avoid interning the String.
    fruit.add(new String("grape")); //avoid interning the String.
   
    JU15.removeThatWord(fruit, "grape");
    assertEquals("[apple]", fruit.toString());
  }
  
  @Test
  public void test08RemoveThatWord5()
  {
    ArrayList<String> fruit = new ArrayList<>();
    fruit.add("grape");
    fruit.add("orange");
    fruit.add("orange");
    fruit.add("grape");
    JU15.removeThatWord(fruit, "orange");
    assertEquals("[grape, grape]", fruit.toString());
  }
  
  @Test
  public void test09MakeMeHealthy1()
  {
    ArrayList<String> myDiet = new ArrayList<>();
    myDiet.add("apple");
    myDiet.add("pizza");
    JU15.makeMeHealthy(myDiet);
    assertEquals("[apple, broccoli]", myDiet.toString());
  }
  
  @Test
  public void test09MakeMeHealthy2()
  {
    ArrayList<String> myDiet = new ArrayList<>();
    myDiet.add("hamburger");
    myDiet.add("pizza");
    JU15.makeMeHealthy(myDiet);
    assertEquals("[broccoli, broccoli]", myDiet.toString());
  }
  
  @Test
  public void test09MakeMeHealthy3()
  {
    ArrayList<String> myDiet = new ArrayList<>();
    myDiet.add("apples");
    myDiet.add(new String("hamburger")); //to make sure students don't use ==
    myDiet.add("pizza");
    myDiet.add("orange");
    myDiet.add(new String("pizza"));
    JU15.makeMeHealthy(myDiet);
    assertEquals("[apples, broccoli, broccoli, orange, broccoli]", myDiet.toString());
  }
  
  @Test
  public void test10reverse1()
  {
    ArrayList<String> myDiet = new ArrayList<>();
    myDiet.add("apples");
    myDiet.add("hamburger");
    myDiet.add("pizza");
    myDiet.add("orange");
    myDiet.add("beans");
    ArrayList<String> answer = JU15.reverse(myDiet);
    assertEquals("[beans, orange, pizza, hamburger, apples]", answer.toString());
  }
  
  @Test
  public void test10reverse2()
  {
    ArrayList<String> myDiet = new ArrayList<>();
    myDiet.add("a");
    myDiet.add("b");
    myDiet.add("c");
    myDiet.add("d");
    myDiet.add("e");
    myDiet.add("f");
    myDiet.add("g");
    myDiet.add("h");
    myDiet.add("i");
    myDiet.add("j");
    myDiet.add("k");
    myDiet.add("l");
    ArrayList<String> answer = JU15.reverse(myDiet);
    assertEquals("[l, k, j, i, h, g, f, e, d, c, b, a]", answer.toString());
  }
  
  @Test
  public void test11GetSumButNotAfter42_1()
  {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(3);
    assertEquals(3, JU15.getSumButNotAfter42(al));
  }
  
  @Test
  public void test11GetSumButNotAfter42_2()
  {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(3);
    al.add(1);
    assertEquals(4, JU15.getSumButNotAfter42(al));
  }
  
  @Test
  public void test11GetSumButNotAfter42_3()
  {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(3);
    al.add(4);
    al.add(1);
    al.add(4);
    al.add(1);
    al.add(4);
    al.add(1);
    assertEquals(18, JU15.getSumButNotAfter42(al));
  }
  
  @Test
  public void test11GetSumButNotAfter42_4()
  {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(3);
    al.add(2);
    al.add(42);
    al.add(1);
    assertEquals(47, JU15.getSumButNotAfter42(al));
  }
  
  @Test
  public void test11GetSumButNotAfter42_5()
  {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(42);
    al.add(2);
    al.add(3);
    al.add(1);
    al.add(3);
    al.add(1);
    assertEquals(42, JU15.getSumButNotAfter42(al));
  }
  
  @Test
  public void test12GetRange1()
  {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(42);
    al.add(2);
    al.add(3);
    al.add(1);
    al.add(3);
    al.add(1);
    assertEquals(41, JU15.getRange(al));
  }
  
  @Test
  public void test12GetRange2()
  {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(-5);
    al.add(2);
    assertEquals(8, JU15.getRange(al));
  }
  
  @Test
  public void test12GetRange3()
  {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(33);
    al.add(88);
    al.add(3);
    al.add(-9);
    al.add(22);
    al.add(-21);
    al.add(25);
    assertEquals(109, JU15.getRange(al));
  }
  
  @Test
  public void test12GetRange4()
  {
    ArrayList<Integer> al = new ArrayList<>();
    al.add(4);
    al.add(5);
    al.add(3);
    al.add(2);
    al.add(22);
    al.add(-2);
    al.add(-4);
    al.add(-6);
    assertEquals(28, JU15.getRange(al));
  }
  
  

  @Test
  public void test13GetSizeOfBigWord1()
  {
    ArrayList<String> myList = new ArrayList<>();
    myList.add("Fluffy");
    myList.add("Bingo");
    myList.add("Xi");

    assertEquals(6, JU15.getSizeOfBigWord(myList));
  }

  @Test
  public void test13GetSizeOfBigWord2()
  {
    ArrayList<String> myList = new ArrayList<>();
    assertEquals(0, JU15.getSizeOfBigWord(myList));
  }

  @Test
  public void test13GetSizeOfBigWord3()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("CDOHS");
    myList.add("CDO");
    myList.add("CD");
    myList.add("A");

    assertEquals(5, JU15.getSizeOfBigWord(myList));
  }

  @Test
  public void test14DestroyDups1()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("apple");
    myList.add("apple");
    myList.add("apple");
    myList.add("apple");
    JU15.destroyDupes(myList);
    assertEquals("[apple]", myList.toString());
  }

  @Test
  public void test14DestroyDups2()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("apple");
    myList.add("pizza");
    myList.add("pizza");
    myList.add("zorro");
    myList.add("zorro");
    JU15.destroyDupes(myList);
    assertEquals("[apple, pizza, zorro]", myList.toString());
  }

  @Test
  public void test14DestroyDups3()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("apple");
    myList.add("g");
    myList.add("g");
    myList.add("g");
    myList.add("g");
    myList.add("zorro");
    JU15.destroyDupes(myList);
    assertEquals("[apple, g, zorro]", myList.toString());
  }

  @Test
  public void test14DestroyDups4()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("zebra");
    JU15.destroyDupes(myList);
    assertEquals("[zebra]", myList.toString());
  }

  @Test
  public void test15TargetThrees1()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("bbb");
    JU15.targetThrees(myList);
    assertEquals("[***, bbb]", myList.toString());
  }

  @Test
  public void test15TargetThrees2()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("bb");
    JU15.targetThrees(myList);
    assertEquals("[bb]", myList.toString());
  }

  @Test
  public void test15TargetThrees3()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("this");
    myList.add("class");
    myList.add("can");
    myList.add("be");
    myList.add("really");
    myList.add("fun");
    JU15.targetThrees(myList);
    assertEquals("[this, class, ***, can, be, really, ***, fun]",
      myList.toString());
  }

  @Test
  public void test15TargetThrees4()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("grace");
    myList.add("hopper");
    myList.add("invented");
    myList.add("the");
    myList.add("first");
    myList.add("programming");
    myList.add("language");
    myList.add("which");
    myList.add("was");
    myList.add("cobol");
    JU15.targetThrees(myList);
    assertEquals(
      "[grace, hopper, invented, ***, the, first, programming, language, which, ***, was, cobol]",
      myList.toString());
  }

  @Test
  public void test16TalkTalk1()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("love");
    JU15.talktalk(myList);
    assertEquals("[love, love]", myList.toString());

  }

  @Test
  public void test16TalkTalk2()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("We");
    myList.add("Love");

    JU15.talktalk(myList);
    assertEquals("[We, We, Love, Love]", myList.toString());

  }

  @Test
  public void test16TalkTalk3()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("hopi");
    myList.add("navajo");
    myList.add("apache");
    JU15.talktalk(myList);
    assertEquals("[hopi, hopi, navajo, navajo, apache, apache]",
      myList.toString());

  }

  @Test
  public void test16TalkTalk4()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("java");
    myList.add("is");
    myList.add("to");
    myList.add("javascript");
    myList.add("as");
    myList.add("car");
    myList.add("is");
    myList.add("to");
    myList.add("carpet");
    JU15.talktalk(myList);
    assertEquals(
      "[java, java, is, is, to, to, javascript, javascript, as, as, car, car, is, is, to, to, carpet, carpet]",
      myList.toString());

  }
  
  @Test
  public void test17ThreeOddEven1()
  {
    ArrayList<Integer> myList1 = new ArrayList<>();
    myList1.add(3);
    myList1.add(5);
    assertFalse(JU15.threeOddEven(myList1));
    ArrayList<Integer> myList2 = new ArrayList<>();
    myList2.add(3);
    myList2.add(5);
    myList2.add(1);
    assertTrue(JU15.threeOddEven(myList2));
  }
  
  @Test
  public void test17ThreeOddEven2()
  {
    ArrayList<Integer> myList1 = new ArrayList<>();
    myList1.add(3);
    myList1.add(2);
    myList1.add(2);
    assertFalse(JU15.threeOddEven(myList1));
    ArrayList<Integer> myList2 = new ArrayList<>();
    myList2.add(1);
    myList2.add(3);
    myList2.add(4);
    myList2.add(8);
    myList2.add(22);
    assertTrue(JU15.threeOddEven(myList2));
  }
  
  @Test
  public void test17ThreeOddEven3()
  {
    ArrayList<Integer> myList1 = new ArrayList<>();
    myList1.add(3);
    myList1.add(2);
    myList1.add(2);
    myList1.add(3);
    myList1.add(2);
    myList1.add(1);
    myList1.add(3);
    myList1.add(2);
    myList1.add(2);
    assertFalse(JU15.threeOddEven(myList1));
    ArrayList<Integer> myList2 = new ArrayList<>();
    myList2.add(5);
    myList2.add(5);
    myList2.add(6);
    myList2.add(5);
    myList2.add(5);
    myList2.add(6);
    myList2.add(5);
    myList2.add(5);
    myList2.add(3);
    myList2.add(5);
    myList2.add(0);
    myList2.add(6);
    assertTrue(JU15.threeOddEven(myList2));
  }
  
  @Test
  public void test17ThreeOddEven4()
  {
    ArrayList<Integer> myList1 = new ArrayList<>();
    myList1.add(3);
    myList1.add(2);
    myList1.add(2);
    myList1.add(3);
    myList1.add(2);
    myList1.add(8);
    assertFalse(JU15.threeOddEven(myList1));
    ArrayList<Integer> myList2 = new ArrayList<>();
    myList2.add(8);
    myList2.add(6);
    myList2.add(12);
    myList2.add(0);

    assertTrue(JU15.threeOddEven(myList2));
  }
  
  @Test
  public void test17ThreeOddEven5()
  {
    ArrayList<Integer> myList1 = new ArrayList<>();
    myList1.add(4);
    assertFalse(JU15.threeOddEven(myList1));
    ArrayList<Integer> myList2 = new ArrayList<>();
    myList2.add(8);
    myList2.add(6);
    myList2.add(12);
    myList2.add(7);
    myList2.add(3);
    myList2.add(5);
    myList2.add(2);
    myList2.add(7);

    assertTrue(JU15.threeOddEven(myList2));
  }
  

  @Test
  public void test18FlipPairs1()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("this");
    myList.add("class");
    JU15.flipPairs(myList);
    assertEquals("[class, this]", myList.toString());
  }

  @Test
  public void test18FlipPairs2()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("this");
    myList.add("class");
    myList.add("can");
    myList.add("be");
    myList.add("really");
    myList.add("fun");
    JU15.flipPairs(myList);
    assertEquals("[class, this, be, can, fun, really]", myList.toString());
  }

  @Test
  public void test18FlipPairs3()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("dont");
    myList.add("swap");
    myList.add("the");
    myList.add("last");
    myList.add("one");
    JU15.flipPairs(myList);
    assertEquals("[swap, dont, last, the, one]", myList.toString());
  }

  @Test
  public void test18FlipPairs4()
  {
    ArrayList<String> myList = new ArrayList<>();

    myList.add("ap");
    myList.add("classes");
    myList.add("reduce");
    myList.add("the");
    myList.add("cost");
    myList.add("of");
    myList.add("college");
    JU15.flipPairs(myList);
    assertEquals("[classes, ap, the, reduce, of, cost, college]",
      myList.toString());
  }
  
  @Test
  public void test19WordPairs1()
  {
    String[] wordNums = {"one", "two", "three"};
    ArrayList<String> actualList = JU15.makeWordPairs(wordNums);
    assertEquals("[onetwo, onethree, twothree]", actualList.toString());
  }
  
  @Test
  public void test19WordPairs2()
  {
    String[] wordNums = {"where", "is", "the", "any", "key"};
    ArrayList<String> actualList = JU15.makeWordPairs(wordNums);
    assertEquals("[whereis, wherethe, whereany, wherekey, isthe, isany, iskey, theany, thekey, anykey]", actualList.toString());
  }
  
  @Test
  public void test19WordPairs3()
  {
    String[] wordNums = {"where", "is", "the", "any", "key"};
    ArrayList<String> actualList = JU15.makeWordPairs(wordNums);
    assertEquals("[whereis, wherethe, whereany, wherekey, isthe, isany, iskey, theany, thekey, anykey]", actualList.toString());
  }
  
  @Test
  public void test19WordPairs4()
  {
    String[] wordNums = {"i", "want", "a", "high", "paying", "job"};
    ArrayList<String> actualList = JU15.makeWordPairs(wordNums);
    assertEquals("[iwant, ia, ihigh, ipaying, ijob, wanta, wanthigh, wantpaying, wantjob, ahigh, apaying, ajob, highpaying, highjob, payingjob]", actualList.toString());
  }

}
