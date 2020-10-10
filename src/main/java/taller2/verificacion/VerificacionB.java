package taller2.verificacion;

import taller2.Cliente;

public class VerificacionB extends Verificacion {

    public boolean verificar(Cliente cliente) {
        if(cliente.getRol().equals("Admin")) {
            System.out.println("Es un Admin");
            return sendSiguiente(cliente);
        } else {
            System.out.println("No es un Admin");
            return Boolean.FALSE;
        }
    }
}
