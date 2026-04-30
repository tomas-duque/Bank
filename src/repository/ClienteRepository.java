package repository;

import domain.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    List<Cliente> clientes = new ArrayList<>();

    public Cliente createClienteRepository(Cliente cliente){

        clientes.add(cliente);

        for (Cliente c : clientes){
            System.out.println(
                    c.getId() + " " +
                            c.getNombre() + " " +
                            c.getApellido()
            );
        }

        return cliente;
    }

    public Cliente getClienteById(int id){

        for (Cliente c : clientes){
            if(c.getId() == id){
                return c;
            }
        }

        return null;
    }

    public List<Cliente> getAllClientes(){

        for (Cliente c : clientes){
            System.out.println(
                    c.getId() + " " +
                            c.getNombre() + " " +
                            c.getApellido()
            );
        }

        return clientes;
    }

    public Cliente updateClienteRepository(int id){

        for (Cliente c : clientes){
            if(c.getId() == id){
                return c;
            }
        }

        return null;
    }

    public void deleteClienteRepository(int id){

        for (Cliente c : clientes){
            if(c.getId() == id){
                clientes.remove(c);
                System.out.println("Cliente eliminado");
                return;
            }
        }

        System.out.println("Cliente no encontrado");
    }
}
