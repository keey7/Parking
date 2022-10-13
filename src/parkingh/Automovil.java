package parkingh;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Automovil extends Vehiculo{
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Automovil(String tipo, String matricula, LocalDateTime fechaEntrada, boolean abono) {
        super(matricula, fechaEntrada, abono);
        this.tipo = tipo;
    }

    public Automovil(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "(Automovil)" + " Tipo " + tipo + super.toString();
    }
    public double calcularImporte(){
        LocalDateTime fechaSalida=LocalDateTime.now();
        long minutos = ChronoUnit.MINUTES.between(this.getFechaEntrada(), fechaSalida);
        double tasa=0, total;
        //System.out.println(minutos);
        switch(tipo){
            case "Turismo":
                tasa = 1.5;
                break;
            case "Todoterreno":
                tasa = 2.5;
                break;
            case "Furgoneta":
                tasa = 3.5;
                break;
        }
        
        total = minutos * tasa/60;
        //System.out.println(total+"*1.5, /60");
        if(this.isAbono()){
            total -= (total*0.4);
        }
        
        return total;
    }
    
    
}
