
package EjercicioA;

import java.util.ArrayList;
import java.util.List;


public class Control {
    private int id;
    private String denominacion;
    private Boolean esObligatorio;
    private EstadoControl estado;
    private ArrayList<EstadoControl> estadoControl=new ArrayList<>();
    
    public Control() {
    }

    public Control(int id, String denominacion, Boolean esObligatorio) {
        this.id = id;
        this.denominacion = denominacion;
        this.esObligatorio = esObligatorio;
    }

    public EstadoControl getEstado() {
        return estado;
    }

    public void setEstado(EstadoControl estado) {
        this.estado = estado;
    }
    
    public ArrayList<EstadoControl> getEstadoControl() {
        return estadoControl;
    }

    public void setEstadoControl(ArrayList<EstadoControl> estadoControl) {
        this.estadoControl = estadoControl;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public Boolean getEsObligatorio() {
        return esObligatorio;
    }

    public void setEsObligatorio(Boolean esObligatorio) {
        this.esObligatorio = esObligatorio;
    }
    
}
