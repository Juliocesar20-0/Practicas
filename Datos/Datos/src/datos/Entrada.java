
package datos;

/**
 *
 * @author Chino
 */
public abstract  class Entrada {
    protected String dato;

    public Entrada() {
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public abstract boolean ingresarDatos(Class<?> tipoDato);
        
    
}
