/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.boletos;

import java.util.Scanner;

/**
 *
 * @author rb940
 */
public class Boletos {

    public static void main(String[] args) {
        
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Elige el tipo de boleto:");
        System.out.println("1. Boleto General");
        System.out.println("2. Boleto VIP");
        int opcion = scanner.nextInt();
        scanner.nextLine();
        
        if (opcion == 1) {
            // Solicitar nombre y precio para el boleto general
            
            System.out.print("Ingresa el nombre del boleto general: ");
            String Nombre = scanner.nextLine();
            
            System.out.print("Ingresa el precio del boleto general: ");
            double Precio = scanner.nextDouble();
            
            BoletoGener boletoGener = new BoletoGener(Nombre, Precio); 
            boletoGener.mostrarInfo();
            
           
            
        } else if (opcion == 2) {
            BoletoVip boletoVip = new BoletoVip();
            boletoVip.mostrarInfo();
        } else {
            System.out.println("Opción no válida.");
        }
    
    }
}

