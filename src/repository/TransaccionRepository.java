package repository;

import domain.Transaccion;

import java.util.ArrayList;
import java.util.List;

public class TransaccionRepository {

    List<Transaccion> transacciones = new ArrayList<>();

    public Transaccion createTransaccionRepository(Transaccion transaccion){

        transacciones.add(transaccion);

        for (Transaccion t : transacciones){
            System.out.println(
                    "ID: " + t.getId() +
                            " CuentaID: " + t.getCuentaId() +
                            " Monto: " + t.getMonto() +
                            " Tipo: " + t.getTipoMovimiento()
            );
        }

        return transaccion;
    }

    public Transaccion getTransaccionById(int id){

        for (Transaccion t : transacciones){
            if(t.getId() == id){
                return t;
            }
        }

        return null;
    }

    public List<Transaccion> getAllTransacciones(){

        for (Transaccion t : transacciones){
            System.out.println(
                    "ID: " + t.getId() +
                            " CuentaID: " + t.getCuentaId() +
                            " Monto: " + t.getMonto() +
                            " Tipo: " + t.getTipoMovimiento()
            );
        }

        return transacciones;
    }

    public Transaccion updateTransaccionRepository(int id){

        for (Transaccion t : transacciones){
            if(t.getId() == id){
                return t;
            }
        }

        return null;
    }

    public void deleteTransaccionRepository(int id){

        for (Transaccion t : transacciones){
            if(t.getId() == id){
                transacciones.remove(t);
                System.out.println("Transacción eliminada");
                return;
            }
        }

        System.out.println("Transacción no encontrada");
    }
}
