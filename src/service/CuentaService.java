package service;

import domain.Cuenta;

import java.util.List;

public interface CuentaService {

    public Cuenta createCuentaService();

    public Cuenta updateCuentaService(int id);

    public Cuenta getCuentaById(int id);

    public List<Cuenta> getAllCuentas();

    public void deleteCuenta(int id);
}
