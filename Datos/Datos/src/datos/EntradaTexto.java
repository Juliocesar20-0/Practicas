
package datos;

import java.util.Scanner;

/**
 *
 * @author Chino
 */
public class EntradaTexto extends Entrada {
    public EntradaTexto() {
    }

    @Override
    public boolean ingresarDatos(Class<?> tipoDato) {
        if (tipoDato == String.class) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Ingrese un dato: ");
            dato = scan.nextLine();
            return true;
        } else {
            System.out.println("El tipo de dato no es válido");
            return false;
        }
        
    }
}
