package hw07;

import hw07.HumanType.Man;
import hw07.HumanType.Woman;
import hw07.Pets.Dog;
import hw07.Pets.DomesticCat;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        Woman mother = new Woman("Jane", "Karleone", 1954);
        Man father = new Man("Vito", "Karleone", 1954);
        Man child = new Man("Michael", "Karleone", 1977);
        Dog dog = new Dog("Rock", 5, 75, new LinkedHashSet<>(Arrays.asList("eat", "drink", "sleep")));
        System.out.println(dog);
        child.setIq(90);
        HashMap<DayOfWeek, Task> childSchedule = new HashMap<>();
        childSchedule.put(DayOfWeek.SUNDAY, Task.TASK1);
        childSchedule.put(DayOfWeek.TUESDAY, Task.TASK3);
        child.setSchedule(childSchedule);
        System.out.println(child);
        Family family = new Family(mother, father);
        System.out.println("Mother&Father - " + family);
        family.addChild(child);
        System.out.println(child);
        System.out.println("Mother&Father&Child - " + family);
        family.countFamily();
        family.setPet(dog);
        System.out.println("Mother&Father&Child&Pet - " + family);
        father.greetPet(dog);
        System.out.println(dog);
        System.out.println(child);
        family.deleteChild(child);
        System.out.println("Mother&Father&WithoutChild&Pet - " +family);
        family.countFamily();
        System.out.println("_______________________________________");

        Woman mother1 = new Woman("Luiza", "Lopes", 1980);
        mother1.setIq(75);
        HashMap<DayOfWeek, Task> mother1schedule = new HashMap<>();
        mother1schedule.put(DayOfWeek.TUESDAY, Task.TASK3);
        mother1schedule.put(DayOfWeek.FRIDAY, Task.TASK5);
        mother1.setSchedule(mother1schedule);
        System.out.println(mother1);
        Man father1 = new Man("Rodrigo", "Lopes", 1978);
        father1.setIq(80);
        HashMap<DayOfWeek, Task> father1schedule = new HashMap<>();
        father1schedule.put(DayOfWeek.MONDAY, Task.TASK1);
        father1schedule.put(DayOfWeek.WEDNESDAY, Task.TASK4);
        father1.setSchedule(father1schedule);
        System.out.println(father1);
        Family family1 = new Family(mother1, father1);
        System.out.println(family1);
        Woman child1 = new Woman("Sara", "Lopes", 2001);
        child1.setIq(50);
        System.out.println(child1);
        family1.addChild(child1);
        System.out.println(family1);
        DomesticCat cat = new DomesticCat("Markizz");
        cat.setAge(3);
        cat.setTrickLevel(48);
        cat.setHabits(new LinkedHashSet<>(Arrays.asList("eat", "fight", "walk")));
        System.out.println(cat);
        family1.setPet(cat);
        System.out.println(family1);

        System.out.println("--------------- HW-6 ---------------");
        Woman mother2 = new Woman("Sara", "Conor", 1975);
        Man father2 = new Man("John", "Conor", 1977);
        Pet cat2 = new DomesticCat("Cezar");
        mother2.greetPet(cat2);
        father2.greetPet(cat2);
        mother2.makeUp();
        father2.repairCar();
        Dog dog2 = new Dog("Rex", 2, 54, new LinkedHashSet<>(Arrays.asList("run","walk", "eat")));
        dog2.respond();
        dog2.foul();
        DomesticCat cat3 = new DomesticCat("Pusha", 7, 78, new LinkedHashSet<>(Arrays.asList("sleep", "eat", "myau")));
        cat3.respond();
        cat3.foul();
        cat3.eat();
    }
}
