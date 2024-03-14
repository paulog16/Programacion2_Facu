package Ejercicio2.classes;

public class Bird extends Animal{

    private String especie;

    public Bird() {
    }

    public Bird(String nombre, int age, String genre, String especie) {
        super(nombre, age, genre);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
    void init_sound() {

    }

    @Override
    void information() {

    }

    @Override
    public String toString() {
        return "Bird{" +
                "especie='" + especie + '\'' +
                '}';
    }
}
