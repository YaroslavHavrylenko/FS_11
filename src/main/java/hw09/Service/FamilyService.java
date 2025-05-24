package hw09.Service;

import hw09.DAO.CollectionFamilyDao;
import hw09.Family;
import hw09.Human;
import hw09.HumanType.Man;
import hw09.HumanType.Woman;
import hw09.Pet;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class FamilyService {
    public CollectionFamilyDao service = new CollectionFamilyDao();

        public List<Family> getAllFamilies() {
            return service.getAllFamilies();
        }

        public void displayAllFamilies() {
            List<Family> familyList = getAllFamilies();
            if (!familyList.isEmpty()){
                System.out.println("List of families:");
                getAllFamilies()
                        .forEach(family -> System.out.println((familyList.indexOf(family) +1) + ") " + family));
            } else {
                System.out.println("List of families is empty");
            }
        }

        public List<Family> getFamiliesBiggerThan (int familySize){
            System.out.printf("Families bigger then %d :\n", familySize);
            List<Family> familiesBiggerThan = new ArrayList<>();
            familiesBiggerThan = getAllFamilies().stream()
                    .filter(family -> family.countFamily() > familySize)
                    .peek(System.out::println)
                    .collect(Collectors.toList());
           return familiesBiggerThan;
        }

        public List<Family> getFamiliesLessThan (int familySize){
            System.out.printf("Families less then %d :\n", familySize);
            List<Family> familiesLessThan = new ArrayList<>();
            familiesLessThan = getAllFamilies().stream()
                    .filter(family -> family.countFamily() < familySize)
                    .peek(System.out::println)
                    .collect(Collectors.toList());
            return familiesLessThan;
        }

        public int countFamiliesWithMemberNumber (int memberNumber){
//            System.out.printf("Families With Member Number %d :", memberNumber);
            int familiesWithMemberNumber = 0;
            familiesWithMemberNumber = Math.toIntExact(getAllFamilies().stream()
                    .filter(family -> family.countFamily() == memberNumber)
                    .count());

            System.out.printf("The families with member number %d is %d.\n ", memberNumber, familiesWithMemberNumber);
            return familiesWithMemberNumber;
        }

        public void createNewFamily (Human woman, Human men) {
            Family family = new Family(woman, men);
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

    public void deleteAllChildrenOlderThen(int age) {
        getAllFamilies().forEach(family -> {
            List<Human> childrenToRemoveFromFamily = family.getChildren().stream()
                    .filter(child -> LocalDate.now().getYear() - child.getYear() > age)
                    .collect(Collectors.toList());
            childrenToRemoveFromFamily.forEach(family::deleteChild);
            service.saveFamily(family);
        });
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
