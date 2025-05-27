package hw11.Menu.MenuEight;

import hw11.Menu.Menu;

import static hw11.Main.scanner;

public class MenuEight {
    public static void editFamilyByIndex () {

        String editFamilyNum = "";
        do {
            Menu.menuEditFamily();
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
                        break;
                }
        } while (!editFamilyNum.equalsIgnoreCase("3"));
    }
}
