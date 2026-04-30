package service;

import domain.Transaccion;
import java.util.List;

public interface TransaccionService {

    void consignar(int cuentaId, double monto);
    void retirar(int cuentaId, double monto);
    Transaccion consultarTransaccion(int id);
    List<Transaccion> obtenerMovimientos();
}
