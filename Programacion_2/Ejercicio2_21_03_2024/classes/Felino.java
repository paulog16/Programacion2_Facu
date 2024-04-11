package Ejercicio2_21_03_2024.classes;

public abstract class Felino extends Animal{

    public Felino() {
    }

    public Felino(String photo, String food, String location, String size) {
        super(photo, food, location, size);
    }

    @Override
    void toRoar() {
        System.out.println("yo rujo");
    }


}
