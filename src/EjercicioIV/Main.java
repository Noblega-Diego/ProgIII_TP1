
package EjercicioIV;

/**
 *
 * @author diego
 */
public class Main {
    public static void main(String[] args){
        
        Barrio barrio = new Barrio(123, "manzanar", "Santiago S.A");
        
        Vivienda vivindaI = new Vivienda(12, "Manuela Saenz", 1234, 100.0, barrio);
          vivindaI.addHabitacion(new Habitacion(0, "Sala Principal", 12, vivindaI));
          vivindaI.addHabitacion(new Habitacion(1, "Cocina", 3, vivindaI));
        
        Vivienda vivindaII = new Vivienda(12, "Maradona", 1324, 100.0, barrio);
          vivindaII.addHabitacion(new Habitacion(0,"Sala Principal", 10, vivindaII));
          vivindaII.addHabitacion(new Habitacion(1,"Habitacion", 8, vivindaII));
          vivindaII.addHabitacion(new Habitacion(2,"Habitacion", 5, vivindaII));
          
        // vivindaII.addHabitacion(new Habitacion(2,"Habitacion PLUS", 100, vivindaII));
        
        barrio.addVivienda(vivindaI);
        barrio.addVivienda(vivindaII);
        
        System.out.println("terreno del barrio ("+barrio.getNombre()+"):" + barrio.getSuperficeTotalTerreno());
        try{
            System.out.println(" terreno ocupado:" + barrio.getSuperficieTotalCubierta());
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
