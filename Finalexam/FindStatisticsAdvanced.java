/* for file IO with arguments */
import java.io.*;
import java.util.*;

// read datafile of n numbers
// find average, variance, standard deviation
// display numbers that are outside of mean +/- 1.97 std
public class FindStatisticsAdvanced {
  public static void main(String[] args) throws Exception {
    // Check command line parameter usage
    if (args.length != 1) {
      System.out.println("Usage: java ClassName inputFile");
      System.exit(1);
    }

    // Check if source file exists
    File inFile = new File(args[0]);
    if (!inFile.exists()) {
      System.out.println("Source file "+args[0]+" does not exist");
      System.exit(2);
    }

    try ( Scanner input = new Scanner(inFile); ) {
      int length = input.nextInt();
      int[] x = new int[length];
      int min = 0; int max = 0;
      int sum = 0; int var = 0;

      for (int i = 0; i < length; i++) {
        int num = input.nextInt();
        x[i] = num;
        if (min > num) min = num;
        if (max < num) max = num;
        sum += num;
      }

      double mean = (double) sum / (double) length;

      for (int i = 0; i < length; i++)
        var += (x[i] - mean) * (x[i] - mean);

      double stddev = Math.sqrt((double) var / (double) length);
      double lowerBound = mean - 1.96 * stddev;
      double upperBound = mean + 1.96 * stddev;

      System.out.println("Maximum = " + max);
      System.out.println("Minimum = " + min);
      System.out.printf("Mean = %.2f\n", mean);
      System.out.printf("standard deviation = %.2f\n", stddev);
      System.out.printf(
          "Values outside of mean +/ -1.96*std (%.2f, %.2f)\n",
          lowerBound, upperBound
      );
      for (int n : x) {
        if (n < lowerBound || n > upperBound)
          System.out.print(n + " ");
      }
      System.out.println();
    }
  }
}
