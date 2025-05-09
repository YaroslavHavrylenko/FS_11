package hw06.Pet;

import hw06.Pet;

public class Dog extends Pet implements Foul {

    @Override
    public void respond(){
        System.out.printf("Привіт, хазяїн. Я - %s, собака. Гав-Гав!!!\n", this.getNickname());
    }

    @Override
    public void foul () {
        System.out.println("Потрібно добре замести сліди...)");
    };
}
