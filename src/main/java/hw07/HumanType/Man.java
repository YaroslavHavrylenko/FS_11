package hw07.HumanType;

import hw07.DayOfWeek;
import hw07.Human;
import hw07.Pet;
import hw07.Task;

import java.util.HashMap;

public final class Man extends Human {
    public Man (String name, String surname, int year) {
        super(name, surname, year);
    }

    public Man (String name, String surname, int year, int iq, HashMap<DayOfWeek, Task> schedule) {
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
