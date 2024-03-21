package Ejercicio2_21_03_2024;

import Ejercicio1.classes.Service;
import Ejercicio2_21_03_2024.classes.Leon;
import Ejercicio2_21_03_2024.classes.Servicio;

public class main {
    public static void main(String[] args) {

        Servicio s1=new Servicio();

        int opcion = 1;

        switch (opcion) {

            case 1:
                System.out.println("Seleccionaste crear un leon");
                s1.llenarLion();
                s1.mostrarLeon();
                break;

            default:
                System.out.println("Opción no válida");
        }

    }
}
