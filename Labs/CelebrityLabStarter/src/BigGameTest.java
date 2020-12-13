/**
 * Use to test your Activity 2 and Activity 3 answers.
 * Make no changes to this file.
 * Do not submit this file to dropbox.
 * Press play on this file once, then you can press play in the other file
 * at any time.
 * @version 1.0
 */
import static org.junit.Assert.*;

import java.lang.reflect.Field;
import java.util.ArrayList;

import org.junit.Test;

//Used to keep tests in order
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BigGameTest
{

  @Test
  public void test01CelebrityCtor1()
  {
    Celebrity celeb = new Celebrity("Big Bird", "Covered in yellow feathers");
    assertEquals(
      "The Celebrity's name is: Big Bird. The clue for this celebrity is: Covered in yellow feathers",
      celeb.toString());
  }

  @Test
  public void test01CelebrityCtor2()
  {
    Celebrity celeb =
      new Celebrity("Grace Hopper",
        "Helped invent the COBOL programming language");
    assertEquals(
      "The Celebrity's name is: Grace Hopper. The clue for this celebrity is: Helped invent the COBOL programming language",
      celeb.toString());
  }

  @Test
  public void test02GetClue1()
  {
    Celebrity celeb = new Celebrity("Big Bird", "Covered in yellow feathers");
    assertEquals("Covered in yellow feathers", celeb.getClue());
  }

  @Test
  public void test02GetClue2()
  {
    Celebrity celeb = new Celebrity("Bill Gates", "Created Microsoft");
    assertEquals("Created Microsoft", celeb.getClue());
  }

  @Test
  public void test03GetAnswer1()
  {
    Celebrity celeb = new Celebrity("Big Bird", "Covered in yellow feathers");
    assertEquals("Big Bird", celeb.getAnswer());
  }

  @Test
  public void test03GetAnswer2()
  {
    Celebrity celeb = new Celebrity("Bill Gates", "Created Microsoft");
    assertEquals("Bill Gates", celeb.getAnswer());
  }

  @Test
  public void test04SetClue1()
  {
    Celebrity celeb = new Celebrity("Big Bird", "Covered in yellow feathers");
    celeb.setClue("Friends with Bert and Ernie");
    assertEquals(
      "The Celebrity's name is: Big Bird. The clue for this celebrity is: Friends with Bert and Ernie",
      celeb.toString());
  }

  @Test
  public void test04SetClue2()
  {
    Celebrity celeb = new Celebrity("Bill Gates", "Created Microsoft");
    celeb.setClue("Destroyed the polio disease");
    assertEquals(
      "The Celebrity's name is: Bill Gates. The clue for this celebrity is: Destroyed the polio disease",
      celeb.toString());
  }

  @Test
  public void test05SetAnswer1()
  {
    Celebrity celeb = new Celebrity("Big Bird", "Covered in yellow feathers");
    celeb.setAnswer("Baby Chicken");
    assertEquals(
      "The Celebrity's name is: Baby Chicken. The clue for this celebrity is: Covered in yellow feathers",
      celeb.toString());
  }

  @Test
  public void test05SetAnswer2()
  {
    Celebrity celeb = new Celebrity("Bill Gates", "Created Microsoft");
    celeb.setAnswer("Paul Allen");
    assertEquals(
      "The Celebrity's name is: Paul Allen. The clue for this celebrity is: Created Microsoft",
      celeb.toString());
  }
  
  //TESTS BELOW ARE FOR THE CELEBRITY GAME
  //Activity 3

  @Test
  public void test06ValidateCelebrity1()
  {
    CelebrityGame cg = new CelebrityGame();
    assertTrue(cg.validateCelebrity("Phil"));
    assertTrue(cg.validateCelebrity("Grace"));
    assertFalse(cg.validateCelebrity("Z"));
    assertFalse(cg.validateCelebrity("Ace"));
  }

  @Test
  public void test06ValidateCelebrity2()
  {
    // Test trim method.
    CelebrityGame cg = new CelebrityGame();
    assertTrue(cg.validateCelebrity("  Phil"));
    assertTrue(cg.validateCelebrity("Grace   "));
    assertFalse(cg.validateCelebrity("    Z"));
    assertFalse(cg.validateCelebrity("Ace     "));
  }

  @Test
  public void test07ValidateClue1()
  {
    CelebrityGame cg = new CelebrityGame();
    assertTrue(cg.validateClue("tenletters", ""));
    assertTrue(cg.validateClue("tenletterss", ""));
    assertFalse(cg.validateClue("nottenten", ""));
    assertFalse(cg.validateClue("notten", ""));
  }

  @Test
  public void test07ValidateClue2()
  {
    // Test trim method.
    CelebrityGame cg = new CelebrityGame();
    assertTrue(cg.validateClue("  tenletters", ""));
    assertTrue(cg.validateClue("tenletterss   ", ""));
    assertFalse(cg.validateClue("    nottenten", ""));
    assertFalse(cg.validateClue("notten     ", ""));
  }

  @Test
  public void test08AddCelebrity1()
  {
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("Ford", "Played Han Solo in StarWars", "");
    try
    {
      //Use reflection to see if student modified state correctly.
      Field field = CelebrityGame.class.getDeclaredField("celebGameList");
      field.setAccessible(true);
      Object value = (ArrayList) field.get(cg);
      assertEquals("[The Celebrity's name is: Ford. The clue for this celebrity is: Played Han Solo in StarWars]", value.toString());
    }
    catch (Exception e)
    {
      fail("CelebrityGame.java missing ArrayList celebGameList instance var");
    }
  }
  
  @Test
  public void test08AddCelebrity2()
  {
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("Ford", "Played Han Solo in StarWars", "");
    cg.addCelebrity("Mark Hamil", "Voices Joker in Batman cartoons", "");
    try
    {
      //Use reflection to see if student modified state correctly.
      Field field = CelebrityGame.class.getDeclaredField("celebGameList");
      field.setAccessible(true);
      Object value = (ArrayList) field.get(cg);
      assertEquals("[The Celebrity's name is: Ford. The clue for this celebrity is: Played Han Solo in StarWars, The Celebrity's name is: Mark Hamil. The clue for this celebrity is: Voices Joker in Batman cartoons]", value.toString());
    }
    catch (Exception e)
    {
      fail("CelebrityGame.java missing ArrayList celebGameList instance var");
    }
  }
  
  @Test
  public void test08AddCelebrity3()
  {
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("AAAA", "CLUECLUECLUEA", "");
    cg.addCelebrity("BBBB", "CLUECLUECLUEB", "");
    cg.addCelebrity("CCCC", "CLUECLUECLUEC", "");
    try
    {
      //Use reflection to see if student modified state correctly.
      Field field = CelebrityGame.class.getDeclaredField("celebGameList");
      field.setAccessible(true);
      Object value = (ArrayList) field.get(cg);
      assertEquals("[The Celebrity's name is: AAAA. The clue for this celebrity is: CLUECLUECLUEA, The Celebrity's name is: BBBB. The clue for this celebrity is: CLUECLUECLUEB, The Celebrity's name is: CCCC. The clue for this celebrity is: CLUECLUECLUEC]", value.toString());
    }
    catch (Exception e)
    {
      fail("CelebrityGame.java missing ArrayList celebGameList instance var");
    }
  }
  
  @Test
  public void test09GetCelebrityGameSize1()
  {
    CelebrityGame cg = new CelebrityGame();
    assertEquals("0", cg.getCelebrityGameSize()+"");
  }
  
  @Test
  public void test09GetCelebrityGameSize2()
  {
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("Heyhey", "CLUECLUECLUEhey", "");
    assertEquals("1", cg.getCelebrityGameSize()+"");
  }
  
  @Test
  public void test09GetCelebrityGameSize3()
  {
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("AAAA", "CLUECLUECLUEA", "");
    cg.addCelebrity("BBBB", "CLUECLUECLUEB", "");
    cg.addCelebrity("CCCC", "CLUECLUECLUEC", "");
    assertEquals("3", cg.getCelebrityGameSize()+"");
  }
  
  @Test
  public void test10ProcessGuess1()
  {
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addCelebrity("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("true", cg.processGuess("Grace Hopper") + "");
  }
  @Test
  public void test10ProcessGuess2()
  {
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addCelebrity("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("false", cg.processGuess("Bill Gates") + "");
  }
  
  @Test
  public void test10ProcessGuess1b()
  {
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addCelebrity("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("true", cg.processGuess("GrAce Hopper") + "");
  }
  @Test
  public void test10ProcessGuess2b()
  {
    //This should be false because the first celeb loaded is Grace
    //when the play method is invoked.
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addCelebrity("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("false", cg.processGuess("Ada Lovelace") + "");
  }
  
  @Test
  public void test10ProcessGuess3()
  {
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addCelebrity("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("true", cg.processGuess("Grace Hopper") + "");
    try
    {
      //Use reflection to see if student modified state correctly.
      Field field = CelebrityGame.class.getDeclaredField("celebGameList");
      field.setAccessible(true);
      Object value = (ArrayList) field.get(cg);
      assertEquals("[The Celebrity's name is: Ada Lovelace. The clue for this celebrity is: Created the Analytical Engine]", value.toString());
    }
    catch (Exception e)
    {
      fail("CelebrityGame.java missing ArrayList celebGameList instance var");
    }
  }
  @Test
  public void test10ProcessGuess4()
  {
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addCelebrity("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("false", cg.processGuess("Bill Gates") + "");
    try
    {
      //Use reflection to see if student modified state correctly.
      Field field = CelebrityGame.class.getDeclaredField("celebGameList");
      field.setAccessible(true);
      Object value = (ArrayList) field.get(cg);
      assertEquals("[The Celebrity's name is: Grace Hopper. The clue for this celebrity is: Admiral for the United States Navy, The Celebrity's name is: Ada Lovelace. The clue for this celebrity is: Created the Analytical Engine]", value.toString());
    }
    catch (Exception e)
    {
      fail("CelebrityGame.java missing ArrayList celebGameList instance var");
    }
  }
  
  @Test
  public void test10ProcessGuess5()
  {
    //When a player guesses correct, the current gameCelebrity changes
    //to the next one in the array list.
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addCelebrity("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("true", cg.processGuess("Grace Hopper") + "");
    try
    {
      //Use reflection to see if student modified state correctly.
      Field field = CelebrityGame.class.getDeclaredField("gameCelebrity");
      field.setAccessible(true);
      Object value = (Celebrity) field.get(cg);
      assertEquals("The Celebrity's name is: Ada Lovelace. The clue for this celebrity is: Created the Analytical Engine", value.toString());
    }
    catch (Exception e)
    {
      fail("CelebrityGame.java missing ArrayList celebGameList instance var");
    }
  }
  @Test
  public void test10ProcessGuess6()
  {
    //When a player guesses wrong, the current gameCelebrity remains
    //the same.
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("Grace Hopper", "Admiral for the United States Navy", "");
    cg.addCelebrity("Ada Lovelace", "Created the Analytical Engine", "");
    cg.play();
    assertEquals("false", cg.processGuess("Bill Gates") + "");
    try
    {
      //Use reflection to see if student modified state correctly.
      Field field = CelebrityGame.class.getDeclaredField("gameCelebrity");
      field.setAccessible(true);
      Object value = (Celebrity) field.get(cg);
      assertEquals("The Celebrity's name is: Grace Hopper. The clue for this celebrity is: Admiral for the United States Navy", value.toString());
    }
    catch (Exception e)
    {
      fail("CelebrityGame.java missing ArrayList celebGameList instance var");
    }
  }
  
  @Test
  public void test10ProcessGuess7()
  {
    //When a player guesses correctly, and there are
    //no more celebs to guess, then an empty celeb is set
    //as the current celebrity (where the clue and answer are both "")
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("Grace Hopper", "Admiral for the United States Navy", "");
    cg.play();
    assertEquals("true", cg.processGuess("Grace Hopper") + "");
    try
    {
      //Use reflection to see if student modified state correctly.
      Field field = CelebrityGame.class.getDeclaredField("gameCelebrity");
      field.setAccessible(true);
      Object value = (Celebrity) field.get(cg);
      assertEquals("The Celebrity's name is: . The clue for this celebrity is: ", value.toString());
    }
    catch (Exception e)
    {
      fail("CelebrityGame.java missing ArrayList celebGameList instance var");
    }
  }
  
  @Test
  public void test10ProcessGuess8()
  {
    //General test for processGuess method.
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("AAAA", "CLUECLUECLUE1", "");
    cg.addCelebrity("BBBB", "CLUECLUECLUE2", "");
    cg.addCelebrity("CCCC", "CLUECLUECLUE3", "");
    cg.addCelebrity("DDDD", "CLUECLUECLUE4", "");
    cg.addCelebrity("EEEE", "CLUECLUECLUE5", "");
    cg.play();
    assertEquals("true", cg.processGuess("AAAA") + "");
    assertEquals("true", cg.processGuess("bbbb") + "");
    assertEquals("false", cg.processGuess("zzzz") + "");
    assertEquals("true", cg.processGuess("CCCC") + "");
    try
    {
      //Use reflection to see if student modified state correctly.
      Field field = CelebrityGame.class.getDeclaredField("gameCelebrity");
      field.setAccessible(true);
      Object value = (Celebrity) field.get(cg);
      assertEquals("The Celebrity's name is: DDDD. The clue for this celebrity is: CLUECLUECLUE4", value.toString());
    }
    catch (Exception e)
    {
      fail("CelebrityGame.java missing ArrayList celebGameList instance var");
    }
  }
  
  @Test
  public void test10ProcessGuess9()
  {
    //General test for processGuess method.
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("AAAA", "CLUECLUECLUE1", "");
    cg.addCelebrity("BBBB", "CLUECLUECLUE2", "");
    cg.addCelebrity("CCCC", "CLUECLUECLUE3", "");
    cg.addCelebrity("DDDD", "CLUECLUECLUE4", "");
    cg.addCelebrity("EEEE", "CLUECLUECLUE5", "");
    cg.play();
    assertEquals("true", cg.processGuess("AAAA") + "");
    assertEquals("true", cg.processGuess("bbbb") + "");
    assertEquals("false", cg.processGuess("zzzz") + "");
    assertEquals("true", cg.processGuess("CCCC") + "");
    try
    {
      //Use reflection to see if student modified state correctly.
      Field field = CelebrityGame.class.getDeclaredField("celebGameList");
      field.setAccessible(true);
      Object value = (ArrayList) field.get(cg);
      assertEquals("[The Celebrity's name is: DDDD. The clue for this celebrity is: CLUECLUECLUE4, The Celebrity's name is: EEEE. The clue for this celebrity is: CLUECLUECLUE5]", value.toString());
    }
    catch (Exception e)
    {
      fail("CelebrityGame.java missing ArrayList celebGameList instance var");
    }
  }
  
  @Test
  public void test11SendClue1()
  {
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("Clifford", "A big red dog", "");
    cg.play();
    assertEquals("A big red dog", cg.sendClue());
  }
  
  @Test
  public void test11SendClue2()
  {
    CelebrityGame cg = new CelebrityGame();
    cg.addCelebrity("Dora", "The explorer", "");
    cg.play();
    assertEquals("The explorer", cg.sendClue());
  }

}
