/*
 *This is mostly just some proof of concept stuff. Not really meant for use. 
 */
import java.util.Scanner;

public class avgKE
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println(
      "Hello. This program will give you the Average Kinetic Energy of a gas, given its temperature in Celsius,"
        + " and it also calculates moles from the Ideal Gas Equation.");
    System.out.println("What is the temperature in *C?");
    double temperatureCelsius = input.nextDouble();
    double temperatureKelvin = temperatureCelsius + 273;
    final double gasEnergyConstantR = 8.3145;
    final double gasPressureConstantR = 0.082;
    double avgKE = 1.5 * gasEnergyConstantR * temperatureKelvin;
    System.out
      .println("The Average Kinetic Energy of the gas is " + avgKE + ".");
    System.out.println("What is the pressure of the gas in atm?");
    double pressureAtm = input.nextDouble();
    System.out.println("How many liters of the gas are there?");
    double liters = input.nextDouble();
    if (temperatureKelvin == 273 && pressureAtm == 1)
    {
      System.out.println("The conditions are at STP!");
      if (liters == 22.4)
      {
        System.out.println("There is 1 mole of the gas");
      }
    }
    else
    {
      System.out.println("The gas is NOT at STP!");
    }
    if (liters != 22.4)
    {
      double moles =
        (pressureAtm * liters) / (gasPressureConstantR * temperatureKelvin);
      System.out.println("There are " + moles + " moles of the gas!");
    }
  }
}
