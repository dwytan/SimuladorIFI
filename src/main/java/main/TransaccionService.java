package main;

import model.*;
import org.springframework.stereotype.Service;

@Service
public class TransaccionService {

    public Auth getAuth(){ return new Auth(); }

    public Consulta getConsulta(){
        return new Consulta();
    }

    public PagoError getPagoError() { return new PagoError(); }

    public Pago getPago(){ return new Pago(); }

    public Extorno getExtorno(){ return new Extorno(); }
}
