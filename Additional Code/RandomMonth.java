
// Generate random number from x to y ----> (int)(Math.random() * (y - x + 1)) + x
import java.util.*;

public class RandomMonth
{
  
  /* Generates random number. 
   * Array 0-11 (12 length) for each month.
   * Each month is months[monthNo - 1]
   */
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    int monthNo = (int) (Math.random() * (12)) + 1;
    String[] months =
      {"January", "February", "March", "April", "May", "June", "July", "August",
          "September", "October", "November", "December"};
    System.out.println(monthNo + "\n" + months[monthNo - 1]);

  }

}