/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc.u1.azulcordero;


public class PC4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a= 20, b=10;
            String x= "Programación ", y= "Objetos";
        int ar[]={1,2,3};
        int br[]={1,2,3};
            boolean condicion = true; 
    
            System.out.println("a==b:" +(a==b));
            System.out.println("a<b: "+ (a<b));
            System.out.println("a<=b: "+(a<=b));
            System.out.println("a>b: "+(a>b));
            System.out.println("a>=b: "+(a>=b));
            System.out.println("a!=b: "+(a!=b));
            System.out.println("x==y: " + (ar==br));
            System.out.println("condicion==true: " + (condicion==true));
        //¿Los arreglos se pueden comparar con operadores relacionales?
        //¿Si o no y porqué?
        //no, ya que no te da un orden, posicion o valor por si solo 
    }
    
}
