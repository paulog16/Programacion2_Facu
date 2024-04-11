package Ejercicio2_21_03_2024.classes;

public abstract class Animal {
    private String photo;
    private String food;
    private String location;
    private String size;

    public Animal() {
    }

    public Animal(String photo, String food, String location, String size) {
        this.photo = photo;
        this.food = food;
        this.location = location;
        this.size = size;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    abstract void makeNoise();


    abstract void eat();


    void sleep() {
        System.out.println("yo duermo");
    };

    abstract void toRoar();
}
