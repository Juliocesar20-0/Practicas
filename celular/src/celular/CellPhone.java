
package celular;

/**
 *
 * @author Chino
 */
abstract class CellPhone {
    public abstract void display();
}

class SmartPhone extends CellPhone {
    private final String modelo;
    private final String marca;
    private final int pricio;
    public SmartPhone(String modelo, String marca, int pricio) {
        this.modelo = modelo;
        this.marca = marca;
        this.pricio = pricio;
    }
    
    @Override
    public void display() {
       System.out.println("SmartPhone: " + modelo + ", " + marca + ", " + pricio);
    }
}

class BasicPhone extends CellPhone {
    private final String modelo;
    private final String marca;
    private final int pricio;
    public BasicPhone(String modelo, String marca, int pricio) {
        this.modelo = modelo;
        this.marca = marca;
        this.pricio = pricio;
    }
    
    @Override
    public void display() {
        System.out.println("BasicPhone: " + modelo + ", " + marca + ", " + pricio);
    }
}
    class Phone extends CellPhone {
    private final String modelo;
    private final String marca;
    private final int pricio;
    public Phone(String modelo, String marca, int pricio) {
        this.modelo = modelo;
        this.marca = marca;
        this.pricio = pricio;
    }
    
    @Override
    public void display() {
        System.out.println("Phone: " + modelo + ", " + marca + ", " + pricio);
    }
    }


