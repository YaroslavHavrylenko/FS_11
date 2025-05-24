package hw10.DAO;

import hw10.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao {
    public List<Family> familyList = new ArrayList<>();

    public List<Family> getAllFamilies() {
        return familyList;
    }

    public Family getFamilyByIndex(int index) {
        if (index >= 0 && index < familyList.size()) return familyList.get(index);
        return null;
    }

    public Boolean deleteFamily(int index) {
        if (index >= 0 && index < familyList.size()) {
            familyList.remove(index);
            return true;
        }
        return false;
    }

    public Boolean deleteFamily(Family family) {
        if (familyList.contains(family)) {
            familyList.remove(family);
            return true;
        }
        return false;
    }

    public void saveFamily(Family family) {
        if (familyList.contains(family)) {
            for (int i = 0; i < familyList.size(); i++) {
                if (familyList.get(i).equals(family)) {
                    familyList.set(i, family);
                }
            }
        } else familyList.add(family);
    }
}