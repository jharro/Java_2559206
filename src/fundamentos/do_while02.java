package fundamentos;

import java.util.Scanner;

public class do_while02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opcion;
        do{
            System.out.println("MENÚ DE OPCIONES\n");
            System.out.println("1. OPCION UNO");
            System.out.println("2. OPCIÓN DOS");
            System.out.println("3. OPCIÓN TRES");
            System.out.println("0. FINALIZAR");
            System.out.println("Seleccione una opción - 0 para finalizar");
            opcion=sc.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Seleccionó la 1");
                    break;
                case 2:
                    System.out.println("Selecionó la 2");
                    break;
                case 3:
                    System.out.println("Seleccionó la 3");
                    break;
                case 0:
                    System.out.println("Chao...");
                    System.exit(0);
                default:
                    System.out.println("Estás mal...");

            }

        } while (opcion!=0);
    }
}
