/**
 * Name: John Donofrio
 *
 * @version 2.0
 *
 */

public class JU02
{
  // declare your constants here to fix "magic" numbers.

  /**
   * Write a method that returns if a number is positive, negative, or zero.
   * 
   * <pre>
   * For Example:
   * posZeroNeg(-4) -> "-4 is negative."
   * posZeroNeg(42) -> "42 is positive."
   * posZeroNeg(0) -> "0 is zero."
   * </pre>
   *
   * @param number
   * @return read the description and unit tests.
   */
  public static String posZeroNeg(int number)
  {
    String response = ""; // declares and initializes String variable 'response'
    if (number > 0) // if number is greater than 0, the variable response will
                    // equal number + " is positive."
    {
      response = number + " is positive.";
    }
    if (number == 0) // if number is 0, the variable response will equal number
                     // + " is zero."
    {
      response = number + " is zero.";
    }
    if (number < 0) // if number is less than 0, response will equal number + "
                    // is negative."
    {
      response = number + " is negative.";
    }

    return response; // this will return the value of response based on user
                     // input
  }

  /**
   * Determines if a number is even or odd. For example:
   * 
   * <pre>
   * isEvenOrOdd(5) -> "5 is odd."
   * isEvenOrOdd(10) -> "10 is even."
   * </pre>
   * 
   * @param number
   * @return
   */
  public static String isEvenOrOdd(int number)
  {
    String answer = "";// declare a String variable answer and assign it empty
                       // string.
    if (number % 2 == 0) // if remainder of number / 2 = 0, then answer equals
                         // number + " is even."
      answer = number + " is even.";
    else
      answer = number + " is odd."; // if remainder of number / 2 is not zero,
                                    // answer equals number + " is odd."
    return answer; // this will return the value of answer based on user input
                   // for number

  }

  /**
   * If the number is a multiple of 5, return "HiFive" If the number is even,
   * return "HiEven" If they are both even and multiple of five, then return
   * "HiFiveAndEven" If neither is the case, return "Sorry" Hint: Look at page
   * 75 in the eBook.
   * 
   * @param number
   * @return
   */
  public static String simpleIf(int number)
  {
    String answer = "Sorry"; // declare a String variable answer and assign it
    // "Sorry".
    if (number % 5 == 0)
    {// if the number is wholly divisible by 5, answer equals "HiFive"
      answer = "HiFive";
    }
    if (number % 2 == 0)
    {// if the number is divisible by 2 (Even), answer equals "HiEven"
      answer = "HiEven";
    }
    if (number % 2 == 0 && number % 5 == 0)
    {// if the number is both even and divisible by five, answer equals
     // "HiFiveAndEven"
      answer = "HiFiveAndEven";
    }
    if (number % 2 != 0 && number % 5 != 0)
    {// if number is not even and not divisible by 5, answer equals "Sorry"
      answer = "Sorry";
    }
    return answer;
  }

  /**
   * The score parameter receives a score from 0.0 to 100.0. This method will
   * return the letter grade that matches the score. For example, an 86.5 would
   * return a "B", a 90.1 would return an "A". Any score under 60 would receive
   * an "F".
   * 
   * @param score
   * @return
   */
  public static String getLetterGrade(int score)
  {
    String letterGrade = "";
    if (score >= 90) // if score is greater than or equal to 90, letterGrade is
                     // equal to "A". This pattern is followed with the rest of
                     // the letter grades using 'else if' statements, where if
                     // the past statement is false, it runs the next one until
                     // one is true or it reaches else.
    {
      letterGrade = "A";
    }
    else if (score >= 80)
    {
      letterGrade = "B";
    }
    else if (score >= 70)
    {
      letterGrade = "C";
    }
    else if (score >= 60)
    {
      letterGrade = "D";
    }
    else
      letterGrade = "F";
    return letterGrade;
  }

  /**
   * Returns a message indicating if an x-y coordinate on a Cartesian coordinate
   * plane is the origin, located on the x (or y) axis, or appears in a
   * particular quadrant. For example,
   *
   * <pre>
   * xyInfo(0, 0) -> "(0, 0) is the origin."
   * xyInfo(2, 0) -> "(2, 0) is on the x-axis."
   * xyInfo(0, 3) -> "(0, 3) is on the y-axis."
   * xyInfo(-3, -2) -> "(-3, -2) is in the third quadrant."
   * </pre>
   *
   * @param x
   * @param y
   * @return
   */
  public static String xyInfo(int x, int y)
  {
    String response = ""; // String variable response is declared + initialized
    if (x == 0 && y == 0)
    {
      response = "(" + x + ", " + y + ") is the origin.";
      // if x and y are 0, response = "(0,0) is the origin."
    }
    if (x != 0 && y == 0)
    {
      response = "(" + x + ", " + y + ") is on the x-axis.";
      // if x is not 0 and y is 0, the point is on the x axis
    }
    if (x == 0 && y != 0)
    {
      response = "(" + x + ", " + y + ") is on the y-axis.";
      // if x is 0 and y is not 0, the point lies on the y-axis
    }
    if (x > 0 && y > 0)
      response = "(" + x + ", " + y + ") is in the first quadrant.";
    // if x and y > 0, the point is in the 1st quadrant
    else if (x < 0 && y > 0)
      response = "(" + x + ", " + y + ") is in the second quadrant.";
    // if x is - and y is +, the point lies in the 2nd quadrant
    else if (x < 0 && y < 0)
      response = "(" + x + ", " + y + ") is in the third quadrant.";
    // if x and y are -, the point is in the 3rd quadrant.
    else if (x > 0 && y < 0)
      response = "(" + x + ", " + y + ") is in the fourth quadrant.";
    // if x is +, y is -, the point is in the 4th quadrant.
    // TODO: Finish
    return response; // this will return response for every scenario of x and y
  }

