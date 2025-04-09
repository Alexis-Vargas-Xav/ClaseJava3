# ClaseJava3
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.clasenum3;

/**
 *
 * @author ibarr
 */
import java.util.Scanner;

public class ClaseNum3 {

    public static void main(String[] args) {
        Scanner e = new Scanner(System.in); //Instanciar
        /*  System.out.println("Hola mundo cruel");
        String nombre = entrada.nextLine();
        
        System.out.println("Licet, " + nombre + ".");*/
 /* int a;
        int b;
        System.out.println("Ingrese el primer numero");
        a= e.nextInt();
        System.out.println("Ingrese el segundo numero");
        b= e.nextInt();
        int suma = a + b;
        System.out.println("La suma es: "+suma);*/
        System.out.println("Escoja una opcion");
        System.out.println("Suma");
        System.out.println("Resta");
        System.out.println("Multiplicacion");
        int opcion = e.nextInt();
        int a;
        int b;
        int suma;
        int resta;
        int producto;
        switch(opcion){
            case 1:

                System.out.println("Ingrese el primer numero");
                a = e.nextInt();
                System.out.println("Ingrese el segundo numero");
                b = e.nextInt();
                suma = a + b;
                System.out.println("La suma es: " + suma);

                break;
            case 2:
                System.out.println("Ingrese el primer numero");
                a= e.nextInt();
                System.out.println("Ingrese el segundo numero");
                b = e.nextInt();
                resta = a- b;
                System.out.println("La resta es: " + resta);
                break;
            case 3:
       
                System.out.println("Ingrese el primer numero");
                a= e.nextInt();
                System.out.println("Ingrese el segundo numero");
                b= e.nextInt();
                producto = a * b;
                System.out.println("El producto es: " + producto);
                break;
            default:
                System.out.println("Opcion incorrecta");
        }

    }
}
