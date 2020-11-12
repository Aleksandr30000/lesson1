package Lesson21;

public class Main {
    public static void main(String[] args) {
        Athletes[] athletes = {
                new Cats("Murzik"),
                new Human("Vacya"),
                new Human("Petya"),
                new Robot("Fedor")
        };

        Obstacles[] obstacles = {
                new Treadmill(300),
                new Wall(2)
        };

        for (Athletes i : athletes) {
            for (Obstacles j : obstacles) {
                j.rezult(i);
                if (!i.isInRace()) {
                    break;
                }
            }
        }
        for (Athletes athletes1 : athletes){
            athletes1.info();
        }
    }

}
