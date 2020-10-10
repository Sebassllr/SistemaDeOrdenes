package taller2.verificacion;

import taller2.Cliente;

public class VerificacionA extends Verificacion {

    public boolean verificar(Cliente cliente) {
        if(cliente.getContraseña().equals("1234")) {
            System.out.println("Contraseña correcta");
            return sendSiguiente(cliente);
        } else {
            System.out.println("Contraseña incorrecta :(");
            return Boolean.FALSE;
        }
    }
}
