package Ejercicio2.classes;

public class Cat extends Animal{

    private String color_eyes;

    public Cat() {
    }

    public Cat(String nombre, int age, String genre, String color_eyes) {
        super(nombre, age, genre);
        this.color_eyes = color_eyes;
    }

    public String getColor_eyes() {
        return color_eyes;
    }

    public void setColor_eyes(String color_eyes) {
        this.color_eyes = color_eyes;
    }

    @Override
    void init_sound() {

    }

    @Override
    void information() {

    }

    @Override
    public String toString() {
        return "Cat{" +
                "color_eyes='" + color_eyes + '\'' +
                '}';
    }
}
