package hw11.Service;

import hw11.DAO.CollectionFamilyDao;
import hw11.Exeption.FamilyOverflowException;
import hw11.Family;
import hw11.Human;
import hw11.HumanType.Man;
import hw11.HumanType.Woman;
import hw11.Pet;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

import static hw08.TransformTime.toLocalDate;
import static hw08.TransformTime.toMilliSec;

public class FamilyService {
    public CollectionFamilyDao service = new CollectionFamilyDao();
    private static final int MAX_FAMILY_SIZE = 5;

        public List<Family> getAllFamilies() {
            return service.getAllFamilies();
        }

        public void displayAllFamilies() {
            List<Family> familyList = getAllFamilies();
            if (!familyList.isEmpty()){
                System.out.println("List of families:");
                getAllFamilies()
                        .forEach(family -> System.out.println((familyList.indexOf(family) +1) + ") " + family.prettyFormat()));
            } else {
                System.out.println("List of families is empty");
            }
        }

        public List<Family> getFamiliesBiggerThan (int familySize){
            System.out.printf("Families bigger then %d :\n", familySize);
            List<Family> familiesBiggerThan;
            familiesBiggerThan = getAllFamilies().stream()
                    .filter(family -> family.countFamily() > familySize)
                    .peek(family -> System.out.println(family.prettyFormat()))
                    .collect(Collectors.toList());
           return familiesBiggerThan;
        }

        public List<Family> getFamiliesLessThan (int familySize){
            System.out.printf("Families less then %d :\n", familySize);
            List<Family> familiesLessThan;
            familiesLessThan = getAllFamilies().stream()
                    .filter(family -> family.countFamily() < familySize)
                    .peek(family -> System.out.println(family.prettyFormat()))
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
            if (family.countFamily() >= MAX_FAMILY_SIZE) {
                throw new FamilyOverflowException("Сім’я не може мати більше ніж " + MAX_FAMILY_SIZE + " осіб.");
            } else {
                String childName = Math.random() < 0.5 ? girlName : boyName;
                Human child;
                if (childName.equals(boyName)) {
                    child = new Man();
                } else {
                    child = new Woman();
                }
                child.setFamily(family);
                child.setName(childName);
                child.setBirthDate(toMilliSec(LocalDate.now()));
                child.setIq(((int) (Math.random() * 150)));
                child.setSurname(family.getFather().getSurname());
                family.addChild(child);
                System.out.printf("Вітаємо! В сім'ї %s народилася дитина!\n", family.getFather().getSurname());
                service.saveFamily(family);
                return family;
            }
        }

        public Family adoptChild (Family family, Human child){
            if (family.countFamily() >= MAX_FAMILY_SIZE) {
                throw new FamilyOverflowException("Сім’я не може мати більше ніж " + MAX_FAMILY_SIZE + " осіб.");
            }

            family.addChild(child);
            child.setFamily(family);
            System.out.printf("Вітаємо! Сім'я %s всиновила дитину!\n", family.getFather().getSurname());
            service.saveFamily(family);
            return family;
        }

    public void deleteAllChildrenOlderThen(int age) {
        getAllFamilies().forEach(family -> {
            List<Human> childrenToRemoveFromFamily = family.getChildren().stream()
                    .filter(child -> LocalDate.now().getYear() - toLocalDate(child.getBirthDate()).getYear() > age)
                    .collect(Collectors.toList());
            childrenToRemoveFromFamily.forEach(family::deleteChild);
            service.saveFamily(family);
        });
    }


    public int count () {
            int quantityFamily = service.getAllFamilies().size();
//            System.out.println("The quantity of families is " + quantityFamily);
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


        public void loadData(List<Family> families) {
        this.service.loadData(families);
        }
}
