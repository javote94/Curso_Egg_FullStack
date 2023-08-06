package servicios;

import console.Console;
import entidades.CuentaBancaria;

public class CuentaBancariaServicio {

    /**
     * La función retorna un objeto de la clase CuentaBancaria con los atributos
     * inicializados por el usuario. Se solicita número de cuenta, dni y saldo.
     *
     * @return objeto de la clase CuentaBancaria
     */
    public CuentaBancaria crearCuenta() {
        int num = Console.inputInt("Ingresar número de cuenta: ");
        int dni = Console.inputInt("Ingresar DNI del cliente: ");
        double saldo = Console.inputDouble("Ingresar saldo actual de la cuenta: ");
        return new CuentaBancaria(num, dni, saldo);
    }

    /**
     * La función le solicita al usuario la cantidad a depositar. Los fondos
     * depositados tienen como destino la cuenta que se pasa como argumento.
     *
     * @param cuenta
     */
    public void ingresarEfectivo(CuentaBancaria cuenta) {
        double deposito = Console.inputDouble("Ingresar cantidad de dinero a depositar en la cuenta: ");
        cuenta.setSaldoActual(cuenta.getSaldoActual() + deposito);
    }

    /**
     * La función le solicita al usuario la cantidad a retirar. Los fondos se
     * deducen del saldo actual de la cuenta que se pasa como argumento.
     *
     * @param cuenta
     */
    public void retirarEfectivo(CuentaBancaria cuenta) {
        double retiro = Console.inputDouble("Ingresar cantidad de dinero a retirar de la cuenta: ");
        if (retiro <= cuenta.getSaldoActual()) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        } else {
            cuenta.setSaldoActual(0);
        }
    }

    /**
     * La función le solicita al usuario retirar hasta un 20% del saldo actual.
     *
     * @param cuenta
     */
    public void extraccionRapida(CuentaBancaria cuenta) {
        double limite = 0.2 * cuenta.getSaldoActual();
        double extraccion = Console.inputDouble("Ingresar cantidad de dinero a "
                + "retirar de la cuenta (hasta un 20% del saldo = " + limite + "): ");
        if (extraccion <= limite) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - extraccion);
        } else {
            Console.println("No puede retirar más del 20% del saldo actual");
        }
    }
    
    public void consultarDatos(CuentaBancaria cuenta) {
        Console.println("Número de cuenta: " + cuenta.getNumeroCuenta());
        Console.println("DNI del cliente: " + cuenta.getDniCliente());
        Console.println("Saldo actual: " + cuenta.getSaldoActual());
    }
}
