package therencia_polimorfismo;

import java.util.ArrayList;


public class Therencia_polimorfismo {

   
    public static void main(String[] args) {
        ArrayList<TProductos> producto = new ArrayList<>();
        
        producto.add(new Televisores("Sony", "Negro", 1000.00, "Buena"));
        producto.add(new Equipo_Sonido("Samsumg", "Azul", 600.00));
        producto.add(new Computadoras("Lenovo", "Roja", 1200.00, "W11"));
        
        for (TProductos pro : producto) {
            pro.mostrardatos();
            pro.Funcion();
        }
        
        
    }
    
}
