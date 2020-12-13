/**
 * Name: John Donofrio Chapter 6 methods in the Ebook. Submit this file to the
 * dropbox for grading.
 */
public class JU06
{
  // Declare any constants here.
  /**
   * Write a method that computes the area of a triangle given the base width
   * and height.
   * 
   * @return returns a double.
   */
  public static double getTriangleArea(int width, int height)
  {
    return width * height / 2.0;
    // area of triangle = 1/2 * width * height
  }

  /**
   * Returns true if a and b are equal or almost equal. They are almost equal if
   * the difference between them is less than 0.01. Examples:
   * 
   * <pre>
   * approxEqual(3.54, 3.542) -> true
   * approxEqual(3.542, 3.54) -> true
   * approxEqual(3.3, 3.1) -> false
   * </pre>
   * 
   */
  public static boolean approxEqual(double a, double b)
  {
    double difference = Math.abs(Math.abs(a) - Math.abs(b));
    // difference between a and b is the absolute value of the difference of the
    // absolute values of a and b.
    if (difference < 0.01 || a == b)
      return true;
    else
      return false;
    // if the difference is less than 0.01 or a is equal to b, it returns true.
    // else, false
  }

  /**
   * Returns the sum of two doubles, but if they are approximately equal to each
   * other (less than 0.01 difference), then return three times the sum of the
   * two parameters.
   * 
   * @param a
   * @param b
   * @return
   */
  public static double funnySum(double a, double b)
  {
    double sum = a + b;
    if (approxEqual(a, b))
      return sum * 3;
    else
      return sum;
    // sum is a + b. if approxEqual(a, b) returns true, sum multiplied by 3 is
    // returned. else, just sum is returned
  }

  /**
   * This method returns the value of number rounded to nearest one's place. The
   * AP way of rounding is actually different than Math.round. It rounds numbers
   * "away" from zero. If the number is positive add 0.5 and truncate the value.
   * If the number is negative then subtract 0.5 and then truncate the value.
   * 
   * <pre>
   * roundAP(5.6) -> 6
   * roundAP(5.54) -> 6
   * roundAP(5.5) -> 6
   * roundAP(5.4555) -> 5
   * roundAP(-5.6) -> -6
   * roundAP(-5.5) -> -6
   * roundAP(-5.2) -> -5
   * </pre>
   * 
   * @param number
   *          can be negative or positive
   * @return see above
   */
  public static int roundAP(double number)
  {
    if (number > 0)
      return (int) (number + 0.5);
    else
      return (int) (number - 0.5);
  }

  // if number is positive, number gets 0.5 added to it and that value is cast
  // as an integer. If number is negative, the same process occurs except 0.5 is
  // subtracted instead of added to number.

  /**
   * Very similar to roundAP, except that it rounds to the nearest hundredths
   * place. Multiply by 100, then add 0.5, then chop off the decimal, then
   * divide by 100.0
   * 
   * <pre>
   * roundAP(5.389) -> 5.39
   * roundAP(2.612) -> 6.12
   * roundAP(-8.225) -> -8.23
   * roundAP(-8.224) -> -8.22
   * </pre>
   * 
   * @param number
   *          can be negative or positive
   * @return see above
   */
  public static double roundAPHundredths(double number)
  {
    if (number > 0)
      return ((int) ((number * 100.0) + 0.5) / 100.0);
    // if number is positive, number gets multiplied by 100.0 and then .5 is
    // added to it. It is cast as an integer, then divided by 100.0
    else
      return ((int) ((number * 100.0) - 0.5) / 100.0);
    // else, (if its negative or 0) number gets multiplied by 100.0, .5 is
    // removed from it, then it is cast as an int and divided by 100.0
  }

