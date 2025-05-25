package hw10.Menu.MenuEight;

import hw10.Human;
import hw10.HumanType.Man;
import hw10.HumanType.Woman;

import java.time.LocalDate;

import static hw08.TransformTime.toMilliSec;
import static hw10.Main.scanner;

public class MenuEightTwo {
    public static void adoptChild () {


    }
    public static Human girl () {
        return child("дівчинки");
    }

    public static Human boy () {
        return child("хлопчика");
    }

    static Human child (String childType) {
        Human parent;

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
            parent = new Woman(name, surname, parentBirthDay, iq);
        } else {parent = new Man(name, surname, parentBirthDay, iq);}
        return parent;
    }
}
