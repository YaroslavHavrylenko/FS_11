package hw10.HumanType;

import hw10.DayOfWeek;
import hw10.Human;
import hw10.Pet;
import hw10.Task;

import java.util.HashMap;

public final class Woman extends Human {
    public Woman (String name, String surname, long birthDate ) {
        super(name, surname, birthDate );
    }

    public Woman (String name, String surname, long birthDate , int iq, HashMap<DayOfWeek, Task> schedule) {
        super(name, surname, birthDate , iq, schedule);
    }

    public Woman (String name, String surname, long birthDate , int iq) {
        super(name, surname, birthDate, iq);
    }

    public Woman (String name, String surname, String birthDate , int iq) {
        super(name, surname, birthDate, iq);
    }

    public Woman () {};

    public void makeUp (){
        System.out.println("Яка я сьогодні гарна!");
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.printf("Привіт, %s! Твоя хазяйка дома!\n", pet.getNickname());
    }
}
