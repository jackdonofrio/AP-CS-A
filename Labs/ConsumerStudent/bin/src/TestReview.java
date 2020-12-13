/**
 * This class is used to call and test methods of the Review class. Open this
 * file, and press play.
 * 
 * @author John Donofrio
 * @version 2.0 - 2/15/20
 */
public class TestReview
{
  public static void main(String[] args)
  {
    System.out.println("******* Activity 1 *******");
    System.out.println(Review.sentimentVal("happily")); // 2.32
    System.out.println(Review.sentimentVal("terrible")); // -3.38
    System.out.println(Review.sentimentVal("cold")); // -0.04
    System.out.println(Review.sentimentVal("wonderful")); // 2.76
    System.out.println(Review.sentimentVal("strange")); // -2.06
    System.out.println(Review.sentimentVal("exciting")); // 0.97
    
    System.out.println("******* Activity 2 *******");
    System.out.println(Review.totalSentiment("SimpleReview.txt"));
    // The above line should print -2.9200000000000004
    System.out.println(Review.totalSentiment("26WestReview.txt"));
    // The above line should print 29.04999999999999
    System.out.println(Review.totalSentiment("StarWarsReview.txt"));
    // The above line should print 4.03
    System.out.println(Review.totalSentiment("BadRottenReview.txt"));
    // Find a bad review of a lame movie on Rotten Tomatoes.
    // The number will be a negative value.
    System.out.println(Review.totalSentiment("GoodRottenReview.txt"));
    // Find a good review of an epic movie on Rotten Tomatoes.
    // The number output will be a positive value.
    System.out.println(Review.starRating("SimpleReview.txt"));
    // The above line should print 1
    System.out.println(Review.starRating("26WestReview.txt"));
    // The above line should print 4
    System.out.println(Review.starRating("StarWarsReview.txt"));
    // The above line should print 2
    System.out.println(Review.starRating("BadRottenReview.txt"));
    // Find a bad review of a lame movie on Rotten Tomatoes.
    System.out.println(Review.starRating("GoodRottenReview.txt"));
    // Find a good review of an epic movie on Rotten Tomatoes.

    System.out.println("******* Activity 3 *******");
    System.out.println("fakeReview will randomly substitute adjectives for");
    System.out.println("words marked with asterisks.");
    System.out.println(Review.fakeReview("SimpleReview.txt"));
    System.out.println(Review.fakeReview("StarWarsReview.txt"));

    System.out.println("******* Activity 4 *******");
    System.out.println("fakeReview should now make \"stronger\" reviews.");
    System.out.println(Review.fakeReview("SimpleReview.txt"));
    System.out.println(Review.fakeReview("StarWarsReview.txt"));

  }

}
