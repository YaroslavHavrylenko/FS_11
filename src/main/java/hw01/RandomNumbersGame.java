package hw01;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class RandomNumbersGame {
  public static void main(String[] args) {
    PrintStream so = System.out;
    so.println("---Let the game begin!---");
    so.print("What's your name? ");
    InputStream in = System.in;
    Scanner scanner = new Scanner(in);
    String name = scanner.nextLine();

    double rn = Math.random()*100 +101;
    int randomNumber = (int) rn;
    do {
      so.print("Enter number from 0 to 100, please: ");


    } while randomNumber == yourVariant;
    so.printf(" Congratulations, %s\n", name);
    so.print("---Game over!---");
  }
}
