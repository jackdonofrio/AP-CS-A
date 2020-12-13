// John Donofrio
public class StringDemo
{
  public static void main(String[] args)
  {
    // 1) Explicitly constructing a String using the new keyword and using the
    // implicit construction.
    String constructorStr = new String("This string was made explicitly.");
    String implicitStr = "This string was constructed implicitly";

    // 2) Demonstrate how String interning works.
    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = new String("Hello");
    // Both str1 and str2 point to the interned string object for "Hello"
    // str3 represents a completely different object, although it has the same
    // contents.

    // 3) Demonstrate the difference between "==", "equals", and "compareTo"
    // when deal with Strings.
    boolean doubleEqualSign = str1 == str2;
    // ^ this evaluates to true because they point to the same place in memory
    boolean equalsWord = str1.equals(str3);
    System.out.println(equalsWord);
    // ^ this evaluates to true because both strings have the same contents;
    int compareTo = str1.compareTo(str2);
    System.out.println(compareTo);
    // ^ This returns an int 0 because the two strings have equal content

    // 4) What is really stored inside a String variable
    // A string variable holds a reference to a String object that stores a
    // string value (Page 357).
  }
}
