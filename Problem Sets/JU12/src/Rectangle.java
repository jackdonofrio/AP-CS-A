// John Donofrio
public class Rectangle
{

  // constants - there's only one needed.
  public static final int MIN_FACTOR = 0;

  // static variables
  private static int rectangleCount = 0;
  private static int scaleCount = 0;

  // instance variables
  private double width;
  private double height;

  /**
   * Default ctor. Constructs a rectangle with width 1 and height 1.
   */
  public Rectangle()
  {
    width = 1;
    height = 1;
    rectangleCount++;
  }

  /**
   * Ctor with params to construct any size rectangle.
   * 
   * @param newWidth
   * @param newHeight
   */
  public Rectangle(double newWidth, double newHeight)
  {
    width = newWidth;
    height = newHeight;
    rectangleCount++;
  }

  /**
   * Gets the area of a rectangle.
   * 
   * @return
   */
  public double getArea()
  {
    return height * width;
  }

  /**
   * Gets the perimeter of a rectangle.
   * 
   * @return
   */
  public double getPerimeter()
  {
    return 2 * width + 2 * height;
  }

  /**
   * Scales the rectangle by a given factor only if the number is 0 or positive.
   * Otherwise leaves the dimensions unchanged.
   * 
   * @param factor
   */
  public void scale(double factor)
  {
    if (factor >= MIN_FACTOR)
    {
      width *= factor;
      height *= factor;
      scaleCount++;
    }
  }

  /**
   * Returns the dimensions of a rectangle in the format 3 X 5
   * 
   * @return
   */
  public String getBasicDimensions()
  {
    return width + " X " + height;
  }

  /**
   * Returns the dimensions of a rectangle along with the unique ID number of
   * that rectangle. The ID of the first rectangle created ever is 1. "Rectangle
   * #34 is 7 X 4" This means that this is the 34th rectangle ever created.
   * 
   * @return
   */
  public String getFancyDimensions()
  {

    return "Rectangle #" + rectangleCount + " is " + width + " X " + height;
  }

  /**
   * returns the number of times all rectangles have been scaled successfully.
   * 
   * @return
   */
  public static int getScaleCount()
  {
    return scaleCount;
  }

}
