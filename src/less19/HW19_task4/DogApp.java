package less19.HW19_task4;

import less18.HomeWork.HW18_Dog;

import java.util.Arrays;

public class DogApp {
    public static void main(String[] args) {

    System.out.println(Arrays.toString(Dog.getBarier()));

    Dog dog1= new Dog("yyy");
    System.out.println(dog1.toString());
    dog1.jampBarier();
    System.out.println(dog1.toString());


    }
}
