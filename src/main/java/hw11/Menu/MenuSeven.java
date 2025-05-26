package hw11.Menu;

import static hw11.Main.scanner;
import static hw11.Menu.Menu.familyController;

public class MenuSeven {
    public static void delFamilyById () {
        int numFamily = 0;
        int quantityOfFamilies = familyController.count();
        do {
            try {
                System.out.print("Введіть порядковий номер родини, яку ви хочете видалити: ");
                numFamily = Integer.parseInt(scanner.nextLine());
                familyController.deleteFamilyByIndex(numFamily - 1);
            } catch (NumberFormatException e) {
                System.out.println("!!!Ви ввели не число!!!");
            }
            if (numFamily <= 0 || numFamily  > quantityOfFamilies) System.out.printf("!!!Родина з порядковим номером %d відсутня в списку!!!\n", numFamily);
        } while (!(numFamily > 0) || !(numFamily  <= quantityOfFamilies));
    }
}
