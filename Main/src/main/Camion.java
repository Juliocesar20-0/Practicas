
package main;

/**
 *
 * @author Chino
 */
public class Camion extends Vehículo{
  public Camion(String marca, String modelo, int año, String color, int Cilindraje) {
        super(marca, modelo, año, color, Cilindraje);
    }

    public void cargar() {
        System.out.println("El camión está cargado");
    }  
}
