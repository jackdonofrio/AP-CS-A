
/**
 * Make no changes to this file.
 * Do not submit this file to the dropbox.
 * Press play on this file.
 * to run these tests..
 */
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.rules.Timeout;
//Used to keep tests in order
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU06Test
{
  
  @Rule
  public Timeout globalTimeout = Timeout.seconds(3);
  
  @Test
  public void test01getTriangleArea1()
  {
    assertEquals(10.0, JU06.getTriangleArea(5, 4), 0.01);
  }
  
  @Test
  public void test01getTriangleArea2()
  {
    assertEquals(7.5, JU06.getTriangleArea(3, 5), 0.01);
  }

  @Test
  public void test01getTriangleArea3()
  {
    assertEquals(31.5, JU06.getTriangleArea(9, 7), 0.01);
  }
  
  @Test
  public void test02RoundAP1()
  {
    assertEquals(9, JU06.roundAP(8.9), 0.1);
  }
  
  @Test
  public void test02RoundAP2()
  {
    assertEquals(-80, JU06.roundAP(-79.5), 0.1);
  }
  
  @Test
  public void test02RoundAP3()
  {
    assertEquals(80, JU06.roundAP(79.5), 0.1);
  }
  
  @Test
  public void test02RoundAP4()
  {
    assertEquals(4, JU06.roundAP(3.6), 0.1);
    assertEquals(-3, JU06.roundAP(-3.1), 0.1);
    assertEquals(-4, JU06.roundAP(-3.5), 0.1);
  }
  
  @Test
  public void test03roundAPHundredths1()
  {
    assertEquals(3.73, JU06.roundAPHundredths(3.7342453), 0.01);
  }
  
  @Test
  public void test03roundAPHundredths2()
  {
    assertEquals(3.74, JU06.roundAPHundredths(3.73544), 0.01);
  }
  
  @Test
  public void test03roundAPHundredths3()
  {
    assertEquals(4.0, JU06.roundAPHundredths(3.99544), 0.01);
  }
  
  @Test
  public void test03roundAPHundredths4()
  {
    assertEquals(-4.0, JU06.roundAPHundredths(-3.99544), 0.01);
  }
  
  @Test
  public void test03roundAPHundredths5()
  {
    assertEquals(-4.0, JU06.roundAPHundredths(-3.99444345), 0.01);
  }
  
  @Test
  public void test04compoundInterest1()
  {
    assertEquals("$5000.0 saved at 5.0% compounded 12\n" + 
      "times per year for 10.0 years is $8235.05", JU06.compoundInterest(5000, 5, 12, 10));
  }
  
  @Test
  public void test04compoundInterest2()
  {
    assertEquals("$2500.0 saved at 7.5% compounded 2\n" + 
      "times per year for 5.0 years is $3612.61", JU06.compoundInterest(2500, 7.5, 2, 5));
  }
  
  @Test
  public void test04compoundInterest3()
  {
    assertEquals("$3450.0 saved at 4.25% compounded 4\n" + 
      "times per year for 13.0 years is $5977.24", JU06.compoundInterest(3450, 4.25, 4, 13));
  }
  
  @Test
  public void test04compoundInterest4()
  {
    assertEquals("$1114.0 saved at 3.14% compounded 8\n" + 
      "times per year for 15.0 years is $1782.53", JU06.compoundInterest(1114, 3.14, 8, 15));
  }
  
  @Test
  public void test05IsMultipleOf5or7a()
  {
    assertTrue(JU06.isMultipleOf5or7(14));
    assertFalse(JU06.isMultipleOf5or7(13));
  }
  
  @Test
  public void test05IsMultipleOf5or7b()
  {
    assertTrue(JU06.isMultipleOf5or7(15));
    assertFalse(JU06.isMultipleOf5or7(13));
  }
  
  @Test
  public void test05IsMultipleOf5or7c()
  {
    assertTrue(JU06.isMultipleOf5or7(95));
    assertFalse(JU06.isMultipleOf5or7(43));
  }
  
  @Test
  public void test06numbersMult5or7a()
  {
    assertEquals("Answer:5,7,10,14,15,20,21,", JU06.numbersMult5or7(23));
  }
  
  @Test
  public void test06numbersMult5or7b()
  {
    assertEquals("Answer:5,7,10,14,15,20,21,25,28,30,35,", JU06.numbersMult5or7(35));
  }
  
  @Test
  public void test06numbersMult5or7c()
  {
    assertEquals("Answer:5,7,10,14,15,20,21,25,28,30,35,40,42,45,49,50,", JU06.numbersMult5or7(50));
  }
  
  @Test
  public void test06numbersMult5or7d()
  {
    assertEquals("Answer:5,7,10,", JU06.numbersMult5or7(13));
  }
  
  @Test
  public void test07SumOfTwoMakesThird1()
  {
    assertTrue(JU06.sumOfTwoMakesThird(1,  2,  3));
    assertFalse(JU06.sumOfTwoMakesThird(1,  2,  10));
  }
  
  @Test
  public void test07SumOfTwoMakesThird2()
  {
    assertTrue(JU06.sumOfTwoMakesThird(3,  1,  2));
    assertFalse(JU06.sumOfTwoMakesThird(5,  2,  4));
  }
  
  @Test
  public void test07SumOfTwoMakesThird3()
  {
    assertTrue(JU06.sumOfTwoMakesThird(3,  5,  2));
    assertFalse(JU06.sumOfTwoMakesThird(10,  10,  10));
  }
  
  @Test
  public void test08ApproxEqual1()
  {
    assertTrue(JU06.approxEqual(3.004, 3.009));
    assertFalse(JU06.approxEqual(3.2, 3.3));
  }
  
  @Test
  public void test09ApproxEqual2()
  {
    assertTrue(JU06.approxEqual(8.02, 8.019));
    assertFalse(JU06.approxEqual(8.02, 8.05));
  }
  
  @Test
  public void test09ApproxEqual3()
  {
    assertTrue(JU06.approxEqual(-5.344, -5.342));
    assertFalse(JU06.approxEqual(-5.344, -5.9));
  }
  
  @Test
  public void test10ApproxEqual4()
  {
    assertTrue(JU06.approxEqual(8.051, 8.049));
    assertFalse(JU06.approxEqual(-5.344, -5.9));
  }
  
  @Test
  public void test11funnySum1()
  {
    assertEquals(24, JU06.funnySum(4, 4), 0.01);
  }
  
  @Test
  public void test11funnySum2()
  {
    assertEquals(9, JU06.funnySum(4, 5), 0.01);
    assertEquals(21.3734, JU06.funnySum(8.832, 12.5414), 0.01);
  }
  
  @Test
  public void test11funnySum3()
  {
    assertEquals(30.11969, JU06.funnySum(5.02, 5.0199), 0.01);
  }
  
  @Test
  public void test11funnySum4()
  {
    assertEquals(82.71303, JU06.funnySum(13.7821, 13.78891), 0.01);
  }
  
  @Test
  public void test12celsiusToFahrenheit1()
  {
    assertEquals(0, JU06.fahrenheitToCelsius(32.0), 0.0001);
  }
  
  @Test
  public void test12celsiusToFahrenheit2()
  {
    assertEquals(100, JU06.fahrenheitToCelsius(212), 0.0001);
  }
  
  @Test
  public void test12celsiusToFahrenheit3()
  {
    assertEquals(-5.38888, JU06.fahrenheitToCelsius(22.3), 0.0001);
  }
  
  @Test
  public void test12celsiusToFahrenheit4()
  {
    assertEquals(-41.8816666, JU06.fahrenheitToCelsius(-43.387), 0.0001);
  }
  
  @Test
  public void test13getCelsiusTemps1()
  {
    assertEquals("Fahrenheit Celsius\n" + 
      "------------------\n" + 
      "32      0.0\n" + 
      "------------------", JU06.getCelsiusTemps(32, 32, 1));
  }
  
  @Test
  public void test13getCelsiusTemps2()
  {
    assertEquals("Fahrenheit Celsius\n" + 
      "------------------\n" + 
      "32      0.0\n" + 
      "33      0.56\n" + 
      "34      1.11\n" + 
      "35      1.67\n" + 
      "------------------", JU06.getCelsiusTemps(32, 35, 1));
  }
  
  @Test
  public void test13getFahrTemps3()
  {
    assertEquals("Fahrenheit Celsius\n" + 
      "------------------\n" + 
      "30      -1.11\n" + 
      "31      -0.56\n" + 
      "32      0.0\n" + 
      "33      0.56\n" + 
      "34      1.11\n" + 
      "------------------", JU06.getCelsiusTemps(30, 34, 1));
  }
  
  @Test
  public void test13getFahrTemps4()
  {
    assertEquals("Fahrenheit Celsius\n" + 
      "------------------\n" + 
      "0      -17.78\n" + 
      "10      -12.22\n" + 
      "20      -6.67\n" + 
      "30      -1.11\n" + 
      "40      4.44\n" + 
      "50      10.0\n" + 
      "60      15.56\n" + 
      "70      21.11\n" + 
      "80      26.67\n" + 
      "90      32.22\n" + 
      "------------------", JU06.getCelsiusTemps(0, 90, 10));
  }
  
  @Test
  public void test13getFahrTemps5()
  {
    assertEquals("Fahrenheit Celsius\n" + 
      "------------------\n" + 
      "-30      -34.44\n" + 
      "-26      -32.22\n" + 
      "-22      -30.0\n" + 
      "-18      -27.78\n" + 
      "-14      -25.56\n" + 
      "-10      -23.33\n" + 
      "-6      -21.11\n" + 
      "-2      -18.89\n" + 
      "2      -16.67\n" + 
      "6      -14.44\n" + 
      "10      -12.22\n" + 
      "14      -10.0\n" + 
      "18      -7.78\n" + 
      "22      -5.56\n" + 
      "26      -3.33\n" + 
      "30      -1.11\n" + 
      "34      1.11\n" + 
      "38      3.33\n" + 
      "42      5.56\n" + 
      "46      7.78\n" + 
      "50      10.0\n" + 
      "------------------", JU06.getCelsiusTemps(-30, 50, 4));
  }
}
