import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            // Reading from Input File
            File inputFile = new File("Input.txt");
            Scanner sc = new Scanner(inputFile);
            sc.useDelimiter("[, ]+"); // comma or space separated

            // Writing to Output File
            PrintWriter pw = new PrintWriter("Output.txt");

            while (sc.hasNextInt()) {
                int a = sc.nextInt();  // first number of series
                if (!sc.hasNextInt()) break; // avoid odd number issue

                int b = sc.nextInt();  // second number of series

                // highest value of the series
                int highest = Math.max(a, b);

                pw.print(highest);
                if (sc.hasNextInt()) pw.print(", ");
            }

            pw.close();
            sc.close();
            System.out.println("Operation Completed. Check Output.txt");

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
