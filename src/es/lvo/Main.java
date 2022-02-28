package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Scanner entrada = new Scanner(System.in);

        // Pedimos los números y los guardamos en el array 1
        System.out.println("Dame cinco números para crear un array con ellos...");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array1[i] = entrada.nextInt();
        }

        // Guardamos los números del array 1 en el array 2, pero al revés, de atrás
        // hacia adelante.
        for (int i = 0; i < array1.length; i++) {
            array2[array2.length - i - 1] = array1[i];
        }

        // Mostramos los elementos del array 1.
        System.out.println("Array 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }

        // Mostramos los elementos del array 2.
        System.out.println();
        System.out.println("Array 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }

        entrada.close();
    }
}
