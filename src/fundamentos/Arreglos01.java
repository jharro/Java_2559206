package fundamentos;

import java.util.ArrayList;
import java.util.Scanner;

public class Arreglos01 {

    public static void main(String[] args) {
        ArrayList<String> aprendices = new ArrayList<>();
        Scanner sc= new Scanner(System.in);

        String nombre;
        System.out.println(aprendices.size());
        aprendices.add("Carlos Alberto Pérez Posada");
        System.out.println(aprendices.size());
        System.out.println("Ingrese otro nombre: ");
        nombre=sc.nextLine();

        aprendices.add(nombre);
        System.out.println(aprendices.size());
        System.out.println("La lista se compone de: "+aprendices);
        System.out.println(aprendices.get(1));
        System.out.println("Vamos a modificar...");
        aprendices.set(0,"María José");
        aprendices.add("Luis Carlos Acevedo");
        System.out.println(aprendices);
        System.out.println("Mostrar la lista dentro de un bucle");
        for (int i = 0; i < aprendices.size() ; i++) {
            System.out.println(aprendices.get(i));
        }
        aprendices.remove(1);
        System.out.println("La lista luego de eliminar un valor...");
        for (int i = 0; i < aprendices.size() ; i++) {
            System.out.println(aprendices.get(i));
        }
    }

}
