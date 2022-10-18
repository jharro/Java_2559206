package fundamentos;

import java.util.Scanner;

public class Ciclos01 {
    public static void main(String[] args) {

        //bucle for
        System.out.println("Bucle for");
        for (int contador=1 ; contador<=10 ; contador++){

            System.out.println("El contador vale: "+contador);
        }
        int miContador=1;
        System.out.println("\nBucle while");
        while (miContador<=10){
            System.out.println("El contador del while vale "+miContador);
            miContador++;
        }

        System.out.println("\nBucle do while");

    // not --- !
        Scanner sc=new Scanner(System.in);
        String nombreLenguajes;
        int contador=0;
        do{
            System.out.println("Ingrese el nombre de un lenguaje de programación [Para salir ingrese Java]");
            nombreLenguajes=sc.nextLine();

            if (!(nombreLenguajes.equals("Java"))){
                contador++;
            }
        } while (!(nombreLenguajes.equals("Java")));
        System.out.println(contador);


    }

}
