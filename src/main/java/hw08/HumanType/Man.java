package hw08.HumanType;

import hw08.DayOfWeek;
import hw08.Human;
import hw08.Pet;
import hw08.Task;

import java.util.HashMap;

public final class Man extends Human {
    public Man (String name, String surname, long birthDate ) {
        super(name, surname, birthDate );
    }

    public Man (String name, String surname, long birthDate , int iq, HashMap<DayOfWeek, Task> schedule) {
        super(name, surname, birthDate , iq, schedule);
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
