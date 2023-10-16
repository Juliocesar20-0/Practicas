
package therencia_polimorfismo;


public class Computadoras extends TProductos{
    private final String sistema_operativo;

    public Computadoras(String marca, String color, double precio, String sistema_operativo) {
        super(marca, color, precio);
        this.sistema_operativo=sistema_operativo;
    }
    @Override
    public void mostrardatos(){
        System.out.println("\nDATOS DEL COMPUTADOR");
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);  
        System.out.println("Precio: " + precio); 
        System.out.println("Sistema_Operativo: " + sistema_operativo);

}
    
    @Override
   public void  Funcion(){
       System.out.println("Este Computador de marca "+ marca+  " Es 100% de buena calidad");
   }
    
    
    
}

    

