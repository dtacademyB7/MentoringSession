package april27;

public interface Commercializable {

// all methods are implicitly public abstract

    void makeMoney();



    // default methods in interfaces, static methods - added with JDK 8,
    // methods that have implementation
    // why -> backward compatibility
    // static methods - to perform some Interface specific actions

    default  void myMethod(){
        System.out.println("cbds  d b");
    }

    public static  void myMethod2(){

    }
}
