package hw09.DAO;

import hw09.Family;

import java.util.List;

public interface FamilyDao {

    List<Family> getAllFamilies ();
    Family getFamilyByIndex(int index);
    Boolean deleteFamily (int index);
    Boolean deleteFamily (Family family);
    void saveFamily (Family family);

}
