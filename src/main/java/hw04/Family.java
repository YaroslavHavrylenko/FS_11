package hw04;

import java.util.Arrays;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family (Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
    };

    public void setMother(Human mother) {
        this.mother = mother;
    };
    public Human getMother() {
        return mother;
    };

    public void setFather(Human father) {
        this.father = father;
    };
    public Human getFather() {
        return father;
    };

    public void setChildren(Human[] children) {
        this.children = children;
    };
    public Human[] getChildren() {
        return children;
    };

    public void setPet(Pet pet) {
        this.pet = pet;
    };
    public Pet getPet() {
        return pet;
    };

    public Human[] addChild(Human child) {
        Human[] newChildren = new Human[this.children.length + 1];
        for (int i = 0; i < this.children.length; i++) {
            newChildren[i] = this.children[i];
        }
        newChildren[newChildren.length - 1] = child;
        this.children = newChildren;
        return this.children;
    };

    public Human[] deleteChild(Human child) {
        Human[] withoutChild = new Human[this.children.length - 1];
        int n = 0;
        for (int i = 0; i <this.children.length; i++){
            if (!this.children[i].equals(child)) { withoutChild[n] = this.children[i]; }
            n++;
        }
        this.children = withoutChild;
        return this.children;
    };

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother.toString() +
                ", father=" + father.toString() +
                ((children.length == 0) ? ", children = No info about children" : ", children = " + Arrays.toString(children)) +
                ((pet == null) ? ", pet = No pet at family" : ", pet=" + pet.toString()) +
                '}';
    };
}
