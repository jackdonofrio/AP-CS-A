
/**
 * JU14 Focuses on Strings.  Do not turn this in to the dropbox.
 * Student Version
 * @version 2.0 Fixed typo in 17th test.
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
//
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU14Test
{

  @Test
  public void test01FirstTwoCharacters1()
  {
    assertEquals("gr", JU14.firstTwoCharacters("grace hopper"));
  }

  @Test
  public void test01FirstTwoCharacters2()
  {
    assertEquals("i#", JU14.firstTwoCharacters("i"));
  }
  
  @Test
  public void test01FirstTwoCharacters3()
  {
    assertEquals("su", JU14.firstTwoCharacters("supermanisop"));
  }
  
  @Test
  public void test02FirstTwoCharacters4()
  {
    assertEquals("##", JU14.firstTwoCharacters(""));
  }
  
  @Test
  public void test02NoFirstLetterConcat1()
  {
    assertEquals("raceopper", JU14.noFirstLetterConcat("Grace", "Hopper"));
  }
  
  @Test
  public void test02NoFirstLetterConcat2()
  {
    assertEquals("teveobs", JU14.noFirstLetterConcat("Steve", "Jobs"));
  }
  
  @Test
  public void test02NoFirstLetterConcat3()
  {
    assertEquals("haggyoo", JU14.noFirstLetterConcat("Shaggy", "Doo"));
  }
  
  @Test
  public void test03GetMiddleThree1()
  {
    assertEquals("and", JU14.getMiddleThree("Candy"));
  }
  
  @Test
  public void test03GetMiddleThree2()
  {
    assertEquals("exe", JU14.getMiddleThree("barreexercise"));
  }
  
  @Test
  public void test03GetMiddleThree3()
  {
    assertEquals("gsa", JU14.getMiddleThree("stringsarefun"));
  }
  
  @Test
  public void test03GetMiddleThree4()
  {
    assertEquals("nope", JU14.getMiddleThree("even"));
    assertEquals("nope", JU14.getMiddleThree("rt"));
    assertEquals("nope", JU14.getMiddleThree("bathbathbath"));
  }


  @Test
  public void test04inNumericalOrder1()
  {
    assertTrue(JU14.inNumericalOrder(3, 5, 19));
    assertFalse(JU14.inNumericalOrder(3, 2, 3));
  }

  @Test
  public void test04inNumericalOrder2()
  {
    assertTrue(JU14.inNumericalOrder(5, 5, 5));
    assertFalse(JU14.inNumericalOrder(5, 5, 3));
  }


  @Test
  public void test05inAlphabeticalOrder1()
  {
    assertTrue(JU14.inAlphabeticalOrder("a", "b", "e"));
    assertFalse(JU14.inAlphabeticalOrder("can", "apple", "z"));
  }

  @Test
  public void test05inAlphabeticalOrder2()
  {
    assertTrue(JU14.inAlphabeticalOrder("ape", "ape", "ape"));
    assertFalse(JU14.inAlphabeticalOrder("mouse", "apple", "mouse"));
  }
  
  @Test
  public void test05inAlphabeticalOrder3()
  {
    assertTrue(JU14.inAlphabeticalOrder("barre", "hit", "pilates"));
    assertFalse(JU14.inAlphabeticalOrder("orange", "blue", "zed"));
  }


  @Test
  public void test06WordCount1()
  {
    assertEquals(0, JU14.wordCount(""));
  }

  @Test
  public void test06WordCount2()
  {
    assertEquals(1, JU14.wordCount("apple"));
  }

  @Test
  public void test06WordCount3()
  {
    assertEquals(3, JU14.wordCount("I love pizza."));
  }
  
  @Test
  public void test06WordCount4()
  {
    assertEquals(14, JU14.wordCount("Well I think this should count the number of words in this sentence correctly!"));
  }
  
  @Test
  public void test07AIsPalendrome1()
  {
    assertTrue(JU14.isPalendrome("kayak"));
    assertFalse(JU14.isPalendrome("kayaky"));
  }
  
  @Test
  public void test07AIsPalendrome2()
  {
    assertTrue(JU14.isPalendrome("kAyak"));
    assertFalse(JU14.isPalendrome("Ka"));
  }
  
  @Test
  public void test07AIsPalendrome3()
  {
    assertTrue(JU14.isPalendrome("ka y A K"));
    assertFalse(JU14.isPalendrome("toast"));
  }
  
  @Test
  public void test07AIsPalendrome4()
  {
    assertTrue(JU14.isPalendrome("'ka      Ya'k'"));
    assertFalse(JU14.isPalendrome("toast"));
  }
  
  @Test
  public void test07AIsPalendrome5()
  {
    assertTrue(JU14.isPalendrome("A man, a plan, a canal, Panama"));
    assertTrue(JU14.isPalendrome("Never odd or even"));
    assertFalse(JU14.isPalendrome("I'm not sure this is a palendrome"));
  }



  @Test
  public void test08ConvertName1()
  {
    assertEquals("John von Neumann", JU14.convertName("von Neumann, John"));
  }

  @Test
  public void test08ConvertName2()
  {
    assertEquals("Grace Hopper", JU14.convertName("Hopper, Grace"));
  }


  @Test
  public void test09FirstAndLast1()
  {
    assertEquals("pe", JU14.firstAndLast("pasta", "rice"));
  }

  @Test
  public void test09FirstAndLast2()
  {
    assertEquals("t#", JU14.firstAndLast("turbo", ""));
  }

  @Test
  public void test09FirstAndLast3()
  {
    assertEquals("##", JU14.firstAndLast("", ""));
  }


  @Test
  public void test10GetEuroDate1()
  {
    assertEquals("31-05-2009", JU14.getEuroDate("05/31/2009"));
  }
  
  @Test
  public void test10GetEuroDate2()
  {
    assertEquals("01-01-2001", JU14.getEuroDate("01/01/2001"));
  }


  @Test
  public void test11PatternCount1()
  {
    assertEquals(2, JU14.patternCount("appleappleacorn", "app"));
  }

  @Test
  public void test11PatternCount2()
  {
    assertEquals(4,
      JU14.patternCount("fjdewksalfdshrewuiobmfrhfewafdew", "ew"));
  }

  @Test
  public void test11PatternCount3()
  {
    assertEquals(0, JU14.patternCount("software", "ew"));
  }
  
  @Test
  public void test11PatternCount4()
  {
    assertEquals(3, JU14.patternCount("shashaggyzshaggyshaggyzz", "shaggy"));
  }


  @Test
  public void test12getHangmanReponse1()
  {
    assertEquals("e-e-----", JU14.getHangmanReponse("elephant", "e"));
  }

  @Test
  public void test12getHangmanReponse2()
  {
    assertEquals("----h---", JU14.getHangmanReponse("elephant", "h"));
  }
  
  @Test
  public void test12getHangmanReponse3()
  {
    assertEquals("-pp--", JU14.getHangmanReponse("apple", "p"));
  }
  
  @Test
  public void test12getHangmanReponse4()
  {
    assertEquals("f---f--", JU14.getHangmanReponse("firefox", "f"));
  }

  @Test
  public void test13SearchAndRemove1()
  {
    assertEquals("acdefg", JU14.searchAndRemove("abcdefg", "b"));
  }

  @Test
  public void test13SearchAndRemove2()
  {
    assertEquals("abcdef", JU14.searchAndRemove("abcdefg", "g"));
  }
  
  @Test
  public void test13SearchAndRemove3()
  {
    assertEquals("abefg", JU14.searchAndRemove("abcdefg", "cd"));
  }

  @Test
  public void test13SearchAndRemove4()
  {
    assertEquals("rrrt", JU14.searchAndRemove("rrrbadtbad", "bad"));
  }

  @Test
  public void test14FindVowels1()
  {
    assertEquals(
      "The first position of a is 14.\nThe first position of e is 4.\nThe first position of i is 2.\nThe first position of o is 11.\nThe first position of u is 0.\n",
      JU14.findVowels("university of arizona"));
  }

  @Test
  public void test14FindVowels2()
  {
    assertEquals(
      "The first position of a is -1.\nThe first position of e is 6.\nThe first position of i is 11.\nThe first position of o is 1.\nThe first position of u is 4.\n",
      JU14.findVowels("computer science"));
  }

  @Test
  public void test15InAlphabeticalOrder1()
  {
    String [] items = {"apple"};
    assertTrue(JU14.inAlphabeticalOrder(items));
    String [] outOfOrder = {"z", "a"};
    assertFalse(JU14.inAlphabeticalOrder(outOfOrder));
  }

  @Test
  public void test15InAlphabeticalOrder2()
  {
    String [] items = {"tango", "uniform"};
    assertTrue(JU14.inAlphabeticalOrder(items));
    String [] outOfOrder = {"x", "b"};
    assertFalse(JU14.inAlphabeticalOrder(outOfOrder));
  }

  @Test
  public void test15InAlphabeticalOrder3()
  {
    String [] items = {"beta", "beta", "papa", "sierra", "zulu"};
    assertTrue(JU14.inAlphabeticalOrder(items));
    String [] outOfOrder = {"papa", "beta", "papa", "sierra", "zulu"};
    assertFalse(JU14.inAlphabeticalOrder(outOfOrder));
  }

  @Test
  public void test15InAlphabeticalOrder4()
  {
    String [] items = {"alpha", "beta", "papa", "sierra", "zulu", "zulu"};
    assertTrue(JU14.inAlphabeticalOrder(items));
    String [] outOfOrder = {"alpha", "beta", "papa", "papa", "foxtrot"};
    assertFalse(JU14.inAlphabeticalOrder(outOfOrder));
  }
  
  @Test
  public void test16WithoutF1()
  {
    assertEquals("apple", JU14.withoutF("fapplef"));
  }
  
  @Test
  public void test16WithoutF2()
  {
    assertEquals("gracehopper", JU14.withoutF("fgracehopper"));
  }
  
  @Test
  public void test16WithoutF3()
  {
    assertEquals("ada", JU14.withoutF("adaf"));
  }
  
  @Test
  public void test16WithoutF4()
  {
    assertEquals("freedom", JU14.withoutF("ffreedom"));
  }
  
  @Test
  public void test16WithoutF5()
  {
    assertEquals("respectof", JU14.withoutF("respectoff"));
  }
  
  @Test
  public void test16WithoutF6()
  {
    assertEquals("lovefood", JU14.withoutF("lovefood"));
    assertEquals("myfisharenotfood", JU14.withoutF("myfisharenotfood"));
  }

  @Test
  public void test17MergeTwoWords1()
  {
    assertEquals("axbycz", JU14.mergeTwoWords("abc", "xyz"));
  }

  @Test
  public void test17MergeTwoWords2()
  {
    assertEquals("appepblbelweatch",
      JU14.mergeTwoWords("applewatch", "pebble"));
  }

  @Test
  public void test17MergeTwoWords3()
  {
    assertEquals("thheywow", JU14.mergeTwoWords("th", "heywow"));
  }
  
  @Test
  public void test17MergeTwoWords4()
  {
    assertEquals("r1s2t3u4v5w6xyz", JU14.mergeTwoWords("rstuvwxyz", "123456"));
  }

  @Test
  public void test18InsertInOrder1()
  {
    String [] al = {"apple", "banana", "zebra", null};
    JU14.insertInOrder(al, "zztop");
    assertEquals("[apple, banana, zebra, zztop]", Arrays.toString(al));
  }

  @Test
  public void test18InsertInOrder2()
  {
    String [] al = {"apple", "banana", "mango", "peach", "tomato", null};
    JU14.insertInOrder(al, "egg");
    assertEquals("[apple, banana, egg, mango, peach, tomato]", Arrays.toString(al));
  }

  @Test
  public void test18InsertInOrder3()
  {
    String [] al = {"bear", "cub", "monster", "zebra", null};
    JU14.insertInOrder(al, "zip");
    assertEquals("[bear, cub, monster, zebra, zip]", Arrays.toString(al));
  }
  
  @Test
  public void test18InsertInOrder4()
  {
    String [] al = {"ardvaark", "bear", "cub", "monster", "panda", "zebra", null};
    JU14.insertInOrder(al, "baby");
    assertEquals("[ardvaark, baby, bear, cub, monster, panda, zebra]", Arrays.toString(al));
  }
  
  @Test
  public void test18InsertInOrder5()
  {
    String [] al = {"ardvaark", "bear", "cub", "monster", "panda", "zebra", null};
    JU14.insertInOrder(al, "baby");
    assertEquals("[ardvaark, baby, bear, cub, monster, panda, zebra]", Arrays.toString(al));
  }
  
  @Test
  public void test18InsertInOrder6()
  {
    String [] al = {"ardvaark", "bear", "cub", "monster", "panda", "zebra", null};
    JU14.insertInOrder(al, "crab");
    assertEquals("[ardvaark, bear, crab, cub, monster, panda, zebra]", Arrays.toString(al));
  }
  
  @Test
  public void test18InsertInOrder7()
  {
    String [] al = {"ardvaark", "bear", "cub", "monster", "panda", "zebra", null};
    JU14.insertInOrder(al, "racoon");
    assertEquals("[ardvaark, bear, cub, monster, panda, racoon, zebra]", Arrays.toString(al));
  }
}