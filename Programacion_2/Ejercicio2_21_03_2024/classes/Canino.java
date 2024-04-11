package Ejercicio2_21_03_2024.classes;

public abstract class Canino extends Animal{
    public Canino() {
    }

    public Canino(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }

    @Override
    void toRoar() {
        System.out.println(" yo rujo ");
    }
}
