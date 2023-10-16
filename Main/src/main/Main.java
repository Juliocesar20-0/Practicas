
package main;
/**
 *
 * @author Chino
 */
public class Main {

 
    public static void main(String[] args) {
       
        Vehículo vehículo = new Coche("Toyota", "Hilux", 2020, "GRIS", 2800);
        vehículo.acelerar();
        vehículo.mostrarInformación();

        Vehículo vehículo2 = new Moto("Yamaha", "Dt", 1967, "Morado", 125);
        vehículo.acelerar();
        vehículo.mostrarInformación();

        
   
        Vehículo vehículo3 = new Camion("Ford", "Raptor", 2023, "Negro-Mate", 3-8);
        vehículo2.frenar();
        vehículo2.mostrarInformación();
    }
    }
    

