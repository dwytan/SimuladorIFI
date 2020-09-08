package model;

import java.util.ArrayList;
import java.util.List;

public class Pago {
    public String codigo = "00";
    public String mensaje = "Satisfactorio";
    public String nroSumin = "GLOBOKAS001";
    public String nombreCliente = "GROVER VIGIL BENDEZU";
    public double montoDeudaConvertido = 500.00;
    public double comisionConvertido = 5.00;
    public List<conceptosAdicionalesPago> conceptosAdicionales = new ArrayList<>();
    public double montoTotalConceptoConv = 15.00;
    public double montoTotalConvertido = 520.00;
    public String numOperacionEmpresa = "LIMA123456";
    public String glosa = "Hola desde Pago";

    public Pago() {
        conceptosAdicionales.add(new conceptosAdicionalesPago("MORA",1));
        conceptosAdicionales.add(new conceptosAdicionalesPago("GASTOS ADMINISTRATIVOS",2));
        conceptosAdicionales.add(new conceptosAdicionalesPago("ITF",3));
        conceptosAdicionales.add(new conceptosAdicionalesPago("PROPINA",4));
        conceptosAdicionales.add(new conceptosAdicionalesPago("IGV",5));
    }
}

class conceptosAdicionalesPago {
    public String nombreConcepto;
    public double montoConceptoConvertido;

    public conceptosAdicionalesPago(String nombreConcepto, double montoConceptoConvertido) {
        this.nombreConcepto = nombreConcepto;
        this.montoConceptoConvertido = montoConceptoConvertido;
    }
}

