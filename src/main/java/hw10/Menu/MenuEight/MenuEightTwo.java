package hw10.Menu.MenuEight;

import hw10.Human;
import hw10.HumanType.Man;
import hw10.HumanType.Woman;
import hw10.Menu.Menu;

import java.time.LocalDate;

import static hw08.TransformTime.toMilliSec;
import static hw10.Main.scanner;
import static hw10.Menu.Menu.familyController;

public class MenuEightTwo {
    public static void adoptChild () {
        Menu.menuEditFamilyAdopt();
        String adoptChildNum;
        do {
            System.out.print("Введіть порядковий номер меню всиновлення дитини: ");
            adoptChildNum = scanner.nextLine();
            switch (adoptChildNum.trim()){
                case "1":
                    // хлопчик
                    child("хлопчика");
                    Menu.menuEditFamily();
                    break;
                case "2":
                    // дівчинка
                    child("дівчинки");
                    Menu.menuEditFamily();
                    break;
                case "3":
                    // вихід в попереднє меню
                    MenuEight.editFamilyByIndex();
                    break;
                default:
                    System.out.println("!!!Пункт меню редагування родини введений невірно!!!");
                    break;
            }
        } while (!adoptChildNum.equalsIgnoreCase("3"));

    }

    static void child (String childType) {
        Human child;

        System.out.printf("Опис %s, що всиновлюється:\n", childType);
        System.out.printf("Введіть ім'я %s: ", childType);
        String name = scanner.nextLine();
        System.out.printf("Введіть прізвище %s: ", childType);
        String surname = scanner.nextLine();

        int yearBirthDay = 0;
        do {
            System.out.printf("Введіть рік народження %s: ", childType);
            try {
                yearBirthDay = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.printf("!!!Невірний формат року народження %s!!!\n", childType);
            }
        } while (!(yearBirthDay > 1900) || !(yearBirthDay < 2026));

        int monthBirthDay = 0;
        do {
            System.out.printf("Введіть місяць народження %s: ", childType);
            try {
                monthBirthDay = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.printf("!!!Невірний формат місяцю народження %s!!!\n", childType);
            }
        } while (!(monthBirthDay > 0) || !(monthBirthDay < 13));

        int dayBirthDay = 0;
        do {
            System.out.printf("Введіть день народження %s: ", childType);
            try {
                dayBirthDay = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("!!!Невірний формат дня народження матері!!!");
            }
        } while (!(dayBirthDay > 0) || !(dayBirthDay < 32));

        int iq = -1;
        do {
            System.out.printf("Введіть IQ %s (від 0 до 150): ", childType);
            try {
                iq = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.printf("!!!Невірний формат IQ %s!!!", childType);
            }
        } while (!(iq > -1) || !(iq < 151));
        long parentBirthDay = toMilliSec(LocalDate.of(yearBirthDay,monthBirthDay,dayBirthDay));
        if (childType.equals("дівчинки")){
            child = new Woman(name, surname, parentBirthDay, iq);
        } else {child = new Man(name, surname, parentBirthDay, iq);}

        int numFamily = 0;
        int quantityFamily = familyController.count();
        do {
            try {
                System.out.print("Введіть порядковий номер сім'ї, яка приймає дитину: ");
                numFamily = Integer.parseInt(scanner.nextLine());
                if (numFamily <= 0 || numFamily > quantityFamily) {
                    System.out.printf("Сім'ї з номером %d не існує!\n", numFamily);
                } else {
                    familyController.adoptChild(familyController.getFamilyById(numFamily - 1), child);
                    System.out.println(familyController.getFamilyById(numFamily - 1).prettyFormat());
                }
            } catch (NumberFormatException e) {
                System.out.println("Некоректний формат номера сім’ї");
            }
        } while (!(numFamily > 0) || !(numFamily <= quantityFamily));
    }
}
