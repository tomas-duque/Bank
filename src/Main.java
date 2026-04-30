import repository.*;
import service.*;
import view.*;
import userinterface.MenuApp;

public class Main {

    public static void main(String[] args) {

        ClienteRepository clienteRepository = new ClienteRepository();
        ClienteServiceImpl clienteService = new ClienteServiceImpl(clienteRepository);
        ClienteView clienteView = new ClienteView(clienteService);

        CuentaRepository cuentaRepository = new CuentaRepository();
        CuentaServiceImpl cuentaService = new CuentaServiceImpl(cuentaRepository);
        CuentaView cuentaView = new CuentaView(cuentaService);

        MenuApp menu = new MenuApp(clienteView, cuentaView);
        menu.mainMenu();
    }
}
