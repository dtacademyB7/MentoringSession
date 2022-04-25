package april25;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Super {


    int id;
    int accountNo;





//     public void method1(){}


//     protected void method1(){}


//      private void method1(){}

    public int method1() throws FileNotFoundException {
        return 0 ;
    }


    public int method2() throws IOException, InterruptedException {
            return 0 ;
        }


        public int method3() throws FileNotFoundException {

//        final int i = 0;
//
//        i = 9;

        return 0 ;
        }












        @MyAnnotation
        public void method5(int i){

        }

         String method5(double i){
             return "";
        }


        public static void myMethod(){
            System.out.println("Super");
        }





    public final void method6(){

    }

    private void method7(){

    }






    public String toString() {
        return
                "id=" + id +
                ", accountNo=" + accountNo
                ;
    }
}
