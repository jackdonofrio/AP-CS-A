public class CelebrityTester
{
  public static void main(String[] args)
  {
    Celebrity celeb = new Celebrity("Tom Hanks", "Forrest Gump");
    System.out.println(celeb.toString());
    System.out.println("Celebrity Clue: " + celeb.getClue());
    System.out.println("Celebrity Name: " + celeb.getAnswer());
    celeb.setClue("Microsoft");
    celeb.setAnswer("Bill Gates");
    System.out.println("Celebrity Clue: " + celeb.getClue());
    System.out.println("Celebrity Name: " + celeb.getAnswer());
    System.out.println(celeb.toString());

    Celebrity test = new Celebrity();
    test.setAnswer("Tes");
  }
}
