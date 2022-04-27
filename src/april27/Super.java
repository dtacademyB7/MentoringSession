package april27;

public class Super {


    int id = 10;
    String name = "super";


    public void instanceMethod1(){
        System.out.println("super instance method 1");
    }

    public void instanceMethod1(int i){
        System.out.println("super instance method  with int param");
    }

    public void instanceMethod2(){
        System.out.println("instance method 2");
    }

    private void instanceMethod3(){
        System.out.println("super private instance method 2");
    }

    public static void staticMethod(){
        System.out.println("super static method");
    }


    public static void main(String[] args) {
        Super obj = new Sub();

        obj.instanceMethod3();
    }


}
