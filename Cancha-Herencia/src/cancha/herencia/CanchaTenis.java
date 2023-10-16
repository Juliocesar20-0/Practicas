
package cancha.herencia;
/**
 *
 * @author Chino
 */
public class CanchaTenis extends Cancha {
    public CanchaTenis(double largo, double ancho) {
        super(largo, ancho);
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(ancho, 2);
    }

    public boolean canchaFutbolesDeFormaCircular() {
        return true;
    }
}
