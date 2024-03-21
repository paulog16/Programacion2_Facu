package Ejercicio1_clase_19_03_2024.classes;

public class Directivo extends Empleado{
    public Directivo() {
    }

    public Directivo(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return "Directivo{}";
    }
}
