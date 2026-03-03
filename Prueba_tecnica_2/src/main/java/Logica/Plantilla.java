/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

import java.util.Date;

/**
 *
 * @author andres-lopez
 */
public class Plantilla {
    
    private int numero;
    private int fila;
    private int asiento;    
    private double precio;
    private Date fecha_compra;
    private Date fecha_validez;
    private Cliente client;

    public Plantilla() {
    }

    public Plantilla(int numero, int fila, int asiento, double precio, Date fecha_compra, Date fecha_validez) {
        this.numero = numero;
        this.fila = fila;
        this.asiento = asiento;
        this.precio = precio;
        this.fecha_compra = fecha_compra;
        this.fecha_validez = fecha_validez;
    }
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public Date getFecha_validez() {
        return fecha_validez;
    }

    public void setFecha_validez(Date fecha_validez) {
        this.fecha_validez = fecha_validez;
    }

    @Override
    public String toString() {
        return "Plantilla{" + "numero=" + numero + ", fila=" + fila + ", asiento=" + asiento + ", precio=" + precio + ", fecha_compra=" + fecha_compra + ", fecha_validez=" + fecha_validez + '}';
    }
    

}
