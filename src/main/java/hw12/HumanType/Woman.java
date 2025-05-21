package hw12.HumanType;

import hw12.DayOfWeek;
import hw12.Human;
import hw12.Pet;
import hw12.Task;

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
