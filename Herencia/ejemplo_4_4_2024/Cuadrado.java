package ejemplo_4_4_2024;

public class Cuadrado implements Figura,Rotable,Dibujable{
    private float lado;

    public Cuadrado(float lado) {
        this.lado = lado;
    }

    public Cuadrado() {
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public void rotar() {
        System.out.println("el cuadrado rota");
    }

    @Override
    public void dibujar() {
        System.out.println("el cuadrado dibuja");
    }
}
