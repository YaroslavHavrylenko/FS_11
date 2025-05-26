package hw11.Controller;

import hw11.Exeption.FamilyOverflowException;
import hw11.Family;
import hw11.Human;
import hw11.Pet;
import hw11.Service.FamilyService;

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

    public void createNewFamily (Human woman, Human men) {
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
