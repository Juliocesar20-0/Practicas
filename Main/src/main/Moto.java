/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Chino
 */
public class Moto extends Vehículo {
    public Moto(String marca, String modelo, int año, String color, int Cilindraje) {
        super(marca, modelo, año, color, Cilindraje);
    }
 public void Tamquiada() {
        System.out.println("La Moto esta Tamquiada");
    }

}
