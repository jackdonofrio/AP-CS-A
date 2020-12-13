import java.util.*;

public class TodaysDate
{
  public static void main(String[] args)
  {
    Date today = Calendar.getInstance().getTime();
    String tday = today + ""; 
    String tdate = tday.substring(8, 10);
    String[] day = {"Su", " Mo", " Tu", " We", " Th", " Fr", " Sa\n"};
    String finalString = "";
    for (String e : day)
      System.out.print(e);
    int[][] array =
      {{01, 02, 03, 04, 05, 06, 07}, {8, 9, 10, 11, 12, 13, 14},
          {15, 16, 17, 18, 19, 20, 21}, {22, 23, 24, 25, 26, 27, 28},
          {29, 30, 31}};
    for (int i = 0; i < array.length; i++)
    {
      for (int k = 0; k < array[i].length; k++)
      {
        if ((array[i][k] + "").equals(tdate))
          finalString += "@@ ";
        // @@ = today
        else if (array[i][k] < 10)
          finalString += " " + array[i][k] + " ";
        else
          finalString += array[i][k] + " ";
      }
      finalString += "\n";
    }
    System.out.print(finalString);
    
    System.out.println("Day: " + tday.substring(0,3));
    System.out.println("Month: " + tday.substring(4,8));
    System.out.println("Date: " + tday.substring(8,10)); 
    System.out.println("Time: " + tday.substring(11,16)); 
    System.out.print("Year: " + tday.substring(24,28)); 
  }
}