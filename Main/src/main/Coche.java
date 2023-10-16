
package main;

/**
 *
 * @author Chino
 */
public class Coche extends Vehículo {

    public Coche(String marca, String modelo, int año, String color, int Cilindraje) {
        super(marca, modelo, año, color, Cilindraje);
    }

    public void tumbarse() {
        System.out.println("El coche se ha tumbado");
    }

}
