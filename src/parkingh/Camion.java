package parkingh;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Camion extends Vehiculo{
    private int ejes;

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public Camion(int ejes, String matricula, LocalDateTime fechaEntrada, boolean abono) {
        super(matricula, fechaEntrada, abono);
        this.ejes = ejes;
    }

    @Override
    public String toString() {
        return "(Camion)" + " Ejes " + ejes + super.toString();
    }

    public double calcularImporte(){
         LocalDateTime fechaDeSalida = LocalDateTime.now();
         long minutos = ChronoUnit.MINUTES.between(this.getFechaEntrada(), fechaDeSalida);
         //System.out.println(minutos);
         double total, tasa=0;
         if(ejes<=3){
             tasa = 4.5;
         }else{
             tasa = 6.5;
         }
         total = minutos * tasa /60;
         //System.out.println(total+"*6.5, /60");
         if(this.isAbono()){
             total -= (total*0.4);
         }
         
         return total;
    }
  
}