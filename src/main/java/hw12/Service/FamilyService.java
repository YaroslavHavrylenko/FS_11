package hw12.Service;

import hw12.DAO.CollectionFamilyDao;
import hw12.Family;
import hw12.Human;
import hw12.HumanType.Man;
import hw12.HumanType.Woman;
import hw12.Pet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FamilyService {
    public CollectionFamilyDao service = new CollectionFamilyDao();

        public List<Family> getAllFamilies() {
            return service.getAllFamilies();
        }

        public void displayAllFamilies() {
            if (!getAllFamilies().isEmpty()){
                System.out.println("List of families:");
                for (int i = 0; service.getAllFamilies().size() > i; i++){
                    System.out.println((i+1) + ") " + service.getAllFamilies().get(i));
                }
            } else {
                    System.out.println("List of families is empty");
            }
        }

        public List<Family> getFamiliesBiggerThan (int familySize){
            List<Family> familiesBiggerThan = new ArrayList<>();
            for (Family family: service.getAllFamilies()){
                if (family.countFamily() > familySize) {
                    familiesBiggerThan.add(family);
                    System.out.println(family);
                }
            }
            return familiesBiggerThan;
        }

        public List<Family> getFamiliesLessThan (int familySize){
            List<Family> familiesLessThan = new ArrayList<>();
            for (Family family: service.getAllFamilies()){
                if (family.countFamily() < familySize) {
                    familiesLessThan.add(family);
                    System.out.println(family);
                }
            }
            return familiesLessThan;
        }

        public int countFamiliesWithMemberNumber (int memberNumber){
            int familiesWithMemberNumber = 0;
            for (Family family: service.getAllFamilies()){
                if (family.countFamily() == memberNumber) familiesWithMemberNumber++;
            }
            System.out.printf("The families with member number %d = %d.\n ", memberNumber, familiesWithMemberNumber);
            return familiesWithMemberNumber;
        }

        public void createNewFamily (Human woman, Human men) {
            Family family = new Family (woman, men);
            service.saveFamily(family);
        }

        public Boolean deleteFamilyByIndex(int index) {
            return service.deleteFamily(index);
        }

        public Family bornChild (Family family, String girlName, String boyName) {
            String childName = Math.random() < 0.5 ? girlName : boyName;
            Human child;
            if (childName.equals(boyName)) {
                child = new Man();   // або new Man(name, surname, ...)
            } else {
                child = new Woman(); // або new Woman(name, surname, ...)
            }
            child.setFamily(family);
            child.setName(childName);
            child.setSurname(family.getFather().getSurname());
            family.addChild(child);
            service.saveFamily(family);
            return family;
        }

        public Family adoptChild (Family family, Human child){
            family.addChild(child);
            child.setFamily(family);
            service.saveFamily(family);
            return family;
        }

        public void deleteAllChildrenOlderThen (int age) {
            List<Family> families = service.getAllFamilies();
            for (Family family:families){
                List<Human> childrenToRemove = new ArrayList<>();
                for (Human child:family.getChildren()){
                    if ((LocalDate.now().getYear() - child.getYear()) > age) childrenToRemove.add(child);
                }
                for (Human child : childrenToRemove) {
                    family.deleteChild(child);
                }
                service.saveFamily(family);
            }
        }

        public int count () {
            int quantityFamily = service.getAllFamilies().size();
            System.out.println("The quantity of families is " + quantityFamily);
            return quantityFamily;
        }

        public Family getFamilyById (int index) {
            return service.getFamilyByIndex(index);
        }

        public HashSet<Pet> getPets (int index){
            return service.getFamilyByIndex(index).getPet();
        }

        public void addPet (int index, Pet pet) {
            Family family = service.getFamilyByIndex(index);
            family.setPet(pet);
            service.saveFamily(family);
        }

        public Family getFamilyByIndex(int index) {
            return service.getFamilyByIndex(index);
        }

        public Boolean deleteFamily(Family family) {
            return service.deleteFamily(family);
        }
}
