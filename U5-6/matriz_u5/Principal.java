/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.matriz_u5;

/**
 *
 * @author Victus
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // se instancia el objeto
        Matriz_Adyacencia ma = new Matriz_Adyacencia (5);
        // es un argumento (0,1)
        ma.agregar(0,1);
        ma.agregar(0,2);
        ma.agregar(0,3);
        ma.agregar(0,4);
        
        ma.agregar(1,4);
        ma.agregar(1,1);
        ma.agregar(1,3);
       
        ma.agregar(2,4);
        ma.agregar(2,1);
        ma.agregar(2,2);
        
        ma.agregar(3,3);
        ma.agregar(3,2);
        
        ma.agregar(4,4);
        ma.agregar(4,3);
        ma.agregar(4,2);
        ma.agregar(4,1);
        
        // mostrar información (elemento)
        ma.imprimir();
    }
}
