package trabajo_practico_2;

public class Main {
    public static void main(String[] args) {
        TiendaMascota tienda = new TiendaMascota();
        Perro perro= new Perro("Mora",2,"Perro",0,"callejero",true);
        Gato gato= new Gato("Milton",10,"Gato",0,"negro",true);
        Ave ave= new Ave("Fifi",2,"ave",0,"banco",true);
        Pez pez= new Pez("Raul",1,"pez",0,"callejero",true);
        tienda.addAnimal(perro);
        tienda.addAnimal(gato);
        tienda.addAnimal(ave);
        tienda.addAnimal(pez);

        tienda.listarAnimales();

        tienda.venderAnimal("Raul");
        tienda.alimentarAnimal("Milton");

        tienda.listarAnimales();
    }
}
