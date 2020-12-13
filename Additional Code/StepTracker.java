public class StepTracker
{
  private int minimum;
  private int steps;
  private int days;
  private int active;

  public StepTracker(int minimum)
  {
    this.minimum = minimum;
    active = 0;
    steps = 0;
    days = 0;
  }

  public int activeDays()
  {
    return active;
  }

  public double averageSteps()
  {
    if (days == 0)
      return 0;
    return steps * 1.0 / days;
  }

  public void addDailySteps(int steps)
  {
    days++;
    this.steps += steps;
    if (steps >= minimum)
      active++;
  }

}