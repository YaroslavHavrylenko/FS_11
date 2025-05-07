package hw05;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Jane", "Karleone", 1954);
        Human father = new Human("Vito", "Karleone", 1954);
        Human child = new Human("Michael", "Karleone", 1977);
        Pet dog = new Pet(Species.DOG, "Rock", 5, 75, new String[] {"eat", "drink", "sleep"});
        System.out.println(dog.toString());
        child.setIq(90);
        child.setSchedule(new String[][]{{"day", "task"}, {"day_2", "task_2"}});
        System.out.println(child.toString());
        Family family = new Family(mother, father);
        System.out.println("Mother&Father - " + family.toString());
        family.addChild(child);
        System.out.println(child.toString());
        System.out.println("Mother&Father&Child - " + family.toString());
        family.countFamily();
        family.setPet(dog);
        System.out.println("Mother&Father&Child&Pet - " + family.toString());
        father.greetPet(dog);
        mother.describePet(dog);
        System.out.println(dog.toString());
        System.out.println(child.toString());
        family.deleteChild(child);
        System.out.println("Mother&Father&WithoutChild&Pet - " +family.toString());
        family.countFamily();
        System.out.println("_______________________________________");

        Human mother1 = new Human("Luiza", "Lopes", 1980);
        mother1.setIq(75);
        mother1.setSchedule(new String[][]{{DayOfWeek.TUESDAY.name().toLowerCase(), "task_3"}, {DayOfWeek.FRIDAY.name().toLowerCase(), "task_5"}});
        System.out.println(mother1.toString());
        Human father1 = new Human("Rodrigo", "Lopes", 1978);
        father1.setIq(80);
        father1.setSchedule(new String[][]{{DayOfWeek.MONDAY.getDayOfWeek(), "task_1"}, {DayOfWeek.WEDNESDAY.getDayOfWeek(), "task_4"}});
        System.out.println(father1.toString());
        Family family1 = new Family(mother1, father1);
        System.out.println(family1.toString());
        Human child1 = new Human("Sara", "Lopes", 2001);
        child1.setIq(50);
        System.out.println(child1.toString());
        family1.addChild(child1);
        System.out.println(family1.toString());
        Pet cat = new Pet(Species.CAT, "Markizz");
        cat.setAge(3);
        cat.setTrickLevel(48);
        cat.setHabits(new String[] {"eat", "fight", "walk"});
        System.out.println(cat.toString());
        family1.setPet(cat);
        System.out.println(family1.toString());

    };



}
