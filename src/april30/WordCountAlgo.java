package april30;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class WordCountAlgo {


    public static void main(String[] args) {

        // Word count algorithm


        String text = "We’re constantly developing new technologies and features to improve our services. For example, we use artificial intelligence and machine learning to provide you with simultaneous translations, and to better detect and block spam and malware";

        String[] words = text.split("[ ,.]");

        System.out.println(Arrays.toString(words));

        Map<String, Integer> map = new TreeMap<>();


        for (String word : words) {


           word = word.toLowerCase();
           if(!word.isEmpty()){

               if(!map.containsKey(word)){
                   map.put(word, 1);
               }else{
                   Integer count = map.get(word);
                   count++;
                   map.put(word, count);
               }
           }




        }

        System.out.println(map);

//        {new=2, and=4, to=6}



        //E.x input: "1 5 9 2 1 5 8 1" .  Output: "1(3) 2(1) 5(2) 8(1) 9(1)"

    }
}
