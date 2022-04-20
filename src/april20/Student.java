package april20;

public class Student {


    String name;
    int id;
    static String university = "MIT";

    int intCount;
    static int staticCount;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }


    public Student(){
        intCount++;
        staticCount++;
    }





//    public void instanceMethod(){
//        System.out.println(university);
//        staticMethod();
//    }

//    public static void staticMethod(){
//        System.out.println(name);
//        new april20.Student().instanceMethod();
//    }

    public static void main(String[] args) {

    }


}
