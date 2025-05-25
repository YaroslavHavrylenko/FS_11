package hw10.Menu;

import static hw10.Main.scanner;
import static hw10.Menu.Menu.familyController;

public class MenuNine {
    public static void delChildrenOlderThen () {
        int ageChildren = 0;
        boolean label;
        do {
            System.out.print("Введіть вік дітей що необхідно видалити з родин: ");
            try {
                ageChildren = Integer.parseInt(scanner.nextLine());
                label = false;
            } catch (NumberFormatException e) {
                System.out.println("!!!Невірний формат віку дітей!!!");
                label = true;
            }
        } while (label);
        familyController.deleteAllChildrenOlderThen(ageChildren);
    }
}
