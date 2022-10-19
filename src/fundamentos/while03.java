package fundamentos;

import java.util.Scanner;

public class while03 {
    public static void main(String[] args) {
        char seguir='S';
        Scanner sc=new Scanner(System.in);
        String nombre;
        float salario;
        int contador=0;
        while(seguir == 'S'){

            System.out.print("Salario: ");
            salario=sc.nextFloat();
            sc.nextLine();
            System.out.print("Nombre: ");
            nombre=sc.nextLine();
            contador++;
            System.out.print("¿Desea continuar? S o N ");
            seguir=sc.next().charAt(0);

        }
        System.out.println("Se ingresaron "+contador+" datos");
    }
}
