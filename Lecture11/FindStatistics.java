import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Arrays;

public class FindStatistics {
    public static void main(String [] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage: java FindStatistics sourceFile targetFile");
            System.exit(1);
        }

        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("Source file " + args[0] + " does not exists");
            System.exit(2);
        }

        File targetFile = new File(args[1]);
        if (targetFile.exists()) {
            System.out.println("Target file " + args[1] + " already exists");
            System.exit(3);
        }

        try (
            Scanner input = new Scanner(sourceFile);
            PrintWriter output = new PrintWriter(targetFile);
        ) {
            int numberOfValues = input.nextInt();
            int[] value = new int[numberOfValues];
            int sum = 0;
            for (int i = 0; i < numberOfValues; i++) {
                value[i] = input.nextInt();
                sum += value[i];
            }
            Arrays.sort(value);

            output.println("Sum = " + sum);
            output.printf("Average = %.2f\n", (double)sum / numberOfValues);
            output.println("Maximum = " + value[numberOfValues-1]);
            output.println("Minimum = " + value[0]);
            output.println("Sorted");
            for (int i = numberOfValues-1; i >= 0; i--) output.print(value[i] + " ");
            output.println();
        }
    }
}
