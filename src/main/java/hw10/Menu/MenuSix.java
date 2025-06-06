package hw10.Menu;

import hw10.Human;
import hw10.HumanType.Man;
import hw10.HumanType.Woman;

import java.time.LocalDate;

import static hw08.TransformTime.toMilliSec;
import static hw10.Main.scanner;
import static hw10.Menu.Menu.familyController;

public class MenuSix {
    public static Woman createMother () {
        return (Woman) parent("матері");
    }

    public static Man createFather () {
        return (Man) parent("батька");
    }

    static Human parent (String parentType) {
        Human parent;

        System.out.printf("Опис %s родини:\n", parentType);
        System.out.printf("Введіть ім'я %s: ", parentType);
        String name = scanner.nextLine();
        System.out.printf("Введіть прізвище %s: ", parentType);
        String surname = scanner.nextLine();

        int yearBirthDay = 0;
        do {
            System.out.printf("Введіть рік народження %s: ", parentType);
            try {
                yearBirthDay = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("!!!Невірний формат року народження матері!!!");
            }
        } while (!(yearBirthDay > 1900) || !(yearBirthDay < 2026));

        int monthBirthDay = 0;
        do {
            System.out.printf("Введіть місяць народження %s: ", parentType);
            try {
                monthBirthDay = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.printf("!!!Невірний формат місяцю народження %s!!!\n", parentType);
            }
        } while (!(monthBirthDay > 0) || !(monthBirthDay < 13));

        int dayBirthDay = 0;
        do {
            System.out.printf("Введіть день народження %s: ", parentType);
            try {
                dayBirthDay = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("!!!Невірний формат дня народження матері!!!");
            }
        } while (!(dayBirthDay > 0) || !(dayBirthDay < 32));

        int iq = -1;
        do {
            System.out.printf("Введіть IQ %s (від 0 до 150): ", parentType);
            try {
                iq = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.printf("!!!Невірний формат IQ %s!!!", parentType);
            }
        } while (!(iq > -1) || !(iq < 151));
        long parentBirthDay = toMilliSec(LocalDate.of(yearBirthDay,monthBirthDay,dayBirthDay));
        if (parentType.equals("матері")){
            parent = new Woman(name, surname, parentBirthDay, iq);
        } else {parent = new Man(name, surname, parentBirthDay, iq);}
        return parent;
    }

    public static void createFamily(){
        familyController.createNewFamily(createMother(), createFather());
    }
}
