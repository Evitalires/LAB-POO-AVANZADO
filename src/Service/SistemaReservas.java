package Service;

import Model.Reserva;

import java.util.ArrayList;

public class SistemaReservas {
    ArrayList<Reserva> reservas = new ArrayList<>();

    public SistemaReservas() {

    }
    public SistemaReservas(Reserva reserva) {
        this.agregarReserva(reserva);
    }

    public void agregarReserva(Reserva r) {
        try {
            if (r == null) {
                throw new IllegalArgumentException("La reserva que se intenta agregar es nula.");
            }

            int nuevoId = r.getId();
            System.out.println(this.reservas.size());
            for (Reserva reservaExistente : this.reservas) {
                if (reservaExistente.getId() == nuevoId) {
                   throw new IllegalStateException("La reserva con ID " + nuevoId + " ya está registrada.");
                }
            }
            this.reservas.add(r);
            System.out.println("Reserva con ID: " + nuevoId + ", agregada exitosamente.");

        } catch (IllegalArgumentException e) {
            System.err.println("Error de argumento: " + e.getMessage());
        } catch (IllegalStateException e) {
            System.err.println("Error de estado: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado al agregar la reserva: " + e.getMessage());
        }
    }
    public void eliminarReserva(int id) {
        System.out.println("Eliminando...");
        try {
           if (this.reservas == null) {
                throw new NullPointerException("La lista de reservas no ha sido inicializada. No se puede eliminar.");
            }

            boolean eliminada = false;

           for (int i = reservas.size() - 1; i >= 0; i--) {
                Reserva reserva = reservas.get(i);

                if (reserva == null) {
                    System.err.println("Advertencia: Se encontró una reserva nula en el índice " + i + ". Se omitirá.");
                    continue;
                }

                if (reserva.getId() == id) {
                    reservas.remove(i);
                    System.out.println("Reserva con ID: " + id + " Eliminada Exitosamente.");
                    eliminada = true;
                }
            }

            if (!eliminada) {
                System.out.println("No se encontró ninguna reserva con el ID: " + id);
            }

        } catch (IndexOutOfBoundsException e) {
            System.err.println("Error: Índice fuera de los límites de la lista. " + e.getMessage());
        } catch (NullPointerException e) {
           System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Error inesperado al intentar eliminar la reserva. Detalle: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void listarReservas() {
        System.out.println("--- Lista de Reservas ---");

        try {
            if (reservas == null) {
               throw new NullPointerException("La lista de reservas no ha sido inicializada (es null).");
            }

            for (Reserva reserva : reservas) {
                System.out.println(" --- 📃---");

                if (reserva == null) {
                    System.err.println("Advertencia: Se encontró una reserva nula en la lista. Se omitirá.");
                    continue;
                }
                reserva.mostrarInfo();
            }

        } catch (NullPointerException e) {
            System.err.println("Error al listar reservas: " + e.getMessage());
            System.err.println("Asegúrese de que la lista de reservas esté inicializada.");
        } catch (Exception e) {
            System.err.println("Ocurrió un error inesperado durante el listado: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public void contarReservas() {
        if(reservas.isEmpty()) {
            System.out.println("No hay reservas registradas!");
        } else {
            System.out.println("El total de las reservas son: " + reservas.size());
        }
    }
}
