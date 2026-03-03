/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.prueba_tecnica_2;

import Logica.Cliente;
import Logica.Plantilla;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author andres-lopez
 */
public class Prueba_tecnica_2 {

    public static void main(String[] args) {

        List<Plantilla> lista_tickets = new ArrayList<Plantilla>();
        Plantilla ticket1 = new Plantilla(12, 2, 3, 1500, new Date(), new Date());
        Plantilla ticket2 = new Plantilla(13, 2, 4, 1500, new Date(), new Date());

        Plantilla ticket3 = new Plantilla();
        ticket3.setNumero(20);
        ticket3.setFila(5);
        ticket3.setAsiento(1);
        ticket3.setPrecio(2300);
        ticket3.setFecha_compra(new Date());
        ticket3.setFecha_validez(new Date());

        // Agregando los tickets a la lista        
        lista_tickets.add(ticket1);
        lista_tickets.add(ticket2);
        lista_tickets.add(ticket3);

        // Suma de precios
        double suma = 0;
        for (Plantilla ticket : lista_tickets) {
            suma = suma + ticket.getPrecio();
        }

        System.out.println("La suma de precios es de: " + suma);


        System.out.println("Ingrese por favor la fila que deseas ver tickets: ");

        // Pedir fila al usuario
        Scanner teclado = new Scanner(System.in);
        int respuesta = teclado.nextInt();
        boolean seguir = false;
        
        for (Plantilla ticket : lista_tickets) {
            if (ticket.getFila() == respuesta) {
                System.out.println(ticket.toString());
                seguir = true;
            }

        }

        if (!seguir) {
            System.out.println("No se encontraron datos de la fila en cuestion: ");
        }
        
        // Prueba de cliente
        
        Cliente client= new Cliente();
        client.setId(1);
        client.setNombre("Andres");
        client.setApellido("Lopez");
        client.setDni("12234567");
        client.getLista_tickets().add(ticket1);
        
        Plantilla ticket4 = new Plantilla ( 12, 4, 6, 20000, new Date(), new Date());
        client.getLista_tickets().add(ticket4);
        
        
    }
}
