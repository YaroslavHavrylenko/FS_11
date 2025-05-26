package hw11.Service;

import hw11.Family;
import hw11.Human;
import hw11.HumanType.Man;
import hw11.HumanType.Woman;
import hw11.Pet;
import hw11.Pets.Dog;
import hw11.Pets.DomesticCat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;

import static hw08.TransformTime.toMilliSec;
import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest {

    private FamilyService familyService;

    @BeforeEach
    void setUp() {
        familyService = new FamilyService();
    }

    @Test
    void testCreateNewFamily() {
        long womanBirthDate = toMilliSec(LocalDate.of(1976, 12, 11));
        Woman woman = new Woman("Jane", "Doe", womanBirthDate);
        long manBirthDate = toMilliSec(LocalDate.of(1978, 5, 12));
        Man man = new Man("John", "Doe", manBirthDate);
        familyService.createNewFamily(woman, man);
        assertEquals(1, familyService.count());
    }

    @Test
    void testGetAllFamilies() {
        long womanBirthDate = toMilliSec(LocalDate.of(1977, 1, 11));
        Woman woman = new Woman("Jane", "Smith", womanBirthDate);
        long manBirthDate = toMilliSec(LocalDate.of(1978, 5, 2));
        Man man = new Man("Bob", "Smith", manBirthDate);
        familyService.createNewFamily(woman, man);
        List<Family> families = familyService.getAllFamilies();
        System.out.println(families);
        assertFalse(families.isEmpty());
    }

    @Test
    void testDeleteFamilyByIndex() {
        long womanBirthDate = toMilliSec(LocalDate.of(1984, 10, 24));
        Woman woman = new Woman("Jane", "Smith", womanBirthDate);
        long manBirthDate = toMilliSec(LocalDate.of(1985, 4, 2));
        Man man = new Man("Bob", "Smith", manBirthDate);
        familyService.createNewFamily(woman, man);
        assertTrue(familyService.deleteFamilyByIndex(0));
    }

    @Test
    void testBornChild() {
        long womanBirthDate = toMilliSec(LocalDate.of(1995, 1, 21));
        Woman woman = new Woman("Anna", "Brown", womanBirthDate);
        long manBirthDate = toMilliSec(LocalDate.of(1994, 2, 14));
        Man man = new Man("Tom", "Brown", manBirthDate);
        Family family = new Family(woman, man);
        familyService.bornChild(family, "Lucy", "Max");
        assertEquals(1, family.getChildren().size());
    }

    @Test
    void testAdoptChild() {
        long womanBirthDate = toMilliSec(LocalDate.of(2000, 12, 30));
        Woman woman = new Woman("Sara", "White", womanBirthDate);
        long manBirthDate = toMilliSec(LocalDate.of(1999, 2, 23));
        Man man = new Man("Mark", "White", manBirthDate);
        Family family = new Family(woman, man);
        long childBirthDate = toMilliSec(LocalDate.of(2015, 4, 2));
        Human child = new Man("Tommy", "White", childBirthDate);
        familyService.adoptChild(family, child);
        assertTrue(family.getChildren().contains(child));
    }

    @Test
    void testCountFamiliesWithMemberNumber() {
        long womanBirthDate = toMilliSec(LocalDate.of(1990, 11, 11));
        Woman woman = new Woman("Lily", "Black", womanBirthDate);
        long manBirthDate = toMilliSec(LocalDate.of(1988, 7, 15));
        Man man = new Man("Jack", "Black", manBirthDate);
        familyService.createNewFamily(woman, man);
        assertEquals(1, familyService.countFamiliesWithMemberNumber(2));
    }

    @Test
    void getFamiliesBiggerThan() {
        long motherBirthDate = toMilliSec(LocalDate.of(1970, 12, 11));
        Woman mother = new Woman("Jane", "Karleone", motherBirthDate);
        long fatherBirthDate = toMilliSec(LocalDate.of(1970, 6, 15));
        Man father = new Man("Vito", "Karleone", fatherBirthDate);
        Family family1 = new Family(mother, father);
        familyService.createNewFamily(mother, father);
        family1.addChild(new Man("Child", "Karleone", 2000));
        familyService.adoptChild(family1, new Woman("Daughter", "Karleone", 2001));
        familyService.service.saveFamily(family1);

        List<Family> result = familyService.getFamiliesBiggerThan(2);
        assertFalse(result.isEmpty());
        assertTrue(result.get(0).countFamily() > 2);
    }

    @Test
    void getFamiliesLessThan() {
        long motherBirthDate = toMilliSec(LocalDate.of(1970, 12, 11));
        Woman mother = new Woman("Jane", "Karleone", motherBirthDate);
        long fatherBirthDate = toMilliSec(LocalDate.of(1970, 6, 15));
        Man father = new Man("Vito", "Karleone", fatherBirthDate);
        familyService.createNewFamily(mother, father);
        List<Family> result = familyService.getFamiliesLessThan(3);
        assertFalse(result.isEmpty());
        assertTrue(result.get(0).countFamily() < 3);
    }

    @Test
    void deleteAllChildrenOlderThen() {
        long motherBirthDate = toMilliSec(LocalDate.of(1970, 12, 11));
        Woman mother = new Woman("Jane", "Karleone", motherBirthDate);
        long fatherBirthDate = toMilliSec(LocalDate.of(1970, 6, 15));
        Man father = new Man("Vito", "Karleone", fatherBirthDate);
        Family family = new Family(mother, father);
        long oldChildBirthDate = toMilliSec(LocalDate.of(1990, 8, 15));
        family.addChild(new Man("OldChild", "Karleone", oldChildBirthDate)); // >30 років
        long youngChildBirthDate = toMilliSec(LocalDate.of(2020, 3, 5));
        family.addChild(new Woman("YoungChild", "Karleone", youngChildBirthDate)); // <10 років
        familyService.service.saveFamily(family);

        familyService.deleteAllChildrenOlderThen(18);
        List<Family> families = familyService.getAllFamilies();
        assertEquals(1, families.size());
    }

    @Test
    void getFamilyById() {
        long motherBirthDate = toMilliSec(LocalDate.of(1970, 12, 11));
        Woman mother = new Woman("Jane", "Karleone", motherBirthDate);
        long fatherBirthDate = toMilliSec(LocalDate.of(1970, 6, 15));
        Man father = new Man("Vito", "Karleone", fatherBirthDate);
        familyService.createNewFamily(mother, father);
        Family expected = familyService.getAllFamilies().get(0);
        Family actual = familyService.getFamilyById(0);
        assertEquals(expected, actual);
    }

    @Test
    void getPets() {
        long motherBirthDate = toMilliSec(LocalDate.of(1970, 12, 11));
        Woman mother = new Woman("Jane", "Karleone", motherBirthDate);
        long fatherBirthDate = toMilliSec(LocalDate.of(1970, 6, 15));
        Man father = new Man("Vito", "Karleone", fatherBirthDate);
        Family family = new Family(mother, father);
        Pet pet = new Dog("Rock", 5, 50);
        family.setPet(pet);
        familyService.service.saveFamily(family);

        HashSet<Pet> pets = familyService.getPets(0);
        assertTrue(pets.contains(pet));
    }

    @Test
    void addPet() {
        long motherBirthDate = toMilliSec(LocalDate.of(1970, 12, 11));
        Woman mother = new Woman("Jane", "Karleone", motherBirthDate);
        long fatherBirthDate = toMilliSec(LocalDate.of(1970, 6, 15));
        Man father = new Man("Vito", "Karleone", fatherBirthDate);
        familyService.createNewFamily(mother, father);
        Pet pet = new DomesticCat( "Luna", 3, 30);
        familyService.addPet(0, pet);

        HashSet<Pet> pets = familyService.getPets(0);
        assertTrue(pets.contains(pet));
    }

    @Test
    void deleteFamily() {
        long motherBirthDate = toMilliSec(LocalDate.of(1970, 12, 11));
        Woman mother = new Woman("Jane", "Karleone", motherBirthDate);
        long fatherBirthDate = toMilliSec(LocalDate.of(1970, 6, 15));
        Man father = new Man("Vito", "Karleone", fatherBirthDate);
        familyService.createNewFamily(mother, father);
        Family family = familyService.getAllFamilies().get(0);
        boolean result = familyService.deleteFamily(family);
        assertTrue(result);
        assertTrue(familyService.getAllFamilies().isEmpty());
    }
}
