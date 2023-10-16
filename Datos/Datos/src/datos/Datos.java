
package datos;

/**
 *
 * @author Chino
 */
public class Datos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Entrada entradaTexto = new EntradaTexto();
        if (entradaTexto.ingresarDatos(String.class)) {
            System.out.println("El dato ingresado es: " + entradaTexto.getDato());
            
        }
        
        Entrada entradaNumero = new EntradaNumero();
        if (entradaNumero.ingresarDatos(int.class)) {
            System.out.println("El numero ingresado es: " + entradaNumero.getDato()); 
        }
        
        Entrada entradaDecimal = new EntradaNumero();
        if (entradaDecimal.ingresarDatos(double.class)) {
            System.out.println("El numero ingresado es: " + entradaDecimal.getDato());
        } else {
        }
        
        
    }
    }
    

