import java.util.Arrays;

/**
 * Complete these methods. You are not allowed to use Array and System methods
 * like arraycopy to solve this. You may not use the break statement either.
 * 
 * @author John Donofrio
 * @version 2.0
 */

public class Course
{
  // Leave these instance variables alone.
  private String name;
  private String[] students = new String[2]; // do not change the value 2.
  private int numberOfStudents;

  // Leave this constructor alone.
  public Course(String name)
  {
    this.name = name;
  }

  /**
   * Adds a new student to the array. If there is not enough room in the array,
   * then we'll increase the size by calling the increaseSize method.
   * 
   * @param student
   */
  public void addStudent(String student)
  {
    if (students.length < numberOfStudents + 1)
    {
      increaseSize();
    }
    students[numberOfStudents] = student;
    numberOfStudents++;
  }

  /**
   * Double the size of the student array to make space for more students. When
   * you double the size make sure to copy the existing students into the new
   * array.
   */
  public void increaseSize()
  {
    String[] temp = new String[students.length * 2];
    for (int i = 0; i < students.length; i++)
    {
      temp[i] = students[i];
    }
    students = temp;
  }

  /**
   * ALREADY DONE. DO NOT MODIFY. A getter method to return a reference to the
   * students array.
   * 
   * @return
   */
  public String[] getStudents()
  {
    return students; // DO NOT CHANGE ANYTHING HERE.
  }

  /**
   * Simple accessor method to return the number of students in the database.
   * 
   * @return
   */
  public int getNumberOfStudents()
  {
    return numberOfStudents; // DO NOT CHANGE
  }

  /**
   * Clear the course, and sets the number of students back to zero, and sets
   * the array to two.
   **/
  public void clear()
  {
    students = new String[2];
    numberOfStudents = 0;
  }

  /**
   * Probably the most complex method. Remove a student from the course if the
   * student is in the array. First find the location of the student. Then shift
   * all of the items in the array down one. Leave the capacity of the students
   * array the same.
   */
  public void dropStudent(String student)
  {
    int index = -1;
    for (int i = 0; i < students.length; i++)
    {
      if (student.equals(students[i]))
        index = i;
    }

    if (index != -1)
    {
      for (int k = index; k < students.length - 1; k++)
      {
        students[k] = students[k + 1];
      }
      students[students.length - 1] = null;
      numberOfStudents--;
    }

  }
}
