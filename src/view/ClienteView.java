package view;

import domain.Cliente;
import service.ClienteServiceImpl;

import java.util.List;
import java.util.Scanner;

public class ClienteView {

    Scanner sc = new Scanner(System.in);

    private final ClienteServiceImpl clienteServiceImpl;

    public ClienteView(ClienteServiceImpl clienteServiceImpl){
        this.clienteServiceImpl = clienteServiceImpl;
    }

    public void createCliente(){
        clienteServiceImpl.createClienteService();
    }

    public void updateCliente(int id){
        clienteServiceImpl.updateClienteService(id);
    }

    public List<Cliente> getAllClientes(){
        return clienteServiceImpl.getAllClientes();
    }

    public void getClienteById(int id){
        clienteServiceImpl.getClienteById(id);
    }

    public void deleteCliente(int id){
        clienteServiceImpl.deleteCliente(id);
    }
}
