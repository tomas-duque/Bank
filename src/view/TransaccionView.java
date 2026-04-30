package view;

import service.TransaccionServiceImpl;
import util.TypeValidator;

public class TransaccionView {

    private final TransaccionServiceImpl transaccionService;

    public TransaccionView(TransaccionServiceImpl transaccionService){
        this.transaccionService = transaccionService;
    }

    public void consignar(){

        int cuentaId = TypeValidator.validateInt("Ingrese el ID de la cuenta");
        double monto = TypeValidator.validateDouble("Ingrese el monto a consignar");

        transaccionService.consignar(cuentaId, monto);
    }

    public void retirar(){

        int cuentaId = TypeValidator.validateInt("Ingrese el ID de la cuenta");
        double monto = TypeValidator.validateDouble("Ingrese el monto a retirar");

        transaccionService.retirar(cuentaId, monto);
    }

    public void consultarTransaccion(){

        int id = TypeValidator.validateInt("Ingrese el ID de la transacción");

        transaccionService.consultarTransaccion(id);
    }

    public void verMovimientos(){

        transaccionService.obtenerMovimientos();
    }
}
