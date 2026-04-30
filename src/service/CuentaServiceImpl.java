package service;

import domain.Cuenta;
import domain.enums.EstadoCuenta;
import repository.CuentaRepository;
import util.TypeValidator;

import java.util.List;

public class CuentaServiceImpl implements CuentaService {

    private final CuentaRepository cuentaRepository;

    public CuentaServiceImpl(CuentaRepository cuentaRepository){
        this.cuentaRepository = cuentaRepository;
    }

    @Override
    public Cuenta createCuentaService(){

        Cuenta cuenta = new Cuenta();

        cuenta.setId(TypeValidator.validateInt("Ingrese el id de la cuenta"));
        cuenta.setSaldo(TypeValidator.validateDouble("Ingrese el saldo inicial"));

        System.out.println("Seleccione el estado de la cuenta:");
        System.out.println("1. ACTIVA");
        System.out.println("2. INACTIVA");

        int opcion = TypeValidator.validateInt("Opción:");

        switch (opcion){
            case 1:
                cuenta.setEstado(EstadoCuenta.ACTIVA);
                break;
            case 2:
                cuenta.setEstado(EstadoCuenta.INACTIVA);
                break;
            default:
                System.out.println("Opción inválida, se asigna ACTIVA por defecto");
                cuenta.setEstado(EstadoCuenta.ACTIVA);
        }

        return cuentaRepository.createCuentaRepository(cuenta);
    }

    @Override
    public Cuenta updateCuentaService(int id){

        Cuenta cuenta = cuentaRepository.getCuentaById(id);

        if(cuenta != null){

            System.out.println("Seleccione el dato a actualizar \n" +
                    "1. Id \n" +
                    "2. Saldo \n" +
                    "3. Estado");

            int option = TypeValidator.validateInt("Opción:");

            switch (option){
                case 1:
                    cuenta.setId(TypeValidator.validateInt("Nuevo id"));
                    break;

                case 2:
                    cuenta.setSaldo(TypeValidator.validateDouble("Nuevo saldo"));
                    break;

                case 3:
                    System.out.println("Seleccione el nuevo estado:");
                    System.out.println("1. ACTIVA");
                    System.out.println("2. INACTIVA");

                    int opcionEstado = TypeValidator.validateInt("Opción:");

                    switch (opcionEstado){
                        case 1:
                            cuenta.setEstado(EstadoCuenta.ACTIVA);
                            break;
                        case 2:
                            cuenta.setEstado(EstadoCuenta.INACTIVA);
                            break;
                        default:
                            System.out.println("Opción inválida");
                    }
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } else {
            System.out.println("Cuenta no encontrada");
        }

        return cuenta;
    }

    @Override
    public Cuenta getCuentaById(int id){

        Cuenta cuenta = cuentaRepository.getCuentaById(id);

        if(cuenta != null){
            System.out.println(
                    "ID: " + cuenta.getId() + "\n" +
                            "Saldo: " + cuenta.getSaldo() + "\n" +
                            "Estado: " + cuenta.getEstado()
            );
        } else {
            System.out.println("Cuenta no encontrada");
        }

        return cuenta;
    }

    @Override
    public List<Cuenta> getAllCuentas(){
        return cuentaRepository.getAllCuentas();
    }

    @Override
    public void deleteCuenta(int id){
        cuentaRepository.deleteCuentaRepository(id);
    }
}