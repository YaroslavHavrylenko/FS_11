package hw11.Menu;

import static hw11.Main.scanner;
import static hw11.Menu.Menu.familyController;

public class MenuThree {
    public static void runMenuThree() {
        System.out.print("Будь-ласка мінімальну кількість членів родини: ");
        int num = Integer.parseInt(scanner.nextLine());
        familyController.getFamiliesBiggerThan(num);
    }
}
