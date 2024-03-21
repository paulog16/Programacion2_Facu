package Ejercicio2_21_03_2024.classes;

public class Leon extends Felino{
    public Leon() {
    }

    public Leon(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }

    @Override
    void makeNoise() {
        System.out.println("ruaaaur");
    }

    @Override
    void eat() {
        System.out.println("el leon come: "+ getFood());
    }
}
