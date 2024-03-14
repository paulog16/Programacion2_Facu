package Ejercicio2.classes;

public class Dog extends Animal{


    private String raza;

    public Dog() {
    }

    public Dog(String nombre, int age, String genre, String raza) {
        super(nombre, age, genre);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    void init_sound() {

    }

    @Override
    void information() {

    }

    @Override
    public String toString() {
        return "Dog{" +
                "raza='" + raza + '\'' +
                '}';
    }
}
