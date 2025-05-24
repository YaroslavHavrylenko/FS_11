package hw09.HumanType;

import hw09.DayOfWeek;
import hw09.Human;
import hw09.Pet;
import hw09.Task;

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
