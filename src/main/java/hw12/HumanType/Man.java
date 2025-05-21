package hw12.HumanType;

import hw12.DayOfWeek;
import hw12.Human;
import hw12.Pet;
import hw12.Task;

import java.util.HashMap;

public final class Man extends Human {
    public Man (String name, String surname, long birthDate ) {
        super(name, surname, birthDate );
    }

    public Man (String name, String surname, long birthDate , int iq, HashMap<DayOfWeek, Task> schedule) {
        super(name, surname, birthDate , iq, schedule);
    };

    public Man (String name, String surname, long birthDate , int iq) {
        super(name, surname, birthDate, iq);
    }
    public Man (String name, String surname, String birthDate , int iq) {
        super(name, surname, birthDate, iq);
    }

    public Man () {};

    public void repairCar () {
        System.out.println("Нарешті закінчив ремонт машини");
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.printf("Привіт, %s! Твій хазяїн дома!\n", pet.getNickname());
    }
}
