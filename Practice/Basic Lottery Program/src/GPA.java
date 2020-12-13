import java.util.Scanner;
public class GPA
{
public static void main(String[] args) {
  System.out.println("AP CSA: ");
  Scanner input = new Scanner(System.in);
  double apCS = input.nextDouble() * 1.1;
  System.out.println("AP Lang: ");
  double apLang = input.nextDouble() * 1.1;
  System.out.println("AP Chem: ");
  double apChem = input.nextDouble() * 1.1;
  System.out.println("Religion: ");
  double religion = input.nextDouble();
  System.out.println("AP Euro: ");
  double apEuro = input.nextDouble() * 1.1;
  System.out.println("Precalculus: ");
  double precalc = input.nextDouble() * 1.07;
  System.out.println("Spanish IV: ");
  double spanish = input.nextDouble() * 1.07;
  double gpa = (apCS + apLang + apChem + religion + apEuro + precalc + spanish) / 7.0;
  System.out.println("Your weighted GPA is " + gpa);
}
}
 