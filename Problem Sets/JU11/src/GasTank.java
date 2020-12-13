// NAME: John Donofrio
public class GasTank
{
  // Gas tank has two instance variables (fields, attributes etc)
  // that keeps track of the amount of gasoline
  // in the tank and it's total capacity. They can be decimals.
  private double amountGas;
  private double tankCapacity;
  
  /**
   * Default constructor that sets the amount of gas to zero.
   */
  public GasTank(double capacity)
  {
    amountGas = 0; // instance vars must be initialized in constructor
    tankCapacity = capacity;
  }

  /**
   * bumps up the amount of gas in the gas tank by amount, 
   * but will not exceed the capacity of the gas tank.
   * 
   * @param amount
   */
  public void addGas(double amount)
  {
    amountGas += amount;
    if (amountGas > tankCapacity)
      amountGas = tankCapacity;
    
  }

  /**
   * Removes the gas from the gas tank by amountUsed. You can't have negative
   * gas!! so if the client uses more than what's in the tank then keep it zero.
   * 
   * @param amountUsed
   */
  public void useGas(double amountUsed)
  {
    amountGas -= amountUsed;
    if (amountGas < 0)
      amountGas = 0;
  }

  /**
   * Tank is empty if we have less than 0.1 gallons of gas. So person has chance
   * to run to the gas station before they are really out.
   * 
   * @return
   */
  public boolean isEmpty()
  {
    return amountGas < 0.1;
  }

  /**
   * The gas tank is full if the amount
   * is within 0.1 gallons of the total capacity of the tank.
   * @return
   */
  public boolean isFull()
  {
    return amountGas >= tankCapacity - 0.1;
  }
  
  /**
   * Fills up the tank but ALSO returns the
   * amount of gas it took to fill up the tank to capacity.
   * Remember there might already be some gas in the tank.
   * @return
   */
  public double fillUp()
  {
    double temp = tankCapacity - amountGas; // temp var to store difference
    amountGas = tankCapacity;
    return temp;
  }

  /**
   * Just a simple getter that returns the amount of gas in the gas tank.
   * 
   * @return
   */
  public double getGasLevel()
  {
    return amountGas;
  }

}
