public class PolymorphismDemo
{
  public static void main(String[] args)
  {
    GeometricObject geoObj = new GeometricObject("green", false);
    Circle circObj1 = new Circle(1, "red", false);
    Circle circObj2 = new Circle(5, "blue", true);
    Rectangle rectObj1 = new Rectangle(1, 1, "black", true);
    Rectangle rectObj2 = new Rectangle(5, 3, "orange", false);
    Triangle triObj1 = new Triangle(3, 4, 5);
    Triangle triObj2 = new Triangle(5, 12, 13);
    

    System.out.println("DisplayObject output - no polymorphic behavior because"
      + "\ngetDateCreated and getColor are never overridden by any subclass:");
    System.out.println("Notice that all of these are different types, yet");
    System.out.println("displayObject can accept all of them.");
    displayObject(geoObj);
    displayObject(circObj1);
    displayObject(rectObj1);
    displayObject(triObj1);

    System.out.println("\nWhen you add specific overridden versions of toString");
    System.out.println("to Circle and Rectangle, then you'll see the differences here:");
    System.out.println("(Notice that Triangle outputs differently because it already has an");
    System.out.println("overridden toString.)");

    useToStringToDisplayObject(geoObj);
    useToStringToDisplayObject(circObj1);
    useToStringToDisplayObject(circObj2);
    useToStringToDisplayObject(rectObj1);
    useToStringToDisplayObject(rectObj2);
    useToStringToDisplayObject(triObj1);
    useToStringToDisplayObject(triObj2);

  }

  /**
   * What's important here is that you can see that different types are being
   * passed to GeometricObject like Rectangles, Triangles, Circles. This is
   * allowed in Java because all of these types extend GeometricObject.
   */
  public static void displayObject(GeometricObject object)
  {
    System.out.println("Created on " + object.getDateCreated() + ". Color is "
      + object.getColor());
  }

  /**
   * Since Object is the great grandpa of all classes (i.e. all classes
   * eventually extend Object) you can pass in any Java type and it will
   * compile. Now this demonstrates polymorphic behavior IF your class overrides
   * the one in GeometricObject. GeometricObject did override the Object's
   * version, but you'll need to add more info to your subclasses and override
   * toString in those as well.
   */
  public static void useToStringToDisplayObject(Object item)
  {
    System.out.println(item.toString());
  }

}
