package taller2.verificacion;

import taller2.Cliente;

public abstract class Verificacion {

    protected Verificacion siguiente;

    abstract boolean verificar(Cliente cliente);

    public void setSiguiente(Verificacion verificacion) {
        siguiente = verificacion;
    }

    protected boolean sendSiguiente(Cliente cliente) {
        if(siguiente != null) {
            return siguiente.verificar(cliente);
        }
        return Boolean.TRUE;
    }
}
