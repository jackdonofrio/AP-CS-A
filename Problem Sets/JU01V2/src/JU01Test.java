/**
 * Hello.  You will press play on this file once, then 
 * you can press PLAY on the JU01.java file anytime after that.
 * You may look at the test cases below, but do not change them.
 * DO NOT TURN THIS FILE IN.  SUBMIT JU01.java to the dropbox.
 * 
 * @Version 4.0 WindChill tests fixed
 */
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU01Test
{
  @Test
  public void test00SquareArea1()
  {
    assertEquals("A square with side length 5.0 has area of 25.0",
      JU01.squareArea(5));
  }

  @Test
  public void test00SquareArea2()
  {
    assertEquals("A square with side length 10.0 has area of 100.0",
      JU01.squareArea(10));
  }

  @Test
  public void test00SquareArea3()
  {
    assertEquals("A square with side length 4.0 has area of 16.0",
      JU01.squareArea(4));
  }

  @Test
  public void test01ComputeAverage1()
  {
    assertEquals("The average of 1.0 2.0 3.0 is 2.0",
      JU01.computeAverage(1, 2, 3));
  }

  @Test
  public void test01ComputeAverage2()
  {
    assertEquals("The average of 10.5 11.0 11.5 is 11.0",
      JU01.computeAverage(10.5, 11, 11.5));
  }

  @Test
  public void test01ComputeAverage3()
  {
    assertEquals("The average of 100.0 80.0 90.0 is 90.0",
      JU01.computeAverage(100, 80, 90));
  }

  @Test
  public void test02ComputeCircleArea1()
  {
    assertEquals("The area for the circle of radius 10.0 is 314.159",
      JU01.computeCircleArea(10));

  }

  @Test
  public void test02ComputeCircleArea2()
  {
    assertEquals("The area for the circle of radius 5.0 is 78.53975",
      JU01.computeCircleArea(5));
  }

  @Test
  public void test02ComputeCircleArea3()
  {
    assertEquals("The area for the circle of radius 2.0 is 12.56636",
      JU01.computeCircleArea(2));
  }

  @Test
  public void test03DisplayTime1()
  {
    assertEquals("120 seconds is 2 minutes and 0 seconds",
      JU01.displayTime(120));
  }

  @Test
  public void test03DisplayTime2()
  {
    assertEquals("180 seconds is 3 minutes and 0 seconds",
      JU01.displayTime(180));
  }

  @Test
  public void test03DisplayTime3()
  {
    assertEquals("185 seconds is 3 minutes and 5 seconds",
      JU01.displayTime(185));
  }

  @Test
  public void test03DisplayTime4()
  {
    assertEquals("400 seconds is 6 minutes and 40 seconds",
      JU01.displayTime(400));
  }

  @Test
  public void test04FahrenheitToCelsius1()
  {
    assertEquals("Fahrenheit 41.0 is 5.0 in Celsius",
      JU01.fahrenheitToCelsius(41));
  }

  @Test
  public void test04FahrenheitToCelsius2()
  {
    assertEquals("Fahrenheit 50.0 is 10.0 in Celsius",
      JU01.fahrenheitToCelsius(50));
  }

  @Test
  public void test04FahrenheitToCelsius3()
  {
    assertEquals("Fahrenheit 32.0 is 0.0 in Celsius",
      JU01.fahrenheitToCelsius(32));
  }

  @Test
  public void test05WindChill1()
  {
    assertEquals("The wind chill index is -5.567068455881625",
      JU01.windChill(5.3, 6));
  }

  @Test
  public void test05WindChill2()
  {
    assertEquals("The wind chill index is -4.203015186081863",
      JU01.windChill(0, 2));
  }

  @Test
  public void test05WindChill3()
  {
    assertEquals("The wind chill index is 36.67393266174048",
      JU01.windChill(40.3, 5.2));
  }

}