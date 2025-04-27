package hw04;

import java.util.Arrays;

public class Pet {
    private String species;
    private String nickname;
    private int age;
    private int trickLevel;
    private String[] habits;

    public Pet (String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    };
    public Pet (String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this. trickLevel = trickLevel;
        this.habits = habits;
    };
    public Pet () {};

    public void setSpecies(String species) {
        this.species = (species.length() < 3) ? "Species not correct" : species;
    };
    public String getSpecies() {
        return species;
    };

    public void setNickname(String nickname) {
        this.nickname = (nickname.length() < 2) ? "Nickname not correct" :nickname;
    };
    public String getNickname() {
        return nickname;
    };

    public void setAge(int age) {
        this.age = age;
    };
    public int getAge() {
        return age;
    };

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = (trickLevel >= 0 && trickLevel <= 100 ) ? trickLevel : 1;
    };
    public int getTrickLevel() {
        return trickLevel;
    };

    public void setHabits (String[] habits){
        this.habits = (habits == null || habits.length == 0 ) ? new String[]{"No habits"} : habits;
    }
    public String[] getHabits() {
        return habits;
    }

    public void eat(){
        System.out.println("Я їм!");
    };
    public void respond(){
        System.out.printf("Привіт, хазяїн. Я - %s. Я скучив!\n", this.getNickname());
    };
    public void foul () {
        System.out.println("Потрібно добре замести сліди...)");
    };

    @Override
    public String toString() {
        return species + "{" +
                "nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    };
}