  /**
   * A shipping company uses the following rules to compute the cost of (in
   * dollars) of shipping based on the weight of the package (in pounds).
   * 
   * <pre>
   *   $3.5 if 0 < packageWeight <= 1
   *   $5.5 if 1 < packageWeight <= 3
   *   $8.5 if 3 < packageWeight <= 10
   *   $10.5 if 10 < packageWeight <= 20
   *   "Cannot be shipped" if the packageWeigth is over 20.
   * </pre>
   * 
   * @param guess
   * @param secret
   * @return
   */
  public static String costOfShipping(double packageWeight)
  {
    String response = "";
    if (0 < packageWeight && packageWeight <= 1)
    { // if the package weighs greater than 0 and at most 1 pound, it will cost
      // $3.5
      response = "The shipping cost is $3.5";
    }
    else if (1 < packageWeight && packageWeight <= 3)
    { // if the package weighs more than 1 pound and at most 3, it will cost
      // $5.5
      response = "The shipping cost is $5.5";
    }
    else if (3 < packageWeight && packageWeight <= 10)
    { // if the package weights more than 3 pounds and at most 10, it will cost
      // $8.5
      response = "The shipping cost is $8.5";
    }
    else if (10 < packageWeight && packageWeight <= 20)
    { // if the package weighs more than 10 pounds and at most 20, it will cost
      // $10.5
      response = "The shipping cost is $10.5";
    }
    else if (packageWeight > 20)
    { // if the package weight exceeds 20 pounds, it cannot be shipped
      response = "The package cannot be shipped";
    }

    return response; // this returns the value of response, based on the value
                     // of packageWeight
  }

  /**
   * Determines if a, b, and c are in order from least to greatest.
   * 
   * <pre>
   * Examples
   * 
   * inNumericalOrder(3, 5, 19) -> "3, 5, and 19 are in numerical order.";
   * inNumericalOrder(3, 3, 3) -> "3, 3, and 3 are in numerical order.";
   * inNumericalOrder(3, 5, 4) -> "3, 5, and 4 are NOT in numerical order.";
   * </pre>
   * 
   * @param a
   * @param b
   * @param c
   * @return
   */
  public static String inNumericalOrder(int a, int b, int c)
  {
    String sentence = "";
    if (a <= b && b <= c)
    {
      sentence = a + ", " + b + ", and " + c + " are in numerical order.";
    }
    // if a is greater than/equal to b and b is greater than/equal to c, then a,
    // b , and c are in numerical order
    else
      sentence = a + ", " + b + ", and " + c + " are NOT in numerical order.";
    // if a is not greater than/equal to b and b isn't greater than/equal to c,
    // this code will say so
    return sentence;
  }

  /**
   * Write a method that outputs the expanded from of any three digit integer.
   * For example:
   *
   * <pre>
   * numExpander(914) returns "914 = 9 X 100 + 1 X 10 + 4 X 1"
   * numExpander(528) returns "528 = 5 X 100 + 2 X 10 + 8 X 1"
   * </pre>
   *
   * Hint: The modulo operator is helpful but you can also do it with just
   * simple subtraction. You'll definitely use the fact that integer division
   * ignores the decimal part.
   *
   * @param threeDigitNumber
   * @return see description and unit tests.
   */
  public static String numExpander(int threeDigitNumber)
  {
    // BTW: in '321', digit1 = 1, digit2 = 2, digit3 = 3.
    String response = "";
    int digit1 = threeDigitNumber % 10;
    // digit1 is the remainder of the 3 digit number / 10
    int digit2 = threeDigitNumber % 100 / 10;
    // digit 2 is the remainder of the 3 digit number / 100, divided by 10 to
    // truncate it to one digit
    int digit3 = threeDigitNumber % 1000 / 100;
    // digit3 is the remainder of the 3 digit number / 1000, then divided by 100
    // to truncate decimals to one digitl.
    response =
      threeDigitNumber + " = " + digit3 + " X 100 + " + digit2 + " X 10 + "
        + digit1 + " X 1";
    return response;
  }

}