/**
 * Make no changes to this file.
 * Do not submit this file to the dropbox.
 * Press play on this file.
 * to run these tests..
 */
import static org.junit.Assert.*;
import org.junit.Test;

//Used to keep tests in order
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU04Test
{
  
  @Test
  public void test01DisplayStarsOnOneLine1()
  {
    assertEquals("***", JU04.displayStarsOnOneLine(3));
  }
  @Test
  public void test01DisplayStarsOnOneLine2()
  {
    assertEquals("************", JU04.displayStarsOnOneLine(12));
  }
  
  @Test
  public void test01DisplayStarsOnOneLine3()
  {
    assertEquals("*****", JU04.displayStarsOnOneLine(5));
  }
  
  @Test
  public void test01DisplayStarsOnOneLine4()
  {
    assertEquals("****", JU04.displayStarsOnOneLine(4));
  }
  
  @Test
  public void test02DisplayStarsOnSeparateLines1()
  {
    assertEquals("*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "", JU04.displayStarsOnSeparateLines(4));
  }
  
  @Test
  public void test02DisplayStarsOnSeparateLines2()
  {
    assertEquals("*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "*\n" + 
        "", JU04.displayStarsOnSeparateLines(20));
  }
  

  
  @Test
  public void test03SimpleLoop1()
  {
    assertEquals("1,2,3,4,", JU04.simpleLoop(4));
  }
  
  @Test
  public void test03SimpleLoop2()
  {
    assertEquals("1,2,3,4,5,6,7,8,9,10,", JU04.simpleLoop(10));
  }
  
  @Test
  public void test03SimpleLoop3()
  {
    assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,", JU04.simpleLoop(32));
  }
  
  
  
  @Test
  public void test04SimpleLoopWordWrap1()
  {
    assertEquals("1,2,3,4,5,\n" + 
      "6,7,8,9,10,\n" + 
      "", JU04.simpleLoopWordWrap(10, 5));
  }
  
  @Test
  public void test04SimpleLoopWordWrap2()
  {
    assertEquals("1,2,3,\n" + 
      "4,5,6,\n" + 
      "7,8,9,\n" + 
      "10,", JU04.simpleLoopWordWrap(10, 3));
  }
  
  @Test
  public void test04SimpleLoopWordWrap3()
  {
    assertEquals("1,2,3,4,\n" + 
      "5,6,7,8,\n" + 
      "9,10,11,12,\n" + 
      "13,14,15,16,\n" + 
      "17,18,19,20,\n" + 
      "21,22,23,24,\n" + 
      "25,", JU04.simpleLoopWordWrap(25, 4));
  }
  @Test
  public void test04SimpleLoopWordWrap4()
  {
    assertEquals("1,2,3,4,5,6,7,8,9,\n" + 
      "10,11,12,13,14,15,16,17,18,\n" + 
      "19,20,21,22,23,24,25,26,27,\n" + 
      "28,29,30,31,32,33,34,", JU04.simpleLoopWordWrap(34, 9));
  }
  
  @Test
  public void test05CountUp1()
  {
    assertEquals("Starting counting at 1,2,3,4,5,and we are done!", JU04.countUpTo(5));
  }
  
  @Test
  public void test05CountUp2()
  {
    assertEquals("Starting counting at 1,2,3,4,5,6,7,8,9,10,11,12,13,and we are done!", JU04.countUpTo(13));
  }
  
  @Test
  public void test05CountUp3()
  {
    assertEquals("Starting counting at 1,2,3,4,5,6,7,8,and we are done!", JU04.countUpTo(8));
  }
  
  @Test
  public void test05CountUp4()
  {
    assertEquals("Starting counting at 1,2,3,4,5,6,7,and we are done!", JU04.countUpTo(7));
  }

  
  @Test
  public void test06CountDownBrackets1()
  {
    assertEquals("[9] [7] [5] [3] [1] ", JU04.countDownBrackets(9));
  }
  
  @Test
  public void test06CountDownBrackets2()
  {
    assertEquals("[18] [16] [14] [12] [10] [8] [6] [4] [2] [0] ", JU04.countDownBrackets(18));
    assertEquals("[5] [3] [1] ", JU04.countDownBrackets(5));
  }
  
  @Test
  public void test07DivisibleBy1()
  {
    assertEquals("1 [2] 3 [4] 5 [6] 7 [8] 9 [10] ", JU04.divisibleBy(2, 10));
  }
  
  @Test
  public void test07DivisibleBy2()
  {
    assertEquals("1 2 [3] 4 5 [6] 7 8 [9] 10 11 [12] 13 14 [15] 16 ", JU04.divisibleBy(3, 16));
  }
  
  @Test
  public void test07DivisibleBy3()
  {
    assertEquals("1 2 [3] 4 5 [6] 7 8 [9] 10 11 [12] 13 14 [15] 16 17 [18] 19 ", JU04.divisibleBy(3, 19));
    assertEquals("1 2 3 4 [5] 6 7 8 9 [10] 11 12 13 14 [15] 16 17 18 19 [20] 21 22 23 24 [25] ", JU04.divisibleBy(5, 25));
  }
  
  @Test
  public void test07DivisibleBy4()
  {
    assertEquals("1 2 [3] 4 5 [6] 7 8 [9] 10 11 [12] 13 14 [15] 16 17 [18] 19 ", JU04.divisibleBy(3, 19));
    assertEquals("1 2 3 4 [5] 6 7 8 9 [10] 11 12 13 14 [15] 16 17 18 19 [20] 21 22 23 24 [25] ", JU04.divisibleBy(5, 25));
  }
  
  @Test
  public void test08NumbersThatAreDivisibleByFiveOrSixButNotBoth1()
  {
    assertEquals("10,12,15,18,20,", JU04.numbersThatAreDivisibleByFiveOrSixButNotBoth(10, 21));
  }
  
  @Test
  public void test08NumbersThatAreDivisibleByFiveOrSixButNotBoth2()
  {
    assertEquals("24,25,35,36,40,", JU04.numbersThatAreDivisibleByFiveOrSixButNotBoth(23, 41));
  }
  
  @Test
  public void test08NumbersThatAreDivisibleByFiveOrSixButNotBoth3()
  {
    assertEquals("50,54,55,65,66,70,72,75,78,80\n" + 
      "84,85,95,96,100,", JU04.numbersThatAreDivisibleByFiveOrSixButNotBoth(50, 100));
  }
  
  @Test
  public void test08NumbersThatAreDivisibleByFiveOrSixButNotBoth4()
  {
    assertEquals("75,78,80,84,85,95,96,100,102,105\n" + 
      "108,110,114,115,125,126,130,132,135,138\n" + 
      "140,144,145,155,156,160,162,165,168,170\n" + 
      "174,175,185,186,190,192,195,198,200,204\n" + 
      "205,215,216,220,222,225,228,230,234,235\n" + 
      "245,246,250,252,255,258,260,264,265,275\n" + 
      "276,280,282,285,288,290,294,295,", JU04.numbersThatAreDivisibleByFiveOrSixButNotBoth(73, 300));
  }
  
  @Test
  public void test09SimpleLoopNoTrailingComma1()
  {
    assertEquals("1,2,3,4", JU04.simpleLoopNoTrailingComma(4));
  }
  
  @Test
  public void test09SimpleLoopNoTrailingComma2()
  {
    assertEquals("1,2,3,4,5,6,7,8,9,10", JU04.simpleLoopNoTrailingComma(10));
    assertEquals("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32", JU04.simpleLoopNoTrailingComma(32));
  }
  
  @Test
  public void test10NasaCountDown1()
  {
    String actual = JU04.nasaCountDown(6);
    assertEquals("T-Minus 6 seconds:6...5...4...3...2...1...BLAST OFF", actual);
  }
  
  @Test
  public void test10NasaCountDown2()
  {
    String actual = JU04.nasaCountDown(10);
    assertEquals("T-Minus 10 seconds:10...9...8...7...6...5...4...3...2...1...BLAST OFF", actual);
  }
  
  @Test
  public void test11SumThemUp1()
  {
    assertEquals("1 + 2 = 3", JU04.sumThemUp(1, 2));
  }
  
  @Test
  public void test11SumThemUp2()
  {
    assertEquals("2 = 2", JU04.sumThemUp(2, 2));
  }
  
  @Test
  public void test11SumThemUp3()
  {
    assertEquals("2 + 3 + 4 + 5 = 14", JU04.sumThemUp(2, 5));
  }
  
  @Test
  public void test11SumThemUp4()
  {
    assertEquals("7 + 8 + 9 + 10 + 11 + 12 + 13 = 70", JU04.sumThemUp(7, 13));
  }
  
  @Test
  public void test12BuildTChart1()
  {
    assertEquals("-----------------\n" + 
        "x | f(x) = 3x + 2\n" + 
        "-----------------\n" + 
        "3   11\n" + 
        "4   14\n" + 
        "5   17\n" + 
        "6   20\n" + 
        "7   23\n" + 
        "8   26\n" + 
        "-----------------\n" + 
        "", JU04.buildTChart(3, 8));
  }
  
  @Test
  public void test12BuildTChart2()
  {
    assertEquals("-----------------\n" + 
        "x | f(x) = 3x + 2\n" + 
        "-----------------\n" + 
        "5   17\n" + 
        "6   20\n" + 
        "7   23\n" + 
        "8   26\n" + 
        "9   29\n" + 
        "10   32\n" + 
        "11   35\n" + 
        "-----------------\n" + 
        "", JU04.buildTChart(5, 11));
  }
  
  @Test
  public void test12BuildTChart3()
  {
    assertEquals("-----------------\n" + 
        "x | f(x) = 3x + 2\n" + 
        "-----------------\n" + 
        "-5   -13\n" + 
        "-4   -10\n" + 
        "-3   -7\n" + 
        "-2   -4\n" + 
        "-1   -1\n" + 
        "0   2\n" + 
        "1   5\n" + 
        "2   8\n" + 
        "3   11\n" + 
        "4   14\n" + 
        "5   17\n" + 
        "-----------------\n" + 
        "", JU04.buildTChart(-5, 5));
  }
  
  @Test
  public void test12BuildTChart4()
  {
    assertEquals("-----------------\n" + 
        "x | f(x) = 3x + 2\n" + 
        "-----------------\n" + 
        "0   2\n" + 
        "1   5\n" + 
        "2   8\n" + 
        "3   11\n" + 
        "-----------------\n" + 
        "", JU04.buildTChart(0, 3));
  }
  

  @Test
  public void test13BuildSqrtTChart1()
  {
    assertEquals("---------------------------\n" + 
        "x | f(x) = Square root of x\n" + 
        "---------------------------\n" + 
        "9000   95\n" + 
        "10000   100\n" + 
        "---------------------------\n" + 
        "", JU04.buildSqrtTChart(9000, 10000));
  }
  
  @Test
  public void test13BuildSqrtTChart2()
  {
    assertEquals("---------------------------\n" + 
        "x | f(x) = Square root of x\n" + 
        "---------------------------\n" + 
        "1000   32\n" + 
        "2000   45\n" + 
        "3000   55\n" + 
        "4000   63\n" + 
        "5000   71\n" + 
        "6000   77\n" + 
        "7000   84\n" + 
        "---------------------------\n" + 
        "", JU04.buildSqrtTChart(1000, 7000));
  }
  
  @Test
  public void test13BuildSqrtTChart3()
  {
    assertEquals("---------------------------\n" + 
        "x | f(x) = Square root of x\n" + 
        "---------------------------\n" + 
        "-5000   71i\n" + 
        "-4000   63i\n" + 
        "-3000   55i\n" + 
        "-2000   45i\n" + 
        "-1000   32i\n" + 
        "0   0\n" + 
        "1000   32\n" + 
        "2000   45\n" + 
        "3000   55\n" + 
        "---------------------------\n" + 
        "", JU04.buildSqrtTChart(-5000, 3000));
  }
  
  @Test
  public void test13BuildSqrtTChart4()
  {
    assertEquals("---------------------------\n" + 
        "x | f(x) = Square root of x\n" + 
        "---------------------------\n" + 
        "-3000   55i\n" + 
        "-2000   45i\n" + 
        "-1000   32i\n" + 
        "0   0\n" + 
        "1000   32\n" + 
        "2000   45\n" + 
        "3000   55\n" + 
        "4000   63\n" + 
        "5000   71\n" + 
        "6000   77\n" + 
        "---------------------------\n" + 
        "", JU04.buildSqrtTChart(-3000, 6000));
  }
  
  @Test
  public void test14FavoriteGame1()
  {
    String actual = JU04.favoriteGame("Sorry", 4);
    assertEquals(
        "My favorite game is \"Sorry\", \"Sorry\", \"Sorry\", \"Sorry\"!",
        actual);
  }
  
  @Test
  public void test14FavoriteGame2()
  {
    String actual = JU04.favoriteGame("Chess", 3);
    assertEquals(
        "My favorite game is \"Chess\", \"Chess\", \"Chess\"!",
        actual);
  }
  
  @Test
  public void test15Tardies1()
  {
    assertEquals("4th tardy\n" + 
      "5th tardy\n" + 
      "6th tardy\n" + 
      "7th tardy\n" + 
      "", JU04.tardies(4,7));
  }
  
  @Test
  public void test15Tardies2()
  {
    assertEquals("1st tardy\n" + 
      "2nd tardy\n" + 
      "3rd tardy\n" + 
      "", JU04.tardies(1,3));
  }
  
  @Test
  public void test15Tardies3()
  {
    assertEquals("9th tardy\n" + 
      "10th tardy\n" + 
      "11th tardy\n" + 
      "12th tardy\n" + 
      "13th tardy\n" + 
      "14th tardy\n" + 
      "15th tardy\n" + 
      "", JU04.tardies(9,15));
    
    assertEquals("178th tardy\n" + 
      "179th tardy\n" + 
      "180th tardy\n" + 
      "181st tardy\n" + 
      "182nd tardy\n" + 
      "183rd tardy\n" + 
      "184th tardy\n" + 
      "185th tardy\n" + 
      "186th tardy\n" + 
      "187th tardy\n" + 
      "188th tardy\n" + 
      "189th tardy\n" + 
      "190th tardy\n" + 
      "191st tardy\n" + 
      "", JU04.tardies(178,191));
  }
  
  @Test
  public void test15Tardies4()
  {
    assertEquals("8th tardy\n" + 
      "9th tardy\n" + 
      "10th tardy\n" + 
      "11th tardy\n" + 
      "12th tardy\n" + 
      "13th tardy\n" + 
      "14th tardy\n" + 
      "15th tardy\n" + 
      "16th tardy\n" + 
      "17th tardy\n" + 
      "18th tardy\n" + 
      "19th tardy\n" + 
      "20th tardy\n" + 
      "21st tardy\n" + 
      "22nd tardy\n" + 
      "23rd tardy\n" + 
      "", JU04.tardies(8,23));
    
    assertEquals("212th tardy\n" + 
      "213th tardy\n" + 
      "214th tardy\n" + 
      "215th tardy\n" + 
      "216th tardy\n" + 
      "217th tardy\n" + 
      "218th tardy\n" + 
      "219th tardy\n" + 
      "220th tardy\n" + 
      "221st tardy\n" + 
      "222nd tardy\n" + 
      "223rd tardy\n" + 
      "224th tardy\n" + 
      "225th tardy\n" + 
      "226th tardy\n" + 
      "227th tardy\n" + 
      "228th tardy\n" + 
      "229th tardy\n" + 
      "230th tardy\n" + 
      "231st tardy\n" + 
      "232nd tardy\n" + 
      "233rd tardy\n" + 
      "234th tardy\n" + 
      "", JU04.tardies(212,234));
  }
  
  @Test
  public void test15Tardies5()
  {
    assertEquals("199th tardy\n" + 
      "200th tardy\n" + 
      "201st tardy\n" + 
      "202nd tardy\n" + 
      "203rd tardy\n" + 
      "204th tardy\n" + 
      "205th tardy\n" + 
      "206th tardy\n" + 
      "207th tardy\n" + 
      "208th tardy\n" + 
      "209th tardy\n" + 
      "210th tardy\n" + 
      "211th tardy\n" + 
      "212th tardy\n" + 
      "213th tardy\n" + 
      "214th tardy\n" + 
      "215th tardy\n" + 
      "216th tardy\n" + 
      "217th tardy\n" + 
      "218th tardy\n" + 
      "219th tardy\n" + 
      "220th tardy\n" + 
      "221st tardy\n" + 
      "", JU04.tardies(199, 221));
  }
  
  @Test
  public void test15Tardies6()
  {
    assertEquals("948th tardy\n" + 
      "949th tardy\n" + 
      "950th tardy\n" + 
      "951st tardy\n" + 
      "952nd tardy\n" + 
      "953rd tardy\n" + 
      "954th tardy\n" + 
      "955th tardy\n" + 
      "956th tardy\n" + 
      "957th tardy\n" + 
      "958th tardy\n" + 
      "959th tardy\n" + 
      "960th tardy\n" + 
      "", JU04.tardies(948, 960));
  }
  
}
