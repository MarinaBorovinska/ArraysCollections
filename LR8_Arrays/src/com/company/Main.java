package com.company;

public class Main {

    public static void main(String[] args) {

        int[] mas = new int[99];
        double[] masRandom = new double[8];

        System.out.println("Array before reverse:");
        for (int i = 0; i < mas.length; i = i + 2) {
            mas[i] = i + 1;
            System.out.print(mas[i] + "  ");
        }
        System.out.println("\nArray after reverse:");
        for (int i = mas.length - 1; i >= 0; i = i - 2) {
            mas[i] = i + 1;
            System.out.print(mas[i] + "  ");
       }

        System.out.println("\nRandom array:");
        for(int i = 0; i < masRandom.length; i++) {
        masRandom[i] =  Math.floor(Math.random() * 10);
        System.out.print(masRandom[i] + "  ");
    }
        System.out.println("\nArray after replacement elements on zero:");
        for(int i = 0; i < masRandom.length; i++) {
            masRandom[i] =  Math.floor(Math.random() * 10);
            if (i % 2 != 0){
                masRandom[i] = 0;
            }
            System.out.print(masRandom[i] + "  ");
        }
    }
 }