/**
 * Make no changes to this file.
 * Do not submit this file to dropbox.
 * Press play on this file once, then you can press play in the other file
 * at any time.
 */
import static org.junit.Assert.*;
import org.junit.Test;

//Used to keep tests in order
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU03Test
{
  
  @Test
  public void test01Shout1()
  {
    assertEquals("Steve loves to shout the phrase \"Apple\"!", JU03.shout("Steve", "Apple"));
  }
  
  @Test
  public void test01Shout2()
  {
    assertEquals("Ellen loves to shout the phrase \"Games and Fun\"!", JU03.shout("Ellen", "Games and Fun"));
  }
  
  @Test
  public void test01Shout3()
  {
    assertEquals("SpongeBob loves to shout the phrase \"Patrick\"!", JU03.shout("SpongeBob", "Patrick"));
  }
  
  @Test
  public void test02GetFilePath1()
  {
    assertEquals("D:\\Downloads\\fred.txt", JU03.getFilePath("D", "Downloads", "fred.txt"));
  }
  
  @Test
  public void test02GetFilePath2()
  {
    assertEquals("C:\\Documents\\ace.mp3", JU03.getFilePath("C", "Documents", "ace.mp3"));
  }
  
  @Test
  public void test02GetFilePath3()
  {
    assertEquals("B:\\Videos\\math.mp4", JU03.getFilePath("B", "Videos", "math.mp4"));
  }
  
  @Test
  public void test03EpicSqrt1()
  {
    assertEquals("Square root of 25 is 5.0", JU03.epicSqrt(25));
    assertEquals("Square root of -25 is 5.0i", JU03.epicSqrt(-25));
  }
  
  @Test
  public void test03EpicSqrt2()
  {
    assertEquals("Square root of 9 is 3.0", JU03.epicSqrt(9));
    assertEquals("Square root of -9 is 3.0i", JU03.epicSqrt(-9));
  }
  
  @Test
  public void test03EpicSqrt3()
  {
    assertEquals("Square root of 100 is 10.0", JU03.epicSqrt(100));  
    assertEquals("Square root of -100 is 10.0i", JU03.epicSqrt(-100));  
  }
  
  @Test
  public void test04RoundToNearestOnesPlace1()
  {
    assertEquals("8.9 rounded to the nearest one's place is 9", JU03.roundToNearestOnesPlace(8.9));
  }
  
  @Test
  public void test04RoundToNearestOnesPlace2()
  {
    assertEquals("-8.9 rounded to the nearest one's place is -9", JU03.roundToNearestOnesPlace(-8.9));
  }
  
  @Test
  public void test04RoundToNearestOnesPlace3()
  {
    assertEquals("59.4 rounded to the nearest one's place is 59", JU03.roundToNearestOnesPlace(59.4));
  }
  
  @Test
  public void test04RoundToNearestOnesPlace4()
  {
    assertEquals("59.5 rounded to the nearest one's place is 60", JU03.roundToNearestOnesPlace(59.5));
  }
  
  @Test
  public void test04RoundToNearestOnesPlace5()
  {
    assertEquals("-59.5 rounded to the nearest one's place is -60", JU03.roundToNearestOnesPlace(-59.5));
  }
  
  @Test
  public void test04RoundToNearestOnesPlace6()
  {
    assertEquals("-8.5 rounded to the nearest one's place is -9", JU03.roundToNearestOnesPlace(-8.5));
  }
  
  @Test
  public void test05FirstTwoCharacters1()
  {
    assertEquals("gr", JU03.firstTwoCharacters("grace hopper"));
  }

  @Test
  public void test05FirstTwoCharacters2()
  {
    assertEquals("i#", JU03.firstTwoCharacters("i"));
  }
  
  @Test
  public void test05FirstTwoCharacters3()
  {
    assertEquals("su", JU03.firstTwoCharacters("supermanisop"));
  }
  
  @Test
  public void test05FirstTwoCharacters4()
  {
    assertEquals("##", JU03.firstTwoCharacters(""));
  }
  
  @Test
  public void test06NoFirstLetterConcat1()
  {
    assertEquals("raceopper", JU03.noFirstLetterConcat("Grace", "Hopper"));
  }
  
  @Test
  public void test06NoFirstLetterConcat2()
  {
    assertEquals("teveobs", JU03.noFirstLetterConcat("Steve", "Jobs"));
  }
  
  @Test
  public void test06NoFirstLetterConcat3()
  {
    assertEquals("haggyoo", JU03.noFirstLetterConcat("Shaggy", "Doo"));
  }
  
  @Test
  public void test07FindVowels1()
  {
    assertEquals(
      "The first position of a is 14.\nThe first position of e is 4.\nThe first position of i is 2.\nThe first position of o is 11.\nThe first position of u is 0.\n",
      JU03.findVowels("university of arizona"));
  }

  @Test
  public void test07FindVowels2()
  {
    assertEquals(
      "The first position of a is -1.\nThe first position of e is 6.\nThe first position of i is 11.\nThe first position of o is 1.\nThe first position of u is 4.\n",
      JU03.findVowels("computer science"));
  }

  @Test
  public void test07FindVowels3()
  {
    assertEquals(
      "The first position of a is 1.\nThe first position of e is 8.\nThe first position of i is -1.\nThe first position of o is 4.\nThe first position of u is -1.\n",
      JU03.findVowels("canyon del oro"));
  }
  
  @Test
  public void test08InAlphabeticalOrder1()
  {
    assertEquals("apple, peach, and zebra are in alphabetical order.", JU03.inAlphabeticalOrder("apple", "peach", "zebra"));
  }
  
  @Test
  public void test08InAlphabeticalOrder2()
  {
    assertEquals("pear, branch, and road are NOT in alphabetical order.", JU03.inAlphabeticalOrder("pear", "branch", "road"));
  }
  
  @Test
  public void test08InAlphabeticalOrder3()
  {
    assertEquals("horse, house, and hzzz are in alphabetical order.", JU03.inAlphabeticalOrder("horse", "house", "hzzz"));
  }
  
  @Test
  public void test08InAlphabeticalOrder4()
  {
    assertEquals("zoo, zip, and zzz are NOT in alphabetical order.", JU03.inAlphabeticalOrder("zoo", "zip", "zzz"));
  }
  
  @Test
  public void test09GetQuadraticRoots1()
  {
    assertEquals("The equation has two roots 0.5 and -3.0", JU03.getQuadraticRoots(2, 5, -3));  
  }
  
  @Test
  public void test09GetQuadraticRoots2()
  {
    assertEquals("The equation has one root -1.0", JU03.getQuadraticRoots(1, 2.0, 1));  
  }
  
  @Test
  public void test09GetQuadraticRoots3()
  {
    assertEquals("The equation has two roots 1.0 and -4.0", JU03.getQuadraticRoots(1, 3, -4));  
  }
  
  @Test
  public void test09GetQuadraticRoots4()
  {
    assertEquals("The equation has two roots 0.4 and 0.25", JU03.getQuadraticRoots(20, -13, 2));  
  }
  
  @Test
  public void test09GetQuadraticRoots5()
  {
    assertEquals("The equation has one root -2.0", JU03.getQuadraticRoots(2, 8, 8));  
  }
  
  @Test
  public void test09GetQuadraticRoots6()
  {
    assertEquals("The equation has one root 0.0", JU03.getQuadraticRoots(1, 0, 0));  
  }
  
  @Test
  public void test09GetQuadraticRoots7()
  {
    assertEquals("The equation has no real roots", JU03.getQuadraticRoots(1, 4, 5));  
  }
  
  @Test
  public void test09GetQuadraticRoots8()
  {
    assertEquals("The equation has no real roots", JU03.getQuadraticRoots(1, -3, 10));  
  }
  
}
