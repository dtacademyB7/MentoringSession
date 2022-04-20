package april18;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class VarArgs {


    public static void main(String... args) {


      //  ...  -> varargs, when method takes variable number of arguments

        sum();
        sum(2);
        sum(2, 4);
        sum(2, 4,4,5,6,7,8,8,9,0,3,4,3,4);

//        List<String> strings = Arrays.asList();

    }

    public static void sum(int... arr){ //... -> ellipsis
       // ... is treated as array
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int j = 0; j < arr.length; j++) {
            sum+=arr[j];
        }
        System.out.println(sum);
    }


}
