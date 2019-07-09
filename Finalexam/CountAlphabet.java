//import java.io.*;
import java.util.Scanner;

public class CountAlphabet {
  public static void main(String[] args) throws Exception {
    String URLString = "http://websitetips.com/articles/copy/lorem/ipsum.txt";
    java.net.URL url = new java.net.URL(URLString);

    try ( Scanner input = new Scanner(url.openStream()) ) {
      int[] count = new int[26];
      while (input.hasNext()) {
        String tmp = input.next();
        for (int i=0; i<tmp.length(); i++) {
          char chr = tmp.charAt(i);
          if (chr >= 'a' && chr <= 'z') count[chr-'a']++;
          else if (chr >= 'A' && chr <= 'Z') count[chr-'A']++;
        }
      }
      printLine();
      char i = 0; char j = 0; char A = 'A'; char a = 'a';
      for (i = 0; i < 13; i++) System.out.print(" " + (char)(A+i) + "," + (char)(a+i));
      System.out.println();
      for (j = 0; j < 13; j++) System.out.printf("%4d", count[j]);
      System.out.println();
      printLine();
      printLine();
      for (; i < 26; i++) System.out.print(" " + (char)(A+i) + "," + (char)(a+i));
      System.out.println();
      for (; j < 26; j++) System.out.printf("%4d", count[j]);
      printLine();
    }
  }

  public static void printLine() {
    for (int i = 0; i < 52; i++) System.out.print("-");
    System.out.println();
  }
}
