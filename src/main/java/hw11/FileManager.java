package hw11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static final String DATA_PATH = "families.dat";

    public static List<Family> loadData() {
        File file = new File(DATA_PATH);
        if (!file.exists()) {
            System.out.println("Файл зі списком сімей не знайдено");
            return new ArrayList<>();
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(DATA_PATH))) {
            List<Family> familyList = (List<Family>) in.readObject();
            System.out.println("Список сімей завантажено.");
            familyList.forEach(family -> System.out.println((familyList.indexOf(family) +1) + ") " +family.prettyFormat()));
            return familyList;
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Помилка завантаження: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static void saveFamilies(List<Family> families) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(DATA_PATH))) {
            out.writeObject(families);
            System.out.println("Список сімей збережено до бази даних.");
        } catch (IOException e) {
            System.out.println("Неможливе збереження даних про сім'ї: " + e.getMessage());
        }
    }

}
