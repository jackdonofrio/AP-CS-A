/**
 * Starts the Celebrity Game application
 * You normally run this file to play the game.
 * This won't work correctly until you 
 * pass all tests in the BigGameTest.
 * @version 1.0
 */
public class CelebrityRunner
{
	/**
	 * The entry point of the Java application.
	 * @param args Unused parameter as it is a GUI based program.
	 */
	public static void main(String [] args)
	{
	  //All this does is instanciate CelebrityGame which
	  //in turn will instanciate CelebrityFrame, which in turns
	  //instanciates StartPanel.
	  new CelebrityGame();
	}
}
