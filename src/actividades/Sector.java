

package actividades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Sector {
    
    private int numero;
    private String denominacion;
    private String tipo;
    private List<Persona> personal = new ArrayList<>();
    
    private List<Sector> subsectores = new ArrayList<>();

    /* Constructores */

    public Sector(int numero, String denominacion, String tipo) {
        this.numero = numero;
        this.denominacion = denominacion;
        this.tipo = tipo;
    }
    
    
    
    /* Metodos de acceso */
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Persona> getPersonal() {
        return personal;
    }

    public void setPersonal(List<Persona> personal) {
        this.personal = personal;
    }

    public List<Sector> getSubsectores() {
        return subsectores;
    }

    public void setSubsectores(List<Sector> subsectores) {
        this.subsectores = subsectores;
    }
    
    public List<Sector> obtenerTotalSubSectores() {
        List<Sector> totalSubsectores = new ArrayList<>();
        totalSubsectores.addAll(subsectores);
        
        for(Sector sector: this.subsectores){
            totalSubsectores.addAll( sector.obtenerTotalSubSectores() );
        }
        return totalSubsectores;
    }

    void addSector(Sector sector) {
        this.subsectores.add(sector);
    }
    
}
