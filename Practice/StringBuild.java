import java.util.*;

class Main {
  public static void main(String[] args) {
    StringBuilder s1 = new StringBuilder("hello");
    String s2 = "hello";
    System.out.println("s1 = " + s1);
    System.out.println("s2 = " + s2);
    // System.out.println("Is s1 == s2 "+ (s1==s2));
    System.out.println("is s1  equals  s2 " + s1.equals(s2));

    s1.setCharAt(2, 'i');
    System.out.println("s1 = " + s1);
    // s2.setCharAt(2,'i'); error
    s1.insert(2, 'l');
    System.out.println("s1 = " + s1);
    s1.deleteCharAt(2);
    System.out.println("s1 = " + s1);
    s1.append('h');
    System.out.println("s1 = " + s1);

    String s3 = "";
    long start = System.currentTimeMillis();
    for (int i = 1; i <= 10000; i++) {
      s3 += i;
    }
    long end = System.currentTimeMillis();
    long duration = end - start;
    System.out.println("duration = " + duration);

    StringBuilder sb3 = new StringBuilder("");
    start = System.currentTimeMillis();
    for (int i = 1; i <= 10000; i++) {
      sb3.append(i);
    }
    end = System.currentTimeMillis();
    duration = end - start;
    System.out.println("duration = " + duration);
  }
}
