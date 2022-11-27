/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.matriz_u5;

/**
 *
 * @author Victus
 */
public class Matriz_Adyacencia {
    private int n;
    private int [][] matriz;
    // se crea constructor
    // metodo constructor

    public Matriz_Adyacencia(int n) {
        this.n = n;
        matriz= new int [this.n][this.n];
        // se inicializa la matriz en 0
        for(int i=0; i<n; i++){
            for( int j=0; j<n; j++){
                matriz[i][j]=0;
            }
        }
    }
    // se crea metodo agregar 
    public void agregar (int i, int j){
        matriz [i][j]+=1;
}
    public void remover (int i, int j){
        if (matriz[i][j]>0)
            matriz [i][j]-=1;
    }
    // se crea metodo imprimir
    public void imprimir (){
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matriz [i][j]+"");
            }
            System.out.println();
        }
    }
}
