package april27;

public class Cat extends Animal implements Commercializable{

    public void makeNoise(){
        System.out.println("cat meowing");
    }

    @Override
    public void makeMovement() {
        System.out.println("cat meowing");
    }


    @Override
    public void makeMoney() {
        System.out.println("Sell");
    }
}
