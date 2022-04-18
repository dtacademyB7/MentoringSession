public class WrapperTypes {


    public static void main(String[] args) {


        int i = 78;

        double j = i;

        double k = 56;

        // Wrappers are simply class version of primitives
        Integer h = new Integer(34);

        // Autoboxing -> taking a primitive and wrap it around an object
        Integer num = 66;

        // Auto-unboxing
        int num2 = new Integer(33);

//          Integer num = 66.4;

//        Double d = 56;

        // Conversion methods

        String price = "$35.99";
        // Calculate tax 6 percent

        // Parse methods -> convert string into a number
        int i1 = Integer.parseInt("34"); //returns primitives
        double v = Double.parseDouble("12.45"); //

        double priceAsNum = Double.parseDouble(price.replace("$", ""));

        System.out.println("Tax is " + priceAsNum*0.06 );

        // Convert a  number to string

         String str = 89+"";
         String str2 = String.valueOf(89); // converts non string into a string

        // ValueOf methods of Wrapper

        Integer integer = Integer.valueOf("25"); //returns wrapper obj




    }
}
