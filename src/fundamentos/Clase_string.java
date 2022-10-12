package fundamentos;

import java.util.Scanner;

public class Clase_string {
    public static void main(String[] args) {
        String nombre_uno;
        String nombre_dos=" Hola";
        char letra;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre_uno=sc.nextLine().toUpperCase();
        System.out.println("Usted se llama: " + nombre_uno);
        System.out.print("Diga una letra [a-u]: ");
        //aeiou
        letra=sc.next().charAt(0);
        System.out.println("La letra es: "+letra);
        System.out.println(nombre_uno.concat(" "+nombre_dos));

    }
}
