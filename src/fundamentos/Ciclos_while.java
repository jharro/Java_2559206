package fundamentos;

import java.util.Scanner;

public class Ciclos_while {
    public static void main(String[] args) {
        int contador=1;
        Scanner sc=new Scanner(System.in);
        int valor,suma=0;
        float promedio;
        while (contador<=5){
            System.out.print("Ingrese un valor: ");
            valor=sc.nextInt();
            suma+=valor;// suma = suma +valor
           contador++;
        }
        promedio = suma/(contador-1);
        System.out.println("Suma total: "+suma);
        System.out.println("Promedio: "+promedio);
    }
}
