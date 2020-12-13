// Define the circle class with two constructors
public class Circle
{
  private double radius;
  // instance must always be private so they cannot be accessed directly from
  // another file

  /** Construct a circle with radius 1 */
  Circle()
  {
    radius = 1;
  }

  /** Construct a circle with a specified radius */
  Circle(double newRadius)
  {
    radius = newRadius;
  }

  // NEW - gets diameter of circle
  public double getDiameter()
  {
    return 2 * radius;
  }

  // NEW - gets radius
  public double getRadius()
  {
    return radius;
  }

  /** Return the area of this circle */
  public double getArea()
  {
    return radius * radius * Math.PI;
  }

  /** Return the perimeter of this circle */
  public double getPerimeter()
  {
    return 2 * Math.PI * radius;
  }

  /** Set a new radius for this circle */
  public void setRadius(double newRadius)
  {
    radius = newRadius;
  }

}
