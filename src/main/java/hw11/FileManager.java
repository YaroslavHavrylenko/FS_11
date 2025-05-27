package hw11;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static final String DATA_PATH = "families.dat";
    public final String TEST_PATH = "data/test.txt";

    public static List<Family> loadData() {
        File file = new File(DATA_PATH);
        if (!file.exists()) {
            System.out.println("Файл зі списком сімей не знайдено");
            return new ArrayList<>();
        }
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(DATA_PATH))) {
            List<Family> families = (List<Family>) in.readObject();
            System.out.println("Список сімей завантажено.");
            families.forEach(family -> System.out.println(family.prettyFormat()));
            return families;
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
