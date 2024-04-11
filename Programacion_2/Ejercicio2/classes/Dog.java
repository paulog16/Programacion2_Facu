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
    public void init_sound() {
        System.out.println("the dogs barks");
    }

    @Override
   public void information() {
        System.out.println("Name: "+ getNombre());
        System.out.println("Age: "+getAge());
        System.out.println("Genre: "+getGenre());
        System.out.println("Raza: "+getRaza());
    }

    @Override
    public String toString() {
        return "Dog{" +
                "raza='" + raza + '\'' +
                '}';
    }
}
