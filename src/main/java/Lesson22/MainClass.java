package Lesson22;

public class MainClass {
    public static void main(String[] args) {

        // Правильный массив
        String[][] string1 = {{"00", "01", "02", "03"}, {"10", "11", "12", "13"}, {"20", "21", "22", "23"}, {"30", "31", "32", "33"}};//new String[4][4];
        try {
            checkArray(string1);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }


        System.out.println();
        // Массив неправильного размера
        String[][] string2 = {{"00", "01", "02", "03"}, {"10", "11", "12", "13", "14"}, {"20", "21", "22", "23"}, {"30", "31", "32", "33"}};//new String[4][4];
        try {
            checkArray(string2);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }

        System.out.println();
        // Массив с ошибкой в данных
        String[][] string3 = {{"00", "01", "ф02", "03"}, {"10", "11", "12", "13"}, {"20", "21", "22", "23"}, {"30", "31", "32", "33"}};//new String[4][4];
        try {
            checkArray(string3);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void checkArray(String[][] string) {
        for (int i = 0; i < 4; i++) {
            if (string.length != 4 || string[i].length != 4) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        int x = 0;
        int iEr = 0;
        int jEr = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(string[i][j] + " ");
                iEr = i;
                jEr = j;
                try {
                    x = Integer.parseInt(string[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println();
                    throw new MyArrayDataException("Неправильные данные в ячейке с номером i = " + iEr + ", j = " + jEr);
                }
                sum += x;
            }
            System.out.println();
        }
        System.out.println("Сумма всех элементов массива = " + sum);
    }
}