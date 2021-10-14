package ru.mail;

public class JavaApp {
    public static void main(String[] args) {
        System.out.print("№1. ");
        invertArray();
        System.out.println();
        System.out.print("№2. ");
        fillArray();
        System.out.println();
        System.out.print("№3. ");
        changeArray();
        System.out.println();
        System.out.print("№4. ");
        System.out.println();
        fillDiagonal();
        System.out.print("№5. ");
        MaxMinArr();
    }

    public static void invertArray() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                arr[i] = 0;
            else
                arr[i] = 1;
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillArray() {
        int[] arr = new int[7];
        int k = 3;

        for (int i = 0; i < arr.length; i++) {
            arr[i] += k;
            k += 3;
            System.out.print(arr[i] + " ");
        }
    }

    public static void changeArray() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 2)
                arr[i] = arr[i] * 2;
            System.out.print(arr[i] + " ");
        }
    }

    public static void fillDiagonal() {
        int[][] arr = new int[5][5];
        int k = arr.length - 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j)
                    arr[i][j] = 1;
                if (j == k)
                    arr[i][k] = 1;
                System.out.print(arr[i][j] + " ");
            }
            k--;
            System.out.println();
        }
    }

    public static void MaxMinArr() {
        int[] arrays = {1, 2, 3, 4, 5, 6};
        int max = 0;
        int min = 0;
        for (int i = 0; i < arrays.length; i++) {
            if (arrays[0] < arrays[i])
                max = arrays[i];
            else
                min = arrays[i];
        }
        System.out.println("Минимальное число: " + min + " Максимальное число: " + max);
    }
}