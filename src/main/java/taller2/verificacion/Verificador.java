package taller2.verificacion;

import taller2.Cliente;

public class Verificador {

    private Verificacion verificacion;

    public Verificador() {
        construirCadena();
    }

    public boolean verificar(Cliente cliente) {
        return verificacion.verificar(cliente);
    }

    private void construirCadena() {
        Verificacion verificacionA = new VerificacionA();
        Verificacion verificacionB = new VerificacionB();
        verificacionA.setSiguiente(verificacionB);
        verificacion = verificacionA;
    }
}
