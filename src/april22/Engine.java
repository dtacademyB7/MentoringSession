package april22;

public class Engine {


    String make;
    int noOfCylinders;
    boolean isElectric;


    public Engine(String make, int noOfCylinders, boolean isElectric) {
        this.make = make;
        this.noOfCylinders = noOfCylinders;
        this.isElectric = isElectric;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "make='" + make + '\'' +
                ", noOfCylinders=" + noOfCylinders +
                ", isElectric=" + isElectric +
                '}';
    }
}
