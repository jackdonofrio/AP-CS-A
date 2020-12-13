import java.util.*;
public class Palindromes
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter text: ");
    String str = in.next(); // get user input    
    String reverse = reverse(str);
    System.out.println("Reverse = " + reverse);
    if (reverse.equals(str)) 
      System.out.println(str + " is a palindrome.");
    else
      System.out.println(str + " is not a palindrome");
  }
  public static String reverse(String str) {
    String reverse = "";
    for (int i = str.length() - 1; i >= 0; i--) {
      reverse += str.substring(i, i + 1);
    } 
    return reverse;
  }
}
