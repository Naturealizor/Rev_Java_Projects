package one;

public class Application {

    public static void main(String[] args) {

        Person personOne = new Person();
        personOne.age = 25;
        personOne.name = "Jake";
        System.out.println("Name: " + personOne.name + "Age: " + personOne.age);
    }
}