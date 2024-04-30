package Parcial1_Practica;

public class Athlete extends Person implements Contract{

    private double height;
    private int age;
    private double weight;


    public Athlete() {
    }

    public Athlete(int id, String name, double height, int age, double weight) {
        super(id, name);
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double calculateImc() {
        return weight / (height*height);
    }

    @Override
    public boolean thereIsExtraWeight(double imc) {
        return imc > 25.0;
    }

    @Override
    public double takeHeartRate() {
        return 70; //valor de prueba
    }
}
