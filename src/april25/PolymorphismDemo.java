package april25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PolymorphismDemo {


    // Polymorphism -> an ability of an object to take many forms

    // An ability of a super type reference to be assigned a subtype object

    // Benefits: code re-use, code flexibility, dynamic code

    public static void main(String[] args) {


//        Scanner scan =  new Scanner(System.in);
//        System.out.println("Enter the animal type: ");
//        String an = scan.next();



//        Animal animal = null;
//
//        if(an.equals("Dog")){
//            animal = new Dog();
//        }else if(an.equals("Cat")){
//            animal = new Cat();
//        }
//
//        animal.makeNoise();
//        animal.makeMovement();


        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Cat());
        animalList.add(new Dog());
        animalList.add(new Cat());
        animalList.add(new Dog());


        for (Animal animal : animalList) {
            animal.makeNoise();
        }

    }


}
