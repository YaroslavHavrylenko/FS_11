package Additional;

public class Brackets {

    static boolean isValid(String s) {
        int open = 0;
        int maxDeep = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case '{':
                    open++;
                    if (open > maxDeep) maxDeep = open;
                    break;
                case '}': open--; break;
                default:
            }
            if (open < 0) return false;
        }
        return open == 0;
    }

}
