package ru.geekbrains.lesson1.HoumeWork2;

public class HoumeWork2 {
    public static void main(String[] args) {
        // Задание №1
        int[] arr = {0, 1, 1, 0, 0, 0, 0, 1, 0, 1};
        System.out.print("Начальный массив: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        System.out.print("Конечный массив: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Задание №2
        int[] arr2 = new int[8];
        int a2 = 0;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = a2;
            a2 += 3;
        }
        System.out.print("\nМассив: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        // Задание №3
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("\nНачальный массив: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] = arr3[i]*2;
            }
        }
        System.out.print("\nКонечный массив: ");
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        // Задание №4
        int[][] arr4 = new int[5][5];
        System.out.print("\nМассив:");
        for (int i = 0, j = 0; i < arr4.length; i++, j++) {
            arr4[i][j] = 1;
        }
        for (int i = 0, j = 4; i < arr4.length; i++, j--) {
            arr4[i][j] = 1;
        }
        for (int i = 0; i < arr4.length; i++) {
            System.out.print("\n");
            for (int j = 0; j < arr4.length; j++) {
                System.out.print(arr4[i][j] + " ");
            }
        }

        //Задание №5
        int [] arr5 = {5, 8, 3, 67, 34, 2, 32};
        System.out.print("\nМассив: ");
        for (int i = 0; i < arr5.length; i++) {
            System.out.print(arr5[i] + " ");
        }
        System.out.println("\nМинимальное значение массива: " + arrMin(arr5));
        System.out.println("Максимальное значение массива: " + arrMax(arr5));

        //Задание №6
        int[] checkBalance = {2, 2, 2, 1, 2, 2, 10, 1};
        for (int i = 0; i < checkBalance.length; i++) {
            System.out.print(checkBalance[i] + " ");
        }
        System.out.println("");
        System.out.println(balance(checkBalance));

        //Задание №7
        int[] arr7 = {3, 9, 5, 7, 1};
        int n = 2;
        for (int i = 0; i < arr7.length; i++) {
            System.out.print(arr7[i] + " ");
        }
        shift(arr7, n);
    }

    //Задание №5.1
    public static int arrMin(int arr[]) {
        int a5=arr[1];
        for (int i = 0; i < (arr.length); i++) {
            if (a5 > arr[i]){
                a5 = arr[i];
            }
        }
        return a5;
    }

    //Задание №5.2
    public static int arrMax(int arr[]) {
        int a5=arr[1];
        for (int i = 0; i < (arr.length); i++) {
            if (a5 < arr[i]){
                a5 = arr[i];
            }
        }
        return a5;
    }

    //Задание №6
    public static boolean balance(int arr[]) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.length-1; i++) {
            sum1 = 0;
            for (int j = 0; j <= i; j++) {
                sum1 = sum1 + arr[j];
            }
            sum2 = 0;
            for (int j = i+1; j < arr.length; j++) {
                sum2 = sum2 + arr[j];
            }
            if (sum1 == sum2) {
                break;
            }
        }
        return (sum1 == sum2);
    }

    //Задание №7
    public static void shift(int arr[], int n){

    }
}
