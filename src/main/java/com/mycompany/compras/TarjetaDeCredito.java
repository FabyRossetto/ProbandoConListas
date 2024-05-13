/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.compras;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Faby
 */
public class TarjetaDeCredito {
    private double limite;
    private double saldo;
    List<Compras>listaDeCompras;

    public TarjetaDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaDeCompras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getListaDeCompras() {
        return listaDeCompras;
    }
    public boolean lanzarCompra(Compras compra){
     if(this.saldo>= compra.getValor()){
         this.saldo = this.saldo- compra.getValor();
         System.out.println(" La compra fue realizada con exito! Su saldo actual es de " + this.saldo);
         this.listaDeCompras.add(compra);
         return true;
     }else{
         System.out.println("Saldo insuficiente");
         return false;
     }
 }
 
    
    
    
    
}
