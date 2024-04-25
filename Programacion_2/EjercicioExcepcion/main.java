package EjercicioExcepcion;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int n1=0;int n2=0;
      String op;
      int opc;




        while(true){


            boolean bo = false;
            do {
                System.out.println("Ingrese dos números:");
                try {
                    n1 = leer.nextInt();
                    n2 = leer.nextInt();
                    bo = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Por favor, ingrese números válidos.");
                    // Limpieza del buffer del scanner para evitar bucles infinitos
                    leer.nextLine();
                }
            } while (!bo);

            System.out.println("desea realizar una operacion? s/n");
            op= leer.next();
            if(op.equals("s")){
                System.out.println("que operacion desea realizar?");
                System.out.println("1-SUMA,2-RESTA,3-MULTIPLICACION,4-DIVISION");
                opc=leer.nextInt();

                switch (opc){
                    case 1:
                        System.out.println("la suma es: "+(n1+n2));
                        break;
                    case 2:
                        System.out.println("la resta es: "+(n1-n2));
                        break;
                    case 3:
                        System.out.println("la multplicacion es: "+(n1*n2));
                        break;
                    case 4:
                        try{
                            System.out.println("la division es: "+(n1/n2));
                            break;
                        }catch (ArithmeticException e){
                            System.out.println("error, no se divide por cero");
                        }
                    default:
                        System.out.println("opcion incorrecta");

                }
            }
            if(op.equals("n")){
                break;
            }
        }

    }

}
