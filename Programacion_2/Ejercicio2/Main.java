package Ejercicio2;

import Ejercicio2.classes.Animal;
import Ejercicio2.classes.Bird;
import Ejercicio2.classes.Cat;
import Ejercicio2.classes.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog= new Dog("Mora",5,"female","street");
        Cat cat= new Cat("milton",12,"male","brown");
        Bird bird= new Bird("kiti",2,"male","hornero");

        dog.init_sound();
        dog.information();

        System.out.println("-----------");

        cat.init_sound();
        cat.information();

        System.out.println("------------");

        bird.init_sound();
        bird.information();
    }
}
