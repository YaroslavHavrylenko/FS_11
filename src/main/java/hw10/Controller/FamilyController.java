package hw10.Controller;

import hw10.Exeption.FamilyOverflowException;
import hw10.Family;
import hw10.Human;
import hw10.HumanType.Man;
import hw10.HumanType.Woman;
import hw10.Pet;
import hw10.Service.FamilyService;

import java.util.HashSet;
import java.util.List;

public class FamilyController {
    FamilyService familyService;

    public FamilyController() {
        this.familyService = new FamilyService();
    }

    public List<Family> getAllFamilies() {
        return familyService.getAllFamilies();
    }

    public void displayAllFamilies() {
        familyService.displayAllFamilies();
    }

    public List<Family> getFamiliesBiggerThan (int familySize){
        return familyService.getFamiliesBiggerThan(familySize);
    }

    public List<Family> getFamiliesLessThan (int familySize){
        return familyService.getFamiliesLessThan(familySize);
    }

    public int countFamiliesWithMemberNumber (int memberNumber){
        return familyService.countFamiliesWithMemberNumber(memberNumber);
    }

    public void createNewFamily (Woman woman, Man men) {
        familyService.createNewFamily(woman, men);
    }

    public Boolean deleteFamilyByIndex(int index) {
        return familyService.deleteFamilyByIndex(index);
    }

    public void bornChild (Family family, String girlName, String boyName) {
        try {
            familyService.bornChild(family, girlName, boyName);
        } catch (FamilyOverflowException e) {
            System.out.println("Неможливо усиновити дитину: " + e.getMessage());
        }
    }

    public void adoptChild (Family family, Human child){
        try {
            familyService.adoptChild(family, child);
        } catch (FamilyOverflowException e){
            System.out.println("Неможливо усиновити дитину: " + e.getMessage());
        }
    }

    public void deleteAllChildrenOlderThen (int age) {
        familyService.deleteAllChildrenOlderThen(age);
    }

    public int count () {
        return familyService.count();
    }

    public Family getFamilyById (int index) {
        return familyService.getFamilyById(index);
    }

    public HashSet<Pet> getPets (int index){
        return familyService.getPets(index);
    }

    public void addPet (int index, Pet pet) {
        familyService.addPet(index, pet);
    }

    public Family getFamilyByIndex(int index) {
        return familyService.getFamilyByIndex(index);
    }

    public Boolean deleteFamily(Family family) {
        return familyService.deleteFamily(family);
    }
}
