import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RefresherTest
{

  @Test
  public void stringTest()
  {
    assertEquals("Hello!", JavaRefresher.stringTest());
  }

  @Test
  public void exponentTest()
  {
    assertEquals("100.0", JavaRefresher.exponentTest(10) + "");
    assertEquals("49.0", JavaRefresher.exponentTest(7) + "");
    assertEquals("144.0", JavaRefresher.exponentTest(12) + "");
    assertEquals("625.0", JavaRefresher.exponentTest(25) + "");
  }

  @Test
  public void sqrtTest()
  {
    assertEquals("10.0", JavaRefresher.sqrtTest(100) + "");
    assertEquals("7.0", JavaRefresher.sqrtTest(49) + "");
    assertEquals("25.0", JavaRefresher.sqrtTest(625) + "");
    assertEquals("12.0", JavaRefresher.sqrtTest(144) + "");
  }

  @Test
  public void multiplicationTest()
  {
    assertEquals("720", JavaRefresher.multiplicationTest() + "");
  }

  @Test
  public void whatsUpTest()
  {
    assertEquals("What's up, Jack", JavaRefresher.whatsUp("Jack"));
  }
}
