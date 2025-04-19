package hw02;

import java.io.PrintStream;

public class AreaShooting {
    public static boolean chekingShootingParametr (String axisX, String axisY){
        boolean isNumber = axisX.matches("-?\\d+") && axisY.matches("-?\\d+");
        if (isNumber) {
            int axisXDigit = Integer.parseInt(axisX);
            int axisYDigit = Integer.parseInt(axisY);
            (axisXDigit >= 1 && axisXDigit <= 5 && axisYDigit >= 1 && axisYDigit <= 5 ) ? return true :  return false;
        } else {
            System.out.printf("");
            return false;
        }

        boolean isInRange = axisXDigit
        return isNumber && isInRange;
    };

    public static void main(String[] args) {
        PrintStream so = System.out;
        so.printf("---All Set. Get ready to rumble!---\n");
    }
}
