package hw11.Menu;

import hw11.Family;
import hw11.FileManager;

import java.util.List;

import static hw11.Menu.Menu.familyController;

public class MenuTwo {
    public static void runMenuTwo () {
        List<Family> allFamilies = familyController.getAllFamilies();
//        FileManager.saveFamilies(allFamilies);
        familyController.displayAllFamilies();
    }
}
