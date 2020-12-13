/**
 * Name: John Donofrio This goes with chapter 5 and deals with String methods
 * and some math.
 */

public class JU03
{

  /**
   * Create a method that builds a sentence with the name and phrase that the
   * person shouts. shout("Grace", "Java") -> Grace loves to shout the phase
   * "Java"!
   * 
   * @param name
   * @param phrase
   * @return
   */
  public static String shout(String name, String phrase)
  {
    String message = name + " loves to shout the phrase \"" + phrase + "\"!";
    // This concatenates the variable string with the line " loves to shout the
    // phrase \"" (with \" representing a double-quote) with the variable phrase
    // and the string "\"!", with "\ representing a double quote once again
    return message; // this returns the value of string variable message
  }

  /**
   * Build a computer file path given the drive letter, the main folder name,
   * and the filename. Examples:
   * 
   * <pre>
   * getFilePath("C", "Documents", "rap.mp3") - >
   * </pre>
   * 
   * @param driveLetter
   * @param mainFolder
   * @param fileName
   * @return
   */
  public static String getFilePath(String driveLetter, String mainFolder,
    String fileName)
  {
    String path = driveLetter + ":\\" + mainFolder + "\\" + fileName;
    // this declares/initializes the variable path as the value of driveLetter
    // concatenated with ":\\", with "\\" representing a single \, and with
    // mainFolder, another "\\", and with fileName.
    return path; // this returns the value of string variable path
  }

  /**
   * Unlike the Java built-in Math.sqrt method, GoodSqrt can return imaginary
   * numbers. If you haven't completed Algebra II, don't worry. When you take
   * the square root of a negative number, just remove the negative before you
   * square root it. Then concatenate an "i" to the end of it. Examples
   * 
   * <pre>
   * epicSqrt(25) -> "Square root of 25 is 5.0"
   * epicSqrt(-25) -> "Square root of -25 is 5.0i"
   * epicSqrt(-16) -> "Square root of -16 is 4.0"
   * epicSqrt(16) -> "Square root of 16 is 4.0"
   * </pre>
   * 
   * @param age
   * @return
   */
  public static String epicSqrt(int value)
  {
    double squareRoot = Math.sqrt(Math.abs(value));
    // calculates the square root of the absolute value of 'value'
    String stringRoot = squareRoot + "";
    // creates string variable stringRoot as squareRoot value but as a string
    if (value < 0)
      stringRoot += "i";
    // if value is negative, i is added to stringRoot.
    return "Square root of " + value + " is " + stringRoot;
  }

  /**
   * To round a positive number to the nearest ones place, you add 0.5 to the
   * number then chop off (truncate) the decimal. To round a negative number,
   * you subtract 0.5 from the number and then chop off the decimal. This method
   * returns the value of number rounded to nearest one's place.
   * 
   * @param number
   *          can be negative or positive
   * @return see above
   */
  public static String roundToNearestOnesPlace(double number)
  {
    double value = number; // value is initialized to equal number
    if (number > 0)
      value += 0.5;
    // if number is positive, 0.5 is added to value
    else if (number < 0)
      value -= 0.5;
    // else, if number is negative, 0.5 is subtracted from value
    return number + " rounded to the nearest one's place is " + (int) value;
    // value is returned, converted into int to truncate decimals.
  }

  /**
   * Create a String made up of just the first two letters. Hashtags are used if
   * there are not enough letters.
   * 
   * <pre>
   * firstTwoCharacters("superman") -> "su" 
   * firstTwoCharacters("e") -> "e#"
   * firstTwoCharacters("") -> "##"
   * </pre>
   * 
   * @param phrase
   *          != null
   * @return the first two letters, or hashtags if there's not enough letters
   *         for that.
   */
  public static String firstTwoCharacters(String phrase)
  {
    String char1 = phrase.substring(0, 1); // creates variable for substring of phrase at index 0
    String char2 = phrase.substring(1, 2);// creates variable for substring of phrase at index 1
    if (char1 == null  || char1.length() == 0)
      char1 = "#";
    // if the value of char1 is null or its length is 0, char1 = #
    if (char2 == null  || char2.length() == 0)
      char2 = "#";
    // if the value of char2 is null or its length is 0, char2 = #
    return char1.concat(char2);
    // this returns char1 concatenated with char2
  }

