package Ejercicio1.classes;

import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    Scanner read = new Scanner(System.in);
    Vehicle vehicle = new Vehicle();
    Car car = new Car("red", 4, 120, 200);
    Pickup pickup = new Pickup("white", 4, 140, 300, 200);
    Bicycle bicycle = new Bicycle("black", 2, "urbana");

    Motorcycle motorcycle = new Motorcycle("yellow", 2, "deportiva", 200, 150);

    public void catalog() {

        ArrayList<Vehicle> listVehicle = new ArrayList<>();
        listVehicle.add(car);
        listVehicle.add(pickup);
        listVehicle.add(bicycle);
        listVehicle.add(motorcycle);
        showList(listVehicle);
        System.out.println("-------------");
        catalogWheels(listVehicle);

    }

    public void showList(ArrayList<Vehicle> listaVehicle) {

        for (Vehicle vehicle : listaVehicle) {
            System.out.println("-----------------");
            System.out.println(vehicle);

        }
    }

    public void catalogWheels(ArrayList<Vehicle>list) {
        System.out.println("ingrese un numero de ruedas y le diremos que vehiculo tenemos con esas ruedas");
        int wheels= read.nextInt();
        for(Vehicle vehicle:list){
            if (vehicle.getRuedas()==wheels){
                System.out.println("los vehiculos con esas ruedas son: ");
                System.out.println(vehicle);
            }
        }


    }


}
