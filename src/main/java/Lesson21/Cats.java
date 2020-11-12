package Lesson21;

public class Cats implements Athletes {
    private String name;
    private static int runMax = 150;
    private static int jumpMax = 1;
    private boolean inRace;


    public Cats(String name) {
        this.name = name;
        this.inRace = true;
    }

    public void info(){
        System.out.println(name + " прошел дистанцию: " + inRace);
    }

    @Override
    public void run(int dist) {
        if (dist <= runMax) {
            System.out.println(name + " преодолел дистанцию");

        } else {
            System.out.println(name + " не смог преодолеть дистанцию");
            inRace = false;
        }
    }

    @Override
    public void jump(int h) {
        if(h<=jumpMax){
            System.out.println(name + " успешно преодолел препятствие");
        } else {
            System.out.println(name + " не смог перепрыгнуть препятствие");
            inRace = false;
        }
    }

    @Override
    public boolean isInRace() {
        return inRace;
    }
}
