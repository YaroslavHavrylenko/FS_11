package hw02;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class AreaShooting {
    static PrintStream so = System.out;
    static InputStream in = System.in;

    static void makeShootingAria (String [][] ariaShooting) {
        for (String[] row : ariaShooting) {
            for (String value : row) {
                so.print(value + " | ");
            }
            so.println();
        }
        so.println("_______________________");
    };

    static boolean checkingShootingParameter (String value){
        boolean isNumber = value.matches("-?\\d+");
        if (isNumber) {
            int valueDigit = Integer.parseInt(value);
            boolean isInRange = valueDigit >= 1 && valueDigit <= 5;
            if (!isInRange) so.printf(" Input parameter is out of range\n");
            return isInRange;
        } else {
            so.printf("Input parameter is not a number\n");
            return false;
        }
    };
    static int [] shooting () {
        boolean checking;
        String shootingRow;
        do {
            so.print("Enter shooting row, please: ");
            Scanner scannerNumber = new Scanner(in);
            shootingRow = scannerNumber.nextLine();
            checking = checkingShootingParameter(shootingRow);
            if (!checking) so.println("Parameter shooting row is not correct! Please be attentive!");
        } while (!checking);
        String shootingColumn;
        do {
            so.print("Enter shooting column, please: ");
            Scanner scannerNumber = new Scanner(in);
            shootingColumn = scannerNumber.nextLine();
            checking = checkingShootingParameter(shootingColumn);
            if (!checking) so.println("Parameter shooting column is not correct! Please be attentive!");
        } while (!checking);
        int xDigit = Integer.parseInt(shootingColumn);
        int yDigit = Integer.parseInt(shootingRow);
        return new int[] {xDigit, yDigit};
    };

    public static void main(String[] args) {
        so.printf("---All Set. Get ready to rumble!---\n");
        String [][] ariaShooting = {
                {"0", "1", "2", "3", "4", "5"},
                {"1", "-", "-", "-", "-", "-"},
                {"2", "-", "-", "-", "-", "-"},
                {"3", "-", "-", "-", "-", "-"},
                {"4", "-", "-", "-", "-", "-"},
                {"5", "-", "-", "-", "-", "-"}
        };
        makeShootingAria(ariaShooting);
        double randomY = Math.random()*5 + 1;
        int y = (int) randomY;
        double randomX = Math.random()*5 + 1;
        int x = (int) randomX;
        int [] shoot;
        //so.printf(" Target X = %d, Y = %d\n", x, y);
        do {
            shoot = shooting();
            ariaShooting[shoot[1]][shoot[0]] = "*";
            makeShootingAria(ariaShooting);
        } while (shoot[1] != y || shoot[0] != x);

        ariaShooting[x][y] = "X";
        so.println("---You have won!---");
        makeShootingAria(ariaShooting);
    }
}
