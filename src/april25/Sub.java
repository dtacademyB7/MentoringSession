package april25;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Sub extends Super {


    String name;
    String className;




//     protected void method1(){}

//       void method1(){}


//      private void method1(){}

//    public Integer method1(){
//        return 0;
//    }



//    public int method1() throws IOException {
//        return 0 ;
//
//
//    }


    public int method2() throws FileNotFoundException{
//        new ArithmeticException();
//        Thread.sleep(34);
        return 0 ;
    }

     public int method3() throws  ArithmeticException {
            return 0 ;
        }



//

   // overloading
    public int method5(String i){
       return 0;
    }






    public static void myMethod(){
        System.out.println("Sub");
    }


//   public final void method6(){
//
//    }

    private void method7(){

    }



    public String toString() {
        return
                super.toString() +
                ", name='" + name + '\'' +
                ", className='" + className ;
    }
}
