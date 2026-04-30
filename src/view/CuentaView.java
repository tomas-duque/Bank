package view;

import domain.Cuenta;
import service.CuentaServiceImpl;

import java.util.List;
import java.util.Scanner;

public class CuentaView {

    Scanner sc = new Scanner(System.in);

    private final CuentaServiceImpl cuentaServiceImpl;

    public CuentaView(CuentaServiceImpl cuentaServiceImpl){
        this.cuentaServiceImpl = cuentaServiceImpl;
    }

    public void createCuenta(){
        cuentaServiceImpl.createCuentaService();
    }

    public void updateCuenta(int id){
        cuentaServiceImpl.updateCuentaService(id);
    }

    public List<Cuenta> getAllCuentas(){
        return cuentaServiceImpl.getAllCuentas();
    }

    public void getCuentaById(int id){
        cuentaServiceImpl.getCuentaById(id);
    }

    public void deleteCuenta(int id){
        System.out.println("Estoy en el view");
        cuentaServiceImpl.deleteCuenta(id);
    }
}
