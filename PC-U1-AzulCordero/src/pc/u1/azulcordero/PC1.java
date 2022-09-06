/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pc.u1.azulcordero;

/**
 *
 * @author omarl
 */
public class PC1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] nombre = new String [5];
        
        nombre[0]="Luis";
        nombre[1]="María";
        nombre[2]="Carlos";
        nombre[3]="José";
        nombre[4]="Ismael"; 
        //Error: No existe esta variable array de índice 4
        /*for (int i = 0; i < nombre.length; i++) {
            System.out.println(nombre[i]);
            JOptionPane.showMessageDialog(null, nombre[i]);          
        }*/
        
            System.out.println("Cantidad de parámetros: " + nombre.length);
            System.out.println(nombre[0]);
            System.out.println(nombre[1]);
            System.out.println(nombre[2]);
            System.out.println(nombre[3]);
            System.out.println(nombre[4]);
       
            
        
            
    }
    
}
