package domain;

import domain.enums.EstadoCuenta;

public class Cuenta {

    private int id;
    private double saldo;
    private Cliente cliente;
    private EstadoCuenta estado;

    public Cuenta(){}

    public Cuenta(int id, double saldo, Cliente cliente, EstadoCuenta estado) {
        this.id = id;
        this.saldo = saldo;
        this.cliente = cliente;
        this.estado = estado;
    }

    public void consignar(double monto){
        saldo += monto;
        System.out.println("Consignación exitosa. Nuevo saldo: " + saldo);
    }

    public void retirar(double monto){
        if(monto <= saldo){
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public EstadoCuenta getEstado() {
        return estado;
    }

    public void setEstado(EstadoCuenta estado) {
        this.estado = estado;
    }
}
