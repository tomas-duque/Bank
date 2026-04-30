package config;

import repository.*;
import service.*;
import view.*;
import userinterface.MenuApp;

public class Config {

    public static MenuApp createMenuApp(){

        ClienteRepository clienteRepository = new ClienteRepository();
        ClienteServiceImpl clienteService = new ClienteServiceImpl(clienteRepository);
        ClienteView clienteView = new ClienteView(clienteService);

        CuentaRepository cuentaRepository = new CuentaRepository();
        CuentaServiceImpl cuentaService = new CuentaServiceImpl(cuentaRepository, clienteRepository);
        CuentaView cuentaView = new CuentaView(cuentaService);

        TransaccionRepository transaccionRepository = new TransaccionRepository();
        TransaccionServiceImpl transaccionService = new TransaccionServiceImpl(transaccionRepository);
        TransaccionView transaccionView = new TransaccionView(transaccionService);

        return new MenuApp(
                clienteView,
                cuentaView,
                transaccionView
        );
    }
}
