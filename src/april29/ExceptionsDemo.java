package april29;

import java.util.Scanner;

public class ExceptionsDemo {


    public static void main(String[] args) {


        System.out.println("Game started.");
        System.out.println("Division is happening...");

        Scanner scan =  new Scanner(System.in);

        System.out.println("Please enter 2 numbers: ");

        int a = scan.nextInt();
        int b = scan.nextInt();


        if(b == 0) {
            System.out.println("Division by zero is not allowed. ");
            System.out.println("Division was rejected.");
            System.out.println("Ending the program...");
//            return;
            System.exit(2);
        }


       System.out.println("The result is: " + a/b);

        System.out.println("The game continues....");









    }
}
