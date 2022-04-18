public class MethodOverloading {



    public static void add(int i, int j){
        System.out.println(i+j);
    }

    // 3 ways to overload a method
    // number of params
    public static void add(int i, int j, int k){
        System.out.println(i+j);
    }

    // type of params
    public static void add(double i, int j){
        System.out.println(i+j);
    }

    // order of params
    public static void add(int i, double j){
        System.out.println(i+j);
    }


    public static void myMethod(int i, double j){
//
    }

    public static void myMethod(double i, int j){

    }

    // The order of method calls in overloaded methods:
    // 1. Exact match
    // 2. Next larger primitive type
     // byte->short->int->long->float->double
    // 3. The same Wrapper type
    // 4. Varargs

    public static void main(String[] args) {
       myMethod(5.4, 5); //Ambiguous method call happens when a call matches more than one methods
        add(45);

       final int i = 89;

    }

    public static void main(String args) {}

//    public static void add(int i){
//        System.out.println("int");
//    }

//    public static void add(double i){
//        System.out.println("double");
//    }

//    public static void add(short i){
//        System.out.println("short");
//    }


//    public static void add(long i){
//        System.out.println("long");
//    }

//    public static void add(Integer i){
//        System.out.println("Wrapper int");
//    }

    public static void add(int... i){  // variable length arguments
        System.out.println("int vararags");
    }

//    public static void add(Double i){
//        System.out.println("Wrapper double");
//    }



     // Can you overload the main method?
    // Yes, the original method will be called



}
