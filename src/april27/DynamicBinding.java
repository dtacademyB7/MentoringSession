package april27;

public class DynamicBinding {



    // Dynamic Binding  vs Static Binding
    // Run-time polymorphism vs Compile-time polymorphism
    // Method overriding vs Method Overloading

  //  Static binding - variables, static methods
  // Dynamic binding - instance methods
    public static void main(String[] args) {

        //Declared type  = Actual Type
        //Reference type = Object Type
        Super obj = new Sub();
        System.out.println(obj.id);
        obj.instanceMethod1();
        obj.staticMethod();
        obj.instanceMethod1(34);





    }



}
