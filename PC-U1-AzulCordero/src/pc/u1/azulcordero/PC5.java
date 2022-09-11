

package pc.u1.azulcordero;


public class PCt {



    /**

     * @param args the command line arguments

     */

    public static void main(String[] args) {

    //Instanciar objetos para ver en pantalla los valores y dejar al usuario que ingresé valores

        

    }

    //hacer uso de o(N) en un arreglo

    public void printSumProd (int []array){

        int suma= 0;

        int producto =1;

        for (int i = 0; i < array.length; i++) {

            suma+=array[i];

            

        }

        for (int i = 0; i < array.length; i++) {

            producto*=array[i];

            System.out.println(suma+","+producto);

        } 

    }

    //ahora aplicamos o(N*2) es decir hay bucle, ciclo o lazo que itera N veces y otro interior que también itera N veces 

    public void printPares (int []array){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                

                System.out.println(array[i]+ "," + array[j]);                

            }

        }

    }

    //al mismo código que el anterior al ciclo interno se agrega i+1

    public void printPares(String[]array){

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                

                System.out.println(array[i]+","+array[j]);

            }

        }

    }

    /* más o menos una salida seria: 

    (1,2),(1,3),(1,4),(1,5)

    (2,3),(2,4),(2,5)

    (3,4),(3,5)

    (4,5)

    Aunque el ciclo, lazo, interno sea más pequeño que el exterior no es importante entrar en los detalles ni crear cosntantes

    */

    

    /* pendientes desarrollar mas notaciones y editar preguntas para la actividad se hace uso de la notación O(A*B)

    */

   public void printArrays(int[]arrayA,int[]arrayB){

       for (int a:arrayA) {

           for(int b:arrayB){

               if(a>b){

                   System.out.println(a+","+b);

               }

           }

       }

       /*Al tener un ciclo dentro de otro ciclo el tiempo de ejecución se ultiplica debido a que los conjuntos

       de datos son distintos se hace uso de O(A*B)*/

   }

   /*¿Qué pasaría si en el mismo código introducimos un ciclo interno que tiene como un valor constante?*/

   public void printArrayss(int []arrayA, int []arrayB){

       for(int a:arrayA){

           for(int b:arrayB){

               for (int i=0; i<1000000;i++){

                   System.out.println(a+","+b);

               }

           }

       }

   }

   public static void reverse (int []array){

       for(int i=0; i<array.length/2;i++){

           int other=array.length-i-1;

           int temp=array[i];

           array[i]=array[other];

           array[other]=temp;

       }

       /*¿El resultado es similar al anterior si o no por qué?

         ¿Cuál de las expreiones es similar a o(n)?

            A)O(n+p) en donde p=n/2;

            B)O(2n);

            C)O(n+m);

       */

   }

}

