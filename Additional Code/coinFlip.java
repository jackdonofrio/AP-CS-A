
/*
 * Things to fix: make heads/tails input non cAsE sEnSiTiVe so it picks up any correct input 
 */
import java.util.Scanner;

public class coinFlip
{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    // Probability of 1 heads = 1/2 | 2 heads = 1/4 3 heads = 1/8

    int flips = input.nextInt();

    double probability = (1.0 / (Math.pow(2, flips))) * 100.0;

    System.out.println("for " + flips + " flips, the probability of " 
    + flips + " heads in a row is " + probability + "%.");
  }
}
