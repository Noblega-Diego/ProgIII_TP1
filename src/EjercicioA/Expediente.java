
package EjercicioA;

import java.util.ArrayList;
import java.util.List;

public class Expediente {
    private int id;
    private String letra;
    private int numero;
    private String descripcion;
    private String tipo;
    private String ambito;
    private List <Control> control= new ArrayList<>();
    private Expediente expedientePadre;
    private List <Expediente> expedienteHijo;
    
    public Expediente(int id, String letra, int numero, String descripcion, String tipo, String ambito) {
        this.id = id;
        this.letra = letra;
        this.numero = numero;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.ambito = ambito;
        
    }
    
    public String getCaratulaExpediente(){
    return (String.valueOf(numero)+" - "+letra+" - "+descripcion);
    }
    
    public String getControlesObligatorios(){
        String lista="";
        for(Control c: this.control){
            if(c.getEsObligatorio()==true){
                lista += (c.getDenominacion()+",");   
            }
        }
        return lista;
    }
    
    public Boolean getEstadoControles(){
        Boolean estado=false;
        for(Control c: this.control){
            if(c.getEstado().getAprobado()==false){
                break;
            }else
                estado=true;
        }
        return estado;
    }
    
    public List<Expediente> listaExpediente(){
        List<Expediente> listaRecursiva = new ArrayList<>();
            listaExpedienteRecursion(this, listaRecursiva);
            return listaRecursiva;
    }
    
    public void listaExpedienteRecursion(Expediente ex, List<Expediente> lista){
        lista.add(ex);
        if(ex.getExpedienteHijo()!= null){
            for(Expediente expHijo: ex.getExpedienteHijo()){
                listaExpedienteRecursion(expHijo, lista);
            }
        }
    }
    
    public Expediente getExpedientePadre() {
        return expedientePadre;
    }

    public void setExpedientePadre(Expediente expedientePadre) {
        this.expedientePadre = expedientePadre;
    }

    public List<Expediente> getExpedienteHijo() {
        return expedienteHijo;
    }

    public void setExpedienteHijo(List<Expediente> expedienteHijo) {
        this.expedienteHijo = expedienteHijo;
    }
    
    public List<Control> getControl() {
        return control;
    }

    public void setControl(List<Control> control) {
        this.control = control;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getAmbito() {
        return ambito;
    }

    public void setAmbito(String ambito) {
        this.ambito = ambito;
    }
    
}
