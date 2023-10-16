
package therencia_polimorfismo;


public class TProductos {
    protected String marca;
    protected String color;
    protected double precio;

    public TProductos(String marca, String color, double precio) {
        this.marca = marca;
        this.color = color;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }
        
    public void mostrardatos(){
        System.out.println("Marca"+marca);
        System.out.println("Color"+color);  
        System.out.println( "Precio"+precio);  
    }
    
    public void Funcion() {
        
    }
    
}

    

