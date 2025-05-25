package hw10.Menu;

import static hw10.Main.scanner;
import static hw10.Menu.Menu.familyController;

public class MenuSeven {
    public static void delFamilyById () {
        int numFamily = -1;
        int quantityOfFamilies = familyController.count();
        do {
            try {
                System.out.print("Введіть порядковий номер родини, яку ви хочете видалити: ");
                numFamily = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("!!!Ви ввели не число!!!");
            }
        } while (!(numFamily > 0) || !(numFamily  <= quantityOfFamilies));

        familyController.deleteFamilyByIndex(numFamily - 1);
    }
}
