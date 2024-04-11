package Ejercicio1.classes;

public class Motorcycle extends Bicycle {

    private int velocity;
    private int displacement;

    public Motorcycle() {
    }

    public Motorcycle(String color, int ruedas, String type, int velocity, int displacement) {
        super(color, ruedas, type);
        this.velocity = velocity;
        this.displacement = displacement;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public int getDisplacement() {
        return displacement;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "Motorcycle{color: "+getColor()+" wheels: " + getRuedas() +
                "velocity=" + velocity +
                ", displacement=" + displacement +
                '}';
    }
}
