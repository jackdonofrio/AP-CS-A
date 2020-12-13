/**
 * Name: John Donofrio FOR LOOPS Chapter 5 in the Ebook Practice on nested for
 * loops. Submit this file to the dropbox for grading.
 * 
 * @version 2.0 - rearranged simpleLoop to top.
 */
public class JU05
{
  // Declare any constants here.

  /**
   * The client sends the max through a parameter and you return a String length
   * of that many asterisks.
   * 
   * <pre>
   * displayStarsOnOneLine(4) -> "****"
   * displayStarsOnOneLine(2) -> "**"
   * </pre>
   */
  public static String displayStarsOnOneLine(int max)
  {
    // You must solve using a FOR loop.
    // No credit for using a while loop.
    String answer = "";
    int count;
    for (count = 0; count < max; count++)
      answer += "*";
    return answer;
  }

  // the code initializes count to 0, sets the termination condition to while
  // count is less than max, adds "*" to answer, and then increments count while
  // count is less than max.
  /**
   * Given max, this will generate a String of numbers from 1 to max separated
   * by commas. There will not be a comma at the end of the sequence.
   * simpleLoop(5) -> "[1,2,3,4,5]" simpleLoop(8) -> "[1,2,3,4,5,6,7,8]"
   * 
   * @param max
   * @return
   */
  public static String simpleLoop(int max)
  {
    // You must solve using a FOR loop.
    // No credit for using a while loop.
    String answer = "";
    int count;
    for (count = 1; count < max; count++)
      answer += count + ",";
    if (count == max)
      answer += count;
    return "[" + answer + "]";
  }
  // count is initialized to 1, count < max is the termination condition, and
  // then answer += count + "," is executed and count is incremented while count
  // is less than max. When count = max, count is added to answer without a
  // comma.

  /**
   * Given a max value, this will create a string of the multiples of 7 starting
   * at 7 and not going any higher than max. It will run all of the numbers
   * together without spaces.
   * 
   * <pre>
   * For example: basicCountUpBy7s(22) -> "[71421]"
   * For example: basicCountUpBy7s(43) -> "[71421283542]"
   * </pre>
   */
  public static String basicCountUpBy7s(int max)
  {
    // You must solve using a FOR loop(s).
    // No credit for using a while loop.
    String answer = "";
    int count;
    for (count = 7; count <= max; count += 7)
      answer += count;
    return "[" + answer + "]";
  }
  // count is initialized to 7, count <= max is the termination condition, and
  // then answer += count is executed and count is incremented by 7 while count
  // <= max.

  /**
   * The client can pass the start, end, and the step value that each number.
   * The method returns the sequence of numbers from start to end, using the
   * delta value of the step.
   * 
   * <pre>
   * flexibleLoop(3, 7, 1) -> "[3,4,5,6,7]"
   * flexibleLoop(7, 3, -1) -> "[7,6,5,4,3]"
   * flexibleLoop(10, 0, -3) -> "[10,7,4,1]"
   * 
   * </pre>
   * 
   * @param max
   * @return
   */
  public static String flexibleLoop(int start, int end, int step)
  {
    String answer = "[";
    if (step > 0)
    {
      int count;
      for (count = start; count <= end; count += step)
        answer += count + ",";
    }
    else
    {
      int count;
      for (count = start; count >= end; count += step)
        answer += count + ",";
    }
    // if step is positive, count is initialized to start, the termination
    // condition is end, and then answer += count + "," is executed and step is
    // added to count while count <= end. Else (when step is negative), the same
    // process occurs except the termination condition is count >= end because
    // the value of count is descending toward end.

    return answer + "]";
  }

  /**
   * The client sends the max through a parameter and you return a list of
   * numbers from 1 to max, but all numbers divisible by wierdNum have brackets
   * around them.
   * 
   * <pre>
   * PRECONDITION: max will be greater than zero.
   * </pre>
   * 
   * @param max
   * @return
   */
  public static String divisibleBy(int weirdNum, int max)
  {
    // You must solve using a FOR loop(s).
    // No credit for using a while loop. ... like you'd want to anyway.
    String answer = "";
    int count;
    for (count = 1; count <= max; count++)
      if (count % weirdNum == 0)
        answer += "[" + count + "] ";
      else
        answer += count + " ";
    return answer;
  }

