/* Made by John Donofrio
 * Lesson 9.3 Program It: DivModQuiz
 */
import java.util.Scanner;

public class DivModQuiz
{
  public static void main(String[] args)
  {
    // Generate two random integers. numerator is from 10-30, denominator is
    // from 2-10
    int number1 = (int) (Math.random() * (30 - 10 + 1)) + 10; // number1 is the
                                                              // numerator
    int number2 = (int) (Math.random() * (10 - 2 + 1)) + 2; // number2 is the
                                                            // denominator
    // Prompt the student to answer "What is number1 / number2?"
    System.out.print("What is " + number1 + " / " + number2 + "?");
    Scanner input = new Scanner(System.in);
    int divAnswer = input.nextInt();
    // Check the answer and display whether it is correct or not
    if (number1 / number2 == divAnswer)
      System.out.println("You are correct!");
    else
    {
      System.out.println("Sorry, your answer is wrong.");
      System.out.println(
        number1 + " / " + number2 + " should be " + (number1 / number2));
    }
    // Prompt the student to answer "What is number 1 % number2?"
    System.out.println("What is " + number1 + " % " + number2 + "?");
    int modAnswer = input.nextInt();
    // Check if the answer is correct or not, display results.
    if (number1 % number2 == modAnswer)
      System.out.println("Correct!");
    else
    {
      System.out.println("Sorry, your answer is incorrect.");
      System.out.println(
        number1 + " % " + number2 + " should be " + (number1 % number2));
    }

  }
}
