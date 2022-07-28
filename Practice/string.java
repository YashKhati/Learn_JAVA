import java.util.*;

class Main {
  public static void main(String[] args) {
    String s1 = "hello";
    String s2 = "hello";
    String s3 = new String("hello");

    System.out.println("s1 = " + s1);
    System.out.println("s2 = " + s2);
    System.out.println("Is s1 equals s2 " + s1.equals(s2));
    System.out.println("Is s1 == s2 " + (s1 == s2));
    System.out.println("Is s1 equals s3 " + s1.equals(s3));
    System.out.println("Is s1 == s3 " + (s1 == s3));

    s1 += " World";
    System.out.println("Is s1 equals s2 " + s1.equals(s2));
    System.out.println("Is s1 == s2 " + (s1 == s2));

  }
}
