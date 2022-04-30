package april30;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {


    public static void main(String[] args) {
        System.out.println(removeDuplicateChars("abbbxbbbcccccccaxxxbxxwwnw"));
    }
    //removeDuplicateChars("abbbxbbbcccccccaxxxbxxwwnw"); -> "abxcwn"

    public static String removeDuplicateChars(String str) {

        Set<Character> uniq =  new LinkedHashSet<>();

        for (int i = 0; i < str.length(); i++) {

            uniq.add(str.charAt(i));
        }



        return uniq.toString();
    }
}
