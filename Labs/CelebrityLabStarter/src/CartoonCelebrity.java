/**
 * This helps you do Activity 4 
 * You'll hack this file and turn it in.
 * Take a look at LiteratureCelebrity for ideas.
 * @version 1.0
 */
public class CartoonCelebrity extends Celebrity
{
  //Activity 4 - Question 3
  //add at least new attribute clue here.
  //What does a CartoonCelebrity have in
  //addition to normal celeb hints?
  //ideas: after a hint, the person could
  //type a comma then the medium (in a book, movie, tv)
  //or the year the show was created.

  //TODO: create at least one instance variables
  //to store a different types of clues.
  /**
   * Constructs a CartoonCelebrity
   * 
   * @param answer
   *          - the cartoon character's name
   * @param clue
   *          - a clue about the cartoon character other than the show/movie it
   *          appears in
   * @param show
   *          - the show/movie which the cartoon character appears
   */
  public CartoonCelebrity(String answer, String clue)
  {
    super("TODO", "TODO"); //Change this.
    //You'll store the answer into the parent class.  
    //You need to extract the stuff before the first comma and send
    //it to the parent class. Since Cartoon celebrities 
    //get two clues separated by a comma, you'll send the first
    //clue to the parent, and the other you'll store in your new
    //instance var.
    
    //TODO: Look at LiteratureCelebrity for ideas on
    //how to get the user to enter stuff after the
    //first clue.
    //Remember you must call super in the first line of code.
    
    //The user is going to send the clue with one or two with your
    //specific clues - so use indexOf to find the extra clues past
    //the first comma and store them
  }

  /**
   * randomly returns either the clue (80% of the time) or the show (20% of the
   * time)
   */
  @Override
  public String getClue()
  {
    //TODO: how would get clue work differently
    //than the Celebrity's version?  Maybe it randomly sends back
    //one of the special clues, or it will just send back the normal clue.
    return super.getClue(); //You'll need to change this.
  }

  /**
   * adds info about probability
   */
  @Override
  public String toString()
  {
    //TODO: Make sure you add your new instance vars
    //to this toString.
    return super.toString();
  }

  //Add any mutators or accessors to modify and
  //access your instance vars.
}
