
package EjercicioB;

import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private long cuit;
    private String domicilio;
    private String email;
    private RegimenHorario regimenHorario;
    private Tardanza tardanzaEmpleado;
    private Asistencia asistenciaEmpleado;
    private List<Asistencia>asistencia = new ArrayList<>();
    private List<Tardanza>tardanza = new ArrayList<>();
    
    public List<Asistencia>getAsistenciaXMesXAnio(int mes, int anio){
        List<Asistencia>asist = new ArrayList<>();
            for(Asistencia asi: asistencia){
                if(asi.getFecha().getMonth()+1==mes && asi.getFecha().getYear()+1900==anio){
                    asist.add(asi);
                }    
            }
        return asist;
    }
    
     public List<Tardanza> getDiasConTardanza(int mes, int anio){
         List<Tardanza>diasTarde = new ArrayList<>();
            for(Asistencia asi: asistencia){
                if(asi.getHora()!=regimenHorario.getHoraIngreso() || Math.abs(asi.getMinuto()-regimenHorario.getMinutoIngreso())>15){
                    Tardanza tard = new Tardanza();
                    tard.setFecha(asi.getFecha());
                    tard.setHora(asi.getHora());
                    tard.setId(asi.getId());
                    tard.setMinuto(asi.getMinuto());
                    tard.setTipo(asi.getTipo());
                    diasTarde.add(tard);
                }
            }
         return diasTarde;
     }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getCuit() {
        return cuit;
    }

    public void setCuit(long cuit) {
        this.cuit = cuit;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RegimenHorario getRegimenHorario() {
        return regimenHorario;
    }

    public void setRegimenHorario(RegimenHorario regimenHorario) {
        this.regimenHorario = regimenHorario;
    }

    public Tardanza getTardanzaEmpleado() {
        return tardanzaEmpleado;
    }

    public void setTardanzaEmpleado(Tardanza tardanzaEmpleado) {
        this.tardanzaEmpleado = tardanzaEmpleado;
    }

    public Asistencia getAsistenciaEmpleado() {
        return asistenciaEmpleado;
    }

    public void setAsistenciaEmpleado(Asistencia asistenciaEmpleado) {
        this.asistenciaEmpleado = asistenciaEmpleado;
    }

    public List<Asistencia> getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(List<Asistencia> asistencia) {
        this.asistencia = asistencia;
    }

    public List<Tardanza> getTardanza() {
        return tardanza;
    }

    public void setTardanza(List<Tardanza> tardanza) {
        this.tardanza = tardanza;
    }
    
    
}
