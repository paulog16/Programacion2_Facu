package EjercicioRepasoArreglos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejemplo5 {
    public static void main(String[] args) {
        List<Integer> numbers= new ArrayList<>();
        Scanner leer= new Scanner(System.in);
        int nm=0;
        for(int i=0;i<10;i++){
            int n= leer.nextInt();
            numbers.add(n);
        }
        for (int i=0; i<numbers.size();i++){
            if(numbers.get(i)>nm){
                nm=numbers.get(i);
            }
        }
        int cont=0;
        for(int i=0;i<numbers.size();i++){
            if(numbers.get(i)==nm){
                cont++;
            }
        }
        System.out.println(" el numero mas grande es: "+nm);
        System.out.println("el numero mas grande se repite: "+cont+" veces");
    }
}
