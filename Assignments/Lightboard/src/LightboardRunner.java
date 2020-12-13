// John Donofrio
public class LightboardRunner
{
  public static void main(String[] args)
  {
    System.out.println("======= PROBLEM 1 ========");
    double[][] distances =
      {{0, 983, 787, 714, 1375, 967, 1087},
          {983, 0, 214, 1102, 1763, 1723, 1842},
          {787, 214, 0, 888, 1549, 1548, 1627},
          {714, 1102, 888, 0, 661, 781, 810},
          {1375, 1763, 1549, 661, 0, 1426, 1187},
          {967, 1723, 1548, 781, 1426, 0, 239},
          {1087, 1842, 1627, 810, 1187, 239, 0},};
    for (int row = 0; row < distances.length; row++)
    {
      for (int column = 0; column < distances[row].length; column++)
      {
        System.out.print(distances[row][column] + " ");
      }
      System.out.println();
    }
    System.out.println("======= PROBLEM 2 ========");
    int[][] matrix = new int[5][5];
    for (int row = 0; row < matrix.length; row++)
    {
      for (int column = 0; column < matrix[row].length; column++)
      {
        System.out.print(matrix[row][column]);
      }
      System.out.println();
    }
    System.out.println("-----");
    matrix[2][1] = 7;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int column = 0; column < matrix[row].length; column++)
      {
        System.out.print(matrix[row][column]);
      }
      System.out.println();
    }

    System.out.println("======= PROBLEM 3 ========");
    String[][] tictactoe = {{"-", "-", "-"}, {"-", "-", "-"}, {"-", "-", "-"}};
    printArray(tictactoe);
    // Player 1
    tictactoe[1][1] = "X";
    printArray(tictactoe);
    // Player 2
    tictactoe[0][2] = "O";
    printArray(tictactoe);
    // Player 1
    tictactoe[0][0] = "X";
    printArray(tictactoe);
    // Player 2
    tictactoe[2][2] = "O";
    printArray(tictactoe);

    System.out.println("======= PROBLEM 4 ========");
    boolean[][] booleanArray = new boolean[10][20];
    int random = 0;
    for (int row = 0; row < booleanArray.length; row++)
    {
      for (int column = 0; column < booleanArray[row].length; column++)
      {
        random = (int) (Math.random() * 4);
        if (random == 0)
        {
          booleanArray[row][column] = true;
          System.out.print(booleanArray[row][column] + "  ");
          // Extra space added here so columns align nicely
        }
        else
          System.out.print(booleanArray[row][column] + " ");
      }
      System.out.println();
    }
  }

  public static void printArray(String[][] arr) // Strings
  {
    for (int row = 0; row < arr.length; row++)
    {
      for (int column = 0; column < arr[row].length; column++)
      {
        System.out.print(arr[row][column]);
      }
      System.out.println();
    }
    System.out.println();
  }
}
