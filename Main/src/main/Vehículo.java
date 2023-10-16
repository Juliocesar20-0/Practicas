
package main;
/**
 *
 * @author Chino
 */
public abstract class Vehículo {
    private final String marca;
    private final String modelo;
    private final int año;
    private final String color;
    private int Cilindraje;
    public Vehículo(String marca, String modelo, int año, String color, int Cilindraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.Cilindraje = Cilindraje;
    }
    public void acelerar() {
        Cilindraje++;
    }

    public void frenar() {
        Cilindraje--;
    }

    public void mostrarInformación() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + año);
        System.out.println("Color: " + color);
        System.out.println("Cilindraje: " + Cilindraje);
    }

}





