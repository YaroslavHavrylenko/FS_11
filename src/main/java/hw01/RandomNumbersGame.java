package hw01;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class RandomNumbersGame {

  public static boolean isNumber(String str) {
    return str.matches("-?\\d+");
  };

  public static void main(String[] args) {
    PrintStream so = System.out;
    so.println("---Let the game begin!---");
    so.print("What's your name? ");
    InputStream in = System.in;
    Scanner scanner = new Scanner(in);
    String name = scanner.nextLine();

    double rn = Math.random()*101;
    int randomNumber = (int) rn;
    int yourVariant;
    do {
      boolean checking;
      String inputNumber;
      do {
        so.print("Enter number from 0 to 100, please: ");
        Scanner scannerNumber = new Scanner(in);
        inputNumber = scannerNumber.nextLine();
        checking = isNumber(inputNumber);
        if (!checking) so.println("Your input is NaN. Please be attentive!");
      } while (!checking);

      yourVariant = Integer.parseInt(inputNumber);
      if (yourVariant < randomNumber) {
        so.println("Your number is too small. Please, try again.");
      } else if (yourVariant > randomNumber) {
        so.println("Your number is too big. Please, try again.");
      } else {
        so.printf(" Congratulations, %s\n", name);
        so.printf("Random number is - %d\n", randomNumber);
      }
    } while (randomNumber != yourVariant);

    so.print("---Game over!---");
  }
}
