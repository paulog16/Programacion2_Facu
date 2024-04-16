package EjercicioRepasoArreglos;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejemplo1 {
    public static void main(String[] args) {
        ArrayList<Integer>numbers=new ArrayList<>();
        Scanner leer = new Scanner(System.in);
        for(int i=1;i<10;i++){
            int number= leer.nextInt();
            numbers.add(number);
        }
        System.out.println(numbers);

        int max=numbers.get(0);
        for(int i=1;i<numbers.size();i++){
            if(numbers.get(i)>max){
                max= numbers.get(i);
            }
        }
        System.out.println("el numero mas grande es: "+ max);
    }
}
