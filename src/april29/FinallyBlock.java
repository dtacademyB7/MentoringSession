package april29;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import sun.awt.windows.ThemeReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FinallyBlock {



    // final
    // finally
    // finalize() - a method from Object class


    public static void main(String[] args) {


        try {
            Scanner scan = new Scanner(new File("ds"));
            Thread.sleep(324);
//            throw new IOException();

        } catch (FileNotFoundException | InterruptedException  e) {
            e.printStackTrace();
            System.exit(2);
        }finally{
            System.out.println("Finally ");
        }

    }
}
