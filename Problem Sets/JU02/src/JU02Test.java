
/**
 * Make no changes to this file.
 * Do not submit this file to dropbox.
 * Press play on this file once, then you can press play in the other file
 * at any time.
 */
import static org.junit.Assert.*;
import org.junit.Test;

//Used to keep tests in order
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU02Test
{

  @Test
  public void test01PosZeroNeg1()
  {
    assertEquals("42 is positive.", JU02.posZeroNeg(42));
  }

  @Test
  public void test01PosZeroNeg2()
  {
    assertEquals("-10 is negative.", JU02.posZeroNeg(-10));
  }

  @Test
  public void test01PosZeroNeg3()
  {
    assertEquals("0 is zero.", JU02.posZeroNeg(0));
    assertEquals("-4 is negative.", JU02.posZeroNeg(-4));
    assertEquals("8 is positive.", JU02.posZeroNeg(8));
  }

  @Test
  public void test02IsEvenOrOdd1()
  {
    assertEquals("100 is even.", JU02.isEvenOrOdd(100));
  }

  @Test
  public void test02IsEvenOrOdd2()
  {
    assertEquals("67 is odd.", JU02.isEvenOrOdd(67));
  }

  @Test
  public void test02IsEvenOrOdd3()
  {
    assertEquals("44 is even.", JU02.isEvenOrOdd(44));
  }

  @Test
  public void test02IsEvenOrOdd4()
  {
    assertEquals("13 is odd.", JU02.isEvenOrOdd(13));
  }

  @Test
  public void test03SimpleIf1()
  {
    assertEquals("HiEven", JU02.simpleIf(4));
  }

  @Test
  public void test03SimpleIf2()
  {
    assertEquals("HiFiveAndEven", JU02.simpleIf(30));
  }

  @Test
  public void test03SimpleIf2b()
  {
    assertEquals("HiFiveAndEven", JU02.simpleIf(100));
  }

  @Test
  public void test03SimpleIf3()
  {
    assertEquals("HiFive", JU02.simpleIf(15));
  }

  @Test
  public void test03SimpleIf4()
  {
    assertEquals("Sorry", JU02.simpleIf(81));
  }

  @Test
  public void test03SimpleIf5()
  {
    assertEquals("Sorry", JU02.simpleIf(99));
  }

  @Test
  public void test04GetLetterGrade1()
  {
    assertEquals("A", JU02.getLetterGrade(90));
  }

  @Test
  public void test04GetLetterGrade2()
  {
    assertEquals("B", JU02.getLetterGrade(89));
  }

  @Test
  public void test04GetLetterGrade3()
  {
    assertEquals("B", JU02.getLetterGrade(81));
  }

  @Test
  public void test04GetLetterGrade4()
  {
    assertEquals("C", JU02.getLetterGrade(79));
    assertEquals("C", JU02.getLetterGrade(70));
  }

  @Test
  public void test04GetLetterGrade5()
  {
    assertEquals("D", JU02.getLetterGrade(69));
    assertEquals("D", JU02.getLetterGrade(66));
    assertEquals("D", JU02.getLetterGrade(60));
  }

  @Test
  public void test04GetLetterGrade6()
  {
    assertEquals("F", JU02.getLetterGrade(3));
    assertEquals("F", JU02.getLetterGrade(59));
    assertEquals("F", JU02.getLetterGrade(55));
  }

  @Test
  public void test05xyInfo1()
  {
    assertEquals("(0, 0) is the origin.", JU02.xyInfo(0, 0));
  }

  @Test
  public void test05xyInfo2()
  {
    assertEquals("(4, 0) is on the x-axis.", JU02.xyInfo(4, 0));
    assertEquals("(0, -3) is on the y-axis.", JU02.xyInfo(0, -3));
  }

  @Test
  public void test05xyInfo3()
  {
    assertEquals("(6, 8) is in the first quadrant.", JU02.xyInfo(6, 8));
    assertEquals("(3, 3) is in the first quadrant.", JU02.xyInfo(3, 3));
    assertEquals("(-2, 3) is in the second quadrant.", JU02.xyInfo(-2, 3));
    assertEquals("(-11, 25) is in the second quadrant.", JU02.xyInfo(-11, 25));
  }

  @Test
  public void test05xyInfo4()
  {
    assertEquals("(-1, -7) is in the third quadrant.", JU02.xyInfo(-1, -7));
    assertEquals("(-8, -7) is in the third quadrant.", JU02.xyInfo(-8, -7));
    assertEquals("(3, -7) is in the fourth quadrant.", JU02.xyInfo(3, -7));
    assertEquals("(5, -5) is in the fourth quadrant.", JU02.xyInfo(5, -5));
  }

  @Test
  public void test06CostOfShipping1()
  {
    assertEquals("The shipping cost is $3.5", JU02.costOfShipping(0.75));
    assertEquals("The shipping cost is $3.5", JU02.costOfShipping(1.0));
  }

  @Test
  public void test06CostOfShipping2()
  {
    assertEquals("The shipping cost is $5.5", JU02.costOfShipping(1.22));
    assertEquals("The shipping cost is $5.5", JU02.costOfShipping(3.0));
  }

  @Test
  public void test06CostOfShipping3()
  {
    assertEquals("The shipping cost is $8.5", JU02.costOfShipping(3.02));
    assertEquals("The shipping cost is $8.5", JU02.costOfShipping(9.5));
    assertEquals("The shipping cost is $8.5", JU02.costOfShipping(10));
  }

  @Test
  public void test06CostOfShipping4()
  {
    assertEquals("The shipping cost is $10.5", JU02.costOfShipping(10.3));
    assertEquals("The shipping cost is $10.5", JU02.costOfShipping(15.2));
    assertEquals("The shipping cost is $10.5", JU02.costOfShipping(20));
  }

  @Test
  public void test06CostOfShipping5()
  {
    assertEquals("The package cannot be shipped", JU02.costOfShipping(20.1));
    assertEquals("The package cannot be shipped", JU02.costOfShipping(30));
  }

  @Test
  public void test07inNumericalOrder1()
  {
    assertEquals("3, 5, and 19 are in numerical order.",
      JU02.inNumericalOrder(3, 5, 19));
    assertEquals("3, 2, and 3 are NOT in numerical order.",
      JU02.inNumericalOrder(3, 2, 3));
  }

  @Test
  public void test07inNumericalOrder2()
  {
    assertEquals("5, 5, and 5 are in numerical order.",
      JU02.inNumericalOrder(5, 5, 5));
    assertEquals("5, 5, and 3 are NOT in numerical order.",
      JU02.inNumericalOrder(5, 5, 3));
  }

  @Test
  public void test07inNumericalOrder3()
  {
    assertEquals("6, 10, and 12 are in numerical order.",
      JU02.inNumericalOrder(6, 10, 12));
    assertEquals("8, 5, and 10 are NOT in numerical order.",
      JU02.inNumericalOrder(8, 5, 10));
  }

  @Test
  public void test08NumExpander1()
  {
    assertEquals("914 = 9 X 100 + 1 X 10 + 4 X 1", JU02.numExpander(914));
  }

  @Test
  public void test08NumExpander2()
  {
    assertEquals("528 = 5 X 100 + 2 X 10 + 8 X 1", JU02.numExpander(528));
  }

  @Test
  public void test08NumExpander3()
  {
    assertEquals("652 = 6 X 100 + 5 X 10 + 2 X 1", JU02.numExpander(652));
  }
}
