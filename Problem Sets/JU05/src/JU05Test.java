
/**
 * Make no changes to this file.
 * Do not submit this file to the dropbox.
 * Press play on this file.
 * to run these tests.
 * @version 2.0
 */
import static org.junit.Assert.*;
import org.junit.Test;
//Needed to protect against infinite loops.
import org.junit.rules.Timeout;
import org.junit.Rule;
//Used to keep tests in order
import org.junit.FixMethodOrder;

import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU05Test
{
  //Snazzy new feature of Junit that
  //guards against students who write
  //infinite loops to solve problems.
  @Rule
  public Timeout globalTimeout = Timeout.seconds(2);

  @Test
  public void test01DisplayStarsOnOneLine1()
  {
    assertEquals("************", JU05.displayStarsOnOneLine(12));
    assertEquals("****", JU05.displayStarsOnOneLine(4));
  }

  @Test
  public void test02SimpleLoop()
  {
    assertEquals("[1,2,3,4]", JU05.simpleLoop(4));
    assertEquals("[1,2,3,4,5,6,7,8,9,10]", JU05.simpleLoop(10));
    assertEquals(
      "[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32]",
      JU05.simpleLoop(32));
  }

  @Test
  public void test03BasicCountUpBy7s1()
  {
    assertEquals("[71421]", JU05.basicCountUpBy7s(21));
    assertEquals("[714]", JU05.basicCountUpBy7s(20));
  }

  @Test
  public void test03BasicCountUpBy7s2()
  {
    assertEquals("[714212835424956637077849198]", JU05.basicCountUpBy7s(100));
    assertEquals(
      "[714212835424956637077849198105112119126133140147154161168175182189196]",
      JU05.basicCountUpBy7s(200));
  }

  @Test
  public void test04FlexibleLoop1()
  {
    assertEquals("[5,6,7,8,]", JU05.flexibleLoop(5, 8, 1));
  }

  @Test
  public void test04FlexibleLoop2()
  {
    assertEquals("[3,5,7,9,11,]", JU05.flexibleLoop(3, 12, 2));
  }

  @Test
  public void test04FlexibleLoop3()
  {
    assertEquals("[9,8,7,6,5,4,3,2,1,0,-1,-2,-3,]",
      JU05.flexibleLoop(9, -3, -1));
  }

  @Test
  public void test04FlexibleLoop4()
  {
    assertEquals("[10,7,4,1,]", JU05.flexibleLoop(10, 0, -3));
  }

  @Test
  public void test04FlexibleLoop5()
  {
    assertEquals("[-8,-3,2,7,12,17,22,27,32,]", JU05.flexibleLoop(-8, 34, 5));
  }

  @Test
  public void test04FlexibleLoop6()
  {
    assertEquals("[50,42,34,26,18,10,2,-6,-14,-22,-30,-38,]",
      JU05.flexibleLoop(50, -45, -8));
  }

  @Test
  public void test05DivisibleBy1()
  {
    assertEquals("1 2 [3] 4 5 [6] 7 8 [9] 10 11 [12] 13 14 [15] 16 ",
      JU05.divisibleBy(3, 16));
    assertEquals("1 2 [3] 4 5 [6] 7 8 [9] 10 11 [12] 13 14 [15] 16 17 [18] 19 ",
      JU05.divisibleBy(3, 19));
    assertEquals(
      "1 2 3 4 [5] 6 7 8 9 [10] 11 12 13 14 [15] 16 17 18 19 [20] 21 22 23 24 [25] ",
      JU05.divisibleBy(5, 25));
  }

  @Test
  public void test06NasaCountDown1()
  {
    String actual1 = JU05.nasaCountDown(6);
    assertEquals("T-Minus 6 seconds:6...5...4...3...2...1...BLAST OFF",
      actual1);
    String actual2 = JU05.nasaCountDown(10);
    assertEquals(
      "T-Minus 10 seconds:10...9...8...7...6...5...4...3...2...1...BLAST OFF",
      actual2);

  }

  @Test
  public void test07SumThemUp4()
  {
    assertEquals("2 + 3 + 4 + 5 = 14", JU05.sumThemUp(2, 5));
    assertEquals("7 + 8 + 9 + 10 + 11 + 12 + 13 = 70", JU05.sumThemUp(7, 13));
  }

  @Test
  public void test08BuildTChart3()
  {
    assertEquals("-----------------\n" + "x | f(x) = 3x + 2\n"
      + "-----------------\n" + "-5   -13\n" + "-4   -10\n" + "-3   -7\n"
      + "-2   -4\n" + "-1   -1\n" + "0   2\n" + "1   5\n" + "2   8\n"
      + "3   11\n" + "4   14\n" + "5   17\n" + "-----------------\n" + "",
      JU05.buildTChart(-5, 5));
  }

  @Test
  public void test08BuildTChart4()
  {
    assertEquals("-----------------\n" + "x | f(x) = 3x + 2\n"
      + "-----------------\n" + "0   2\n" + "1   5\n" + "2   8\n" + "3   11\n"
      + "-----------------\n" + "", JU05.buildTChart(0, 3));
  }

  @Test
  public void test09BuildGridOfStars1()
  {
    assertEquals("*\n", JU05.buildGridOfStars(1, 1));
  }

  @Test
  public void test09BuildGridOfStars2()
  {
    assertEquals("**********\n", JU05.buildGridOfStars(1, 10));
  }

  @Test
  public void test09BuildGridOfStars3()
  {
    assertEquals("**********\n" + "**********\n" + "",
      JU05.buildGridOfStars(2, 10));
  }

  @Test
  public void test09BuildGridOfStars4()
  {
    assertEquals("*****\n" + "*****\n" + "*****\n" + "",
      JU05.buildGridOfStars(3, 5));
  }

  @Test
  public void test09BuildGridOfStars5()
  {
    assertEquals(
      "******\n" + "******\n" + "******\n" + "******\n" + "******\n"
        + "******\n" + "******\n" + "******\n" + "******\n" + "******\n" + "",
      JU05.buildGridOfStars(10, 6));
  }

  @Test
  public void test09BuildGridOfStars6()
  {
    assertEquals("***************\n" + "***************\n" + "***************\n"
      + "***************\n" + "***************\n" + "***************\n"
      + "***************\n" + "***************\n" + "***************\n"
      + "***************\n" + "***************\n" + "***************\n"
      + "***************\n" + "", JU05.buildGridOfStars(13, 15));
  }

  @Test
  public void test10UglyTimesTable1()
  {
    assertEquals("1 2 3 4 5 6 7 \n" + "2 4 6 8 10 12 14 \n"
      + "3 6 9 12 15 18 21 \n" + "4 8 12 16 20 24 28 \n" + "",
      JU05.uglyTimesTable(4, 7));
  }

  @Test
  public void test10UglyTimesTable2()
  {
    assertEquals(
      "1 2 3 4 5 6 7 8 \n" + "2 4 6 8 10 12 14 16 \n"
        + "3 6 9 12 15 18 21 24 \n" + "4 8 12 16 20 24 28 32 \n"
        + "5 10 15 20 25 30 35 40 \n" + "6 12 18 24 30 36 42 48 \n"
        + "7 14 21 28 35 42 49 56 \n" + "8 16 24 32 40 48 56 64 \n"
        + "9 18 27 36 45 54 63 72 \n" + "10 20 30 40 50 60 70 80 \n" + "",
      JU05.uglyTimesTable(10, 8));
  }

  @Test
  public void test10UglyTimesTable3()
  {
    assertEquals(
      "1 2 3 4 5 6 7 8 \n" + "2 4 6 8 10 12 14 16 \n"
        + "3 6 9 12 15 18 21 24 \n" + "4 8 12 16 20 24 28 32 \n" + "",
      JU05.uglyTimesTable(4, 8));
  }

  @Test
  public void test11BuildRightJustified1()
  {
    assertEquals("...................*", JU05.buildRightJustified(1));
  }

  @Test
  public void test11BuildRightJustified2()
  {
    assertEquals("..................**", JU05.buildRightJustified(2));
  }

  @Test
  public void test11BuildRightJustified3()
  {
    assertEquals("............********", JU05.buildRightJustified(8));
  }

  @Test
  public void test12BuildRightJustified4()
  {
    assertEquals(".......*************", JU05.buildRightJustified(13));
    assertEquals(".....***************", JU05.buildRightJustified(15));
    assertEquals(".*******************", JU05.buildRightJustified(19));
  }

  @Test
  public void test13NumberStairs1()
  {
    assertEquals("&\n", JU05.buildStairs(1, "&"));
  }

  @Test
  public void test13NumberStairs2()
  {
    assertEquals(" @\n" + "@@\n" + "", JU05.buildStairs(2, "@"));
  }

  @Test
  public void test13NumberStairs3()
  {
    assertEquals("  ^\n" + " ^^\n" + "^^^\n" + "", JU05.buildStairs(3, "^"));
  }

  @Test
  public void test13NumberStairs4()
  {
    assertEquals(
      "       %\n" + "      %%\n" + "     %%%\n" + "    %%%%\n" + "   %%%%%\n"
        + "  %%%%%%\n" + " %%%%%%%\n" + "%%%%%%%%\n" + "",
      JU05.buildStairs(8, "%"));
  }

  @Test
  public void test13NumberStairs5()
  {
    assertEquals("            $\n" + "           $$\n" + "          $$$\n"
      + "         $$$$\n" + "        $$$$$\n" + "       $$$$$$\n"
      + "      $$$$$$$\n" + "     $$$$$$$$\n" + "    $$$$$$$$$\n"
      + "   $$$$$$$$$$\n" + "  $$$$$$$$$$$\n" + " $$$$$$$$$$$$\n"
      + "$$$$$$$$$$$$$\n" + "", JU05.buildStairs(13, "$"));
  }

  @Test
  public void test14BuildNumberMountain1()
  {
    assertEquals("1 \n", JU05.buildNumberMountain(1));
  }

  @Test
  public void test14BuildNumberMountain2()
  {
    assertEquals("1 \n" + "2 3 \n" + "", JU05.buildNumberMountain(2));
  }

  @Test
  public void test14BuildNumberMountain3()
  {
    assertEquals("1 \n" + "2 3 \n" + "4 5 6 \n" + "",
      JU05.buildNumberMountain(3));
  }

  @Test
  public void test14BuildNumberMountain4()
  {
    assertEquals(
      "1 \n" + "2 3 \n" + "4 5 6 \n" + "7 8 9 10 \n" + "11 12 13 14 15 \n"
        + "16 17 18 19 20 21 \n" + "22 23 24 25 26 27 28 \n"
        + "29 30 31 32 33 34 35 36 \n" + "37 38 39 40 41 42 43 44 45 \n"
        + "46 47 48 49 50 51 52 53 54 55 \n" + "",
      JU05.buildNumberMountain(10));
  }

  @Test
  public void test14BuildNumberMountain5()
  {
    assertEquals(
      "1 \n" + "2 3 \n" + "4 5 6 \n" + "7 8 9 10 \n" + "11 12 13 14 15 \n"
        + "16 17 18 19 20 21 \n" + "22 23 24 25 26 27 28 \n"
        + "29 30 31 32 33 34 35 36 \n" + "37 38 39 40 41 42 43 44 45 \n"
        + "46 47 48 49 50 51 52 53 54 55 \n"
        + "56 57 58 59 60 61 62 63 64 65 66 \n"
        + "67 68 69 70 71 72 73 74 75 76 77 78 \n"
        + "79 80 81 82 83 84 85 86 87 88 89 90 91 \n"
        + "92 93 94 95 96 97 98 99 100 101 102 103 104 105 \n"
        + "106 107 108 109 110 111 112 113 114 115 116 117 118 119 120 \n" + "",
      JU05.buildNumberMountain(15));
  }

}
