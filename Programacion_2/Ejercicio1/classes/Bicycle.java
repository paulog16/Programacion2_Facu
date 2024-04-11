package Ejercicio1.classes;

public class Bicycle extends Vehicle{
    private String type;

    public Bicycle() {
    }

    public Bicycle(String color, int ruedas, String type) {
        super(color, ruedas);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Bicycle{ color: "+getColor()+" wheels: " + getRuedas() +
                "type='" + type + '\'' +
                '}';
    }
}
