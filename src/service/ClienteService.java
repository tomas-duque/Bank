package service;

import domain.Cliente;

import java.util.List;

public interface ClienteService {

    public Cliente createClienteService();
    public Cliente updateClienteService(int id);
    public Cliente getClienteById(int id);
    public List<Cliente> getAllClientes();
    public void deleteCliente(int id);
}
