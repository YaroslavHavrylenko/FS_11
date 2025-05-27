package hw11;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Family implements Serializable {
    private Human mother;
    private Human father;
    private ArrayList<Human> children;
    private HashSet<Pet> pet;

    public Family (Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new ArrayList<>();
        this.mother.setFamily(this);
        this.father.setFamily(this);
    }

    public final void setMother(Human mother) {
        this.mother = mother;
    }
    public Human getMother() {
        return mother;
    }

    public final void setFather(Human father) {
        this.father = father;
    }
    public Human getFather() {
        return father;
    }

    public void setChildren(ArrayList<Human> children) {
        this.children = children;
    }
    public ArrayList<Human> getChildren() {
        return children;
    }

    public void setPet(HashSet<Pet> pet) { this.pet.addAll(pet); }
    public void setPet(Pet pet) {
        if (this.pet == null) { this.pet = new HashSet<>(); }
        this.pet.add(pet);
    }
    public HashSet<Pet> getPet() {
        return pet;
    }

    public ArrayList<Human> addChild(Human child) {
        child.setFamily(this);
        this.children.add(child);
        return this.children;
    }

    public ArrayList<Human> deleteChild(Human child) {
        child.setFamily(null);
        this.children.remove(child);
        return this.children;
    }

    public boolean deleteChild (int index) {
        if (this.children.size() > index ) {
            Human child = this.children.get(index);
            child.setFamily(null);
            this.children.remove(index);
            System.out.printf("Child with index %d was deleted\n", index);
            return true;
        } else {
            System.out.printf("Child with index %d can't be deleted\n", index);
            return false;
        }
    }

    public int countFamily () {
        int countFamily = 2 + this.children.size();
//        System.out.printf("Family have %d members\n", countFamily);
        return countFamily;
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother.toString() +
                ", father=" + father.toString() +
                ((children.isEmpty()) ? ",\n children = No info about children" : ", children = " + children) +
                ((pet == null) ? ",\n pet = No pet at family" : ", pet=" + pet) +
                '}';
    }

    public String prettyFormat() {
        return "family:\n" +
                "  mother: " + mother.toString() +
                ",\n  father: " + father.toString() +
                ((children.isEmpty()) ? ",\n  children: No info about children" : ",\n  children:\n    " + children.stream()
                        .map(Human::prettyFormat)
                        .collect(Collectors.joining("\n    "))) +
                (pet == null ? ",\n  pet: No pet at family" : ",\n  pets:\n    " + pet.stream()
                        .map(Pet::prettyFormat)
                        .collect(Collectors.joining("\n    ")));
    }
}
