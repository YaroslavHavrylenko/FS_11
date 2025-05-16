package hw08.Pets;

import hw08.Pet;

import java.util.LinkedHashSet;

public class Dog extends Pet implements Foul {

    private Species species;


    public Dog (String nickname){
        super(nickname);
        this.species = Species.DOG;
    }

    public Dog (String nickname, int age, int trickLevel, LinkedHashSet<String> habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.DOG;
    };

    public Dog () {
        this.species = Species.DOG;
    };
    public void setSpecies(Species species) {
        this.species = species;
    };
    public Species getSpecies() {
        return species;
    };

    @Override
    public void respond(){
        System.out.printf("Привіт, хазяїн. Я - %s, собака. Гав-Гав!!!\n", this.getNickname());
    }

    @Override
    public void foul () {
        System.out.println("Потрібно добре замести сліди...)");
    }

    @Override
    public String toString() {
        return this.getSpecies() + "{" +
                "nickname='" + super.getNickname() + '\'' +
                ", age=" + super.getAge() +
                ", trickLevel=" + super.getTrickLevel() +
                ", habits=" + super.getHabits() +
                '}';
    };
}
