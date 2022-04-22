package april22;

public class MyString {

    String str;


    public MyString(String str){
        this.str = str;
    }

    public String getStr() {
        return str;
    }



    @Override
    public String toString() {
        return str;
    }

    public static void main(String[] args) {
        MyString myString = new MyString("HTML");

        System.out.println(myString);



    }
}
