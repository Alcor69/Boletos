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
public class BoletoGener {
    public String Nombre;
    public double Precio;
    public double cantidad;
    public double respuesta;
    
    Scanner scanner = new Scanner(System.in);
    //constructor
    public BoletoGener(String Nombre, double Precio) {
        this.Nombre = Nombre;
        this.Precio = Precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }
    
   //metodo
    public void mostrarInfo() {
        double pagarboletos;
        System.out.print("Ingresa la cantidad de boletos a comprar: ");
        cantidad = scanner.nextDouble();
        pagarboletos = Precio*cantidad;
        System.out.println("Precio a pagar: $" + pagarboletos);
    }
    
}
