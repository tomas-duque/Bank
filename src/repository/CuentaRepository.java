package repository;

import domain.Cuenta;

import java.util.ArrayList;
import java.util.List;

public class CuentaRepository {

    List<Cuenta> cuentas = new ArrayList<>();

    public Cuenta createCuentaRepository(Cuenta cuenta){

        cuentas.add(cuenta);

        for (Cuenta c : cuentas){
            System.out.println(
                    "ID: " + c.getId() +
                            " Saldo: " + c.getSaldo()
            );
        }

        return cuenta;
    }

    public Cuenta getCuentaById(int id){

        for (Cuenta c : cuentas){
            if(c.getId() == id){
                return c;
            }
        }

        return null;
    }

    public List<Cuenta> getAllCuentas(){

        for (Cuenta c : cuentas){
            System.out.println(
                    "ID: " + c.getId() +
                            " Saldo: " + c.getSaldo() +
                            " Estado: " + c.getEstado()
            );
        }

        return cuentas;
    }

    public Cuenta updateCuentaRepository(int id){

        for (Cuenta c : cuentas){
            if(c.getId() == id){
                return c;
            }
        }

        return null;
    }

    public void deleteCuentaRepository(int id){

        for (Cuenta c : cuentas){
            if(c.getId() == id){
                cuentas.remove(c);
                System.out.println("Cuenta eliminada");
                return;
            }
        }

        System.out.println("Cuenta no encontrada");
    }
}