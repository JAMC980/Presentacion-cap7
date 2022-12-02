/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg7.pkg11;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Dados {
    Scanner entrada = new Scanner(System.in);
    Random aleatorio = new Random();
    private int numero;
    int Arreglo[];
 
 
 public void Recibir()
 {  // Abre metodo Recibir
 System.out.print("\nPor favor introduzca el numero de veces que se lanzaran ");
 System.out.print(" los dados\n");
 numero = entrada.nextInt();
 Arreglo = new int[numero];
 Lanzar();
 }  


 public void Lanzar()
 { 
 int numero1;
 int numero2;
 
 for ( int i = 0; i < Arreglo.length; i++ )
 {      // Abre for
 numero1 = 1 + aleatorio.nextInt(6); 
 numero2 = 1 + aleatorio.nextInt(6);

 Arreglo[i] = numero1 + numero2; 
 }      
 Contar();
 }  
 public void Contar()
 {     // Abre metodo Contar
 int Contador[] = new int[13];
 
 for ( int j = 0; j < Arreglo.length; j++ )
 {  
 for ( int k = 0; k < Contador.length; k++ )
 {      
 if ( Arreglo[j] == k )
 Contador[k]++;
 } 
 } 

 Imprimir(Contador); 

 }  

 public void Imprimir( int B[])
 { // Abre metodo Imprimir
 for (int m = 0; m < B.length; m++ )
 {       // Abre for
 System.out.printf("\n%d lanzamientos sumaron %d\n", B[m], m ); 
 }     
 }  
}
