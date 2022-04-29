package april29;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HandlingCheckedExceptions {


    public static void main(String[] args) {

        // Handle or declare

        // throw vs throws
        // throws - used for declaring the exception in the method header
        // throw - used for throwing an exception explicitly by the programmer.

//        myAnotherMethod();



        test1();
    }




    public static void myMethod() throws InterruptedException, FileNotFoundException {


        Thread.sleep(1000);
        Scanner scan =  new Scanner(new File("dcv"));


    }



    public static void myAnotherMethod() throws FileNotFoundException, InterruptedException {
        myMethod();

    }


     public static void test1(){
        throw new TestSkipException("Test is skipped");
     }

}
