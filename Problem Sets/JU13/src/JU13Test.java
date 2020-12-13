/**
 * version 2.0 - fixed double size related tests.
 */
import static org.junit.Assert.*;
import java.util.Arrays;
import org.junit.Test;

//keep the tests from scrambling otherwise would drive students insane.
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class JU13Test
{
  @Test
  public void test01TestAddStudentSimple1()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    assertEquals("[Peter Jones, null]", Arrays.toString(course1.getStudents()));
  }
  
  @Test
  public void test01TestAddStudentSimple2()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    assertEquals("[Peter Jones, Brian Smith]", Arrays.toString(course1.getStudents()));
  }
 
  
  @Test
  public void test01TestIncreaseSize1()
  {
    Course course1 = new Course("Data Structures");
    course1.increaseSize();
    assertEquals("[null, null, null, null]", Arrays.toString(course1.getStudents())); 
  }
  
  @Test
  public void test01TestIncreaseSize2()
  {
    Course course1 = new Course("Data Structures");
    course1.increaseSize();
    course1.increaseSize();

    assertEquals("[null, null, null, null, null, null, null, null]", Arrays.toString(course1.getStudents())); 
  }
  
  @Test
  public void test01TestIncreaseSize3()
  {
    Course course1 = new Course("Data Structures");
    course1.increaseSize();
    course1.increaseSize();
    course1.increaseSize();
    course1.increaseSize();

    assertEquals("[null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]", Arrays.toString(course1.getStudents())); 

  }
  
  @Test
  public void test03TestAddStudent1()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("S3");
    assertEquals("[Peter Jones, Brian Smith, S3, null]", Arrays.toString(course1.getStudents())); 
  }
  
  @Test
  public void test03TestAddStudent2()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("S3");
    course1.addStudent("S4");
    course1.addStudent("S5");
    assertEquals("[Peter Jones, Brian Smith, S3, S4, S5, null, null, null]", Arrays.toString(course1.getStudents())); 
  }
  
  @Test
  public void test03TestAddStudent3()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("S3");
    course1.addStudent("S4");
    course1.addStudent("Douglas Adams");
    course1.addStudent("S6");
    assertEquals("[Peter Jones, Brian Smith, S3, S4, Douglas Adams, S6, null, null]", Arrays.toString(course1.getStudents())); 
  }
  
  @Test
  public void test03TestAddStudent4()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("S3");
    course1.addStudent("S4");
    course1.addStudent("S5");
    course1.addStudent("S6");
    course1.addStudent("S7");
    course1.addStudent("Douglas Adams");
    course1.addStudent("S9");
    assertEquals("[Peter Jones, Brian Smith, S3, S4, S5, S6, S7, Douglas Adams, S9, null, null, null, null, null, null, null]", Arrays.toString(course1.getStudents())); 
  }
  
  @Test
  public void test03TestAddStudent5()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("S3");
    course1.addStudent("S4");
    course1.addStudent("S5");
    course1.addStudent("S6");
    course1.addStudent("S7");
    course1.addStudent("S8");
    course1.addStudent("S9");
    course1.addStudent("S10");
    course1.addStudent("S11");
    course1.addStudent("S12");
    course1.addStudent("S13");
    assertEquals("[Peter Jones, Brian Smith, S3, S4, S5, S6, S7, S8, S9, S10, S11, S12, S13, null, null, null]", Arrays.toString(course1.getStudents())); 
  }
  
  @Test
  public void test04TestClear1()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    course1.clear();
    assertEquals("[null, null]", Arrays.toString(course1.getStudents())); 
  }
  
  @Test
  public void test04TestClear2()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.clear();
    assertEquals("0", course1.getNumberOfStudents() + ""); 
    assertEquals("[null, null]", Arrays.toString(course1.getStudents())); 
  }
  
  @Test
  public void test04TestClear3()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("S3");
    course1.clear();
    assertEquals("0", course1.getNumberOfStudents() + ""); 
    assertEquals("[null, null]", Arrays.toString(course1.getStudents())); 
  }
  
  @Test
  public void test05TestDropStudent1()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.dropStudent("Peter Jones");
    assertEquals("[Brian Smith, null]", Arrays.toString(course1.getStudents())); 
  }
  
  @Test
  public void test05TestDropStudent2()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.dropStudent("Brian Smith");
    assertEquals("[Peter Jones, null]", Arrays.toString(course1.getStudents())); 
  }
  
  @Test
  public void test05TestDropStudent3()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("S3");
    course1.addStudent("S4");
    course1.addStudent("S5");

    course1.dropStudent("S3");
    assertEquals("[Peter Jones, Brian Smith, S4, S5, null, null, null, null]", Arrays.toString(course1.getStudents())); 
  }
  
  @Test
  public void test05TestDropStudent4()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("S3");
    course1.addStudent("S4");
    course1.addStudent("S5");
    course1.dropStudent("Buzz Lightyear");
    assertEquals("[Peter Jones, Brian Smith, S3, S4, S5, null, null, null]", Arrays.toString(course1.getStudents())); 
  }
  
  @Test
  public void test05TestDropStudent5()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("S3");
    course1.addStudent("S4");
    course1.addStudent("S5");
    course1.dropStudent("S3");
    course1.dropStudent("Peter Jones");
    assertEquals("3", course1.getNumberOfStudents() + ""); 
  }
  
  @Test
  public void test05TestDropStudent6()
  {
    Course course1 = new Course("Data Structures");
    course1.addStudent("Peter Jones");
    course1.addStudent("Brian Smith");
    course1.addStudent("S3");
    course1.addStudent("S4");
    course1.addStudent("S5");
    course1.dropStudent("S3");
    course1.dropStudent("Peter Jones");
    course1.dropStudent("S4");
    assertEquals("2", course1.getNumberOfStudents() + ""); 
  }
  
  @Test
  public void test05TestDropStudent7()
  {
    Course course1 = new Course("Star Wars");
    course1.addStudent("Darth Vader");
    course1.addStudent("Rey");
    course1.addStudent("Darth Maul");
    course1.addStudent("Obiwan Kenobi");
    course1.addStudent("RD2D");
    course1.dropStudent("Darth Silly");
    course1.dropStudent("RD2D");
    course1.dropStudent("Rey");
    assertEquals("3", course1.getNumberOfStudents() + ""); 
  }
}
  