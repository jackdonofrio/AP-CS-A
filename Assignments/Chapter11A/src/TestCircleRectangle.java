// John Donofrio
public class TestCircleRectangle
{
  public static void main(String[] args)
  {
    Circle circle = new Circle(1);
    System.out.println("A circle " + circle.toString());
    System.out.println("The color is " + circle.getColor());
    System.out.println("The radius is " + circle.getRadius());
    System.out.println("The area is " + circle.getArea());
    System.out.println("The diameter is " + circle.getDiameter());
    System.out
      .println("The border thickness is " + circle.getBorderThickness());
    System.out.println(
      "Changing the border thickness to 24 using the mutator method inherited from GeometricObject: ");
    circle.setBorderThickess(24);
    System.out
      .println("The border thickness is " + circle.getBorderThickness());

    Rectangle rectangle = new Rectangle(2, 4);
    System.out.println("\nA rectangle " + rectangle.toString());
    System.out.println("The area is " + rectangle.getArea());
    System.out.println("The perimeter is " + rectangle.getPerimeter());
    System.out
      .println("The border thickness is " + rectangle.getBorderThickness());
    rectangle.setBorderThickess(13);
    System.out
      .println("The border thickness is " + rectangle.getBorderThickness());

  }
}