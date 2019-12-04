//  2018115809, ±èµµÈÆ, COMP217001, Homewwork 2-2

import java.util.Scanner;

// Test class for Complex
// $ javac proj2_1.java
// $ java proj2_1
// c3 = (5.2+3.5i)
// c3 = (2.3-7.2i)
// |(5.2+3.5i)| = 6.27 < |(2.3-7.2i)| = 7.56
// (5.2+3.5i) == (5.2+3.5i) = true
// (5.2+3.5i) == (2.3-7.2i) = false
// (5.2+3.5i) + (2.3-7.2i) = (7.5-3.7i)
// (2.3-7.2i) - (5.2+3.5i) = (-2.9-10.7i)
// (5.2+3.5i) * (2.3-7.2i) = (37.2-29.4i)

public class hw2_2 {
  ////////////////////////////////////
  // main function for testing
  ////////////////////////////////////
  public static void main( String[] args )
  {
    Complex c1 = new Complex(5.2,3.5);
    Complex c2 = new Complex(2.3,-7.2);
    Complex c3 = new Complex(c1);
    Complex c4 = new Complex();
    c4.set(c2);
    Complex c5 = new Complex();

    // toString()
    System.out.println("c3 = " + c3);
    System.out.println("c3 = " + c4);

    // compareTo() and method abs()
    int r = c1.compareTo(c2);
    String op;
    switch ( r ) {
      case 1: op = ">"; break;
      case -1: op = "<"; break;
      case 0: op = "=="; break;
      default: op = "?";
    }
    System.out.format("|%s| = %.2f %s |%s| = %.2f\n",
	c1.toString(),c1.abs(),op,c2.toString(),c2.abs());

    // equality
    System.out.println(c1 + " == " + c3 + " = " + c3.equals(c1));
    System.out.println(c1 + " == " + c4 + " = " + c1.equals(c4));

    // arithmetic operators
    c5.add(c1,c2);
    System.out.println(c1 + " + " + c2 + " = " + c5);
    c5.sub(c2,c3);
    System.out.println(c2 + " - " + c3 + " = " + c5);
    c5.mul(c3,c4);
    System.out.println(c3 + " * " + c4 + " = " + c5);
  }
}
