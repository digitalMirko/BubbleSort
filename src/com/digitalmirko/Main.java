package com.digitalmirko;

// Bubble Sort Algorithm in Java
// This algorithm steps through the given array, compares each pair of adjacent items,
// swaps them until no other swaps are required.
// Big O Notation:
// Best case: O(n), Average and Worst Case: O(n2)

public class Main {

    public static void bubbleSort(int array[]) {
        int n = array.length;
        int k;
        for (int m = n; m >= 0; m--) {
            for (int i = 0 ; i < n - 1; i++) {
                k = i + 1;
                if (array[i] > array[k]) {
                    swapNumbers(i, k, array);
                }
            }
            printNumbers(array);
        }
    }

    private static void swapNumbers(int i, int j, int[] array){
        int temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void printNumbers(int[] input){

        for(int i = 0; i < input.length; i++){
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        int[] input = {6,3,7,2,8,18,45,34,16,0,21,23};
        bubbleSort(input);
    }
}

/*
Output:
3, 6, 2, 7, 8, 18, 34, 16, 0, 21, 23, 45,

3, 2, 6, 7, 8, 18, 16, 0, 21, 23, 34, 45,

2, 3, 6, 7, 8, 16, 0, 18, 21, 23, 34, 45,

2, 3, 6, 7, 8, 0, 16, 18, 21, 23, 34, 45,

2, 3, 6, 7, 0, 8, 16, 18, 21, 23, 34, 45,

2, 3, 6, 0, 7, 8, 16, 18, 21, 23, 34, 45,

2, 3, 0, 6, 7, 8, 16, 18, 21, 23, 34, 45,

2, 0, 3, 6, 7, 8, 16, 18, 21, 23, 34, 45,

0, 2, 3, 6, 7, 8, 16, 18, 21, 23, 34, 45,

0, 2, 3, 6, 7, 8, 16, 18, 21, 23, 34, 45,

0, 2, 3, 6, 7, 8, 16, 18, 21, 23, 34, 45,

0, 2, 3, 6, 7, 8, 16, 18, 21, 23, 34, 45,

0, 2, 3, 6, 7, 8, 16, 18, 21, 23, 34, 45,
 */