package main;

import model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TransaccionController {

    @Autowired
    private TransaccionService transaccionService;

    @PostMapping("/Auth")
    public Auth generateToken(@RequestBody Usuario usuario) {
        return transaccionService.getAuth();
    }

    @RequestMapping("/ConsultaDeuda")
    public Consulta getConsulta(){
        return transaccionService.getConsulta();
    }

    @PostMapping("/NotificarPago")
    public Object getPago(@RequestBody PagoRequest pagoRequest){
        if (pagoRequest.montoTotalConvertido == 66){
            return transaccionService.getPagoError();
        }

        else if (pagoRequest.montoTotalConvertido == 99){
            try {
                Thread.sleep(30000);
                return transaccionService.getPago();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        return transaccionService.getPago();
    }

    @PostMapping("/AnularPago")
    public Extorno getExtorno(){
        return transaccionService.getExtorno();
    }
}
