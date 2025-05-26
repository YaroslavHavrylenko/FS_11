package hw11.Menu;

import static hw11.Main.scanner;
import static hw11.Menu.Menu.familyController;

public class MenuFour {
    public static void runMenuFour() {
        System.out.print("Будь-ласка максимальну кількість членів родини: ");
        int num = Integer.parseInt(scanner.nextLine());
        familyController.getFamiliesLessThan(num);
    }
}
