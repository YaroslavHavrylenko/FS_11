package hw11.Menu;

import static hw11.Main.scanner;
import static hw11.Menu.Menu.familyController;

public class MenuFive {
    public static void runMenuFive() {
        System.out.print("Будь-ласка точну кількість членів родини: ");
        int num = Integer.parseInt(scanner.nextLine());
        familyController.countFamiliesWithMemberNumber(num);
    }



}
