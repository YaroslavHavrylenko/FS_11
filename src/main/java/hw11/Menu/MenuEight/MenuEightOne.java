package hw11.Menu.MenuEight;

import hw11.FileManager;

import static hw11.Main.scanner;
import static hw11.Menu.Menu.familyController;

public class MenuEightOne {
    public static void bornChild() {

        System.out.print("Введіть ім'я, якщо народився хлопчик: ");
        String boyName = scanner.nextLine();
        System.out.print("Введіть ім'я, якщо народилася дівчинка: ");
        String girlName = scanner.nextLine();
        int numFamily = 0;
        int quantityFamily = familyController.count();
        do {
            try {
                System.out.print("Введіть порядковий номер сім'ї, що народила дитину: ");
                numFamily = Integer.parseInt(scanner.nextLine());
                if (numFamily <= 0 || numFamily > quantityFamily) {
                    System.out.printf("Сім'ї з номером %d не існує!\n", numFamily);
                } else {
                    familyController.bornChild(familyController.getFamilyById(numFamily - 1), girlName, boyName);
                    System.out.println(familyController.getFamilyById(numFamily - 1).prettyFormat());
                }
            } catch (NumberFormatException e) {
                System.out.println("Некоректний формат номера сім’ї");
            }
        } while (!(numFamily > 0) || !(numFamily <= quantityFamily));
        FileManager.saveFamilies(familyController.getAllFamilies());
    }
}