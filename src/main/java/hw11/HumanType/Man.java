package hw11.HumanType;

import hw11.DayOfWeek;
import hw11.Human;
import hw11.Pet;
import hw11.Task;

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
