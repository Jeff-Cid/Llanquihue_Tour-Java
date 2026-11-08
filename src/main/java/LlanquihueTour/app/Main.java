package LlanquihueTour.app;

import LlanquihueTour.model.Cliente;
import LlanquihueTour.model.Direccion;
import LlanquihueTour.model.Rut;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println("=== CLIENTES DE LLANQUIHUE TOUR ===");
        System.out.println();

        try {
            Rut rut1 = new Rut("12345678-0");
            Direccion direccion1 = new Direccion("Av. Los Castaños", 123, "Viña de Mar", "Valparaìso");
            Cliente cliente1 = new Cliente("Juan", "Pérez", rut1, 987654321, "jperez@correo.cl", direccion1, "Chilena", "Español e ingles");
            System.out.println(cliente1);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error al crear el cliente 1: " + e.getMessage());
        }

        System.out.println("-------------------------------------------------------");

        try {
        Rut rut2 = new Rut("18765432-20"); // RUT INVALIDO PARA DEMOSTRAR QUE EL PROGRAMA NO SE CAE Y SIGUE FUNCIONANDO, PASANDO AL SIEGUIENTE CLIENTE
        Direccion direccion2 = new Direccion("Yates", 334, "Puerto Montt", "Los Lagos");
        Cliente cliente2 = new Cliente("María", "Soto", rut2, 912125566, "soto@correo.cl", direccion2, "Chilena", "Español");
            System.out.println(cliente2);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error al crear el cliente 2: " + e.getMessage());
        }

        System.out.println("-------------------------------------------------------");

        try {
        Rut rut3 = new Rut("25123321-K");
        Direccion direccion3 = new Direccion("Pasaje Doce", 1657, "La Granja", "Santiago");
        Cliente cliente3 = new Cliente ("Pedro", "Rivas", rut3, 965658383, "elpedro@correo.cl", direccion3, "Venezolona", "Español e ingles");
            System.out.println(cliente3);
        }
        catch (IllegalArgumentException e) {
            System.out.println("Error al crear el cliente 3: " + e.getMessage());
        }

    }
}

