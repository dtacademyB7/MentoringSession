package april20;

public class Ball {

    // variables
    // fields, instance variables

    double radius;
    String color;
    boolean isFilled;

    // numeric variables -> 0
    // objects -> null
    // char -> '\u0001'
    // boolean -> false


    //Constructor


    public Ball(double radius, String color, boolean isFilled){
        this.radius = radius;
        this.color = color;
        this.isFilled = isFilled;
    }

    public Ball(double radius) {
        this.radius = radius;
    }


    // 4 differences:
    // - same name
    // - called implicitly
    // - no return type
    // - initialize variables;


    // instance methods

    public void moveUpwards(){
        System.out.println("move up");
    }
    public void moveDownwards(){
        System.out.println("move down");
    }
    public void moveRight(){
        System.out.println("move right");
    }
    public void moveLeft(){
        System.out.println("move left");
    }

    // toString()


    @Override
    public String toString() {
        return "april20.Ball{" +
                "radius=" + radius +

                '}';
    }
}
