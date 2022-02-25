package es.lvo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        Scanner entrada = new Scanner(System.in);

        System.out.println("Dame cinco números para crear un array con ellos...");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            array1[i] = entrada.nextInt();
        }

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println("Array 1:" + array1);

        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println("Array 2:");
    }
}
