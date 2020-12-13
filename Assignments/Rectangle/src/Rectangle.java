/**
 * Name: John Donofrio
 * Lesson: 7.6 Program It: Rectangle
 */

import java.util.Scanner;

public class Rectangle
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to John Donofrio's Rectangle App.");

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the width of the rectangle:");
    double width = input.nextDouble();

    System.out.println("Please enter the height of the rectangle");
    double height = input.nextDouble();

    System.out
      .println("For your rectangle with dimensions " + width + " X " + height);
    System.out.println("The area is " + (width * height));
    System.out.println("The perimeter is " + ((2 * width) + (2 * height)));
  }
}
