package hw04;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Jane", "Karleone", 1954);
        Human father = new Human("Vito", "Karleone", 1954);
        Human child = new Human("Michael", "Karleone", 1977);
        Family family = new Family(mother, father);
        System.out.println(family.toString());
        family.addChild(child);
        System.out.println(family.toString());
        family.deleteChild(child);
        System.out.println(family.toString());
    };
}
