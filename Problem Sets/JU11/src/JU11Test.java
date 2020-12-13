
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

//keep the tests from scrambling otherwise would drive students insane.
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU11Test
{
  @Test
  public void test01TestGetGasLevel1()
  {
    GasTank tank1 = new GasTank(20);
    assertEquals("0.0", tank1.getGasLevel() + "");
  }
  
  @Test
  public void test01TestIsEmpty1()
  {
    GasTank tank1 = new GasTank(20);
    
    assertEquals("true", tank1.isEmpty() + "");
  }
  

  
  @Test
  public void test01TestGetGasLevel2()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(15);
    assertEquals("15.0", tank1.getGasLevel() + "");
  }
  
  @Test
  public void test01TestGetGasLevel3()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(15);
    tank1.addGas(3);
    assertEquals("18.0", tank1.getGasLevel() + "");
  }
  

  
  @Test
  public void test01TestUseGas1()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(10);
    tank1.useGas(7);
    assertEquals("3.0", tank1.getGasLevel() + "");
  }
  
  @Test
  public void test01TestUseGas2()
  {
    GasTank tank1 = new GasTank(100);
    tank1.addGas(20);
    tank1.useGas(7);
    tank1.useGas(5);
    assertEquals("8.0", tank1.getGasLevel() + "");
  }
  
  @Test
  public void test01TestUseGas3()
  {
    GasTank tank1 = new GasTank(100);
    tank1.addGas(20);
    tank1.useGas(7);
    tank1.useGas(500);
    assertEquals("0.0", tank1.getGasLevel() + "");
  }
  
  @Test
  public void test01TestUseGas4()
  {
    GasTank tank1 = new GasTank(100);
    tank1.addGas(20);
    tank1.useGas(7);
    tank1.useGas(73);
    assertEquals("0.0", tank1.getGasLevel() + "");
  }
  
  @Test
  public void test01TestIsEmpty2()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(0.09);
    assertEquals("true", tank1.isEmpty() + "");
  }
  
  @Test
  public void test01TestIsEmpty3()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(0.1);
    assertEquals("false", tank1.isEmpty() + "");
  }
  
  @Test
  public void test01IsFull1()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(20);
    assertEquals("true", tank1.isFull() + "");
  }
  
  @Test
  public void test01IsFull2()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(19.91);
    assertEquals("true", tank1.isFull() + "");
  }
  
  @Test
  public void test01IsFull3()
  {
    GasTank tank1 = new GasTank(20);
    tank1.addGas(19.89);
    assertEquals("false", tank1.isFull() + "");
  }
  
  @Test
  public void test01IsFull4()
  {
    GasTank tank1 = new GasTank(100);
    tank1.addGas(99.91);
    assertEquals("true", tank1.isFull() + "");
  }

}