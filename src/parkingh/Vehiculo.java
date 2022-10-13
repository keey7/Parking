/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parkingh;

/**
 *
 * @author Lizeth
 */

import java.time.LocalDateTime;
import java.time.Month;
import java.util.Objects;

 public abstract class Vehiculo {
    private String matricula;
    private LocalDateTime fechaEntrada;
    private boolean abono;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public LocalDateTime getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDateTime fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public boolean isAbono() {
        return abono;
    }

    public void setAbono(boolean abono) {
        this.abono = abono;
    }
    public Vehiculo(String matricula, LocalDateTime fechaEntrada, boolean abono) {
        this.matricula = matricula;
        this.fechaEntrada = fechaEntrada;
        this.abono = abono;
    }

    //Segundo constructor yo le escribo y llamo la fecha 
    public Vehiculo(String matricula, boolean abono) {
        this.matricula = matricula;
        this.abono = abono;
        this.fechaEntrada = LocalDateTime.of(2022, Month.SEPTEMBER, 20, 9, 0, 0);
        
    }

    public Vehiculo() {
    }

    @Override
    public String toString() {
        return " (Vehiculo)" + " Matricula " + matricula + ", Fecha de entrada: " + fechaEntrada + ", ¿Tiene abono? " + abono;
    }
    
    public abstract double calcularImporte();

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.matricula);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehiculo other = (Vehiculo) obj;
        return Objects.equals(this.matricula, other.matricula);
    }
    
    
    
    
}
