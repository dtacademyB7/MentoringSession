package april22;

public class Sub extends Super{

    int accountNo;
    String value;

    // Constructor

    // Can this() and super() be in the same constructor?
    // No, they cannot, either super() or this() can come

    public Sub(){
       // every constructor in Java has an implicit super() call
        // to the default constructor of a super class


//       this(67);
    }


    public Sub(int accountNo, String value){
        super(4,"blavla", 4546L);
        this.accountNo = accountNo;
        this.value = value;
    }

    @Override
    public String toString() {
        return
                "accountNo=" + accountNo +
                ", value='" + value + ", " + super.toString();
    }


    public static void main(String[] args) {
        System.out.println(new Sub(325432654, "value"));
    }
}
