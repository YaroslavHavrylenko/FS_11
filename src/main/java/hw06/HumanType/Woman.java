package hw06.HumanType;

import hw06.Human;
import hw06.Pet;

public final class Woman extends Human {
    public Woman (String name, String surname, int year) {
        super(name, surname, year);
    }

    public Woman (String name, String surname, int year, int iq, String[][] schedule) {
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
