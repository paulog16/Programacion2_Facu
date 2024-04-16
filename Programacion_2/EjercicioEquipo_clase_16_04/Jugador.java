package EjercicioEquipo_clase_16_04;

public class Jugador {
    private String name;
    private String position;
    private String number;

    public Jugador() {
    }

    public Jugador(String name, String position, String number) {
        this.name = name;
        this.position = position;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
