package april30;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class CollectionConstructors {


    public static void main(String[] args) {


        List<Integer> nums =  new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(2);
        nums.add(1);
        nums.add(2);
        nums.add(3);


        System.out.println(nums);


        System.out.println(new ArrayList<>(new LinkedHashSet<>(nums)));

    }
}
