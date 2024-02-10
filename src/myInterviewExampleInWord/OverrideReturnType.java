package myInterviewExampleInWord;

import com.InterviewByMe.A;

class Animal {
    Animal makeSound() {
        System.out.println("General Animal Sound");
        return new Animal();
    }
}
    // Subclass overriding the method with a covariant return type
    class Dog extends Animal {

        @Override
        Dog makeSound() {
            System.out.println("Bark!...");
            return new Dog();
        }
    }

public class OverrideReturnType {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal dogAnimal = new Dog();

        animal.makeSound();
        dogAnimal.makeSound();
    }
}
