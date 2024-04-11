package trabajo_practico_2;

public class Pez extends Animal{
    private String tipoPez;
    private boolean nada;

    public Pez(String nombre, int edad, String tipoAnimal, double precio, String tipoPez, boolean nada) {
        super(nombre, edad, tipoAnimal, precio);
        this.tipoPez = tipoPez;
        this.nada = nada;
    }
}
