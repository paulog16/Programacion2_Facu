package Ejercicio1.classes;

public class Car extends Vehicle{

    private int velocity;
    private int displacement;

    public Car() {
    }

    public Car(int velocity, int displacement) {
        this.velocity = velocity;
        this.displacement = displacement;
    }

    public Car(String color, int ruedas, int velocity, int displacement) {
        super(color, ruedas);
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
        return "Car{ color: "+getColor()+" wheels: " + getRuedas() +
                " velocity=" + velocity +
                ", displacement=" + displacement +
                '}';
    }
}
