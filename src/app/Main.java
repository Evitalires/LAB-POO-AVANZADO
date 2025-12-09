package app;

import Model.Reserva;
import Service.SistemaReservas;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("---Bienvenido al sistema de reservas");

        SistemaReservas sistemaReservas1 = new SistemaReservas();
        //sistemaReservas1.listarReservas();

        //Creando Reservas
        Reserva reserva1 = new Reserva(12, "Jorge", "2026/06/1995", 72);
        Reserva reserva2 = new Reserva(0, "DAvid", "2026/06/1995", 72);

        sistemaReservas1.agregarReserva(reserva1);
        sistemaReservas1.agregarReserva(reserva2);
        sistemaReservas1.listarReservas();
        System.out.println("Cambiando informacion cliente");
        reserva1.setCliente("Jorge Paez");
        sistemaReservas1.listarReservas();
        sistemaReservas1.eliminarReserva(1);
        sistemaReservas1.eliminarReserva(12);
        sistemaReservas1.listarReservas();
        sistemaReservas1.contarReservas();





    }
}