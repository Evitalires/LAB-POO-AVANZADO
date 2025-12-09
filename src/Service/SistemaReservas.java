package Service;

import Model.Reserva;

import java.util.ArrayList;

public class SistemaReservas {
    ArrayList<Reserva> reservas;

    public SistemaReservas(ArrayList<Reserva> reservas) {
        this.reservas = reservas;
    }

    void agregarReserva(Reserva r) {
        this.reservas.add(r);
    }
    void eliminarReserva(int id) {
        int idActual;
        for (Reserva reserva: reservas) {
            idActual = reserva.getId();
            if(idActual == id) {
                reservas.remove(reserva);
            }
        }
    }
    void listarReservas() {
        System.out.println("--- Lista de Reservas ---");
        for (Reserva reserva: reservas) {
            System.out.println(" --- 📃---");
            reserva.mostrarInfo();
        }
    }
    void contarReservas() {
        if(reservas.isEmpty()) {
            System.out.println("No hay reservas registradas!");
        } else {
            System.out.println("El total de las reservas son: " + reservas.size());
        }
    }
}
