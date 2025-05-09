package hw06.HumanType;

import hw06.Human;
import hw06.Pet;

public class Man extends Human {
    public Man (String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man (String name, String surname, int year, int iq, String[][] schedule) {
        super(name, surname, year, iq, schedule);
    };
    public Man () {};

    public void repairCar () {
        System.out.println("Нарешті закінчив ремонт машини");
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.printf("Привіт, %s! Твій хазяїн дома!\n", pet.getNickname());
    }
}
