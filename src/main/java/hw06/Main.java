package hw06;

import hw06.HumanType.Man;
import hw06.HumanType.Woman;
import hw06.Pets.Dog;
import hw06.Pets.DomesticCat;

public class Main {
    public static void main(String[] args) {
        Woman mother = new Woman("Jane", "Karleone", 1954);
        Man father = new Man("Vito", "Karleone", 1954);
        Man child = new Man("Michael", "Karleone", 1977);
        Dog dog = new Dog("Rock", 5, 75, new String[] {"eat", "drink", "sleep"});
        System.out.println(dog);
        child.setIq(90);
        child.setSchedule(new String[][]{{"day", "task"}, {"day_2", "task_2"}});
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

        Woman mother1 = new Woman ("Luiza", "Lopes", 1980);
        mother1.setIq(75);
        mother1.setSchedule(new String[][]{{DayOfWeek.TUESDAY.name().toLowerCase(), "task_3"}, {DayOfWeek.FRIDAY.name().toLowerCase(), "task_5"}});
        System.out.println(mother1);
        Man father1 = new Man("Rodrigo", "Lopes", 1978);
        father1.setIq(80);
        father1.setSchedule(new String[][]{{DayOfWeek.MONDAY.getDayOfWeek(), "task_1"}, {DayOfWeek.WEDNESDAY.getDayOfWeek(), "task_4"}});
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
        cat.setHabits(new String[] {"eat", "fight", "walk"});
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
        Dog dog2 = new Dog("Rex", 2, 54, new String[]{"run","walk", "eat"});
        dog2.respond();
        dog2.foul();
        DomesticCat cat3 = new DomesticCat("Pusha", 7, 78, new String[]{"sleep", "eat", "myau"});
        cat3.respond();
        cat3.foul();
        cat3.eat();


    }
}
