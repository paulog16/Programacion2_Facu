package EjercicioRepasoArreglos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejemplo4 {
    public static void main(String[] args) {
        List<Integer> numbres= new ArrayList<>();
        List<Integer> posiciones= new ArrayList<>();
        Scanner leer = new Scanner(System.in);

        for(int i=0;i<10;i++){
            int n= leer.nextInt();
            numbres.add(n);
        }
        for(int i=0; i<numbres.size();i++){
            if(numbres.get(i)%10==4){
                posiciones.add(i);
            }
        }

        System.out.println("las posiciones donde el numero es 4 es: "+ posiciones);
    }
}
