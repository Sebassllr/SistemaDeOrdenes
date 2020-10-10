package taller2;

import taller2.verificacion.Verificador;

public class Main {

    public static void main(String[] args) {

        Verificador verificador = new Verificador();
        Cliente cliente = new Cliente("Daniela", "Admin", "1234");
//        Cliente cliente = new Cliente("Sebastian", "No Admin", "1234");
//        System.out.println(verificador.verificar(cliente));
//        System.out.println(verificador.verificar(cliente2));
        if(verificador.verificar(cliente)) {
            SistemaDeOrdenes sistemaDeOrdenes = new SistemaDeOrdenes();
            sistemaDeOrdenes.bienvenido();
        } else {
            System.out.println("No se pudo acceder al sistema de órdenes");
        }

    }
}
