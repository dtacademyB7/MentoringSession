package april30;

import java.util.*;

public class Maps {


    public static void main(String[] args) {

        // Map: data structure where each element is stored as a key-value pair
        // HashMap - does not keep the order of insertion
        // LinkedHashMap - keeps the order of insertion
        // TreeMap - sorts the map by its keys


        Map<Integer, String> students = new TreeMap<>();



        students.put(44,"Xavier");
        students.put(1,"Ali");
        students.put(34,"Allie");
        students.put(22,"Benny");
        students.put(21,"Benny");
        students.put(4,"Matt");
        students.put(4,"John");

        System.out.println(students);

        System.out.println(students.get(22));
        System.out.println(students.get(4));

//        Set<Integer> integers = students.keySet();//
//
//        for (Integer integer : integers) {
//            System.out.println(integer);
//        }

//        Collection<String> values = students.values();
//
//        for (String value : values) {
//            System.out.println(value);
//        }

        Set<Map.Entry<Integer, String>> entries = students.entrySet();

        for (Map.Entry<Integer, String> entry : entries) {
            entry.setValue(entry.getValue().toUpperCase());
            System.out.println(entry);
        }






    }
}
