package hw11.Pets;

import hw11.Pet;

import java.util.LinkedHashSet;

public class Fish extends Pet {
    private Species species;


    public Fish (String nickname){
        super(nickname);
        this.species = Species.FISH;
    }

    public Fish (String nickname, int age, int trickLevel, LinkedHashSet<String> habits) {
        super(nickname, age, trickLevel, habits);
        this.species = Species.FISH;

    }
    public Fish () {
        this.species = Species.FISH;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }
    public Species getSpecies() {
        return species;
    }

    @Override
    public void respond() {
        System.out.println("Риби не можуть говорити");
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
