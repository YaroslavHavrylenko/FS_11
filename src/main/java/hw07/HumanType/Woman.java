package hw07.HumanType;

import hw07.DayOfWeek;
import hw07.Human;
import hw07.Pet;
import hw07.Task;

import java.util.HashMap;

public final class Woman extends Human {
    public Woman (String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman (String name, String surname, int year, int iq, HashMap<DayOfWeek, Task> schedule) {
        super(name, surname, year, iq, schedule);
    };
    public Woman () {};

    public void makeUp (){
        System.out.println("Яка я сьогодні гарна!");
    }

    @Override
    public void greetPet(Pet pet) {
        System.out.printf("Привіт, %s! Твоя хазяйка дома!\n", pet.getNickname());
    }
}
