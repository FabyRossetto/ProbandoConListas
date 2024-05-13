/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compras;


import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Faby
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escriba el limite d la tarjeta");
        double limite = scan.nextDouble();

        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);
        int salir = 1;

        while (salir != 0) {
            System.out.println("Escriba la descripcion de la compra");
            String descripcion = scan.next();

            System.out.println("Escriba el valor de la compra");
            double valor = Double.valueOf(scan.next());

            Compras compra = new Compras(valor, descripcion);
                boolean compraRealizada = tarjeta.lanzarCompra(compra);

            if(compraRealizada){
             System.out.println("Escriba 0 para salir o 1 para continuar");
             salir = scan.nextInt();
            }else{
             salir = 0;
            }
            
            }
        System.out.println("\n**************");
        System.out.println("COMPRAS REALIZADAS: \n");
       
        Collections.sort(tarjeta.getListaDeCompras());
        
        for(Compras compra : tarjeta.getListaDeCompras()){
            System.out.println(compra.getDescripcion() + " , " + compra.getValor());
        }
        System.out.println("\n**************");
        System.out.println("\nSaldo de la tarjeta: " + tarjeta.getSaldo());
    }
}
    

