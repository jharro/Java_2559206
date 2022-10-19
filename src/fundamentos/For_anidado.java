package fundamentos;

import java.util.Scanner;

public class For_anidado {
    public static void main(String[] args) {

        //Bucle externo que se repita 3 veces --> 1 2 3
        //Bucle interno que se repita 5 veces --> 1 2 3 4 5
        // 1 2 3 4 5 1 2 3 4 5
        Scanner sc=new Scanner(System.in);
        int cantidad;
        for (int contadorExterno=1; contadorExterno<=2;contadorExterno++){
            System.out.println("# de Factura: "+contadorExterno);
            for (int contadorInterno=1; contadorInterno<=3;contadorInterno++){
                System.out.println("Producto #: "+contadorInterno);
                System.out.print("Cantidad de productos ");
                cantidad=sc.nextInt();
            }
        }
    }
}
