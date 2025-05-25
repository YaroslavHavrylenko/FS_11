package hw10.Menu.MenuEight;

import hw10.Menu.Menu;

import static hw10.Main.scanner;
import static hw10.Menu.Menu.familyController;

public class MenuEight {
    public static void editFamilyByIndex () {

        String editFamilyNum = "";
        do {
//            try {
                System.out.print("Введіть порядковий номер меню редагування родини: ");
                editFamilyNum = scanner.nextLine();
                switch (editFamilyNum.trim()){
                    case "1":
                        MenuEightOne.bornChild();
                        Menu.menuEditFamily();
                        break;
                    case "2":
                        MenuEightTwo.adoptChild();
                        Menu.menuEditFamily();
                        break;
                    case "3":
                        Menu.showMenu();
                        break;
                    default:
                        System.out.println("!!!Пункт меню редагування родини введений невірно!!!");
                }
//            } catch (NumberFormatException e) {
//                System.out.println("!!!Ви ввели не число!!!");
//            }
        } while (!editFamilyNum.equalsIgnoreCase("3"));
    }
}
