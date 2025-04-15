/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.promed;

import java.util.Scanner;

/**
 *
 * @author Xav
 */
public class Promed {

    public static void main(String[] args) {
        float[] notas = new float[20];

        Scanner sc = new Scanner(System.in);

        int tamanos;
        float promedioMediociclo;
        float promedioFinCiclo;
        float promedioAcumulado;
        float sumaMedioCiclo = 0;
        float sumaFinCiclo = 0;
        int i;
        float recuperacion;
        float notaRecuperada;
        String nombre;
        System.out.println("CALCULO DEL PROMEDIO DE LAS NOTAS DEL SEMESTRE");

        System.out.println(" ");
        System.out.println("  ---NOTAS DE MEDIO CICLO---");
        System.out.println("Ingrese el nombre del estudiante. ");
        nombre = sc.nextLine();

        System.out.println(" ");
        System.out.println("Cuantas notas va a ingresar");
        tamanos = sc.nextInt();
        System.out.println(" ");
        for (i = 0; i < tamanos; i++) {
            System.out.println((i + 1) + ".Ingrese las notas");
            do {
                notas[i] = sc.nextFloat();
            } while (notas[i] < 0 || notas[i] > 10);

            sumaMedioCiclo += notas[i];
            System.out.println(" ");
        }
        promedioMediociclo = sumaMedioCiclo / tamanos;
        System.out.println("El estudiante " + nombre + " obtuvo una calificacion de:" + promedioMediociclo);

        System.out.println(" ");
        System.out.println("---NOTAS FIN DE CICLO---");
        System.out.println(" ");

        System.out.println("Cuantas notas va a ingresar");
        tamanos = sc.nextInt();
        System.out.println(" ");
        for (i = 0; i < tamanos; i++) {
            System.out.println((i + 1) + ".Ingrese las notas");
            do {
                notas[i] = sc.nextFloat();
            } while (notas[i] < 0 || notas[i] > 10);
            
            sumaFinCiclo += notas[i];
            System.out.println(" ");
        }
        promedioFinCiclo = sumaFinCiclo / tamanos;
        System.out.println("El estudiante " + nombre + " obtuvo una calificacion de: " + promedioFinCiclo);
        System.out.println(" ");

        promedioAcumulado = ((promedioMediociclo + promedioFinCiclo) / 2);
        System.out.println("  ---NOTA FINAL---");
        System.out.println("El estudiante " + nombre + " obtuvo una calificacion final de: " + promedioAcumulado);
        System.out.println(" ");
        if (promedioAcumulado < 6.99) {
            System.out.println("La calificacion del estudiante " + nombre + " no a alcanzado el  minimo aprobatorio");
            System.out.println(" ");
            System.out.println("---EXAMEN DE RECUPERACION--- ");
            System.out.println("Ingrese su nota del examen de recuperacion:");
            recuperacion = sc.nextFloat();
            notaRecuperada = ((recuperacion + promedioAcumulado) / 2);
            if (notaRecuperada < 6.99) {
                System.out.println(" ");

                System.out.println("  ---NO APRUEBA--- ");
                System.out.println("La calificacion del estudiante " + nombre + "no ha alcanzado la nota aprobatoria,usted pierde la materia con:" + notaRecuperada);
            } else {
                System.out.println(" ");
                System.out.println("   ---APRUEBA--- ");
                System.out.println("Felicidades " + nombre + " has aprobar la materia con:" + notaRecuperada);
            }
        } else {
            System.out.println(" ");
            System.out.println("  ---APRUEBA--- ");
            System.out.println("Felicidades " + nombre + " has aprobar la materia con:" + promedioAcumulado);

        }
    }
}
