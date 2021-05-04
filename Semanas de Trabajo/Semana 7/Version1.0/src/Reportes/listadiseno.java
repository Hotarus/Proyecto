/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;


public class listadiseno {
    private String ID,dimenciones,bateria,procesador,pinCarga,SO,detalles;
    private String pinAudifonos,camaraFrontal,camaraPosterior,giroscopio,acelerometro;

    public listadiseno(String pinAudifonos, String camaraFrontal, String camaraPosterior, String giroscopio, String acelerometro) {
        this.pinAudifonos = pinAudifonos;
        this.camaraFrontal = camaraFrontal;
        this.camaraPosterior = camaraPosterior;
        this.giroscopio = giroscopio;
        this.acelerometro = acelerometro;
    }

    public String getPinAudifonos() {
        return pinAudifonos;
    }

    public void setPinAudifonos(String pinAudifonos) {
        this.pinAudifonos = pinAudifonos;
    }

    public String getCamaraFrontal() {
        return camaraFrontal;
    }

    public void setCamaraFrontal(String camaraFrontal) {
        this.camaraFrontal = camaraFrontal;
    }

    public String getCamaraPosterior() {
        return camaraPosterior;
    }

    public void setCamaraPosterior(String camaraPosterior) {
        this.camaraPosterior = camaraPosterior;
    }

    public String getGiroscopio() {
        return giroscopio;
    }

    public void setGiroscopio(String giroscopio) {
        this.giroscopio = giroscopio;
    }

    public String getAcelerometro() {
        return acelerometro;
    }

    public void setAcelerometro(String acelerometro) {
        this.acelerometro = acelerometro;
    }

    public listadiseno(String ID, String dimenciones, String bateria, String procesador, String pinCarga, String SO, String detalles) {
        this.ID = ID;
        this.dimenciones = dimenciones;
        this.bateria = bateria;
        this.procesador = procesador;
        this.pinCarga = pinCarga;
        this.SO = SO;
        this.detalles = detalles;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getDimenciones() {
        return dimenciones;
    }

    public void setDimenciones(String dimenciones) {
        this.dimenciones = dimenciones;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String pricesador) {
        this.procesador = pricesador;
    }

    public String getPinCarga() {
        return pinCarga;
    }

    public void setPinCarga(String pinCarga) {
        this.pinCarga = pinCarga;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }
    
    
}
