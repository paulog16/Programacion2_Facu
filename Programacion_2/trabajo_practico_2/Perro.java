package trabajo_practico_2;

public class Perro extends Animal{
    private String raza;
    private boolean vacunado;

    public Perro(String nombre, int edad, double precio, String raza, boolean vacunado) {
        super(nombre, edad,"Perro", precio);
        this.raza = raza;
        this.vacunado = vacunado;
    }
}
