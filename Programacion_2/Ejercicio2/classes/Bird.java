package Ejercicio2.classes;

public class Bird extends Animal{

    private String especie;

    public Bird() {
    }

    public Bird(String nombre, int age, String genre, String especie) {
        super(nombre, age, genre);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    @Override
  public  void init_sound() {
        System.out.println("te bird sing");
    }

    @Override
    public void information() {
        System.out.println("Name: "+ getNombre());
        System.out.println("Age: "+getAge());
        System.out.println("Genre: "+getGenre());
        System.out.println("Raza: "+getEspecie());
    }

    @Override
    public String toString() {
        return "Bird{" +
                "especie='" + especie + '\'' +
                '}';
    }
}
