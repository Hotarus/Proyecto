/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

/**
 *
 * @author enzun
 */
public class listaverificador {
    private String ID,diseno,cedula,aprobacion;

    public listaverificador(String ID, String diseno, String cedula, String aprobacion) {
        this.ID = ID;
        this.diseno = diseno;
        this.cedula = cedula;
        this.aprobacion = aprobacion;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDiseno() {
        return diseno;
    }

    public void setDiseno(String diseno) {
        this.diseno = diseno;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getAprobacion() {
        return aprobacion;
    }

    public void setAprobacion(String aprobacion) {
        this.aprobacion = aprobacion;
    }
    
    
}
