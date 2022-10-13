/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingh;

import java.util.ArrayList;

/**
 *
 * @author Lizeth
 */
public class Parking {
    private static ArrayList<Vehiculo> vehiculos= new ArrayList<Vehiculo>();
    private final static int cantidad=20;//que no cambie la cantidad. Es constante
    private static int numero=0;
//No se pone ni GETTER, SETTER ni CONSTRUCTOR porque es solo para leer dato 
    
    //CONTIENE TODOS LOS VEICULOS Q ESTAN EN EL ARRAYLIST DE ESTA CLASE:
    public static ArrayList<Vehiculo> losVehiculos(){//SELF METHOD -----BUT NOT NECESARRY!!!!
        return vehiculos;
        //Visualiza los vehiculos en format SOUT(xx) osea todo hacia la der infitnio
        //Pero en esta clase lo utilizamos para SACAR VEHICULO x OBJETO, x eso saber si un v enviado por paramentro
        //esta en el arraylist vehiculos, osea solo para leer o saber internamente
    }
    
    public static ArrayList<String> seeMatriculas(){//CREA UN ARRAYLIST SOLO DE LAS MATRICULAS QUE HAY
        ArrayList<String> matriculas = new ArrayList<>();
        for(Vehiculo v: vehiculos){
            matriculas.add(v.getMatricula());
        }
        return matriculas;
    }
    
    public static String introducirVehiculo(Vehiculo v){
        if(vehiculos.contains(v)){
            return "El vehiculo ya se encuentra en el aparcamiento";
        }else if(numero==cantidad){
            return "El aparcamiento esta completo";
        }else{
            numero++;
            vehiculos.add(v);
            return "Vehiculo aparcado: \t"+v.toString();
        }
    }
    public static String sacarVehiculo(Vehiculo v){
        if(! Parking.losVehiculos().contains(v)){
            return "(v) El vehiculo no se encuentra en el aparcamiento.";
        }else{
            double precio = v.calcularImporte();
            numero--;
            vehiculos.remove(v);
            return"'Veviculo' con matricula "+v.getMatricula()+
                    " retirado con precio: $"+v.calcularImporte();//precio
        }
    }
    public static String sacarVehiculo(String matricula){
        boolean dentro=false;
        Vehiculo vNew=null;
        for(Vehiculo i: vehiculos){
            if(i.getMatricula().equals(matricula)){
                vNew=i;
                dentro=true;
            }
        }
        if(!dentro){
            return "(m) El vehiculo no se encuentra en el aparcamiento.";
        }else{
            double precio=vNew.calcularImporte();
            numero--;
            vehiculos.remove(vNew);
            return "Vehiculo con 'matricula' "+vNew.getMatricula()+
                    " retirado con precio $"+precio;
        }
    }
}
