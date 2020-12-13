// 12/15/19 - posting this to github just to have it
// Last Edited 11/04/19 
import java.util.Scanner;

public class Text_Based_RPG
{
  public static void main(String[] args)
  {
    System.out.println(
      "=================================================================================\nREALM 041959Z9"
        + "\n================================================================================="
        + "\nYou are dreaming...\nThere is a bright orb of white light... it beckons you forth."
        + "\nIt asks, \"What is your first name?\"");
    Scanner input = new Scanner(System.in);
    String playerName = input.next();


    System.out.println(
      "Now... I must ask you a series of questions to determine your role in this quest."
        + "\n=================================================================================");

    /*
     * Player Stats declaration/initialization Values are determined through
     * user answers to questions below
     */

    int intel = 0, combat = 0, magic = 0, charisma = 0, acrobatics = 0,
      taming = 0, dancing = 0, medical = 0;
    // NOTE: these stats will essentially determine the difficulty level of this
    // game.
    System.out.println(playerName + "... what is your IQ?");
    // -------------------------------------------------------------------------\\
    int iq = input.nextInt();
    if (iq > 200 || iq < 80)
    {
      do
      {
        System.out.println(
          "Bruh... just because you watch Rick and Morty...\nNevermind, just try again.");
        iq = input.nextInt();
      }
      while (iq > 200 || iq < 80);
    }
    else if (iq >= 150)
      intel += 2;
    else if (iq >= 120)
    {
      intel++;
    }
    System.out.println("Your intelligence level is " + intel);
    if (intel == 0)
      System.out.println("That's just about average.");
    if (intel == 1)
      System.out.println("Hey, that's pretty good!");
    if (intel == 2)
      System.out.println("Nice");
    System.out.println(
      "=================================================================================");
    // -------------------------------------------------------------------------\\
    System.out.println(playerName
      + "... tell me, are you an experienced fighter?\nAnswer \"Yes\" or \"No\"");
    // -------------------------------------------------------------------------\\
    String fightingLevel = input.next();
    if (fightingLevel.equals("Yes"))
      combat = 1;
    if (!fightingLevel.equals("Yes") && !fightingLevel.equals("No"))
    {
      do
      {
        System.out.println("I said Yes or No you illiterate fool. Try again.");
        if (intel >= 1)
        {
          System.out.println(
            "I expected more from someone with an IQ of " + iq + "...");
        }
        fightingLevel = input.next();
      }
      while (!fightingLevel.equals("Yes") && !fightingLevel.equals("No"));
    }
    System.out.println("Your combat level is " + combat);
    if (combat > 0)
      System.out.println("Not bad.");
    else
      System.out.println("Looks like we've got some work to do.");
    System.out.println(
      "=================================================================================");
    // -------------------------------------------------------------------------\\
    int randomNo = (int) (Math.random() * 10) + 1;
    System.out.println(
      "I am thinking of a number from 1 - 10. If you can read my mind, prove it.");
    int count = 0;
    int userNoGuess = 0;
    do
    {
      userNoGuess = input.nextInt();
      if (userNoGuess == randomNo)
      {
        magic += 1;
        System.out.println("You're a wizard, " + playerName);
        System.out.println("+1 added to Magic Skill!");
      }
      else
      {
        System.out.println("Try again...");
      }
      count++;
    }

    while ((userNoGuess != randomNo) && count <= 1);
    System.out.println(
      "=================================================================================");
    // -------------------------------------------------------------------------\\
  }
}