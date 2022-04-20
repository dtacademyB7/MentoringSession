package april20;

public class StaticVsInstance {


     // variables, methods, inner classes can be static


    //


//    static class Dog{}



    public static void main(String[] args) {


        Student student1 = new Student("John", 45);
        Student student2 = new Student("Matt", 34);

        System.out.println(student1.name);
        System.out.println(student2.name);
        System.out.println(Student.university);


        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();


        System.out.println(st1.intCount); // 1
        System.out.println(st3.staticCount); // 5


        Student st4 = new Student();
        Student st5 = new Student();








    }





}
