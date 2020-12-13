// John Donofrio
import java.util.Scanner;

public class TriangleApp
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three sides separated by spaces: ");
    double side1 = input.nextDouble();
    double side2 = input.nextDouble();
    double side3 = input.nextDouble();
    System.out.print("Enter the color: ");
    String color = input.next();
    System.out.print("Enter a boolean value for filled: ");
    boolean filled = input.nextBoolean();

    Triangle triangle = new Triangle(side1, side2, side3);
    triangle.setColor(color);
    triangle.setFilled(filled);

    System.out.println("\n-----RESULTS-----");
    System.out.println("Side 3 has length " + side3);
    System.out.println("The color is " + triangle.getColor());
    System.out.print("The triangle is ");
    if (!triangle.isFilled())
      System.out.print("not ");
    System.out.println("filled.");
    System.out.println("The area is " + triangle.getArea());
    System.out.println("The perimeter is " + triangle.getPerimeter());
    System.out.println(triangle.toString());

  }
}
