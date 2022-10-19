package fundamentos;

import java.util.Scanner;

public class Ciclos_while_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero;
        System.out.print("Diga un número [Negativo para terminar] ");
        numero=sc.nextInt(); // 10
        while (numero>=0){
            System.out.print("Diga un número [Negativo para terminar] ");
            numero=sc.nextInt(); // 2 - 100 - -9
        }

    }
}
