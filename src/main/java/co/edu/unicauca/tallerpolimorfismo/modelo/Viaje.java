/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unicauca.tallerpolimorfismo.modelo;

import java.util.Date;

/**
 *
 * @author Home
 */
public abstract class Viaje {
 protected String origen;
 protected String destino;
 protected int costo;
 protected Date fechaSalida;
 protected Date fechaLlegada;
 // Constructores, getters y setters
 public Viaje( String origen,  String destino, int costo,  Date fechaSalida,  Date fechaLlegada)
 {
     
 }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public int getCosto() {
        return costo;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
 
 
 public abstract String descripcion();
 public String cualquierMetodo() {
 return "Cualquier método implementado en la clase base";
 }
 public String cualquierMetodo2() {
 return "Cualquier método2 implementado en la clase base";
 }
}

