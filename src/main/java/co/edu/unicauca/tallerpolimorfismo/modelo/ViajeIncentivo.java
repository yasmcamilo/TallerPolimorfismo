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
public class ViajeIncentivo extends Viaje {
 /**
 * Empresa que patrocina el viaje al empleado
 */
 private String empresa;

    public ViajeIncentivo(String origen, String destino, int costo, Date fechaSalida, Date fechaLlegada, String empresa) {
        super(origen, destino, costo, fechaSalida, fechaLlegada);
        this.empresa=empresa;
    }
 //Constructor, getters and setters

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    
    
 @Override
 public String descripcion() {
 return "Viaje incentivo que te envia la empresa " + empresa;
 }

 public String cualquierMetodo2() {
 return "Método implementado en la clase hija viaje de incentivo";
 }  
}
