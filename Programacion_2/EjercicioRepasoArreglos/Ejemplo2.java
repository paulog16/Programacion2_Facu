package EjercicioRepasoArreglos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        List<Integer>numbers=new ArrayList<>();
        Scanner leer= new Scanner(System.in);

        for (int i=1;i<10;i++){
            int n= leer.nextInt();
            numbers.add(n);
        }
        int mayorPrimo=0;
        int posicionMayorPrimo=-1;

        for(int i=1;i<numbers.size();i++){
            if(esPrimo(numbers.get(i)) && numbers.get(i)>mayorPrimo){
                mayorPrimo=numbers.get(i);
                posicionMayorPrimo=i;
            }
        }

        System.out.println("el mayor numero primo es: "+mayorPrimo+" y esta en la posicion: "+posicionMayorPrimo);

    }
    public static boolean esPrimo(int n){
        if(n<=1){
            return false;
        }
        for(int i=2 ; i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
