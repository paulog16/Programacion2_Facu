package trabajo_practico_2;

import java.util.ArrayList;
import java.util.List;

public class TiendaMascota {


    private List<Animal>animales;  //DECLARO LISTA DE ANIMALES

    //CONSTRUCTOR DE TIENDAMASCOTA
    public TiendaMascota(){ //CONSTRUCTOR TIENDA MASCOTA
        animales= new ArrayList<>();
    }
    public void addAnimal(Animal animal ){ //METODO PARA AGREGAR UN ANIMAL
        animales.add(animal);
    }

    public void venderAnimal(String nombre){
        for(Animal animal: animales){
            if(animal.getNombre().equals(nombre)){
                animales.remove(animal);
                System.out.println("se vendio el animal: "+animal.getNombre());
                return;
            }
        }
        System.out.println("no se encontro un animal con ese nombre");
    }

    public void alimentarAnimal(String nombre){
        for(Animal animal:animales){
            if(animal.getNombre().equals(nombre)){
                animal.alimentar(animal.getNombre());
                return;
            }
        }
        System.out.println("no se encontro el animal");
    }

    public void listarAnimales(){
        System.out.println("animales de la tienda");
        for(Animal animal:animales){
            System.out.println("nombre: "+animal.getNombre());
            System.out.println("tipo animal: "+animal.getTipoAnimal());
        }
    }
}
