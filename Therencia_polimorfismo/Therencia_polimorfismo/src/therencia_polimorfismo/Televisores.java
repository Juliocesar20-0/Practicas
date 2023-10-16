
package therencia_polimorfismo;


public class Televisores extends TProductos{
    private final String calidad;

    public Televisores(String marca, String color, double precio, String calidad) {
        super(marca, color, precio);
        this.calidad = calidad;
    }
    
    @Override
    public void mostrardatos(){
        System.out.println("\nDATOS DEL TELEVISOR");
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);  
        System.out.println( "Precio: " + precio);
        System.out.println("Calidad: " + calidad);
    
    };

    @Override
    public double getPrecio() {
        return super.getPrecio(); 
    }


    @Override
    public String getColor() {
        return super.getColor(); 
    }

    @Override
    public String getMarca() {
        return super.getMarca(); 
    }
        
    @Override
    public void Funcion(){
        System.out.println("Este Televisor de marca "+ marca+  " Es 100% de buena calidad");
    
    }
    
    
    
}


