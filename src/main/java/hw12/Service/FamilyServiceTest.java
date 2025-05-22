package hw12.Service;

import hw12.DAO.CollectionFamilyDao;
import hw12.Family;
import hw12.HumanType.Man;
import hw12.HumanType.Woman;
import hw12.Human;
import hw12.Pet;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class FamilyServiceTest {

    private FamilyService familyService;

    @BeforeEach
    void setUp() {
        familyService = new FamilyService();
    }

    @Test
    void testCreateNewFamily() {
        Woman woman = new Woman("Jane", "Doe", 1980);
        Man man = new Man("John", "Doe", 1978);
        familyService.createNewFamily(woman, man);
        assertEquals(1, familyService.count());
    }

    @Test
    void testGetAllFamilies() {
        Woman woman = new Woman("Jane", "Smith", 1982);
        Man man = new Man("Bob", "Smith", 1980);
        familyService.createNewFamily(woman, man);
        List<Family> families = familyService.getAllFamilies();
        assertFalse(families.isEmpty());
    }

    @Test
    void testDeleteFamilyByIndex() {
        Woman woman = new Woman("Jane", "Smith", 1982);
        Man man = new Man("Bob", "Smith", 1980);
        familyService.createNewFamily(woman, man);
        assertTrue(familyService.deleteFamilyByIndex(0));
    }

    @Test
    void testBornChild() {
        Woman woman = new Woman("Anna", "Brown", 1985);
        Man man = new Man("Tom", "Brown", 1983);
        Family family = new Family(woman, man);
        familyService.bornChild(family, "Lucy", "Max");
        assertEquals(1, family.getChildren().size());
    }

    @Test
    void testAdoptChild() {
        Woman woman = new Woman("Sara", "White", 1980);
        Man man = new Man("Mark", "White", 1979);
        Family family = new Family(woman, man);
        Human child = new Man("Tommy", "White", 2015);
        familyService.adoptChild(family, child);
        assertTrue(family.getChildren().contains(child));
    }

    @Test
    void testCountFamiliesWithMemberNumber() {
        Woman woman = new Woman("Lily", "Black", 1990);
        Man man = new Man("Jack", "Black", 1988);
        familyService.createNewFamily(woman, man);
        assertEquals(1, familyService.countFamiliesWithMemberNumber(2));
    }

    @Test
    void getFamiliesBiggerThan (){

    }

    @Test
    void getFamiliesLessThan (){

    }

    @Test
    void deleteAllChildrenOlderThen() {

    }

    @Test
    void getFamilyById() {

    }
    @Test
    void getPets() {

    }

    @Test
    void addPet() {

    }

    @Test
    void deleteFamily() {

    }
}
