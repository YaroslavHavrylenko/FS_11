package hw07;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

public abstract class Human {
    private String name;
    private String surname;
    private  int year;
    private int iq;
    private HashMap<DayOfWeek, Task> schedule;
    private Family family;

    public Human (String name, String surname, int year) {
        this.name = name;
        this.surname = surname;
        this.year = year;
    }

    public Human (String name, String surname, int year, int iq, HashMap<DayOfWeek, Task> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }
    public Human () {}

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getSurname() {
        return surname;
    }

    public void setYear(int year) {
        this.year = (year <= 1900 || year >= 2026) ? null : year;
    }
    public int getYear() {
        return year;
    }

    public void setIq(int iq) {
        this.iq = (iq < 0 || iq > 100) ? 0 : iq;
    }
    public int getIq() {
        return iq;
    }

    public void setFamily(Family family) { this.family = family; }
    public Family getFamily() { return family; }

    public void setSchedule(HashMap<DayOfWeek, Task> schedule) {
        this.schedule = schedule;
    }
    public HashMap<DayOfWeek, Task> getSchedule() {
        return schedule;
    }

    public void greetPet(Pet pet) {
        System.out.printf("Hello, %s", pet.getNickname());
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ((iq != 0) ? ", iq=" + iq : "") +
                ((family == null || family.getMother() == null) ? "" : ", mother = " + (family.getMother().getName() + " " + family.getMother().getSurname())) +
                ((family == null || family.getFather() == null) ? "" : ", father=" + (family.getFather().getName() + " " + family.getFather().getSurname())) +
                ((schedule == null || schedule.isEmpty()) ? "" : ", schedule=" + schedule) +
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
    protected void finalize() {
        System.out.println("Object deleted - ".concat(this.toString()));
    }
}


