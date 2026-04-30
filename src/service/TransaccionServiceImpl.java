package service;

import domain.Transaccion;
import domain.enums.TipoMovimiento;
import repository.TransaccionRepository;
import util.TypeValidator;

import java.util.List;

public class TransaccionServiceImpl implements TransaccionService {

    private final TransaccionRepository repository;

    public TransaccionServiceImpl(TransaccionRepository repository){
        this.repository = repository;
    }

    @Override
    public void consignar(int cuentaId, double monto){

        Transaccion t = new Transaccion();

        t.setId(TypeValidator.validateInt("ID transacción"));
        t.setCuentaId(cuentaId);
        t.setMonto(monto);
        t.setTipoMovimiento(TipoMovimiento.CONSIGNACION);

        repository.createTransaccionRepository(t);

        System.out.println("Consignación realizada");
    }

    @Override
    public void retirar(int cuentaId, double monto){

        Transaccion t = new Transaccion();

        t.setId(TypeValidator.validateInt("ID transacción"));
        t.setCuentaId(cuentaId);
        t.setMonto(monto);
        t.setTipoMovimiento(TipoMovimiento.RETIRO);

        repository.createTransaccionRepository(t);

        System.out.println("Retiro realizado");
    }

    @Override
    public Transaccion consultarTransaccion(int id){
        return repository.getTransaccionById(id);
    }

    @Override
    public List<Transaccion> obtenerMovimientos(){
        return repository.getAllTransacciones();
    }
}
