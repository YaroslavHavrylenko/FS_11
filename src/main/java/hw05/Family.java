package hw05;

import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Human mother;
    private Human father;
    private Human[] children;
    private Pet pet;

    public Family (Human mother, Human father) {
        this.mother = mother;
        this.father = father;
        this.children = new Human[0];
        this.mother.setFamily(this);
        this.father.setFamily(this);
    };

    public final void setMother(Human mother) {
        this.mother = mother;
    };
    public Human getMother() {
        return mother;
    };

    public final void setFather(Human father) {
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
        child.setFamily(this);

        Human[] newChildren = new Human[this.children.length + 1];
        for (int i = 0; i < this.children.length; i++) {
            newChildren[i] = this.children[i];
        }
        newChildren[newChildren.length - 1] = child;
        this.children = newChildren;

        return this.children;
    };

    public Human[] deleteChild(Human child) {
        child.setFamily(null);

        Human[] withoutChild = new Human[this.children.length - 1];
        int n = 0;
        for (int i = 0; i <this.children.length; i++){
            if (!this.children[i].equals(child)) {
                withoutChild[n] = this.children[i];
                n++; }
        }
        this.children = withoutChild;
        return this.children;
    };

    public boolean deleteChild (int index) {
        if (this.children.length > index ) {
            Human[] withoutChild = new Human[this.children.length - 1];
            int n = 0;
            for (int i = 0; i <this.children.length; i++) {
                if (i != index) { withoutChild[n] = this.children[i]; n++;}

            }
            this.children = withoutChild;
            System.out.printf("Child with index %d was deleted\n", index);
            return true;
        } else {
            System.out.printf("Child with index %d can't be deleted\n", index);
        }
            return false;
    }

    public int countFamily () {
        int countFamily = 2 + this.children.length;
        System.out.printf("Family have %d members\n", countFamily);
        return countFamily;
    }

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
