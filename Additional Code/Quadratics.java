import java.util.Scanner;

public class Quadratics
{
  public static void main(String[] args)

  {
    Scanner in = new Scanner(System.in);
    System.out.print("A:");
    double a = in.nextDouble();
    System.out.print("B:");
    double b = in.nextDouble();
    System.out.print("C:");
    double c = in.nextDouble();
    double discriminant = Math.pow(b, 2) - 4 * a * c;
    double root1 = ((-1 * b) + Math.pow(discriminant, .5)) / 2.0;
    double root2 = ((-1 * b) - Math.pow(discriminant, .5)) / 2.0;
    if (discriminant == 0)
      System.out.println("No roots");
    if (discriminant > 0)
      System.out.println("Roots: \n" + root1 + "\n" + root2);
    else
      System.out.println("No roots");
  }
}
