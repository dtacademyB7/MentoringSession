package april22;

public class StringBuilderDemo {


    public static void main(String[] args) {




        // Immutable - String
        // Mutable - Sb


        // Immutability - property of an object where the initial value cannot be upddated after initialization

        String str = "Java";
        str.toUpperCase(); // Calling a method
        System.out.println(str); //Java


        StringBuilder sb = new StringBuilder("a");
        sb.insert(1, "bcd");
        System.out.println(sb);

    }
}
