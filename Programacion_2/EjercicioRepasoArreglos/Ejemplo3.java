package EjercicioRepasoArreglos;

import java.util.ArrayList;
import java.util.List;

public class Ejemplo3 {
    public static void main(String[] args) {
        List<Integer> primos=new ArrayList<>();

        int contPrimos=0;

        for(int i=100;i<300;i++){
            if(esPrimo(i)){
                primos.add(i);
                contPrimos++;
            }
            if(contPrimos==10){
                break;
            }

        }
        System.out.println("los primeros 10 numeros primos son: "+primos);

    }
    public static boolean esPrimo(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
