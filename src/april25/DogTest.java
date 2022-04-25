package april25;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DogTest {


    public static void main(String[] args) {


        System.out.println(new Dog());


        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        System.out.println(dog1.equals(dog2));

        StringBuilder sb = new StringBuilder("java");
        StringBuilder sb2 = new StringBuilder("java");

        System.out.println(sb.equals(sb2));

        // getClass()

        System.out.println(dog1.getClass());
        System.out.println(sb.getClass());

        List<String> list = new LinkedList<>();
        System.out.println(list.getClass());




    }
}
