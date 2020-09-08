package model;

import java.util.ArrayList;
import java.util.List;

public class PagoRequest {
    public String nroSumin;
    public String numFactura;
    public String fechaPago;
    public String horaPago;
    public String codCanal;
    public String traceConsulta;
    public String tracePago;
    public String codEmpresa;
    public String codServicio;
    public String codAgencia;
    public String terminal;
    public double montoDeudaConvertido;
    public double comisionConvertido;
    public double montoTotalConvertido;
    public double montoTotalConceptoConv;
    public List<conceptosAdicionalesRequest> conceptosAdicionales;

    public PagoRequest() {
    }

    public List<conceptosAdicionalesRequest> getConceptosAdicionales() {
        return conceptosAdicionales;
    }

    public void setConceptosAdicionales(List<conceptosAdicionalesRequest> conceptosAdicionales) {
        this.conceptosAdicionales = conceptosAdicionales;
    }
}

class conceptosAdicionalesRequest {
    public String nombreConcepto;
    public double montoConcepto = 0;
    public double montoConceptoConvertido = 0;

    public conceptosAdicionalesRequest() {
    }

    public conceptosAdicionalesRequest(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
    }

    public String getNombreConcepto() {
        return nombreConcepto;
    }

    public void setNombreConcepto(String nombreConcepto) {
        this.nombreConcepto = nombreConcepto;
    }

    public double getMontoConcepto() {
        return montoConcepto;
    }

    public void setMontoConcepto(double montoConcepto) {
        this.montoConcepto = montoConcepto;
    }

    public double getMontoConceptoConvertido() {
        return montoConceptoConvertido;
    }

    public void setMontoConceptoConvertido(double montoConceptoConvertido) {
        this.montoConceptoConvertido = montoConceptoConvertido;
    }
}