package trabajo_practico_2;

public class Gato extends Animal{
    private String raza;
    private boolean esterilizado;

    public Gato(String nombre, int edad, String tipoAnimal, double precio, String raza, boolean esterilizado) {
        super(nombre, edad, tipoAnimal, precio);
        this.raza = raza;
        this.esterilizado = esterilizado;
    }
}
