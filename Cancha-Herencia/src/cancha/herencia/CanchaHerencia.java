
package cancha.herencia;
/**
 *
 * @author Chino
 */
public class CanchaHerencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Cancha canchaFutbol = new CanchaFutbol(100, 50);
        Cancha canchaTenis = new CanchaTenis(20, 15);

        System.out.println("El área de la cancha de fútbol es: " + canchaFutbol.calcularArea());
        System.out.println("El área de la cancha de tenis es: " + canchaTenis.calcularArea());

        System.out.println("La cancha de fútbol es rectangular: " + canchaFutbol.esDeFormaRectangular());
        System.out.println("La cancha de tenis es circular: " + canchaTenis.esDeFormaCircular());
    }    
    
}
