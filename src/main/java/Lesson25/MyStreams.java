package Lesson25;

import java.util.Arrays;

public class MyStreams implements Runnable {
    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];
    static float[] arr1 = new float[size];
    static float[] arr2 = new float[size];

    public static void main(String[] args) throws InterruptedException {
        Arrays.fill(arr, 1);

        long a = System.currentTimeMillis();
        strim1();
        System.out.println("Время обработки массива в одном потоке: " + (System.currentTimeMillis() - a) + " миллисекунд");

        Arrays.fill(arr, 1);
        a = System.currentTimeMillis();
        strim2();
        System.out.println("Время обработки массива в двух потоках: " + (System.currentTimeMillis() - a) + " миллисекунд");
    }

    static float[] strim1() throws InterruptedException {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return arr;
    }

    static float[] strim2() {
        System.arraycopy(arr, 0, arr1, 0, h);
        System.arraycopy(arr, h, arr2, 0, h);

        new Thread(new MyStreams()).start();

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (float) (arr1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }

        System.arraycopy(arr1, 0, arr, 0, h);
        System.arraycopy(arr2, 0, arr, h, h);
        return arr;
    }

    @Override
    public void run() {
        long a = System.currentTimeMillis();
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (float) (arr2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
    }
}
