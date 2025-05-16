package hw08.Pets;

import hw08.Pet;

import java.util.LinkedHashSet;

public class DomesticCat extends Pet implements Foul {
    private Species species;

    public DomesticCat(String nickname) {
        super(nickname);
        this.species = Species.DOMESTICCAT;
    }

    public DomesticCat(String nickname, int age, int trickLevel, LinkedHashSet<String> habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.DOMESTICCAT;

    }

    public DomesticCat() {
        this.species = Species.DOMESTICCAT;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Species getSpecies() {
        return species;
    }

    @Override
    public void respond() {
        System.out.printf("Привіт, хазяїн. Я - %s, Домашній кіт. Мяу!!!\n", this.getNickname());
    }

    @Override
    public void foul() {
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
    }
}
