/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PC_U2;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class PC1 {
    public static void main(String[] args) {
        /*1-Se calcula el factorial/es
        2-se suma el factorial/es
        3-se se calcula factorial de n numro ingresado 
        (completar codigo)*/
        
        int N;
        double factorial, suma=0;
        Scanner sc = new Scanner(System.in);
        
        
        //leer un numero > 0
        do{
        System.out.println("Introduzca un numero >0: ");
        N=sc.nextInt();
        }while(N<0);
        for(int i=0; i<=N; i++){
        //para cada numero desde 1 hasta N
            factorial=1;
            for(int j=1; j<=i; j++){
            factorial=factorial*j;
            }
            // se muestra el factorial
            System.out.println(String.format("%n%2d!=%.0f%n",i,factorial));
            //se suma factorial
            suma=suma+factorial;
            System.out.println(String.format("Suma de los factoriales desde cero hasta %d:%.0f%n",N,suma));
            
        }
        
    }
    
}


