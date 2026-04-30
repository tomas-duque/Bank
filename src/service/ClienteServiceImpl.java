package service;

import domain.Cliente;
import repository.ClienteRepository;
import util.TypeValidator;

import java.util.List;

public class ClienteServiceImpl implements ClienteService  {

    private final ClienteRepository clienteRepository;

    // Inyección de dependencias
    public ClienteServiceImpl(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    @Override
    public Cliente createClienteService(){

        Cliente cliente = new Cliente();

        cliente.setId(TypeValidator.validateInt("Ingrese el id del cliente"));
        cliente.setNombre(TypeValidator.validateString("Ingrese el nombre"));
        cliente.setApellido(TypeValidator.validateString("Ingrese el apellido"));
        cliente.setEmail(TypeValidator.validateString("Ingrese el email"));
        cliente.setTelefono(TypeValidator.validateString("Ingrese el teléfono"));
        cliente.setUsuario(TypeValidator.validateString("Ingrese el usuario"));
        cliente.setContrasena(TypeValidator.validateString("Ingrese la contraseña"));
        cliente.setEstado(TypeValidator.validateBoolean("Estado (true/false)"));

        return clienteRepository.createClienteRepository(cliente);
    }

    // UPDATE
    @Override
    public Cliente updateClienteService(int id){

        Cliente cliente = clienteRepository.getClienteById(id);

        if(cliente != null){

            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. Id \n" +
                    "2. Nombre \n" +
                    "3. Apellido \n" +
                    "4. Email \n" +
                    "5. Teléfono \n" +
                    "6. Usuario \n" +
                    "7. Contraseña \n" +
                    "8. Estado");

            int option = TypeValidator.validateInt("Opción: ");

            switch (option){
                case 1:
                    cliente.setId(TypeValidator.validateInt("Nuevo id"));
                    break;
                case 2:
                    cliente.setNombre(TypeValidator.validateString("Nuevo nombre"));
                    break;
                case 3:
                    cliente.setApellido(TypeValidator.validateString("Nuevo apellido"));
                    break;
                case 4:
                    cliente.setEmail(TypeValidator.validateString("Nuevo email"));
                    break;
                case 5:
                    cliente.setTelefono(TypeValidator.validateString("Nuevo teléfono"));
                    break;
                case 6:
                    cliente.setUsuario(TypeValidator.validateString("Nuevo usuario"));
                    break;
                case 7:
                    cliente.setContrasena(TypeValidator.validateString("Nueva contraseña"));
                    break;
                case 8:
                    cliente.setEstado(TypeValidator.validateBoolean("Nuevo estado"));
                    break;
                default:
                    System.out.println("Opción inválida");
            }

        } else {
            System.out.println("Cliente no encontrado");
        }

        return cliente;
    }

    @Override
    public Cliente getClienteById(int id){

        Cliente cliente = clienteRepository.getClienteById(id);

        if(cliente != null){
            System.out.println(
                    "Id: " + cliente.getId() + "\n" +
                            "Nombre: " + cliente.getNombre() + "\n" +
                            "Apellido: " + cliente.getApellido() + "\n" +
                            "Email: " + cliente.getEmail() + "\n" +
                            "Teléfono: " + cliente.getTelefono() + "\n" +
                            "Usuario: " + cliente.getUsuario() + "\n" +
                            "Estado: " + cliente.isEstado()
            );
        } else {
            System.out.println("Cliente no encontrado");
        }

        return cliente;
    }

    @Override
    public List<Cliente> getAllClientes(){
        return clienteRepository.getAllClientes();
    }

    @Override
    public void deleteCliente(int id){
        clienteRepository.deleteClienteRepository(id);
    }
}
