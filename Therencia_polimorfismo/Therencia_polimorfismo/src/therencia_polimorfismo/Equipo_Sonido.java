
package therencia_polimorfismo;


public class Equipo_Sonido extends TProductos {
    public Equipo_Sonido(String marca, String color, double precio) {
        super(marca, color, precio);
    }
    
    @Override
    public void mostrardatos(){
        System.out.println("\nDATOS DEL EQUIPO DE SONIDO");
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color); 
        System.out.println("Precio" + precio); 
      
}
    @Override
    public void Funcion(){
        System.out.println("Este equipo de sonido "+ marca+  " Es 100% de buena calidad");
    }
    
    
}


    

