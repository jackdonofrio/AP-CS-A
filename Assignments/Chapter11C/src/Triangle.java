class Triangle extends GeometricObject
{
  private double side1, side2, side3;

  /** Constructor */
  public Triangle()
  {
    side1 = 1.0;
    side2 = 1.0;
    side3 = 1.0;
  }

  /** Constructor */
  public Triangle(double side1, double side2, double side3)
  {
    this.side1 = side1;
    this.side2 = side2;
    this.side3 = side3;
  }

  public double getSide1()
  {
    return side1;
  }

  public double getSide2()
  {
    return side2;
  }

  public double getSide3()
  {
    return side3;
  }

  public double getArea()
  {
    double s = (side1 + side2 + side3) / 2;
    return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
  }

  public double getPerimeter()
  {
    return side1 + side2 + side3;
  }

  /**
   * Yeah this is overriding GeometricObject's toString but you need to call
   * super to get the parent's info about color and date.
   */
  public String toString()
  {
    // Implement it to return the three sides
    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = "
      + side3 + " " + super.toString();
  }
}
