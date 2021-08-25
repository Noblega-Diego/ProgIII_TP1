
package EjercicioIV;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Barrio {
    
    private long id;
    private String nombre;
    private String empresaConstructora;

    private List<Vivienda> viviendas = new ArrayList<>(); 
    
    public Barrio(long id, String nombre, String empresaConstructora) {
        this.id = id;
        this.nombre = nombre;
        this.empresaConstructora = empresaConstructora;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmpresaConstructora() {
        return empresaConstructora;
    }
    
    public double getSuperficeTotalTerreno() {
        double totalTerreno = 0;
        
        for(Vivienda v: this.viviendas){
            totalTerreno += v.getSuperficie();
        }
        return totalTerreno;
    }
    
    public double getSuperficieTotalCubierta() throws Exception{
        double totalCubierto = 0;
        for(Vivienda v: this.viviendas){
            totalCubierto += v.getMetrosCuadradosCubiertos();
        }
        return totalCubierto;
    }

    public void addVivienda(Vivienda vivinda) {
        this.viviendas.add(vivinda);
    }
    
}
