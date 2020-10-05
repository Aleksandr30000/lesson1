package lesson3;
import java.util.Scanner;
public class HoumeWork31 {
    public static Scanner sc = new Scanner(System.in);

    public static void main (String[] args) {
        System.out.println("Это игра угадай число. \nВам нужно угадать число от 0 до 9. У Вас есть 3 попытки.");
        int b;
        do {
            if (game()) {
                System.out.println("Поздравляю! Вы угадали");
            } else {
                System.out.println("К сожалению Вы проиграли");
            }
            System.out.println("Хотите сыграть еще раз? \n Да - введите 1, НЕТ - введите 0.");
            b = sc.nextInt();
        } while (b == 1);
        sc.close();
    }

    public static boolean game() {
        int a = (int) (Math.random() * 10);
        int x;
        for (int i=0; i<3; i++){
            System.out.println("Введите число от 0 до 9: ");
            x = sc.nextInt();
            if (x > a){
                System.out.println("Вы ввели слишком большое число");
            } else if (x < a){
                System.out.println("Вы ввели слишком маленькое число");
            } else if (x == a){
                return true;
            }
        }
        System.out.println("Загаданное число = " + a);
        return false;
    }
}
