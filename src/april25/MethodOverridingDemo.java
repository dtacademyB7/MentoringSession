package april25;

public class MethodOverridingDemo {


    public static void main(String[] args) {


        /**
         * Method overriding is applicable to instance methods only, static methods cannot be overridden
         *
         * Method overriding rules:
         *
         * - same method signature (name+parameters)
         * - visibility has to me the same or more visible
         * - return type has to be the same or covariant type (Sub type)
         * - The method in the child class may not throw a checked exception that is new or broader than the class of any exception thrown in the parent class method
         *
         */


        Sub sub = new Sub();

        System.out.println(sub.toString());


        Sub.myMethod();


    }
}
