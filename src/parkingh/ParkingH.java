package parkingh;

import java.time.LocalDateTime;
import java.time.Month;

public class ParkingH {

    public static void main(String[] args) {
        System.out.println("DIAZ' PARKING");
        System.out.println("======================");
        
        Automovil a1 = new Automovil("Furgoneta","001", LocalDateTime.of(2022, Month.SEPTEMBER, 20, 9, 0, 0), true);
        System.out.println("El importe calculado de A1 es: "+a1.calcularImporte()+"\n");
        Automovil a2 = new Automovil("Todoterreno","002", LocalDateTime.of(2022, Month.SEPTEMBER, 20, 9, 0, 0), false);
        Automovil a3 = new Automovil("Furgoneta","003", LocalDateTime.of(2022, Month.SEPTEMBER, 20, 9, 0, 0), true);
        Automovil a4 = new Automovil("Furgoneta","004", LocalDateTime.of(2022, Month.SEPTEMBER, 20, 9, 0, 0), false);
        
        
        Camion c1 = new Camion(4,"101", LocalDateTime.of(2022, Month.SEPTEMBER, 20, 9, 0, 0), true);
        Camion c2 = new Camion(2,"102", LocalDateTime.of(2022, Month.SEPTEMBER, 20, 9, 0, 0), true);
         System.out.println("El importe calculado de C1 es: "+c1.calcularImporte()+"\n");
        //METHODOS PARKING
        System.out.println(Parking.introducirVehiculo(a1));
        System.out.println(Parking.introducirVehiculo(a2));
        System.out.println(Parking.introducirVehiculo(a3));
        System.out.println(Parking.introducirVehiculo(c2));
        System.out.println(Parking.introducirVehiculo(c1));
         System.out.println("El importe calculado de A2 es: "+a2.calcularImporte()+"\n");
        System.out.println("\n"+Parking.sacarVehiculo("101"));
        System.out.println("\n"+Parking.sacarVehiculo(a3));
        
        System.out.println("");
        System.out.println("Visualizar array de las matriculas: "+Parking.seeMatriculas());
        
        System.out.println("");
        System.out.println("Introducir mat"+Parking.losVehiculos());//no necessary
    }
    
    
}
