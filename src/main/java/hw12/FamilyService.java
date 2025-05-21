package hw12;

import java.util.List;

public class FamilyService {
    public FamilyDao service = new FamilyDao() {
        @Override
        public List<Family> getAllFamilies() {
            return List.of();
        }

        @Override
        public Family getFamilyByIndex(int index) {
            return null;
        }

        @Override
        public Boolean deleteFamily(int index) {
            return null;
        }

        @Override
        public Boolean deleteFamily(Family family) {
            return null;
        }

        @Override
        public void saveFamily(Family family) {

        }
    };
}