  // count is initialized as 1, the termination condition is set to count <=
  // max. The loop body is then executed: if count / weirdNum has no remainder,
  // then "[" + count + "] " is added to answer. Else, the same is added but no
  // brackets. Then, count is incremented. As dictated by the condition, this
  // continues process until count is no longer < or = to max.

  /**
   * Creates a nasa T-minus countdown phrase given a value for the start
   * parameter. nasaCountDown(5) -> "T-Minus 5 seconds:5...4...3...2...1...BLAST
   * OFF"
   * 
   * @param start
   *          can be any positive integer
   * @return see test.
   */
  public static String nasaCountDown(int start)
  {
    String answer = "";
    int count;
    for (count = start; count >= 1; count--)
      // count is initialized to = start, count >= 1 is termination condition.
      answer += count + "...";
    // then, the loop body is executed: count + "..." is added to answer.
    // Then, count is decremented. This is done because it is counting down from
    // start to 1.
    return "T-Minus " + start + " seconds:" + answer + "BLAST OFF";

  }

  /**
   * The client sends the min and max through a parameter and you return a list
   * of numbers from min to max and determining the sum of all of those numbers.
   * 
   * <pre>
   * sumThemUp(3) -> 1 + 2 + 3 = 6
   * sumThemUp(5) -> 1 + 2 + 3 + 4 + 5 = 15
   * 
   * PRECONDITION: max will be greater than min.
   * </pre>
   * 
   * @param max
   *          will be greater than one.
   */
  public static String sumThemUp(int min, int max)
  {
    String answer = "";
    int count;
    int sum = 0;
    for (count = min; count <= max; count++)
    // count is initialized to min, count <= max is the termination condition
    // Then, the loop body is executed:
    // if count == max, count alone is added to answer. Else, count + " + " is
    // added to it. Then, count is added to sum. Finally, at the end of one run
    // of the loop, count is incremented.
    {
      if (count == max)
        answer += count;
      else
      {
        answer += count + " + ";
      }
      sum += count;
    }
    return answer + " = " + sum;
    // answer + " = " + sum is displayed
  }

  /**
   * Builds an algebra 1 T chart with the function f(x) = 3x + 2. The client
   * supplies the smallest and largest numbers for the T chart. This is also
   * called the domain. Check the failing tests to see the format.
   * 
   */
  public static String buildTChart(int min, int max)
  {
    String answer = "";
    int x;
    int y;
    for (x = min; x <= max; x++)
    {
      y = 3 * x + 2;
      answer += x + "   " + y + "\n";
    }

    return "-----------------\n" + "x | f(x) = 3x + 2\n" + "-----------------\n"
      + answer + "-----------------\n";
  }

  // x is initialized to max, the termination condition is x <= max. The loop
  // body is then executed: y = 3 * x + 2, and x + " " + y + "\n" is added to
  // answer. Then, x is incremented.
  /**
   * Given a height and width, return a box of asterisks with those dimensions.
   * 
   * <pre>
   * buildGridOfStars(4,2) -> "**
   *                           **
   *                           **
   *                           **"
   *
   * buildGridOfStars(3,5) -> "*****
   *                           *****
   *                           *****"
   * </pre>
   */
  public static String buildGridOfStars(int height, int width)
  {
    String answer = "";
    int count1;
    int count;
    for (count = 0; count < height; count++)
    {
      for (count1 = 0; count1 < width; count1++)
        answer += "*";
      answer += "\n";
    }
    return answer;
  }
  // count initializes to 0, count < height is the termination condition. Then,
  // the loop body is executed: a nested for loop is executed, with count1
  // initialized to 0 and count1 < width as the termination condition. The body
  // of the nested loop is executed, and "*" is added to answer, then count1 is
  // incremented. After this loop executes, "\n" is added to answer to create
  // each new line. Then, count is incremented.

