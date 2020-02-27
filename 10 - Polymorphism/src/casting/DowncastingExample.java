package casting;

public class DowncastingExample {

    public static void main(String[] args) {

        Animal animalRef = new Dog(); // Upcasting a Dog obj to an Animal ref type
        Dog dogRef = (Dog) animalRef; // Downcasting the Dog obj referenced by animalRef into a Dog-typed ref variable
        Bird birdRef = (Bird) animalRef; // This won't work, throws a ClassCastException

        // Use instanceof to check if the object pointed to by a ref variable has an
        // is-a relationship to a particular class.
        if (animalRef instanceof Dog)
            dogRef = (Dog) animalRef;
        else
            System.out.println("animalRef does not point to a Dog obj");
    }
}

class Animal {
}

class Dog extends Animal {
}

class Bird extends Animal {
}