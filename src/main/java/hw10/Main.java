package hw10;

import hw10.Controller.FamilyController;
import hw10.HumanType.Man;
import hw10.HumanType.Woman;
import hw10.Menu.*;
import hw10.Pets.Dog;
import hw10.Pets.DomesticCat;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

import static hw08.TransformTime.toMilliSec;
import static hw10.Menu.MenuOne.runMenuOne;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static String menuChoice;

    public static void main(String[] args) {
//        long motherBirthDay = toMilliSec(LocalDate.of(1956,2,28));
//        Woman mother = new Woman("Jane", "Karleone", motherBirthDay);
//        long fatherBirthDay = toMilliSec(LocalDate.of(1954,5,15));
//        Man father = new Man("Vito", "Karleone", fatherBirthDay);
//        long childBirthDay = toMilliSec(LocalDate.of(1977,12,23));
//        Man child = new Man("Michael", "Karleone", childBirthDay);
//        Dog dog = new Dog("Rock", 5, 75, new LinkedHashSet<>(Arrays.asList("eat", "drink", "sleep")));
//        System.out.println(dog);
//        child.setIq(90);
//        HashMap<DayOfWeek, Task> childSchedule = new HashMap<>();
//        childSchedule.put(DayOfWeek.SUNDAY, Task.TASK1);
//        childSchedule.put(DayOfWeek.TUESDAY, Task.TASK3);
//        child.setSchedule(childSchedule);
//        System.out.println(child);
//        Family family = new Family(mother, father);
//        System.out.println("Mother&Father - " + family);
//        family.addChild(child);
//        System.out.println(child);
//        System.out.println("Mother&Father&Child - " + family);
//        family.countFamily();
//        family.setPet(dog);
//        System.out.println("Mother&Father&Child&Pet - " + family);
//        father.greetPet(dog);
//        System.out.println(dog);
//        System.out.println(child);
//        family.deleteChild(child);
//        System.out.println("Mother&Father&WithoutChild&Pet - " +family);
//        family.countFamily();
//        System.out.println("_______________________________________");
//        long mother1BirthDay = toMilliSec(LocalDate.of(1980,3,13));
//        Woman mother1 = new Woman("Luiza", "Lopes", mother1BirthDay);
//        mother1.setIq(75);
//        HashMap<DayOfWeek, Task> mother1schedule = new HashMap<>();
//        mother1schedule.put(DayOfWeek.TUESDAY, Task.TASK3);
//        mother1schedule.put(DayOfWeek.FRIDAY, Task.TASK5);
//        mother1.setSchedule(mother1schedule);
//        System.out.println(mother1);
//        long father1BirthDay = toMilliSec(LocalDate.of(1978,6,29));
//        Man father1 = new Man("Rodrigo", "Lopes", 1978);
//        father1.setIq(80);
//        HashMap<DayOfWeek, Task> father1schedule = new HashMap<>();
//        father1schedule.put(DayOfWeek.MONDAY, Task.TASK1);
//        father1schedule.put(DayOfWeek.WEDNESDAY, Task.TASK4);
//        father1.setSchedule(father1schedule);
//        System.out.println(father1);
//        Family family1 = new Family(mother1, father1);
//        System.out.println(family1);
//        long child1BirthDay = toMilliSec(LocalDate.of(2001,8,9));
//        Woman child1 = new Woman("Sara", "Lopes", child1BirthDay);
//        child1.setIq(50);
//        System.out.println(child1);
//        family1.addChild(child1);
//        System.out.println(family1);
//        DomesticCat cat = new DomesticCat("Markizz");
//        cat.setAge(3);
//        cat.setTrickLevel(48);
//        cat.setHabits(new LinkedHashSet<>(Arrays.asList("eat", "fight", "walk")));
//        System.out.println(cat);
//        family1.setPet(cat);
//        System.out.println(family1);
//
//        System.out.println("--------------- HW-6 ---------------");
//        long mother2BirthDay = toMilliSec(LocalDate.of(1975,10,7));
//        Woman mother2 = new Woman("Sara", "Conor", mother2BirthDay);
//        long father2BirthDay = toMilliSec(LocalDate.of(1977,2,10));
//        Man father2 = new Man("John", "Conor", father2BirthDay);
//        Pet cat2 = new DomesticCat("Cezar");
//        mother2.greetPet(cat2);
//        father2.greetPet(cat2);
//        mother2.makeUp();
//        father2.repairCar();
//        Dog dog2 = new Dog("Rex", 2, 54, new LinkedHashSet<>(Arrays.asList("run","walk", "eat")));
//        dog2.respond();
//        dog2.foul();
//        DomesticCat cat3 = new DomesticCat("Pusha", 7, 78, new LinkedHashSet<>(Arrays.asList("sleep", "eat", "myau")));
//        cat3.respond();
//        cat3.foul();
//        cat3.eat();
//
//        System.out.println("--------------- HW-7 ---------------");
//        System.out.println("---Family 1---");
//        mother.describeAge(motherBirthDay);
//        father.describeAge(fatherBirthDay);
//        child.describeAge(child1BirthDay);
//
//        System.out.println("---Family 2---");
//        mother1.describeAge(mother1BirthDay);
//        father1.describeAge(father1BirthDay);
//        child1.describeAge(child1BirthDay);
//        System.out.println("---Adopted children---");
//        Man adoptedChildren1 = new Man("Simon", "Willis", "07/10/1980",80);
//        System.out.println(adoptedChildren1);
//        Woman adoptedChildren2 = new Woman("Jane", "Smith", "23/12/1985", 87);
//        System.out.println(adoptedChildren2);

//        System.out.println("--------------- HW-12 ---------------");
//        long motherBirthDay = toMilliSec(LocalDate.of(1956,2,28));
//        Woman mother = new Woman("Jane", "Karleone", motherBirthDay);
//        long fatherBirthDay = toMilliSec(LocalDate.of(1954,5,15));
//        Man father = new Man("Vito", "Karleone", fatherBirthDay);
//        long childBirthDay = toMilliSec(LocalDate.of(1977,12,23));
//        Man child = new Man("Michael", "Karleone", childBirthDay);
//
//        long mother1BirthDay = toMilliSec(LocalDate.of(1980,5,28));
//        Woman mother1 = new Woman("Jane", "Karleone", mother1BirthDay);
//        long father1BirthDay = toMilliSec(LocalDate.of(1978,12,15));
//        Man father1 = new Man("Vito", "Karleone", father1BirthDay);
//        long child1BirthDay = toMilliSec(LocalDate.of(2015,2,2));
//        Man child1 = new Man("Michael", "Karleone", child1BirthDay);
//
//        Dog dog = new Dog("Rock", 5, 75, new LinkedHashSet<>(Arrays.asList("eat", "drink", "sleep")));
//        FamilyController familyController = new FamilyController();
//        familyController.createNewFamily(mother, father);
//        familyController.displayAllFamilies();
//        familyController.createNewFamily(mother1, father1);
//        familyController.displayAllFamilies();
//        familyController.bornChild(familyController.getFamilyById(0), "Erik", "Elsa");
//        familyController.getFamiliesBiggerThan(1);
//        familyController.getFamiliesLessThan(3);
//        familyController.countFamiliesWithMemberNumber(2);
//        familyController.bornChild(familyController.getFamilyById(0), "Erik", "Elsa");
//        familyController.adoptChild(familyController.getFamilyById(1), child);
//        familyController.adoptChild(familyController.getFamilyById(1), child1);
//        familyController.displayAllFamilies();
//        familyController.deleteAllChildrenOlderThen(30);
//        familyController.displayAllFamilies();
//        familyController.count();
//        familyController.addPet(0, dog);
//        familyController.displayAllFamilies();
//        familyController.getPets(0);
//        familyController.getFamilyById(0);
//        familyController.deleteFamilyByIndex(0);
//        familyController.deleteFamily(familyController.getFamilyById(0));

        System.out.println("--------------- HW-10 ---------------");
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


        FamilyController familyController = new FamilyController();
        familyController.createNewFamily(mother, father);
        familyController.displayAllFamilies();
        familyController.createNewFamily(mother1, father1);
        familyController.bornChild(familyController.getFamilyById(1), "Elsa", "Erik");
        long bornChildBirthDay = toMilliSec(LocalDate.of(2015,2,2));
        familyController.getFamilyById(1).getChildren().get(0).setBirthDate(bornChildBirthDay);
        familyController.displayAllFamilies();

        familyController.adoptChild(familyController.getFamilyById(1), child);
        familyController.addPet(1,dog);
        familyController.addPet(1, cat);
        familyController.displayAllFamilies();
        familyController.getFamiliesBiggerThan(3);
        familyController.getFamiliesLessThan(3);
        familyController.deleteFamilyByIndex(0);
        familyController.displayAllFamilies();

        Menu.showMenu();

        do{
            System.out.println("__________________________________");
            System.out.print("Будь-ласка виберіть пункт меню: ");
            menuChoice = scanner.nextLine();
//            try {
//                int num = Integer.parseInt(String.valueOf(menuChoice));
                switch (menuChoice.trim()){
                    case "1":
                        MenuOne.runMenuOne();
                        Menu.showMenu();
                        break;
                    case "2":
                        MenuTwo.runMenuTwo();
                        Menu.showMenu();
                        break;
                    case "3":
                        MenuThree.runMenuThree();
                        Menu.showMenu();
                        break;
                    case "4":
                        MenuFour.runMenuFour();
                        Menu.showMenu();
                        break;
                    case "5":
                        MenuFive.runMenuFive();
                        Menu.showMenu();
                        break;
                    case "6":
//                        MenuSix.createMother();
//                        MenuSix.createFather();
                        MenuSix.createFamily();
                        Menu.showMenu();
                        break;
                    case "7":

                        break;
                    case "8":

                        break;
                    case "9":

                        break;
                    case "exit":
                        break;
                    default:
                        System.out.println("Ви ввели невірний номер меню! Будь-ласка введіть уважно!");
                }
//            } catch (NumberFormatException e) {
//                System.out.println("Ведено не число");
//            }
        } while (!menuChoice.equalsIgnoreCase("exit"));




    }
}
