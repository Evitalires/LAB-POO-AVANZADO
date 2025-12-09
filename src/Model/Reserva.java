package Model;

public class Reserva {
    private int id;
    private String cliente;
    private String fecha;
    private int duracionHoras;

    public Reserva(int id, String cliente, String date, int duracionHoras) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = date;
        this.duracionHoras = duracionHoras;
    }

    public void mostrarInfo() {
        System.out.println("---Informacion de la reserva---");
        System.out.println("Id: " + this.id);
        System.out.println("Fecha: " + this.fecha);
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Duracion horas: " + this.duracionHoras);
    }
    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("El id debe ser un número positivo.");
        }
        this.id = id;
    }

    public void setCliente(String cliente) {
        if (cliente == null || cliente.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío.");
        }
        this.cliente = cliente;
    }

    public void setFecha(String fecha) {
        if (fecha == null || fecha.trim().isEmpty()) {
            throw new IllegalArgumentException("La fecha no puede estar vacía.");
        }
        this.fecha = fecha;
    }

    public void setDuracionHoras(int duracionHoras) {
        if (duracionHoras <= 0) {
            throw new IllegalArgumentException("La duración debe ser mayor a 0 horas.");
        }
        this.duracionHoras = duracionHoras;
    }
    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public int getDuracionHoras() {
        return duracionHoras;
    }
}
