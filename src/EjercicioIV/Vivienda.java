
package EjercicioIV;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
class Vivienda {
    
    private int id;
    private String calle;
    private int numeroCalle;
    private Double superficie;
    private Barrio barrio;
    private List<Habitacion> habitaciones = new ArrayList<>();

    public Vivienda(int id, String calle, int numeroCalle, Double superficie, Barrio barrio) {
        this.id = id;
        this.calle = calle;
        this.numeroCalle = numeroCalle;
        this.superficie = superficie;
        this.barrio = barrio;
    }

    public int getId() {
        return id;
    }

    public String getCalle() {
        return calle;
    }

    public int getNumeroCalle() {
        return numeroCalle;
    }

    public Double getSuperficie() {
        return superficie;
    }

    public Barrio getBarrio() {
        return barrio;
    }

    public List<Habitacion> getHabitaciones() {
        return habitaciones;
    }
    
    public void addHabitacion(Habitacion habitacion) {
        this.habitaciones.add(habitacion);
    }
    
    public double getMetrosCuadradosCubiertos() throws Exception{
        double totalMetrosHabitaciones = 0;
        for(Habitacion h: this.habitaciones){
            totalMetrosHabitaciones += h.getMetrosCuadrados();
        }
        if(totalMetrosHabitaciones >= this.superficie)
            throw new Exception("La superficie cubierta no puede ser mayor a la superficie del terreno");
        
        return totalMetrosHabitaciones;
    }
    
}
