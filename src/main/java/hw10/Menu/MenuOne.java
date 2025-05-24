package hw10.Menu;

import hw10.HumanType.Man;
import hw10.HumanType.Woman;
import hw10.Pets.Dog;
import hw10.Pets.DomesticCat;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashSet;

import static hw08.TransformTime.toMilliSec;
import static hw10.Menu.Menu.familyController;

public class MenuOne {
    public static void runMenuOne() {
        long motherBirthDay = toMilliSec(LocalDate.of(1956,2,28));
        Woman mother = new Woman("Jane", "Karleone", motherBirthDay);
        long fatherBirthDay = toMilliSec(LocalDate.of(1954,5,15));
        Man father = new Man("Vito", "Karleone", fatherBirthDay);
        long childBirthDay = toMilliSec(LocalDate.of(1977,12,23));
        Man child = new Man("Michael", "Karleone", childBirthDay);

        long mother1BirthDay = toMilliSec(LocalDate.of(1980,5,28));
        Woman mother1 = new Woman("Alice", "Smith", mother1BirthDay);
        long father1BirthDay = toMilliSec(LocalDate.of(1978,12,15));
        Man father1 = new Man("Will", "Smith", father1BirthDay);

        Dog dog = new Dog("Rock", 5, 75, new LinkedHashSet<>(Arrays.asList("eat", "drink", "sleep")));
        DomesticCat cat = new DomesticCat("Kisa", 3, 50, new LinkedHashSet<>(Arrays.asList("eat", "walk", "foul")));

        familyController.createNewFamily(mother, father);
        familyController.createNewFamily(mother1, father1);
        familyController.bornChild(familyController.getFamilyById(1), "Elsa", "Erik");
        long bornChildBirthDay = toMilliSec(LocalDate.of(2015,2,2));
        familyController.getFamilyById(1).getChildren().get(0).setBirthDate(bornChildBirthDay);
        familyController.adoptChild(familyController.getFamilyById(1), child);
        familyController.addPet(1,dog);
        familyController.addPet(1, cat);
        familyController.displayAllFamilies();
    }
}
