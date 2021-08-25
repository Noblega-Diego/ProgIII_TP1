
package EjercicioIV;

/**
 *
 * @author diego
 */
public class Habitacion {
    
    private long id;
    private String nombre;
    private long metrosCuadrados;

    private Vivienda vivienada;

    public Habitacion(long id, String nombre, long metrosCuadrados, Vivienda vivienada) {
        this.id = id;
        this.nombre = nombre;
        this.metrosCuadrados = metrosCuadrados;
        this.vivienada = vivienada;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(long metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public long getId() {
        return id;
    }

    public Vivienda getVivienada() {
        return vivienada;
    }
    
    
    
}
