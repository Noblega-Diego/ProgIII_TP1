
package EjercicioA;

public class EstadoControl {
    private long id;
    private Boolean aprobado;

    public EstadoControl() {
    }

    public EstadoControl(long id, Boolean aprobado) {
        this.id = id;
        this.aprobado = aprobado;
    }
    
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boolean getAprobado() {
        return aprobado;
    }

    public void setAprobado(Boolean aprobado) {
        this.aprobado = aprobado;
    }
    
}
