package ru.geekbrains.lesson1;

public class HoumeWork1 {
    public static void main (String args[]) {       // Задание №1

        // Задание №2
        byte a = 127;
        short b = 32767;
        int c = 2147483647;
        long d = 3000000000000L;
        float e = 3.14f;
        double f = -3.14;
        char g = 'a';
        boolean val = true;

        // Задание №3
        System.out.println(scale (3.14f, 8.15f, 9.1f, 5.9f));

        // Задание №4
        System.out.println(verification1(5, 2));

        // Задание №5
        verification2 (7);

        // Задание №6
        System.out.println(verification3(5));

        // Задание №7
        helloName("Александр");

        // Задание №8
        leapYear(2020);
    }

    public static float scale (float a, float b, float c, float d) {          // Задание №3
        return a * (b + (c/d));
    }

    public static boolean verification1 (int a, int b) {       // Задание №4
        int c = a + b;
        if (c >= 10 && c <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void verification2 (int a) {             // Задание №5
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static boolean verification3 (int a) {             // Задание №6
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void helloName(String a) {                    // Задание №7
        System.out.println("Привет, " + a + "!");
    }

    public static void leapYear(int a) {                      // Задание №8
        float b = a % 4;
        float c = a % 100;
        float d = a % 400;
        if (b == 0) {
            if (d == 0 || c != 0) {
                System.out.println("Год " + a + " високосный.");
            }  else {
                System.out.println("Год " + a + " не високосный.");
            }
        } else {
            System.out.println("Год " + a + " не високосный.");
        }
    }
}
