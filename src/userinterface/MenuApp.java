package userinterface;

import util.TypeValidator;
import view.ClienteView;
import view.CuentaView;
import view.TransaccionView;

import java.util.Scanner;

public class MenuApp {

    Scanner sc = new Scanner(System.in);

    private final ClienteView clienteView;
    private final CuentaView cuentaView;
    private final TransaccionView transaccionView;

    public MenuApp(ClienteView clienteView, CuentaView cuentaView, TransaccionView transaccionView) {
        this.clienteView = clienteView;
        this.cuentaView = cuentaView;
        this.transaccionView = transaccionView;
    }

    public void menuPrincipal() {

        boolean activo = true;

        while (activo) {

            System.out.println("1. Clientes");
            System.out.println("2. Cuentas");
            System.out.println("3. Transacciones");
            System.out.println("4. Salir");

            int op = TypeValidator.validateInt("Seleccione opción:");

            switch (op) {
                case 1:
                    menuCliente();
                    break;
                case 2:
                    menuCuenta();
                    break;
                case 3:
                    menuTransaccion();
                    break;
                case 4:
                    activo = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    public void menuCliente(){

        boolean activo = true;

        while(activo){

            System.out.println("1. Crear");
            System.out.println("2. Ver todos");
            System.out.println("3. Volver");

            int op = TypeValidator.validateInt("Seleccione:");

            switch (op){
                case 1:
                    clienteView.createCliente();
                    break;
                case 2:
                    clienteView.getAllClientes();
                    break;
                case 3:
                    activo = false;
                    break;
            }
        }
    }

    public void menuCuenta(){

        boolean activo = true;

        while(activo){

            System.out.println("1. Crear cuenta");
            System.out.println("2. Ver cuentas");
            System.out.println("3. Volver");

            int op = TypeValidator.validateInt("Seleccione:");

            switch (op){
                case 1:
                    cuentaView.createCuenta();
                    break;
                case 2:
                    cuentaView.getAllCuentas();
                    break;
                case 3:
                    activo = false;
                    break;
            }
        }
    }

    public void menuTransaccion() {

        boolean activo = true;

        while (activo) {

            System.out.println("1. Consignar");
            System.out.println("2. Retirar");
            System.out.println("3. Ver movimientos");
            System.out.println("4. Consultar transacción");
            System.out.println("5. Volver");

            int op = TypeValidator.validateInt("Seleccione:");

            switch (op) {

                case 1:
                    transaccionView.consignar();
                    break;

                case 2:
                    transaccionView.retirar();
                    break;

                case 3:
                    transaccionView.verMovimientos();
                    break;

                case 4:
                    transaccionView.consultarTransaccion();
                    break;

                case 5:
                    activo = false;
                    break;

                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}
