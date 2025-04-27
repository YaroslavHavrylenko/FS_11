package hw04;

public class Main {
    public static void main(String[] args) {
        Human mother = new Human("Jane", "Karleone", 1954);
        Human father = new Human("Vito", "Karleone", 1954);
        Family family = new Family(mother, father);
        System.out.println(family.toString());
    };
}
