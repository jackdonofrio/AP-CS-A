
/**
 * @author John Donofrio
 * This class deals with chapter 10.10 in the eText.
 * Turn this in to the dropbox.
 * Note: You are only allowed to use methods from
 * the official APCS Subset. The String class specific ones are:
 * <ol>
 * <li>int length()</li>
 * <li>String substring(from, to),</li>
 * <li>String substring(from),</li>
 * <li>int indexOf(String value),</li>
 * <li>int compareTo(Object other),</li>
 * <li>boolean equals(Object other)</li>
 * <li>String toString()</li>
 * </ol>
 * <p>
 * Use of any other method from the String class will result in a zero.
 * </p>
 * 
 * @version 1.0
 */

import java.util.List;

public class JU14
{
  // TODO: Add constant declarations here.
  // Use descriptive names. Do not say FIVE = 5, rather HIGH_SCORE = 5;

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
    if (phrase.length() == 1)
      return phrase.substring(0, 1) + "#";
    if (phrase.length() == 0)
      return "##";
    return phrase.substring(0, 2);
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

    return word1.substring(1) + word2.substring(1);
  }

  /**
   * Given a string of odd length, return a three letter word from its middle,
   * so "Candy" yields "and". The string length will be at least 3. If the
   * string is not of odd length or has less than 3 letters, return "nope".
   * 
   * <pre>
   * getMiddleThree("Candy") -> "and"
   * getMiddleThree("graceap") -> "ace"
   * getMiddleThree("ababab") -> "nope"
   * </pre>
   */
  public static String getMiddleThree(String str)
  {
    if (str.length() % 2 == 0 || str.length() < 3)
      return "nope";
    int mid = (str.length() / 2);
    return str.substring(mid - 1, mid + 2);
  }

  /**
   * Determines if a, b, and c are in order from least to greatest.
   * 
   * <pre>
   * Examples
   * 
   * inNumericalOrder(3, 5, 19) -> true;
   * inNumericalOrder(3, 3, 3) -> true;
   * inNumericalOrder(3, 5, 4) -> false;
   * inNumericalOrder(1, 2, 7) -> true;
   * inNumericalOrder(4, 2, 1) -> false;
   * </pre>
   * 
   * @param a
   * @param b
   * @param c
   * @return
   */
  public static boolean inNumericalOrder(int a, int b, int c)
  {
    return (a < b && b < c) || (a == b && b == c);
  }

  /**
   * Determines if the String's a, b, c are sorted in alphabetical order.
   * 
   * <pre>
   * Examples:
   * 
   * inAlphabeticalOrder("acorn", "apple", "pizza") -> true
   * inAlphabeticalOrder("bear", "morning", "zebra") -> true
   * inAlphabeticalOrder("giraff", "morning", "zebra") -> false
   * inAlphabeticalOrder("egg", "egg", "egg") -> true
   * inAlphabeticalOrder("egg", "egg", "eg") -> false
   * </pre>
   * 
   * @param a
   *          lowercase != null
   * @param b
   *          lowercase != null
   * @param c
   *          lowercase != null
   * @return
   */
  public static boolean inAlphabeticalOrder(String a, String b, String c)
  {
    // TODO: Write the body of the method to pass the tests.
    return (a.compareTo(b) < 0 && b.compareTo(c) < 0)
      || (a.compareTo(b) == 0 && b.compareTo(c) == 0);
  }

  /**
   * Given a sentence, this returns the number of words in the sentence.
   * <p>
   * PRECONDITION: sentence will not have more than one space between each word.
   * </p>
   * 
   * @param sentence
   *          != null && there is only one space between each word.
   * @return the number of words
   */
  public static int wordCount(String sentence)
  {
    if (sentence.length() == 0)
      return 0;
    int spaceCount = 0;
    for (int i = 0; i < sentence.length(); i++)
    {
      if (sentence.substring(i, i + 1).equals(" "))
        spaceCount++;
    }
    return spaceCount + 1;

  }

  /**
   * A string dateStr represents a date in the format "mm/dd/yyyy" (for example,
   * "05/31/2009"). Write a statement or a fragment of code that changes dateStr
   * to the format "dd-mm-yyyy" (e.g., "31-05-2009"). It shouldn't matter if the
   * parameter uses forward slashes or hypens as a delimiter.
   * 
   * @param usaDate
   * @return
   */
  public static String getEuroDate(String usaDate)
  {
    return usaDate.substring(3, 5) + "-" + usaDate.substring(0, 2) + "-"
      + usaDate.substring(6);
  }

  /**
   * In the hangman game, you guess a letter, and then the player reveals any of
   * those letters. Mystery ones remain a hyphen.
   * 
   * <pre>
   * getHangmanResponse("apple", "p") -> "-pp--"
   * getHangmanResponse("apple", "e") -> "----e"
   * getHangmanResponse("apple", "x") -> "-----"
   * getHangmanResponse("apple", "q") -> "-----"
   * getHangmanResponse("apple", "a") -> "a----"
   * </pre>
   * 
   * @param answer
   *          != null
   * @param letterGuess
   *          != null
   * @return see description above.
   */
  public static String getHangmanReponse(String answer, String letterGuess)
  {
    String playerCurrentAnswer = "";
    for (int i = 0; i < answer.length(); i++)
    {
      if (answer.substring(i, i + 1).equals(letterGuess))
      {
        playerCurrentAnswer += letterGuess;
      }
      else
      {
        playerCurrentAnswer += "-";
      }
    }
    return playerCurrentAnswer;
  }

  /**
   * Given two strings, return a new string created with the first letter of
   * firstWord and the last letter of lastWord. Substitute a hashtag symbol for
   * any string parameter that is empty.
   * 
   * <pre>
   * Examples: 
   * firstAndLast("kitten", "zip") -> "kp" 
   * firstAndLast("", "egg") -> "#p"
   * </pre>
   * 
   * @param firstWord
   * @param lastWord
   * @return
   */
  public static String firstAndLast(String firstWord, String lastWord)
  {
    if (firstWord.equals(""))
      firstWord = "#";
    if (lastWord.equals(""))
      lastWord = "#";
    return firstWord.substring(0, 1)
      + lastWord.substring(lastWord.length() - 1, lastWord.length());
  }

  /**
   * Given a pattern and a String toSearch, this method returns the number of
   * times the pattern is found. I used indexOf to search.
   * 
   * <pre>
   * patternCount("appleappleacorn", "app") -> 2
   * patternCount("eggtoeggtoto", "to") -> 3
   * patternCount("eggtoeggtoto", "too") -> 0
   * </pre>
   * 
   * @param toSearch
   *          !null && is lowercase.
   * @param pattern
   *          !null && is lowercase.
   * @return the number of times pattern is found in toSearch
   */
  public static int patternCount(String toSearch, String pattern)
  {
    int patternCount = 0;
    for (int i = 0; i < toSearch.length() - pattern.length() + 1; i++)
    {
      if (toSearch.substring(i, i + pattern.length()).equals(pattern))
      {
        patternCount++;
      }
    }
    return patternCount;
  }

  /**
   * Suppose a string holds a person's last name and first name, separated by a
   * comma. Write a method convertName that takes such a string and returns a
   * string where the first name is placed first followed by one space and then
   * the last name.
   * 
   * <pre>
   * convertName("Hopper, Grace") -> "Grace Hopper"
   * convertName("Skywalker, Luke") -> "Luke Skywalker"
   * </pre>
   * 
   * @param phrase
   *          has two strings separated by a comma and a space. There will
   *          always be a comma and a space after the comma.
   * @return the first name followed by a space and the last name. No comma.
   */
  public static String convertName(String phrase)
  {
    String firstName = phrase.substring(phrase.indexOf(",") + 2);
    String lastName = phrase.substring(0, phrase.indexOf(","));
    return firstName + " " + lastName;
  }

  /**
   * Determines if phrase is a palendrome. A palendrome is a word or sentence
   * that spells the same way forwards as it does backwards.
   * 
   * <pre>
   * Examples:
   * isPalendrome("Rise to vote, sir") -> true
   * isPalendrome("beans") -> false
   * isPalendrome("kayak") -> true
   * isPalendrome("Able was i ere i saw Elba") -> true
   * isPalendrome("Madam I'm Adam") -> true
   * isPalendrome("I really love CDO") -> false
   * </pre>
   * <p>
   * Hints: You may use the toLowerCase() method of the String class even though
   * it is not covered on the AP exam
   * </p>
   * 
   * @param phrase
   *          could have spaces, commas, apostrophes, or uppercase letters. It
   *          will not have any other characters besides these.
   * @return
   */
  public static boolean isPalendrome(String phrase)
  {
    String simplePhrase = "";
    for (int i = 0; i < phrase.length(); i++)
    {
      if (!phrase.substring(i, i + 1).equals(",")
        && !phrase.substring(i, i + 1).equals("'")
        && !phrase.substring(i, i + 1).equals(" "))
      {
        simplePhrase += phrase.substring(i, i + 1).toLowerCase();
      }
    }

    String reversePhrase = "";
    for (int i = simplePhrase.length() - 1; i >= 0; i--)
    {
      reversePhrase += simplePhrase.substring(i, i + 1).toLowerCase();
    }
    return (simplePhrase.toLowerCase().equals(reversePhrase));
  }

  /**
   * Given two strings, original and deleteInfo, return a new string that
   * doesn't have any matches with deleteInfo.
   * 
   * PRECONDITION: original and removeData are lowercase and contain at least
   * one character.
   * 
   * <pre>
   * searchAndRemove("steve jobs invented apple computers", "te") returns
   * "sve jobs invend apple compurs"
   * 
   * searchAndRemove("aaa", "aa"); returns "a"
   * </pre>
   * 
   * @param original
   *          is not null and original.length() >= 1 and lowercase
   * @param removeData
   *          is not null and removeData.length() >= 1 and lowercase
   * @return
   */
  public static String searchAndRemove(String original, String removeData)
  {
    String modifiedString = "";
    int i = 0;
    while (i < original.length())
    {
      if (original.substring(i).indexOf(removeData) == -1)
      {
        modifiedString += original.substring(i);
        i = original.length();
      }
      else if (!original.substring(i, i + removeData.length()).equals(removeData))
      {
        modifiedString += original.substring(i, i + 1);
        i++;
      }
      else
      {
        i += removeData.length();
      }
    }
    return modifiedString;
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
    int indexOfA = sentence.indexOf("a");
    int indexOfE = sentence.indexOf("e");
    int indexOfI = sentence.indexOf("i");
    int indexOfO = sentence.indexOf("o");
    int indexOfU = sentence.indexOf("u");
    return "The first position of a is " + indexOfA
      + ".\nThe first position of e is " + indexOfE
      + ".\nThe first position of i is " + indexOfI
      + ".\nThe first position of o is " + indexOfO
      + ".\nThe first position of u is " + indexOfU + ".\n";
  }

  /**
   * returns true if and only if the array of words is in alphabetical order
   * 
   * <pre>
   * if stuff == {"alpha", "bravo", "charlie", "delta", "echo", "foxtrot"}
   * inAlphabeticalOrder(stuff) -> true
   * 
   * if group == {"mike", "kilo", "juliett"}
   * inAlphabeticalOrder(group) -> false;
   * 
   * if collection == {"quebec", "quebec", "zulu"}
   * inAlphabeticalOrder(collection) -> true;
   * </pre>
   * 
   * @param words
   *          not null and full of lowercase words.
   * @return true if in alphabetical order.
   */
  public static boolean inAlphabeticalOrder(String[] words)
  {
    boolean isInAlphabeticalOrder = true;
    for (int i = 0; i < words.length - 1; i++)
    {
      if (words[i].compareTo(words[i + 1]) > 0)
        isInAlphabeticalOrder = false;
    }
    return isInAlphabeticalOrder;
  }

  /**
   * Given a string, if the first or last letters are 'f', return the string
   * without those 'f' letters, and otherwise return the string unchanged.
   * 
   * <pre>
   * withoutX("fHif") -> "Hi"
   * withoutX("fHi") -> "Hi"
   * withoutX("Hfif") -> "Hfi"
   * </pre>
   */
  public static String withoutF(String str)
  {
    boolean frontF = str.substring(0, 1).equals("f");
    boolean endF = str.substring(str.length() - 1, str.length()).equals("f");
    if (frontF && endF)
      return str.substring(1, str.length() - 1);
    else if (frontF)
      return str.substring(1);
    else if (endF)
      return str.substring(0, str.length() - 1);
    else
      return str;
  }

  /**
   * Merges two strings together. The first letter is always from phrase1. If
   * you run out of letters from one of the phrases, then just stitch on the
   * remaining unused letters from the other one.
   * 
   * Examples:
   * 
   * <pre>
   * mergeTwoWords("abc", "xyz") -> "axbycz" 
   * mergeTwoWords("th", "heywow") -> "thheywow" 
   * mergeTwoWords("", "pizza") -> "pizza"
   * </pre>
   * 
   * @param phrase1
   *          != null and lowercase
   * @param phrase2
   *          != null and lowercase
   * @return see above.
   */
  public static String mergeTwoWords(String phrase1, String phrase2)
  {
    String mergedString = "";
    int shorterLength = Math.min(phrase1.length(), phrase2.length());
    int k = 0;
    while (k < shorterLength)
    {
      mergedString += phrase1.substring(k, k + 1);
      mergedString += phrase2.substring(k, k + 1);
      k++;
    }
    if (shorterLength == phrase1.length())
    {
      mergedString += phrase2.substring(k);
    }
    else
    {
      mergedString += phrase1.substring(k);
    }
    return mergedString;
  }

  /**
   * Adds aBook to a list of books in alphabetical order. For example, if the
   * array had [adventures, barges, moon] and aBook was "barney", then
   * insertInOrder would mutate the array to [adventures, barges, barney, moon].
   * Methods used: compareTo.
   * 
   * @param bookList
   *          is not null, all items are sorted alphabetically. There is a
   *          single empty null element at the end of the array.
   * @param aBook
   *          the non-null item to insert alpabetically into bookList.
   */
  public static void insertInOrder(String[] bookList, String aBook)
  {
    // TODO: look for the spot in the array where the book should be.
    // scoot all the other values down one.
    // finally put the value where it needs to go.
    int spot = 0;
    if (bookList[bookList.length - 2].compareTo(aBook) < 0)
    {
      spot = bookList.length - 1;
    }
    for (int i = 0; i < bookList.length - 1; i++)
    {
      if (bookList[i] != null && bookList[i + 1] != null)
      {
        if (bookList[i].compareTo(aBook) < 0
          && aBook.compareTo(bookList[i + 1]) < 0)
        {
          spot = i + 1;
        }
      }
    }
    for (int i = bookList.length - 1; i >= spot; i--)
    {
      bookList[i] = bookList[i - 1];
    }
    bookList[spot] = aBook;
  }
}