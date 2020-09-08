package model;

import java.util.ArrayList;
import java.util.List;

public class Consulta {

    public String codigo = "00";
    public String mensaje = "Exitoso";
    public String nombreCliente = "GROVER VIGIL BENDEZU";
    public String nroSumin = "GLOBOKAS001";
    public String ordenPrelacion = "Cuota atrasada";
    public List<lsdebt> lstdebt = new ArrayList<>();

    public Consulta() {
        lstdebt.add(new lsdebt());
    }
}

class lsdebt {
    public String numFactura = "FACTURA001";
    public int tipoMoneda = 604;
    public double montoTipoCambio = 1.00;
    public double montoDeuda = 500.00;
    public double montoDeudaConvertido = 500.00;
    public double comision = 5.00;
    public double comisionConvertido = 5.00;
    public List<model.conceptosAdicionales> conceptosAdicionales = new ArrayList<>();
    public double montoTotalConcepto = 15.00;
    public double montoTotalConceptoConv = 15.00;
    public double montoTotal = 520.00;
    public double montoTotalConvertido = 520.00;
    public String formaPago = "Parcial";
    public double montoMinimo = 20.00;
    public double montoMinimoConvertido = 20.00;
    public double montoMaximo = 520.00;
    public double montoMaximoConvertido = 520.00;
    public String fechaEmision = "20200110";
    public String fechaVencimiento = "20200210";
    public String tipoIntegracion = "Online";
    public String glosa = "Hola desde Consulta";
    public String orden = "1";

    public lsdebt() {
        conceptosAdicionales.add(new conceptosAdicionales("MORA",1,1));
        conceptosAdicionales.add(new conceptosAdicionales("GASTOS ADMINISTRATIVOS",2,2));
        conceptosAdicionales.add(new conceptosAdicionales("ITF",3,3));
        conceptosAdicionales.add(new conceptosAdicionales("PROPINA",4,4));
        conceptosAdicionales.add(new conceptosAdicionales("IGV",5,5));
    }
}

class conceptosAdicionales {
    public String nombreConcepto;
    public double montoConcepto;
    public double montoConceptoConvertido;

    public conceptosAdicionales(String nombreConcepto, double montoConcepto, double montoConceptoConvertido) {
        this.nombreConcepto = nombreConcepto;
        this.montoConcepto = montoConcepto;
        this.montoConceptoConvertido = montoConceptoConvertido;
    }
}