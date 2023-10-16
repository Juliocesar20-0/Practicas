
package cancha.herencia;

/**
 *
 * @author Chino
 */
public abstract  class Cancha {
    double largo;
    double ancho;

    public Cancha(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public abstract double calcularArea();

    String esDeFormaRectangular() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    String esDeFormaCircular() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}

