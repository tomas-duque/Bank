package userinterface;

import util.TypeValidator;
import view.ClienteView;
import view.CuentaView;

import java.util.Scanner;

public class MenuApp {

    Scanner sc = new Scanner(System.in);

    private final ClienteView clienteView;
    private final CuentaView cuentaView;

    public MenuApp(ClienteView clienteView, CuentaView cuentaView){
        this.clienteView = clienteView;
        this.cuentaView = cuentaView;
    }

    public void mainMenu(){

        System.out.println("Presione 1 para iniciar la aplicación");

        int init = sc.nextInt();
        sc.nextLine();

        while (init != 0){

            System.out.println("Seleccione una opción:");
            System.out.println("1. Gestión Clientes");
            System.out.println("2. Gestión Cuentas");
            System.out.println("3. Salir");

            int option = sc.nextInt();
            sc.nextLine();

            switch (option){
                case 1:
                    clienteMenu();
                    break;
                case 2:
                    cuentaMenu();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    init = 0;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    public void clienteMenu(){

        boolean init = true;

        while(init){
            System.out.println("\n--- MENÚ CLIENTE ---");
            System.out.println("1. Crear Cliente");
            System.out.println("2. Actualizar Cliente");
            System.out.println("3. Ver Clientes");
            System.out.println("4. Ver Cliente por ID");
            System.out.println("5. Eliminar Cliente");
            System.out.println("6. Volver");

            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt){
                case 1:
                    clienteView.createCliente();
                    break;
                case 2:
                    clienteView.updateCliente(TypeValidator.validateInt("Ingrese ID"));
                    break;
                case 3:
                    clienteView.getAllClientes();
                    break;
                case 4:
                    clienteView.getClienteById(TypeValidator.validateInt("Ingrese ID"));
                    break;
                case 5:
                    clienteView.deleteCliente(TypeValidator.validateInt("Ingrese ID"));
                    break;
                case 6:
                    init = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }

    public void cuentaMenu(){

        boolean init = true;

        while(init){
            System.out.println("\n--- MENÚ CUENTA ---");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Actualizar Cuenta");
            System.out.println("3. Ver Cuentas");
            System.out.println("4. Ver Cuenta por ID");
            System.out.println("5. Eliminar Cuenta");
            System.out.println("6. Volver");

            int opt = sc.nextInt();
            sc.nextLine();

            switch (opt){
                case 1:
                    cuentaView.createCuenta();
                    break;
                case 2:
                    cuentaView.updateCuenta(TypeValidator.validateInt("Ingrese ID"));
                    break;
                case 3:
                    cuentaView.getAllCuentas();
                    break;
                case 4:
                    cuentaView.getCuentaById(TypeValidator.validateInt("Ingrese ID"));
                    break;
                case 5:
                    cuentaView.deleteCuenta(TypeValidator.validateInt("Ingrese ID"));
                    break;
                case 6:
                    init = false;
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }
    }
}
