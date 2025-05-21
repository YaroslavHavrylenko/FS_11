package hw12;

import java.util.List;

public class FamilyService {
    public CollectionFamilyDao service = new CollectionFamilyDao() {
        @Override
        public List<Family> getAllFamilies() {
            return service.getAllFamilies();
        }

        @Override
        public Family getFamilyByIndex(int index) {
            return service.getFamilyByIndex(index);
        }

        @Override
        public Boolean deleteFamily(int index) {
            return service.deleteFamily(index);
        }

        @Override
        public Boolean deleteFamily(Family family) {
            return service.deleteFamily(family);
        }

        @Override
        public void saveFamily(Family family) {
            service.saveFamily(family);
        }
    };
}
