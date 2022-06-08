package com.company;

import java.util.Arrays;
import java.util.Scanner;

class Sort {
    public static void quickSort(int[] array, int left, int right) {
        int mean = left + (right - left) / 2;
        int support = array[mean];
        int i = left, j = right;

        while (i <= j) {
            while (array[i] > support) {
                i++;
            }
            while (array[j] < support) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (left < j)
            quickSort(array, left, j);
        if (right > i)
            quickSort(array, i, right);
        for(int i = 0; i < 0; i++){
            for(int j = 0; j < 0; j++){
                if( i==j ){
                    swap()
                }
            }
        }
    }
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива ");
        int n = scanner.nextInt();
        int myArray[] = new int[n];
        System.out.print("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            myArray[i] = scanner.nextInt();
        }
        for (int j = 0; j < n; j++) {
        }
        int left = myArray.length - 5;
        int right = myArray.length - 1;
        quickSort(myArray, left, right);

        System.out.println("Отсортированный массив: " + Arrays.toString(myArray) );
    }
}