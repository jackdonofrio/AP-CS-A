/**
 * Do not just test one method at a time, or static
 * variables will be offset.  Make sure to always
 * run all tests at once.
 */
import static org.junit.Assert.*;

import java.lang.reflect.Field;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
//keep the tests from scrambling otherwise would drive students insane.
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU12Test
{

  @Test
  public void test01TestGetRectangleSentence1()
  {
    Rectangle box = new Rectangle(); //#1
    assertEquals("1.0 X 1.0", box.getBasicDimensions());
  }

  @Test
  public void test01TestGetRectangleSentence2()
  {
    Rectangle box = new Rectangle(2, 5.51); //#2
    Rectangle square = new Rectangle(5, 5); //#3
    Rectangle table = new Rectangle(3, 8); //#4
    Rectangle roof = new Rectangle(9, 4); //#5
    assertEquals("9.0 X 4.0", roof.getBasicDimensions());
  }

  @Test
  public void test02TestGetArea1()
  {
    Rectangle box = new Rectangle(3, 4); //#6
    assertEquals("12.0", box.getArea() + "");
  }

  @Test
  public void test02TestGetArea2()
  {
    Rectangle box = new Rectangle(7, 5); //#7
    assertEquals("35.0", box.getArea() + "");
  }

  @Test
  public void test03TestPerimeter1()
  {
    Rectangle box = new Rectangle(7, 4); //#8
    assertEquals("22.0", box.getPerimeter() + "");
  }

  @Test
  public void test03TestPerimeter2()
  {
    Rectangle box = new Rectangle(3, 2); //#9
    assertEquals("10.0", box.getPerimeter() + "");
  }
  
  @Test
  public void test04FancyDimensions1()
  {
    Rectangle box = new Rectangle(); //#10
    assertEquals("Rectangle #10 is 1.0 X 1.0", box.getFancyDimensions());
  }
  
  @Test
  public void test04FancyDimensions2()
  {
    Rectangle box = new Rectangle(66, 42); //#10
    assertEquals("Rectangle #11 is 66.0 X 42.0", box.getFancyDimensions());
  }
  
  @Test
  public void test04FancyDimensions3()
  {
    Rectangle box = new Rectangle(); //#11
    Rectangle door = new Rectangle(3, 4); //#12
    Rectangle fridge = new Rectangle(3, 4); //#13
    assertEquals("Rectangle #14 is 3.0 X 4.0", fridge.getFancyDimensions());
  }

  @Test
  public void test05TestScale1()
  {
    Rectangle box = new Rectangle(5, 1);
    box.scale(2.0);
    assertEquals("10.0 X 2.0", box.getBasicDimensions());
  }
  
  @Test
  public void test05TestScale2()
  {
    Rectangle box = new Rectangle(7, 4);
    box.scale(0.5);
    assertEquals("3.5 X 2.0", box.getBasicDimensions());
  }
  
  @Test
  public void test05TestScale3()
  {
    Rectangle box = new Rectangle(7, 5);
    box.scale(-2.0);
    assertEquals("7.0 X 5.0", box.getBasicDimensions());
  }
  
  @Test
  public void test05TestScale4()
  {
    Rectangle box = new Rectangle(8, 8);
    box.scale(-0.0001);
    assertEquals("8.0 X 8.0", box.getBasicDimensions());
  }
  
  @Test
  public void test06SuccessfulScaleCount1()
  {
    Rectangle door = new Rectangle(8, 15);
    assertEquals("2", Rectangle.getScaleCount()  + "");
  }
  @Test
  public void test06SuccessfulScaleCount2()
  {
    Rectangle door = new Rectangle(8, 15);
    door.scale(3);
    door.scale(10);
    door.scale(20);
    door.scale(-2.0); //will not scale negative.
    assertEquals("5", Rectangle.getScaleCount()  + "");
  }
  
  @Test
  public void test06SuccessfulScaleCount3()
  {
    Rectangle door = new Rectangle(8, 15);
    door.scale(-3);
    door.scale(100);
    door.scale(-12);
    door.scale(20);
    door.scale(-2.0);
    assertEquals("7", Rectangle.getScaleCount()  + "");
  }

}