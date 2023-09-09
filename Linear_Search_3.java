import java.util.Arrays;

public class Linear_Search_3 {
    public static void main(String[] args) {
        // Search the target characters using forEcah loop
        String name = "ShriRam";
        char target = 'R';
        boolean ans = search(name, target);
        System.out.println(ans);

    }

    static boolean search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        // if we want to use the foreach loop then change the string into array and use the loop
        // tocharArray is used to covert string into array
        
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;

    }

}
