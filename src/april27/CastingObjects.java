package april27;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CastingObjects {


    public static void main(String[] args) {


        // Implicit / Upcasting


        Super sup =  (Super) new Sub();


        // Downcasting / Explicit
        // The main reason why downcasting is needed: superclass does not have direct access to subclass members

        ((Sub)sup).methodSub();

//        Sub sub =  (Sub) new Super();

//        String sup1 =   (String) new Sub(); //unrelated types result in compiler error

//        Object o =  new String();
//
//        Object o2 = new StringBuilder();
//
//        o2 = (StringBuilder)o;


        ArrayList<Object> customerInfo = new ArrayList<>();
        customerInfo.add("john doe");
        customerInfo.add(32);
        customerInfo.add(231432423443L);
        customerInfo.add('m');

        System.out.println(customerInfo);


       String name =  (String)(customerInfo.get(0));

        System.out.println(((String)customerInfo.get(0)).toUpperCase());


//        Object o = customerInfo.get(3);


        Object o =  new String();
//
        Object o2 = new StringBuilder();

        if(o instanceof StringBuilder){
            o2 = (StringBuilder)o;
        }



    }

}
