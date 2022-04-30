package april29;

import java.util.*;

public class CollectionsFramework {


    public static void main(String[] args) {


        // Collections vs Collection vs Collections Framework

        // Collections Framework - a java term for 4 interfaces of Java: List, Set, Queue, Map
        // Collection -  super interface of List, Set and Queue
        // Collections - a utility class that has useful method to work with Collection interface subclasses


//        List<String> coll  =  new ArrayList<>();

//        Collections.sort(new ArrayList<>());
//        Collections.reverse(new ArrayList<>());

        Set<String> names =  new HashSet<>();
        names.add("Johnny");
        names.add("Johnny");
        names.add("Johnny");
        names.add("Johnny");

        names.add("Xavier");

        names.add("Alex");
        names.add("Yolo");

        System.out.println(names);

//         names.get(2);

        // iterate through a set


        Iterator<String> iterator = names.iterator();
//
//         while(iterator.hasNext()){
//             System.out.println(iterator.next());
//         }


//        iterator.next();
//        iterator.next();
//        String next = iterator.next();

//        System.out.println(next);


        for (String name : names) {
            System.out.println(name);
        }

        // List -> ordered sequence of data which can contain duplicate values
        // ArrayList, LinkedList,  Vector, Stack

        // Set -> unordered collection which cannot contain duplicates
        // HashSet - does not keep the order
        // LinkedHashSet - keeps the order
        // TreeSet - sorts the collection as you add items

        // Queue -> a FIFO type collection where an item added first must be taken out first
        // Concrete classes ->
        // LinkedList -  we can use LinkedList for  regular FIFO queue
        // PriorityQueue - used for special queue where you can determine specific priority of retrieval



        // Stack -> LIFO style data structure

        Stack<String> stack =  new Stack<>();

        //Dynamic binding

        // Declared type           Actual type
        Queue<String> names2 = new LinkedList<>();
        names2.offer("Zeta");
        names2.offer("xavier");
        names2.offer("Nardos");
        names2.offer("Annie");

        System.out.println(names2);

        System.out.println(names2.poll());
        System.out.println(names2.poll());
        System.out.println(names2.poll());
        System.out.println(names2.poll());







    }
}
