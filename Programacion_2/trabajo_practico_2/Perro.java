package trabajo_practico_2;

public class Perro extends Animal{
    private String raza;
    private boolean vacunado;

    public Perro(String nombre, int edad, String tipoAnimal, double precio, String raza, boolean vacunado) {
        super(nombre, edad, tipoAnimal, precio);
        this.raza = raza;
        this.vacunado = vacunado;
    }
}
