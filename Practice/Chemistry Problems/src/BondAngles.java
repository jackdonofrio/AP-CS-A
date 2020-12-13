import java.util.Scanner;
/* some of it is still buggy
 * I am pretty busy rn
 * But I will fix it eventually :)
 */
public class BondAngles
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    String shape = "null";
    double bondAngle = 0.0;
    System.out.println("How many atoms are bonded to the central atom?");
    int bonds = input.nextInt();
    if (bonds == 1)
    {
      shape = "linear";
      bondAngle = 180;
    }
    else if (bonds > 1)
    {
      System.out.println("How many lone pairs are there?");
      int lonePairs = input.nextInt();
      if (bonds == 2 && lonePairs == 0)
      {
        shape = "linear";
        bondAngle = 180;
      }
      if (bonds == 3 && lonePairs == 0)
      {
        shape = "trigonal planar";
        bondAngle = 120;
      }
      if (bonds == 2 && lonePairs == 1)
      {
        shape = "bent";
        bondAngle = 104.5;
      }
      if (bonds == 4 && lonePairs == 0)
      {
        shape = "tetrahedral";
        bondAngle = 109.5;
      }
      if (bonds == 3 && lonePairs == 1)
      {
        shape = "trigonal pyramidal";
        bondAngle = 107;
      }
      if (bonds == 2 && lonePairs == 2)
      {
        shape = "bent";
        bondAngle = 109.5;
      }
    }
    System.out.println("The molecular shape is " + shape
      + " and the bond angle is " + bondAngle);
  }
}
