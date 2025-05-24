package hw10;

import hw10.HumanType.Man;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Objects;

import static hw08.TransformTime.*;

public abstract class Human {
    private String name;
    private String surname;
    private long birthDate ;
    private int iq;
    private HashMap<DayOfWeek, Task> schedule;
    private Family family;

    public Human (String name, String surname, long birthDate ) {
        this.name = name;
        this.surname = surname;
        this.birthDate  = birthDate ;
    }

    public Human (String name, String surname, long birthDate , int iq, HashMap<DayOfWeek, Task> schedule) {
        this.name = name;
        this.surname = surname;
        this.birthDate  = birthDate ;
        this.iq = iq;
        this.schedule = schedule;
    }
        // конструктор для усиновлених дітей
    public Human (String name, String surname, long birthDate, int iq) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.iq = iq;
    }

    public Human (String name, String surname, String birthDateAdoptedChildren, int iq) {
        this.name = name;
        this.surname = surname;
        this.birthDate = stringToLong(birthDateAdoptedChildren);
        this.iq = iq;
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

    public void setBirthDate(long birthDate ) {
        int year = toLocalDate(birthDate).getYear();
        this.birthDate  = (year <= 1900 || year  >= 2026) ? null : birthDate ;
    }
    public long getBirthDate() {
        return birthDate ;
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

    public void describeAge (long birthDate) {
        LocalDate now = LocalDate.now();
        Period age = Period.between(TransformTime.toLocalDate(birthDate),now);
        System.out.printf("%s %s has %d years %d months %d days\n", this.name, this.surname, age.getYears(), age.getMonths(), age.getDays());
    }

    @Override
    public String toString() {
        return  "{name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birthDate=" + dateToString(birthDate)  +
                ((iq != 0) ? ", iq=" + iq : "") +
                ((schedule == null || schedule.isEmpty()) ? "" : ", schedule=" + schedule) +
                '}';
    }

    public String prettyFormat() {
        if (family != null && !family.getChildren().contains(this)) {
            return "{name='" + name + '\'' +
                            ", surname='" + surname + '\'' +
                            ", birthDate=" + dateToString(birthDate) +
                            ((iq != 0) ? ", iq=" + iq : "") +
                            ((schedule == null || schedule.isEmpty()) ? "" : ", schedule=" + schedule) +
                            '}';
        } else {
            return (this instanceof Man) ? "" : "girl";

        }

    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return birthDate  == human.birthDate  && iq == human.iq && name.equals(human.name) && surname.equals(human.surname);
    }


    @Override
    public int hashCode() {
        return Objects.hash(name, surname, birthDate , iq);
    }

    @Override
    protected void finalize() {
        System.out.println("Object deleted - ".concat(this.toString()));
    }
}


