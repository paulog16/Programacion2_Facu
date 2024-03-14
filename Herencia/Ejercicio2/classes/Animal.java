package Ejercicio2.classes;

public class Animal {
    private String nombre;
    private int age;
    private String genre;

    public Animal() {
    }

    public Animal(String nombre, int age, String genre) {
        this.nombre = nombre;
        this.age = age;
        this.genre = genre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }



    public void setGenre(String genre) {
        this.genre = genre;
    }

   public void init_sound(){

   };
    public void information(){

    };
    @Override
    public String toString() {
        return "Animal{" +
                "nombre='" + nombre + '\'' +
                ", age=" + age +
                ", genre='" + genre + '\'' +
                '}';
    }
}