  /**
   * Generates and returns a times table given a height and width. It's ugly
   * because the spacing will look weird, but this makes it easier for you to
   * solve the problem. Each number will have a single space after it.
   */
  public static String uglyTimesTable(int height, int width)
  {
    String answer = "";
    int count;
    int count1;
    for (count = 1; count <= height; count++)
    // count initializes to 1, count <= height is the termination condition
    { // loop body is executed:
      for (count1 = 1; count1 <= width; count1++)
      // count1 is initialized to 1, termination condition is count1 <= width.
      { // loop body is executed:
        answer += count * count1 + " ";
      } // count1 is incremented.
      answer += "\n";
    } // count is incremented.
    return answer;
  }

  /**
   * Given a width less than 21, this method will return a string of width stars
   * with dots in front of them. The whole length of the returned string is 20.
   * 
   * <pre>
   * buildRightJustified(3) -> ".................***"
   * buildRightJustified(5) -> "...............*****"
   * </pre>
   */
  public static String buildRightJustified(int width)
  {
    String answer = "";
    int count;
    int count1;
    int dots = 20 - width; // # dots determined by 20 - width;
    int stars = 20 - dots; // # stars determined by 20 - # dots.
    for (count = 0; count < dots; count++)
      // count is initialized to 0, termination condition is count < dots
      // loop body executed:
      answer += ".";
    // count is incremented.
    for (count1 = 0; count1 < stars; count1++)
      // count1 is initialized to 0, count < stars is the termination condition
      // loop body executed:
      answer += "*";
    // count1 is incremented
    return answer;
  }

  /**
   * Given a height, build a pyramid of symbols that is right justified. For
   * example:
   * 
   * <pre>
   * numberStars("$") ->
   * "  $"
   * " $$"
   * "$$$"
   * </pre>
   */
  public static String buildStairs(int height, String symbol)
  {
    String answer = "";
    int count;
    int count1;
    for (count = 1; count <= height; count++)
    // count initializes to 1, count <= height is termination condition.
    { // loop body executes:
      for (count1 = 1; count1 <= height; count1++)
      { // count1 initializes to 1, termination condition is count1 <= height
        // loop body executes:
        if ((count1 + count) > height)
        // if the sum of count1 and count > height at this point in the loop,
        // symbol is added to answer
        {
          answer += symbol;
        }
        else
        // else, a space is added to answer. This is done so the lines fill up
        // with the necessary # of spaces before the symbol can be added.
        {
          answer += " ";
        }
        // count1 is incremented.
      }
      answer += "\n";
      // new line is added at the end of every loop of the first for loop.
      // count is incremented
    }
    return answer;
  }

  /**
   * Creates a set of stairs built with increasing numbers. You send it the
   * number of rows it needs to build. Look at the examples:
   * 
   * <pre>
   * buildNumberMountain(3) -> "1 "
   *                           "2 3"
   * buildNumberMountain(5) -> "1 "
   *                           "2 3" 
   *                           "4 5 6"
   *                           "7 8 9 10"
   *                           "11 12 13 14 15"
   * </pre>
   */
  public static String buildNumberMountain(int rows)
  {
    // You must solve using a FOR loop(s).
    // No credit for using a while loop.
    String answer = "";
    int count;
    int count1;
    int i = 1; // i is essentially the values being displayed
    for (count1 = 1; count1 <= rows; count1++)
    // count1 is initialized to 1, count1 <= rows is the termination condition.
    // loop body executes:
    {
      for (count = 1; count <= count1; count++)
      // count initializes to 1, count <= count1 is the termination condition.
      { // loop body executes
        answer += i + " ";
        i++;
        // count is incremented
      }
      answer += "\n"; // new line after loop 2 executes
      // count1 is incremented.
    }
    return answer;
  }

}