package Logica;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

    private int id;
    private String dni;
    private String nombre;
    private String apellido;
    private List<Plantilla> lista_tickets;

    public Cliente() {
        this.lista_tickets = new ArrayList<>();  // 🔥 SOLUCIÓN
    }

    public Cliente(int id, String dni, String nombre, String apellido, List<Plantilla> lista_tickets) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.lista_tickets = lista_tickets;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public List<Plantilla> getLista_tickets() {
        return lista_tickets;
    }

    public void setLista_tickets(List<Plantilla> lista_tickets) {
        this.lista_tickets = lista_tickets;
    }
}