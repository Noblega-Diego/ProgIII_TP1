
package actividades;

import java.util.Date;

/**
 *
 * @author diego
 */
public class Main {
    
    public static void main(String[] args){
        
        Sector ventas = new Sector(5, "ventas", "2");
        Sector compras = new Sector(1, "compras", "3");
        Sector marketing = new Sector(12, "marketing", "3");
        Sector comercio = new Sector(4, "comercio", "4");
        
        comercio.addSector(compras);
        comercio.addSector(ventas);
        ventas.addSector(marketing);
        
        TipoActividad tipo1 = new TipoActividad(0, "tipo1", 120);
        TipoActividad tipo2 = new TipoActividad(1, "tipo2", 100);
        TipoActividad tipo3 = new TipoActividad(2, "tipo3", 50);
        
        Persona alfred = new Persona("alfred", "DNI", 12632731, 4723844, "", "26154214", ventas);

        Actividad jefe = new Actividad(new Date(), new Date(), "jefe", "lorem ...", tipo3, alfred);
        Actividad actII = new Actividad(new Date(), new Date(), "otra", "lorem ...", tipo2, alfred);
        
        alfred.setSector(ventas);
        alfred.setSector(marketing);
        alfred.addActividad(jefe);
        alfred.addActividad(actII);

        System.out.println("Sectores de la empresa:");
        for(Sector s :comercio.obtenerTotalSubSectores()){
            System.out.println(s.getDenominacion());
            for(Persona persona:s.getPersonal()){
                System.out.println("    |- "+persona.getNombre()+":");
                System.out.println("        * Total Puntos:"+persona.totalPuntosAsignados());
            }
        }
            
        
    }
    
}
