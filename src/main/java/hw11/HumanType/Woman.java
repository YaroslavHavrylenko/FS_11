package hw11.HumanType;

import hw11.DayOfWeek;
import hw11.Human;
import hw11.Pet;
import hw11.Task;

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