  /**
   * Given 2 strings, return their concatenation, except dump the first char of
   * each. The strings will be at least length 1.
   * 
   * <pre>
   * noFirstLetterConcat("Hello", "There") -> "ellohere"
   * noFirstLetterConcat("java", "code") -> "avaode"
   * noFirstLetterConcat("shotl", "java") -> "hotlava"
   * </pre>
   * 
   * @param word1
   * @param word2
   * @return
   */
  public static String noFirstLetterConcat(String word1, String word2)
  {

    return word1.substring(1, word1.length())
      .concat(word2.substring(1, word2.length()));
  }

  /**
   * Creates a string that displays the first position of the letters a, e, i,
   * o, and u in sentence. If a vowel is not located, it will report -1 as the
   * position. Hint: use indexOf to simplify things.
   * 
   * <pre>
   *  findVowels("appleapp") would return
   *  The first position of a is 0.
   *  The first position of e is 4.
   *  The first position of i is -1.
   *  The first position of o is -1.
   *  The first position of u is -1.
   * </pre>
   * 
   * @param sentence
   *          != null and lowercase
   * @return
   */
  public static String findVowels(String sentence)
  {
    return "The first position of a is " + sentence.indexOf("a")
    + ".\nThe first position of e is " + sentence.indexOf("e")
    + ".\nThe first position of i is " + sentence.indexOf("i")
    + ".\nThe first position of o is " + sentence.indexOf("o")
    + ".\nThe first position of u is " + sentence.indexOf("u") + ".";
  }
  // sentence.indexOf() gives the first instance of letters in a given string,
  // sentence.

  /**
   * Determines if the String's a, b, c are sorted in alphabetical order.
   * Returns a sentence that says if they are in order or not.
   * 
   * <pre>
   * Examples:
   * inAlphabeticalOrder("acorn", "apple", "pizza") -> "acorn, apple, and pizza are in alphabetical order."
   * inAlphabeticalOrder("bear", "morning", "zebra") -> "bear, morning, and zebra are in alphabetical order."
   * inAlphabeticalOrder("giraff", "morning", "zebra") -> "bear, morning, and zebra are NOT in alphabetical order."
   * </pre>
   * 
   */
  public static String inAlphabeticalOrder(String a, String b, String c)
  {
    if (a.compareTo(b) < 0 && a.compareTo(c) < 0)
      // if the result of a.compareTo(b) is less than 0 and a.compareTo(c) is
      // less than 0, the words are in alphabetical order.
      return a + ", " + b + ", and " + c + " are in alphabetical order.";
    else // else, this will return that the words are not in alphabetical order
      return a + ", " + b + ", and " + c + " are NOT in alphabetical order.";
  }

  /**
   * The quadratic formula returns the solutions to the equation ax^2 + bx + c =
   * 0. The quadratic formula is on page 99, problem 3.1 in the Programming
   * Exercises. Compute the descriminant which is b squared minus 4 times a
   * times c. If the descriminant is negative, then display "The equation has no
   * real roots" If the descriminant is zero, then display "The equation has one
   * root r1". If the descriminant is positive, then display "The equation has
   * two roots r1 and r2"
   * 
   * @param a
   * @param b
   * @param c
   * @return
   */
  public static String getQuadraticRoots(double a, double b, double c)
  {
    double discriminant = Math.pow(b, 2) - (4 * a * c); // discriminant = b^2 -
                                                        // 4ac
    double r1 = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a); // first root =
                                                                // -b +
                                                                // sqrt(discriminant)
                                                                // / 2a
    double r2 = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a); // 2nd root = -b
                                                                // -
                                                                // sqrt(discriminant)
                                                                // / 2a
    String message = "";
    if (discriminant > 0)
      message = "The equation has two roots " + r1 + " and " + r2;
    // if disc. is positive, there are 2 roots
    if (discriminant == 0)
      message = "The equation has one root " + r1;
    // if disc. is 0, there is one real root.
    if (discriminant < 0)
      message = "The equation has no real roots";
    // if disc is negative, there are no real roots.
    return message;
  }

}