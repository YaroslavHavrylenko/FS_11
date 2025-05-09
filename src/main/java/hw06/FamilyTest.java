package hw06;

import hw06.HumanType.Man;
import hw06.HumanType.Woman;
import hw06.Pets.Dog;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FamilyTest {

    @Test
    public void testToString() {
    String expected = "DOG{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}";
    Dog dog = new Dog ("Rock", 5, 75, new String[] {"eat", "drink", "sleep"});
    String real = dog.toString();
    assertEquals(expected, real);
    }

    @Test
    public void  testDeleteChildByHuman () {
        Woman mother = new Woman("Jane", "Karleone", 1954);
        Man father = new Man("Vito", "Karleone", 1954);
        Man child = new Man("Michael", "Karleone", 1977);
        Family family = new Family(mother, father);
        family.addChild(child);
        Man child1 = new Man("Stiven", "Karleone",1978);
        family.addChild(child1);
        family.deleteChild(child);
        Human[] expChildren = new Human[]{child1};
        Human[] realChildren = family.getChildren();
        assertArrayEquals(expChildren, realChildren);
    }

    @Test
    public void  testDeleteChildByIndex () {
        Woman mother = new Woman("Jane", "Karleone", 1954);
        Man father = new Man("Vito", "Karleone", 1954);
        Man child = new Man("Michael", "Karleone", 1977);
        Family family = new Family(mother, father);
        family.addChild(child);
        Man child1 = new Man("Stiven", "Karleone",1978);
        family.addChild(child1);
        family.deleteChild(0);
        Human[] expChildren = new Human[]{child1};
        Human[] realChildren = family.getChildren();
        assertArrayEquals(expChildren, realChildren);
    }

    @Test
    public void  testDeleteChildByWrongIndex () {
        Woman mother = new Woman("Jane", "Karleone", 1954);
        Man father = new Man("Vito", "Karleone", 1954);
        Man child = new Man("Michael", "Karleone", 1977);
        Family family = new Family(mother, father);
        family.addChild(child);
        Man child1 = new Man("Stiven", "Karleone",1978);
        family.addChild(child1);
        family.deleteChild(5);
        Human[] expChildren = new Human[]{child,child1};
        Human[] realChildren = family.getChildren();
        assertArrayEquals(expChildren, realChildren);
    }

    @Test
    public void testAddChild (){
        Woman mother = new Woman("Jane", "Karleone", 1954);
        Man father = new Man("Vito", "Karleone", 1954);
        Man child = new Man("Michael", "Karleone", 1977);
        Family family = new Family(mother, father);
        family.addChild(child);
        Human[] realChildren = family.getChildren();
        assertEquals(1, realChildren.length);
        assertEquals(child, family.getChildren()[0]);

        Man child1 = new Man("Stiven", "Karleone",1978);
        family.addChild(child1);
        Human[] realChildren1 = family.getChildren();

        assertEquals(2, realChildren1.length);
        assertEquals(child1, family.getChildren()[1]);
    }

    @Test
    public void testCountFamily () {
        Woman mother = new Woman("Jane", "Karleone", 1954);
        Man father = new Man("Vito", "Karleone", 1954);
        Man child = new Man("Michael", "Karleone", 1977);
        Family family = new Family(mother, father);
        family.addChild(child);
        assertEquals(3, family.countFamily());

        Man child1 = new Man("Stiven", "Karleone",1978);
        family.addChild(child1);
        assertEquals(4, family.countFamily());
    }
}
