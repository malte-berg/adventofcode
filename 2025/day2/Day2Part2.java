import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day2Part2 {

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

          for (int sub = 1; sub <= length/2; sub++) {

            if (length % sub != 0) continue;

              String substring = s.substring(0, sub);
              String regex = "(?i)".concat(substring);
              String replaced = s.replaceAll(regex, "");

            if (replaced.length() == 0) {

              sum += i;
              break;

            }

          }

        }

      }

      System.out.println("Total sum: " + sum);

    } catch (FileNotFoundException e) {

      System.out.println("error");

    }

  }

}
