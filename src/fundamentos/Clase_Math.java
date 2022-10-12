package fundamentos;

import java.util.Scanner;

public class Clase_Math {
    public static void main(String[] args) {
       /* int valor_uno = 10550;
        int valor_dos=450;
        double raiz=Math.sqrt(25);
        double potencia=Math.pow(2,5);
        System.out.println(Math.round(45.48));
        System.out.println(Math.ceil(45.38));

        int mayor=Math.max(valor_dos,valor_uno);
        System.out.println("El mayor valor es: "+mayor);
        System.out.println("La raíz cuadrada de 25 es "+raiz);
        System.out.println("Potencia de 2 a la 5 es "+potencia);*/

        //Hallar valor futuro de una inversión
        // Cantidad actual: 250000
        // Interés: 0.2
        // Tiempo: 10
        // Resultado: 1547930
        // resultado = c*((i+1)m)
        int cantidad;
        float interes;
        double resultado;
        int tiempo;
        Scanner sc=new Scanner(System.in);
        System.out.print("Cantidad actual: ");
        cantidad=sc.nextInt();
        System.out.print("Interés: ");
        interes=sc.nextFloat();
        System.out.print("Tiempo: ");
        tiempo=sc.nextInt();
        resultado=cantidad*((Math.pow(interes+1,tiempo)));
        System.out.println("Resultado: "+resultado);

    }
}
