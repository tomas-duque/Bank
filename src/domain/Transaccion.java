package domain;

import domain.enums.TipoMovimiento;

public class Transaccion {

    private int id;
    private Cuenta cuenta;
    private double monto;
    private TipoMovimiento tipoMovimiento;

    public Transaccion(){}

    public Transaccion(int id, Cuenta cuenta, double monto, TipoMovimiento tipoMovimiento) {
        this.id = id;
        this.cuenta = cuenta;
        this.monto = monto;
        this.tipoMovimiento = tipoMovimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }
}


