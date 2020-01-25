import java.io.*;

public class GFG
{
  public static void main (String args[])
  {
    // This is a string in which a substring
    // is to be searched.
    String str = "Hello My name is Saurav";

    // Returns index of first occurrence of substring
    int firstIndex = str.indexOf("My");
    System.out.println("First occurrence of char My"+
               " is found at : " + firstIndex);

    // Returns index of last occurrence
    int lastIndex = str.lastIndexOf("My");
    System.out.println("Last occurrence of char My is"+
               " found at : " + lastIndex);

    // Index of the first occurrence
    // after the specified index if found.
    int first_in = str.indexOf("My", 10);
    System.out.println("First occurrence of char My"+
               " after index 10 : " + first_in);

    int last_in = str.lastIndexOf("My", 20);
    System.out.println("Last occurrence of char My " +
               "after index 20 is : " + last_in);
  }
}
