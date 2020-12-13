public class TestCircle
{
  public static void main(String[] args)
  {
    // Create a circle with radius 1
    Circle circle1 = new Circle();
    System.out.println("The area of the circle of radius " + circle1.getRadius()
      + " is " + circle1.getArea());
    System.out.println("and the diameter is " + circle1.getDiameter());

    // Create a circle with radius 25
    Circle circle2 = new Circle(25);
    System.out.println("The area of the circle of radius " + circle2.getRadius()
      + " is " + circle2.getArea());
    System.out.println("and the diameter is " + circle2.getDiameter());

    // Create a circle with radius 125
    Circle circle3 = new Circle(125);
    System.out.println("The area of the circle of radius " + circle3.getRadius()
      + " is " + circle3.getArea());
    System.out.println("and the diameter is " + circle3.getDiameter());

    // Modify circle radius
    circle2.setRadius(100);
    System.out.println("The area of the circle of radius " + circle2.getRadius()
      + " is " + circle2.getArea());
    System.out.println("and the diameter is " + circle2.getDiameter());

  }
}
