package com.company;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] data = {
                {},
                {1},
                {0, 3, 2, 1},
                {4, 3, 2, 1, 0},
                {6, 8, 3, 123, 5, 4, 1, 2, 0, 9, 7},
        };
        for (int[] arr : data) {
            System.out.print(Arrays.toString(arr) + " => ");
            SelectionSorter.sort(arr);
            System.out.println("отсортированный массив" + Arrays.toString(arr));
        }
    }
}
class SelectionSorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) { // i - номер текущего шага
            int pos = i;
            int min = array[i];

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    pos = j; // pos - индекс наименьшего элемента
                    min = array[j];
                }
            }
            array[pos] = array[i];
            array[i] = min; // меняем местами наименьший с array[i]
        }
    }
}