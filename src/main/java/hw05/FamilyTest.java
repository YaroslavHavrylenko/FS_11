package hw05;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FamilyTest {

    @Test
    public void testToString() {
    String expected = "DOG{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}";
    Pet dog = new Pet(Species.DOG, "Rock", 5, 75, new String[] {"eat", "drink", "sleep"});
    String real = dog.toString();
    assertEquals(expected, real);
    }

    @Test
    public void  testDeleteChildByHuman () {
        Human mother = new Human("Jane", "Karleone", 1954);
        Human father = new Human("Vito", "Karleone", 1954);
        Human child = new Human("Michael", "Karleone", 1977);
        Family family = new Family(mother, father);
        family.addChild(child);
        Human child1 = new Human("Stiven", "Karleone",1978);
        family.addChild(child1);
        family.deleteChild(child);
        Human[] expChildren = new Human[]{child1};
        Human[] realChildren = family.getChildren();
        assertEquals(expChildren, realChildren);
    }

    @Test
    public void  testDeleteChildByIndex () {
        Human mother = new Human("Jane", "Karleone", 1954);
        Human father = new Human("Vito", "Karleone", 1954);
        Human child = new Human("Michael", "Karleone", 1977);
        Family family = new Family(mother, father);
        family.addChild(child);
        Human child1 = new Human("Stiven", "Karleone",1978);
        family.addChild(child1);
        family.deleteChild(0);
        Human[] expChildren = new Human[]{child1};
        Human[] realChildren = family.getChildren();
        assertEquals(expChildren, realChildren);
    }

    @Test
    public void  testDeleteChildByWrongIndex () {
        Human mother = new Human("Jane", "Karleone", 1954);
        Human father = new Human("Vito", "Karleone", 1954);
        Human child = new Human("Michael", "Karleone", 1977);
        Family family = new Family(mother, father);
        family.addChild(child);
        Human child1 = new Human("Stiven", "Karleone",1978);
        family.addChild(child1);
        family.deleteChild(5);
        Human[] expChildren = new Human[]{child,child1};
        Human[] realChildren = family.getChildren();
        assertEquals(expChildren, realChildren);
    }

    @Test
    public void testAddChild (){
        Human mother = new Human("Jane", "Karleone", 1954);
        Human father = new Human("Vito", "Karleone", 1954);
        Human child = new Human("Michael", "Karleone", 1977);
        Family family = new Family(mother, father);
        family.addChild(child);
        Human[] realChildren = family.getChildren();
        assertEquals(1, realChildren.length);
        assertEquals(child, family.getChildren()[0]);

        Human child1 = new Human("Stiven", "Karleone",1978);
        family.addChild(child1);
        Human[] realChildren1 = family.getChildren();
        assertEquals(2, realChildren1.length);
        assertEquals(child1, family.getChildren()[1]);
    }

    @Test
    public void testCountFamily () {
        Human mother = new Human("Jane", "Karleone", 1954);
        Human father = new Human("Vito", "Karleone", 1954);
        Human child = new Human("Michael", "Karleone", 1977);
        Family family = new Family(mother, father);
        family.addChild(child);
        assertEquals(3, family.countFamily());

        Human child1 = new Human("Stiven", "Karleone",1978);
        family.addChild(child1);
        assertEquals(4, family.countFamily());
    }
}
