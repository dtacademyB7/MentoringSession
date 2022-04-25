package april25;

import java.util.Objects;

public class Dog extends Animal {

    int age;
    String breed;


    public void makeNoise(){
        System.out.println("dof woofing");
    }

    public void makeMovement(){
        System.out.println("dog is running");
    }

    @Override
    public String toString() {
        return "Dog{}";
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Dog dog = (Dog) o;
//        return age == dog.age && Objects.equals(breed, dog.breed);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(age, breed);
//    }
}
