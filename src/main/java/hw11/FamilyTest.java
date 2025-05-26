package hw11;

import hw11.HumanType.Man;
import hw11.HumanType.Woman;
import hw11.Pets.Dog;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FamilyTest {

    @Test
    public void testToString() {
    String expected = "DOG{nickname='Rock', age=5, trickLevel=75, habits=[eat, drink, sleep]}";
    Dog dog = new Dog("Rock", 5, 75, new LinkedHashSet<>(Arrays.asList("eat", "drink", "sleep")));
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
        ArrayList<Human> expChildren = new ArrayList<>(Collections.singleton(child1));
        ArrayList<Human> realChildren = family.getChildren();
        assertEquals(expChildren, realChildren);
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
        ArrayList<Human> expChildren = new ArrayList<>(Collections.singleton(child1));
        ArrayList<Human> realChildren = family.getChildren();
        assertEquals(expChildren, realChildren);
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
        ArrayList<Human> expChildren = new ArrayList<>(Arrays.asList(child,child1));
        ArrayList<Human> realChildren = family.getChildren();
        assertEquals(expChildren, realChildren);
    }

    @Test
    public void testAddChild (){
        Woman mother = new Woman("Jane", "Karleone", 1954);
        Man father = new Man("Vito", "Karleone", 1954);
        Man child = new Man("Michael", "Karleone", 1977);
        Family family = new Family(mother, father);
        family.addChild(child);
        ArrayList<Human> realChildren = family.getChildren();
        assertEquals(1, realChildren.size());
        assertEquals(child, family.getChildren().get(0));

        Man child1 = new Man("Stiven", "Karleone",1978);
        family.addChild(child1);
        ArrayList<Human> realChildren1 = family.getChildren();

        assertEquals(2, realChildren1.size());
        assertEquals(child1, family.getChildren().get(1));
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
