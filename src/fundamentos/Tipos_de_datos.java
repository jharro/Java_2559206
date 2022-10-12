package fundamentos;

import javax.swing.*;
import java.util.Scanner;

public class Tipos_de_datos {
    public static void main(String[] args) {
       /* byte edad;
       String nombreCompleto;
       float salario;
       Scanner solicitar = new Scanner(System.in);

        System.out.print("Ingrese su edad: ");
        edad=solicitar.nextByte();
        System.out.print("Ingrese su nombre: ");
        nombreCompleto = solicitar.nextLine();
        System.out.print("Ingrese su salario: ");
        salario=solicitar.nextFloat();
         System.out.println(nombreCompleto+" tiene "+edad+" años y se gana "+
                salario+" pesos mensuales"); */

        String nombre;

        nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        JOptionPane.showInternalMessageDialog (null,nombre);



    }
}
