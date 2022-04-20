package april20;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BallApp {


    public static void main(String[] args) {

        Ball ball = new Ball(5,
                "Blue",
                true);



//        System.out.println(ball.toString()); //
//        System.out.println(ball); //


       List<Ball> balls = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            balls.add(new Ball(1+(new Random().nextInt(10))));
        }


        for( Ball ball1  : balls){
            System.out.println(ball1);
        }


        // Default Constructor - implicit constructor added when there
        // no constructors at all in the class

        Rectangle rectangle = new Rectangle();


    }
}
