package april20;

public class Rectangle {

    int i;

    // this()

    // this() and super(), can they come in the same constructor?
    // No, only one of them can come

    public Rectangle(){
//        super();
//        i = 56;
        this(56); //Call to 'this()' must be first statement in constructor body
        System.out.println("cdsvvcds");

        // this()
    }


    public Rectangle(int i){
        // super();
         this.i = i;
    }

}
