/**
 * Name: John Donofrio
 * 
 * Complete the methods below so that they pass all of the tests in the
 * JU01Test.java. Remember to open the JU01Test.java file and press the PLAY
 * button when that file is open.
 * 
 * @version 2.0 windChill tests updated.
 *
 */

public class JU01
{
  /**
   * Compute the body of the method to pass the tests. This method will compute
   * the area of a square given a side length.
   * 
   * <pre>
   * squareArea(4) -> "A square with side length 4 has area of
   * 16"
   * </pre>
   * 
   */
  public static String squareArea(double sideLength)
  {
    double area = sideLength * sideLength;
    return "A square with side length " + sideLength + " has area of " + area;
  }

  /**
   * Given three decimal numbers, return the average of those numbers. Look at
   * page 35 in the eBook, line 15 in the ComputeAverage code for a hint.
   * Example
   * 
   * <pre>
   * computeAverage(50, 0, 100) -> "The average of 50.0 0.0 100.0 is 90.0"
   * </pre>
   * 
   * @param number1
   * @param number2
   * @param number3
   * @return
   */
  public static String computeAverage(double number1, double number2,
    double number3)
  {
    double average = 0;
    double sum = number1 + number2 + number3;
    average = sum / 3.0;

    return "The average of " + number1 + " " + number2 + " " + number3 + " is "
      + average;
  }

  /**
   * Given the radius of a circle, return the area of the circle. Page 41, Line
   * 15.
   * 
   * @param radius
   * @return
   */
  public static String computeCircleArea(double radius)
  {
    final double PI = 3.14159; // final prevents the variable PI from changing.
    double area = radius * radius * PI;

    return "The area for the circle of radius " + radius + " is " + area;
  }

  /**
   * Given the number of seconds, compute the number of minutes and remaining
   * seconds. Hint: Page 44 eBook, line 8 through 11.
   * 
   * @param seconds
   * @return
   */
  public static String displayTime(int seconds)
  {
    int minutes = seconds / 60;
    int remainingSeconds = seconds % 60;
    return seconds + " seconds is " + minutes + " minutes and "
      + remainingSeconds + " seconds";

  }

  /**
   * Converts fahrenheit to celsius. Hint: Page 47 in the eBook.
   * 
   * @param fahrenheit
   * @return
   */
  public static String fahrenheitToCelsius(double fahrenheit)
  {
    double celsius = (fahrenheit - 32) * 5 / 9;
    return "Fahrenheit " + fahrenheit + " is " + celsius + " in Celsius";
  }

  /**
   * Write a formula to compute the WindChill index given the outside
   * temperature and the wind speed. Use Math.pow(a, b) to compute raising v to
   * the 0.16 power. The formula is on Page 68, problem 2.17 in the eBook.
   */
  public static String windChill(double outsideTemp, double windSpeed)
  {
    double windChill =
      35.74 + 0.6215 * outsideTemp - 35.75 * Math.pow(windSpeed, 0.16)
        + 0.4275 * outsideTemp * Math.pow(windSpeed, 0.16);
    return "The wind chill index is " + windChill;
  }

}