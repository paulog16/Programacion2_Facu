package trabajo_practico_2;

public class Ave extends Animal{
    private String especie;
    private boolean habla;

    public Ave(String nombre, int edad, String tipoAnimal, double precio, String especie, boolean habla) {
        super(nombre, edad, tipoAnimal, precio);
        this.especie = especie;
        this.habla = habla;
    }
}
