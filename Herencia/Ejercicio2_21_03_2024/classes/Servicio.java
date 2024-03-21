package Ejercicio2_21_03_2024.classes;

import java.util.Scanner;

public class Servicio {
Scanner leer = new Scanner(System.in);
Leon lion= new Leon();
Tigre tiger = new Tigre();
Gato cat= new Gato();


   public void llenarLion(){
       System.out.println("ingrese foto de leon");
       lion.setPhoto(leer.next());
       System.out.println("ingrese comida del leon");
       lion.setFood(leer.next());
       System.out.println("ingrese localizacion del leon");
       lion.setLocation(leer.next());
       System.out.println("ingrese tamaño del leon");
       lion.setSize(leer.next());
   }

   public void mostrarLeon(){
       System.out.println("foto: "+lion.getPhoto());
       System.out.println("comida: "+lion.getPhoto());
       System.out.println("localizacion: "+lion.getPhoto());
       System.out.println("tamaño: "+lion.getPhoto());
       lion.toRoar();
       lion.sleep();
       lion.makeNoise();
       lion.eat();

   }


}
