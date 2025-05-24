package hw10.Menu;

import static hw10.Main.scanner;
import static hw10.Menu.Menu.familyController;

public class MenuThree {
    public static void runMenuThree() {
        System.out.print("Будь-ласка мінімальну кількість членів родини: ");
        int num = Integer.parseInt(scanner.nextLine());
        familyController.getFamiliesBiggerThan(num);
    }
}
