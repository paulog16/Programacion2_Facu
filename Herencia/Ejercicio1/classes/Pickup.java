package Ejercicio1.classes;

public class Pickup extends Car{
    private int chargue;

    public Pickup() {
    }

    public Pickup(String color, int ruedas, int velocity, int displacement, int chargue) {
        super(color, ruedas, velocity, displacement);
        this.chargue = chargue;
    }

    public int getChargue() {
        return chargue;
    }

    public void setChargue(int chargue) {
        this.chargue = chargue;
    }

    @Override
    public String toString() {
        return "Pickup{color: "+getColor()+" wheels: " + getRuedas() +
                "chargue=" + chargue +
                '}';
    }
}
