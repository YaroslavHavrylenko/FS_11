package hw06;

import java.util.Arrays;
import java.util.Objects;

public class Human {
    private String name;
    private String surname;
    private  int year;
    private int iq;
//    private Pet pet;
//    private Human mother;
//    private Human father;
    private String[][] schedule;
    private Family family;

    public Human (String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    };
    public Human (String name, String surname, int year, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.year = year;
//        this.mother = mother;
//        this.father = father;
    };
    public Human (String name, String surname, int year, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
//        this.pet = pet;
//        this.mother = mother;
//        this.father = father;
        this.schedule = schedule;
    };
    public Human () {};

    public void setName(String name) {
        this.name = name;
    };
    public String getName() {
        return name;
    };

    public void setSurname(String surname) {
        this.surname = surname;
    };
    public String getSurname() {
        return surname;
    };

    public void setYear(int year) {
        this.year = (year <= 1900 || year >= 2026) ? null : year;
    };
    public int getYear() {
        return year;
    };

    public void setIq(int iq) {
        this.iq = (iq < 0 || iq > 100) ? 0 : iq;
    };
    public int getIq() {
        return iq;
    };

//    public void setPet(Pet pet) {
//        this.pet = pet;
//    };
//    public Pet getPet() {
//        return pet;
//    };
//
//    public void setMother(Human mother) {
//        this.mother = mother;
//    };
//    public Human getMother() {
//        return mother;
//    };
//
//    public void setFather(Human father) {
//        this.father = father;
//    };
//    public Human getFather() {
//        return father;
//    };

    public void setFamily(Family family) { this.family = family; };
    public Family getFamily() { return family; }

    public void setSchedule(String[][] schedule) {
        this.schedule = schedule;
    };
    public String[][] getSchedule() {
        return schedule;
    };

    public void greetPet (Pet pet) {
        System.out.printf("Привіт, %s\n", pet.getNickname());
    };
    public void describePet (Pet pet) {
        System.out.printf("У мене є %s, їй %d років, він %s\n", pet.getSpecies(), pet.getAge(), (pet.getTrickLevel() > 50) ? "дуже хитрий" : "майже не хитрий");
    };

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ((iq != 0) ? ", iq=" + iq : "") +
                ((family == null || family.getMother() == null) ? "" : ", mother = " + (family.getMother().getName() + " " + family.getMother().getSurname())) +
                ((family == null || family.getFather() == null) ? "" : ", father=" + (family.getFather().getName() + " " + family.getFather().getSurname())) +
                ((schedule == null || schedule.length == 0) ? "" : "schedule=" + Arrays.deepToString(schedule)) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return year == human.year && iq == human.iq && name.equals(human.name) && surname.equals(human.surname);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname, year, iq);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object deleted - ".concat(this.toString()));
    }
};


