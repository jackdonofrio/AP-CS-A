import java.util.Scanner;

public class SphereSurfaceArea
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to John Donofrio's Sphere App!");
    System.out
      .println("Please enter the volume of the sphere (in cubic meters):");
    double volume = input.nextDouble();
    double surfaceArea =
      Math.pow(3.14159, 1.0 / 3) * Math.pow(6 * volume, 2.0 / 3);
    double radius = Math.pow((3 * volume) / (4 * 3.14159), 1.0 / 3);
    System.out.println("The surface area of a sphere with volume " + volume
      + " is " + surfaceArea + " square meters.");
    System.out.println("The radius of that sphere is " + radius + " meters.");
    System.out.println("Have a great day!");
  }
}