  /**
   * Visit
   * https://www.thecalculatorsite.com/articles/finance/compound-interest-formula.php
   * and find the compound interest formula.
   * 
   * <pre>
   * principle = the principal investment amount (the initial deposit or loan amount)
   * rate = the annual interest rate (in percentage)
   * numberOftimes = the number of times that interest is compounded per unit t
   * times = the time the money is invested or borrowed for
   * </pre>
   * 
   * @return the future value of the investment/loan, including interest
   */
  public static String compoundInterest(double principle, double rate,
    int numberOfTimes, double time)
  {
    double a =
      principle
        * (Math.pow(1 + (rate / 100.0) / numberOfTimes, numberOfTimes * time));
    // formula - A = p * (1 + ((r/100) / n) ^ n * t)
    String sentence =
      "$" + principle + " saved at " + rate + "% compounded " + numberOfTimes;
    sentence +=
      "\ntimes per year for " + time + " years is $" + roundAPHundredths(a);
    // a (amount) gets rounded using method made previously
    return sentence;
  }

  /**
   * Given three values, x, y, and z, is it possible to add any two of the
   * parameters where the sum would equal the third one. Examples:
   * 
   * <pre>
   * sumOfTwoMakesThird(2, 5, 7) -> true because 2 + 5 == 7
   * sumOfTwoMakesThird(4, 9, 5) -> true because 4 + 5 == 9
   * sumOfTwoMakesThird(5, 4, 7) -> false because no two numbers sum to the third.
   * sumOfTwoMakesThird(0, 2, 2) -> false because no two numbers sum to the third.
   * </pre>
   */
  public static boolean sumOfTwoMakesThird(int x, int y, int z)
  {
    if (x + y == z || y + z == x || z + x == y)
      // if x and y = z or y and z = x or z and x = y, return true. else, false
      return true;
    else
      return false;

  }

  /**
   * 
   * Returns true if number is a multiple of 5 or 7.
   * 
   * <pre>
   * isMultipleOf5or7(14) -> true
   * isMultipleOf5or7(19) -> false
   * isMultipleOf5or7(42) -> true
   * </pre>
   * 
   * @param number
   *          is any real number
   * @return true if multiple of 5 or 7, false if not.
   */
  public static boolean isMultipleOf5or7(int number)
  {
    if (number % 5 == 0 || number % 7 == 0)
      return true;
    else
      return false;
    // if n / 5 or n / 7 has no remainder, this outputs true. otherwise, false.
  }

  /**
   * Return a string of numbers that are divisible by five or seven up to max.
   * 
   * <pre>
   * numbersMult5or7(10) -> "5,7,10,"
   * numbersMult5or7(17) -> "5,7,10,14,15,"
   * </pre>
   * 
   * @param max
   * @return
   */
  public static String numbersMult5or7(int max)
  {
    String msg = "";
    for (int i = 1; i <= max; i++)
      if (isMultipleOf5or7(i))
        msg += i + ",";
    return "Answer:" + msg;
    // for all values of i from i to max, if isMultipleOf5or7(i) is true, i +
    // ","
    // gets added to msg.
  }

  /**
   * The formula for this is in your book on page 217. Actually, the whole line
   * of code is there.
   * 
   * <pre>
   * celsiusToFahrenheit(100) -> 212.0
   * celsiusToFahrenheit(0) -> 32.0
   * </pre>
   * 
   * @param celcius
   * @return
   */
  public static double fahrenheitToCelsius(double fahrenheit)
  {
    return 5.0 * (fahrenheit - 32.0) / 9.0;
    // formula 5 * (f - 32) / 9 = Celsius
  }

  /**
   * The formula for this is in your book on page 217. Actually, the whole line
   * of code is there.
   * 
   * <pre>
   * celsiusToFahrenheit(100) -> 212.0
   * celsiusToFahrenheit(0) -> 32.0
   * </pre>
   * 
   * @param celcius
   * @return
   */
  public static String getCelsiusTemps(int cMin, int cMax, int step)
  {
    String sentence = "";
    for (int f = cMin; f <= cMax; f += step)
      // for all values of f from cMin to cMax (incremented by step), f gets
      // converted to C and rounded using roundAPhundredths
      sentence +=
        f + "      " + roundAPHundredths(fahrenheitToCelsius(f)) + "\n";
    return "Fahrenheit Celsius\n" + "------------------\n" + sentence
      + "------------------";
  }

}