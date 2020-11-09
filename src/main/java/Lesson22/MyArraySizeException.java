package Lesson22;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {
        super("Неправильный размер массива. Допустимы только двумерные массивы 4х4");
    }

}