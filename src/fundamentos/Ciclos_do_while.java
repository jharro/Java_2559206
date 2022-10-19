package fundamentos;

import java.util.Scanner;

public class Ciclos_do_while {
    public static void main(String[] args) {
        int contador=1;
        Scanner sc=new Scanner(System.in);
        int valor,suma=0;
        float promedio;

        do {
            System.out.print("Ingrese un valor: ");
            valor=sc.nextInt();
            suma+=valor;
            contador++;
        } while (contador<=5);
        promedio=suma/(contador-1);
        System.out.println("La suma es "+suma);
        System.out.println("Promedio "+promedio);
    }
}
