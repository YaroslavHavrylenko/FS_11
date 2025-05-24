package hw10;

import java.util.LinkedHashSet;

public abstract class Pet {
    private String nickname;
    private int age;
    private int trickLevel;
    private LinkedHashSet<String> habits;

    public Pet (String nickname) {
        this.nickname = nickname;
    }

    public Pet (String nickname, int age, int trickLevel) {
        this.nickname = nickname;
        this.age = age;
        this. trickLevel = trickLevel;
    }

    public Pet (String nickname, int age, int trickLevel, LinkedHashSet<String> habits) {
        this.nickname = nickname;
        this.age = age;
        this. trickLevel = trickLevel;
        this.habits = habits;
    }
    public Pet () {}

    public void setNickname(String nickname) {
        this.nickname = (nickname.length() < 2) ? "Nickname not correct" :nickname;
    }
    public String getNickname() {
        return nickname;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setTrickLevel(int trickLevel) {
        this.trickLevel = (trickLevel >= 0 && trickLevel <= 100 ) ? trickLevel : 1;
    }
    public int getTrickLevel() {
        return trickLevel;
    }

    public void setHabits(LinkedHashSet<String> habits) {
        if (this.habits == null ) {
            this.habits = new LinkedHashSet<>(habits);
        }
        if (!habits.isEmpty()) { this.habits.addAll(habits); }
    }
    public LinkedHashSet<String> getHabits() {
        return habits;
    }

    public void eat(){
        System.out.println("Я їм!");
    }
    public abstract void respond();

    public String prettyFormat() {
        return "No information";
    }

    @Override
    protected void finalize() {
        System.out.println("Object deleted - ".concat(this.toString()));
    }
}
