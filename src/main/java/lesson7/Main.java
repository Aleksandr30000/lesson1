package lesson7;

public class Main {
    public static void main(String[] args) {

        Cat[] cat = new Cat[4];
        cat[0] = new Cat("Barsik");
        cat[1] = new Cat("Murzik");
        cat[2] = new Cat("Vas'ka");
        cat[3] = new Cat("Mus'ka");

        Plate plate = new Plate();
        plate.setFood(30);                      // Накладываем еду в тарелку

        for (int i = 0; i < cat.length; i++) {      // кормим котов
            cat[i].eat(plate);
        }

        System.out.println(plate);          // остаток еды в тарелке

        for (int i = 0; i < cat.length; i++) {
            if (cat[i].getSatiety()){
                System.out.println("Cat " + cat[i].getName() + " full");
            } else {
                System.out.println("Cat " + cat[i].getName() + " hungry");
            }
        }

    }
}
