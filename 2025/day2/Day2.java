import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2 {

  public static void main(String[] args) {

    File inputFile = new File("input.txt");

    try {

      Scanner fileReader = new Scanner(inputFile);

      String input = fileReader.nextLine();
      String[] ranges = input.split(",");

      long sum = 0;

      for (String range : ranges) {

        long startOfRange = Long.parseLong(range.split("-")[0]);
        long endOfRange = Long.parseLong(range.split("-")[1]);

        for (long i = startOfRange; i <= endOfRange; i++) {

          String s = Long.toString(i);
          int length = s.length();

          if (length % 2 != 0) continue;

          if(s.substring(0, length/2).compareTo(s.substring(length/2, length)) == 0)
            sum += i;

        }

      }

      System.out.println("Total sum: " + sum);

    } catch (FileNotFoundException e) {

      System.out.println("error");

    }

  }

}
