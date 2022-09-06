/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc.u1.azulcordero;

import java.util.Scanner;
/**
 *
 * @author omarl
 */
public class PC2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Scanenr es una clase*/
        //Se instancia objeto
       
        Scanner entrada = new Scanner (System.in);
        /*se declaran variables para aplicar las operaciones solicitadas a los datos introducidos por el usuario*/
        float promedio=0;
        float suma=0;
        float mayor=0;
        float menor=0;
        //se declara el arreglo 
            int []nums = new int[10];
            for (int i = 0; i < 10; i++) {
                System.out.println("Por favor ingresa el número de la posición: "+(i));
                /*valores,datos y tipo de dato*/
                nums[i]=entrada.nextInt();                        
                }
                /*Operaciones que se realizan */
            for (int i = 0; i < nums.length; i++) {
                suma+=nums[i];
            if (mayor<nums[i]) {
                mayor=nums[i];                
                }
                System.out.println(String.format("Posicion[%d]Elemento:%d",i,nums[i]));
        }
    }
    
}
