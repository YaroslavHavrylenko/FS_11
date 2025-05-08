package Additional;

import java.util.LinkedHashMap;
import java.util.LinkedList;

public class CalculateLetter {
    public static void main(String[] args) {
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut.";
        LinkedHashMap<Character, LinkedList<Integer>> myArray = new LinkedHashMap<>();
        str = str.toLowerCase();
        for (int i= 0;  i < str.length(); i++){
            Character c = str.charAt(i);
            if (c != ' ' && c != '.') {
                myArray.putIfAbsent(c, new LinkedList<>());
                myArray.get(c).add(i);
            }
        }
        myArray.forEach((key, value) -> {
            System.out.println("'" + key + "' = " + value.size() + " : " + value);
        });
    }
}
