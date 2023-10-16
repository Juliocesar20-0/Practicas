
package cancha.herencia;
/**
 *
 * @author Chino
 */
public class CanchaFutbol extends Cancha {
    public CanchaFutbol(double largo, double ancho) {
        super(largo, ancho);
    }

    @Override
    public double calcularArea() {
        return largo * ancho;
    }

    public boolean canchaFutbolesDeFormaRectangular() {
        return true;
    }

}


