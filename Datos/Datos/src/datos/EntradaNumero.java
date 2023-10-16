
package datos;

import java.util.Scanner;

/**
 *
 * @author Chino
 */
public class EntradaNumero extends Entrada {
    public EntradaNumero() {
    }

    @Override
    public boolean ingresarDatos(Class<?> tipoDato) {
        Scanner scan = new Scanner(System.in);
        
        if (tipoDato == int.class) {
            System.out.println("Ingrese un número entero: ");
            try {
                this.dato = String.valueOf(scan.nextInt());
                return true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("El dato ingresado no es un número entero válido.");
                return false;
            }
        } else if (tipoDato == double.class) {
            System.out.println("Ingrese un número decimal: ");
            try {
                this.dato = String.valueOf(scan.nextDouble());
                return true;
            } catch (java.util.InputMismatchException e) {
                System.out.println("El dato ingresado no es un número decimal válido.");
                return false;
            }
        } else {
            System.out.println("El tipo de dato no es válido.");
            return false;
        }
    }
}
