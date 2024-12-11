/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boletos;

import java.util.Scanner;

/**
 *
 * @author rb940
 */
public class BoletoVip {
    public String nombre;
    public double precio;
    public double cantidad;
    public double respuesta;

    Scanner scanner = new Scanner(System.in);
    //Constructor
    public BoletoVip() {
        this.nombre = "boleto bad bunny";
        this.precio = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    //metodo
     public void mostrarInfo() {
        double pagarboletos;
        System.out.println("Boleto VIP:");
        System.out.println("Nombre: " + nombre);
        System.out.print("Ingresa la cantidad de boletos a comprar: ");
        cantidad = scanner.nextDouble();
        pagarboletos = precio*cantidad;
        System.out.println("Precio: $" + pagarboletos);
    }
    
}
