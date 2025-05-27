package hw11.Pets;

import hw11.Pet;

import java.io.Serializable;
import java.util.LinkedHashSet;

public class RoboCat extends Pet implements Serializable {
    private Species species;

    public RoboCat (String nickname){
        super(nickname);
        this.species = Species.ROBOCAT;
    }

    public RoboCat (String nickname, int age, int trickLevel, LinkedHashSet<String> habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.ROBOCAT;

    };
    public RoboCat () {
        this.species = Species.ROBOCAT;
    };

    public void setSpecies(Species species) {
        this.species = species;
    };
    public Species getSpecies() {
        return species;
    };

    @Override
    public void respond(){
        System.out.printf("Привіт, хазяїн. Я - %s, кіт-робот. Мя-у, мя-у!!!\n", this.getNickname());
    }

    @Override
    public String toString() {
        return this.getSpecies() + "{" +
                "nickname='" + super.getNickname() + '\'' +
                ", age=" + super.getAge() +
                ", trickLevel=" + super.getTrickLevel() +
                ", habits=" + super.getHabits() +
                '}';
    }

    public String prettyFormat() {
        return this.species + ":" +
                " nickname='" + super.getNickname() + '\'' +
                ", age=" + super.getAge() +
                ", trickLevel=" + super.getTrickLevel() +
                ", habits=" + super.getHabits();
    }
}
