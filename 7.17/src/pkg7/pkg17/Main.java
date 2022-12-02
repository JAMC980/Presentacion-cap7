
package pkg7.pkg17;

import java.util.Scanner;


public class Main {

   
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        Scanner obj=new Scanner(System.in);
        int elecc;
        float[] elem=new float[10];
        float[] num=new float[15];
        int[] val=new int[5];
        System.out.println("Seleccione la accion que desee realizar.");
        System.out.println("1.Asignar cero a los 10 elementos del arreglo de cuentas de tipo entero.");
        System.out.println("2.Sumar uno a cada uno de los 15 elementos del arreglo bono de tipo entero.");
        System.out.println("3.Imprimir los cinco valores del arreglo mejoresPuntuaciones de tipo entero en formato de columnas.");
         System.out.println("Elija una opcion:");
        elecc=obj.nextInt();
        
       switch(elecc){
           case 1:
               System.out.println("Asignar cero a los 10 elementos del arreglo de cuentas de tipo entero.");
               for(int i=0;i<10;i++){
                   System.out.print((i+1)+".Ingrese los valores:");
                   elem[i] = entrada.nextFloat();
                   
               }
                System.out.println("\nLos valores del arreglo:");
                for(float i:elem){
                    System.out.println(i+" 0");
                }
               break;
           case 2:
               System.out.println("Sumar uno a cada uno de los 15 elementos del arreglo bono de tipo entero.");
               for(int i=0;i<15;i++){
                   System.out.print((i+1)+".Ingrese los valores:");
                   num[i] = entrada.nextFloat();
                   
               }
                System.out.println("\nLos valores del arreglo:");
                for(float i:num){
                    System.out.println(i+1);
                }
               break;
           case 3:
               System.out.println("Imprimir los cinco valores del arreglo mejores Puntuaciones de tipo entero en formato de columnas.");
               for(int i=0;i<5;i++){
                   System.out.print((i+1)+".Ingrese las puntuaciones:");
                   num[i] = entrada.nextFloat();
                }
               int aux=0;
               for(int j=0;j<5;j++)
               {
                   for(int i=0;i<5;i++){
                       if(num[i]>num[i+1]){
                            aux=(int) num[i];
                            num[i]=num[i+1];
                            num[i+1]=aux;
                       }
                   }
               }
               int k=0;
               System.out.print("Numeros ordenados:");
               while(k<5){
                   System.out.print(num[k]);
                   k++;
               }
               break;
            
        }
    }
}
