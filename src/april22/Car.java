package april22;

public class Car extends Vehicle{


    String vin;
    String color;
    Engine engine;


    public Car(String vin, String color, Engine engine) {
        this.vin = vin;
        this.color = color;
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "vin='" + vin + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }

    public static void main(String[] args) {
        Car car  = new Car("dsv", "blue", new Engine("honda", 4, true));


        System.out.println(car);
    }
}
